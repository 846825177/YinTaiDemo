package com.example.administrator.yintaidemo.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;

import java.util.ArrayList;

/**
 * Created by dell on 2017/10/17.
 */

public class HomePagerAdapter extends FragmentPagerAdapter {

    private  ArrayList<Fragment> arrayList;
    private  ArrayList<String> stringArrayList;

    public HomePagerAdapter(FragmentManager fm, ArrayList<Fragment> arrayList, ArrayList<String> stringArrayList) {
        super(fm);
        this.arrayList = arrayList;
        this.stringArrayList = stringArrayList;
    }

    @Override
    public Fragment getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return stringArrayList.get(position);
    }
}
