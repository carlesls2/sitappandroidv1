package carlesls.prova;

import carlesls.prova.util.SystemUiHider;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.widget.TabHost;
import android.app.TabActivity;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.widget.TabHost.OnTabChangeListener;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class LocationActivity extends FragmentActivity {

    private static final String TAG_TAB_1 = "TAB_1";
    private static final String TAG_TAB_2 = "TAB_2";

    private static final String ARGUMENT_NAME = "name";

    FragmentTabHost mTabHost;
    // probe github and source tree. another probe
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.locationlayout);
        mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), R.id.tab_container);

        final Bundle args1 = new Bundle();
        args1.putString(ARGUMENT_NAME, TAG_TAB_1);
        mTabHost.addTab(mTabHost.newTabSpec(TAG_TAB_1).setIndicator(TAG_TAB_1), TabRoot.class, args1);

        final Bundle args2 = new Bundle();
        args2.putString(ARGUMENT_NAME, TAG_TAB_2);
        mTabHost.addTab(mTabHost.newTabSpec(TAG_TAB_2).setIndicator(TAG_TAB_2), TabRoot.class, args2);
    }

    /*
     * (non-Javadoc)
     * @see android.support.v4.app.FragmentActivity#onBackPressed()
     * バックキーをタブ内フラグメントに処理させる。
     */
    @Override
    public void onBackPressed() {
        Fragment f = getSupportFragmentManager()     .findFragmentByTag(mTabHost.getCurrentTabTag());
        if (f != null && f instanceof TabRoot)
        {
            TabRoot tabChild = (TabRoot) f;
            if (tabChild.onBackPressed())
            {
                return;
            }
        }
        super.onBackPressed();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mTabHost = null;
    }

    /**
     * Tabに入れる親Fragment
     *
     * @author noxi
     */
    public static class TabRoot extends Fragment implements OnClickListener {

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            if (container == null) {
                return null;
            }
            return inflater.inflate(R.layout.tab_root, container, false);
        }

        @Override
        public void onActivityCreated(Bundle savedInstanceState) {
            super.onActivityCreated(savedInstanceState);
            // 初回のみ自動で子を入れる
            if (savedInstanceState == null) {
                getChildFragmentManager()
                        .beginTransaction()
                        .addToBackStack(null)
                        .add(R.id.fragment_container, createNewChild())
                        .commit();
            }
        }

        /*
         * (non-Javadoc)
         * @see android.view.View.OnClickListener#onClick(android.view.View)
         * 子を追加する処理
         */
        @Override
        public void onClick(View v) {
            getChildFragmentManager()
                    .beginTransaction()
                    .addToBackStack(null)
                    .replace(R.id.fragment_container, createNewChild())
                    .commit();
        }

        /**
         * バックキーの処理
         *
         * @return このFragmentが処理を行う場合TRUE
         */
        public boolean onBackPressed() {
            FragmentManager fm = getChildFragmentManager();
            if (fm.getBackStackEntryCount() == 1) {
                return false;
            } else {
                fm.popBackStack();
                return true;
            }
        }

        /**
         * 子Fragmentを作成する
         */
        Fragment createNewChild() {
            FragmentManager fm = getChildFragmentManager();
            Bundle args = getArguments();
            if (args == null) {
                args = new Bundle();
                args.putString(ARGUMENT_NAME, "Name unknown");
            } else {
                args = new Bundle(args);
            }
            args.putInt(TabChild.ARGUMENT_CHILD_COUNT, fm.getBackStackEntryCount() + 1);

            Fragment f = new TabChild();
            f.setArguments(args);
            return f;
        }
    }

    /**
     * Tabの子Fragment
     *
     * @author noxi
     */
    public static class TabChild extends Fragment {

        private static final String ARGUMENT_CHILD_COUNT = "child_count";

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            if (container == null) {
                return null;
            }

            View v = inflater.inflate(R.layout.tab_child, container, false);
            Bundle args = getArguments();
            if (args != null
                    && args.containsKey(ARGUMENT_NAME)
                    && args.containsKey(ARGUMENT_CHILD_COUNT)) {
                String text = args.getString(ARGUMENT_NAME)
                        + "__" + args.getInt(ARGUMENT_CHILD_COUNT);
                Button button = (Button) v.findViewById(R.id.button);
                button.setText(text);

                Fragment f = getParentFragment();
                if (f instanceof OnClickListener) {
                    button.setOnClickListener((OnClickListener) f);
                }
            }

            return v;
        }

    }

}