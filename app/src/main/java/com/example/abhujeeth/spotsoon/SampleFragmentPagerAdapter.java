package com.example.abhujeeth.spotsoon;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by abhujeeth on 6/10/17.
 */

public class SampleFragmentPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 3;
    private String tabTitles[];
    private Context context;

    public SampleFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
        this.tabTitles = new String[] { "VIDEOS", "IMAGES", "MILESTONES" };
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                PageFragment frag=new PageFragment();
                return frag;
            case 1:
                return new PageFragment();
            case 2:
                return new PageFragment();
            default:return null;
        }

    }

    @Override
    public CharSequence getPageTitle(int position) {
        //Generate title based on item position
        return tabTitles[position];
    }

}