package com.example.abhujeeth.spotsoon;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by abhujeeth on 6/10/17.
 */

public class PagerAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 3;

    private Context context;

    public PagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
               FragmentOne frag=new FragmentOne();
                return frag;
            case 1:
                return new FragmentOne();
            case 2:
                return new FragmentOne();
            default:return null;
        }

    }

    @Override
    public CharSequence getPageTitle(int position) {
        //Generate title based on item position
        return null;
    }

}
