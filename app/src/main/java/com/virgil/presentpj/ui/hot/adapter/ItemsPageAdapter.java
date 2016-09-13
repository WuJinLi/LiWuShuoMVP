package com.virgil.presentpj.ui.hot.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

import java.util.List;

/**
 * Created by Administrator on 2016/9/1.
 */
public class ItemsPageAdapter extends FragmentPagerAdapter {
    private List<Fragment> list;
    private String[] arrTabLayout;

    public ItemsPageAdapter(FragmentManager fm,List<Fragment> list,String[] arrTabLayout) {
        super(fm);
        this.list=list;
        this.arrTabLayout=arrTabLayout;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return arrTabLayout[position];
    }
}
