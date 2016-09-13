package com.virgil.presentpj.ui.category.search;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * 搜索详情中viewpager的适配器
 */
public class SDViewPagerAdapter extends FragmentPagerAdapter{
    private List<Fragment> list;
    private String[] tabTitles;

    public SDViewPagerAdapter(FragmentManager fm,List<Fragment> list,String[] tabTitles) {
        super(fm);
        this.list=list;
        this.tabTitles=tabTitles;
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
        return tabTitles[position];
    }
}
