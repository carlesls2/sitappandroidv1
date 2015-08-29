package carlesls.prova;

import internals.internals;
import java.util.Locale;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentPagerAdapter;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by carle_000 on 17/08/2015.
 */
public class MainActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        try
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.splashlayout);
            Thread.sleep(2000);
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        }
        catch(Exception e)
        {

        }
    }

        //Intent intent = new Intent(this, SlideActivity.class);
        //startActivity(intent);
// METHOD 1

//        /****** Create Thread that will sleep for 5 seconds *************/
//        Thread background = new Thread() {
//            public void run() {
//
//                try
//                {
//                    Intent intent = new Intent(this, SlideActivity.class);
//
//
//
//                }
//                catch (Exception e)
//                {
//
//                }
//            }
//        };
//
//        // start thread
//        background.start();

//METHOD 2

        /*
        new Handler().postDelayed(new Runnable() {

            // Using handler with postDelayed called runnable run method

            @Override
            public void run() {
                Intent i = new Intent(MainSplashScreen.this, FirstScreen.class);
                startActivity(i);

                // close this activity
                finish();
            }
        }, 5*1000); // wait for 5 seconds
        */


    @Override
    protected void onDestroy() {

        super.onDestroy();

    }
}
