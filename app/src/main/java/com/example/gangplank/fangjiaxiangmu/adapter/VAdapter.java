package com.example.gangplank.fangjiaxiangmu.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by GANGPLANK on 2019/3/3.
 */

public class VAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> list;
    private ArrayList<String>title;
    public VAdapter(FragmentManager fm, ArrayList<Fragment> list, ArrayList<String>title) {
        super(fm);
        this .list =list;
        this.title = title;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title.get(position);
    }
}
