package com.example.pmerdala.viewpager;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by merdala on 2017-11-02.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private final Context context;

    public SimpleFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment;
        switch(position){
            case 0: fragment = new MondayFragment();break;
            case 1: fragment = new TuesdayFragment();break;
            case 2: fragment = new WednesdayFragment();break;
            case 3: fragment = new ThursdayFragment();break;
            case 4: fragment = new FridayFragment();break;
            case 5: fragment = new SaturdayFragment();break;
            case 6: fragment = new SundayFragment();break;
            default: fragment = null;
        }
        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        CharSequence fragmentName;
        switch(position){
            case 0: fragmentName = getString(R.string.monday) ;break;
            case 1: fragmentName = getString(R.string.tuesday) ;break;
            case 2: fragmentName = getString(R.string.wednesday) ;break;
            case 3: fragmentName = getString(R.string.thursday) ;break;
            case 4: fragmentName = getString(R.string.friday) ;break;
            case 5: fragmentName = getString(R.string.saturday) ;break;
            case 6: fragmentName = getString(R.string.sunday) ;break;
            default: fragmentName = null;
        }
        return fragmentName;
    }

    @Override
    public int getCount() {
        return 7;
    }

    private CharSequence getString(int resourceId){
        return context.getResources().getString(resourceId);
    }
}
