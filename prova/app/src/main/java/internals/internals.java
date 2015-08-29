package internals;


import android.content.Context;
import android.content.*;
import java.lang.Object;
import android.telephony.TelephonyManager;
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
 * the idea is to get internal information from the cell phone so
 */
public final class internals
{
    public int imei; // each mobil has one
    public int imsi; // each subscriber has one
    public int mobilenumber; //
    public String country;
    public int xsize;
    public int ysize;
    public int username;

    public int getImei()
    {
        try
        {

        }
        catch(Exception e)
        {
           System.out.println(e.toString());
        }
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }


    public int getUsername() {
        return username;
    }
/*

 */
    public void setUsername(int username) {
        this.username = username;
    }

    public int getMobilenumber() {
        return mobilenumber;
    }

    public int getXsize() {
        return xsize;
    }

    public int getYsize() {
        return ysize;
    }

    public void setCountry(String country) {
        this.country = country;

    }


    public void initSizes()
    {
        try
        {

        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }

    /*
    caca
     */
    public void initializeInternals()
    {
        try
        {

        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }

    }
}
