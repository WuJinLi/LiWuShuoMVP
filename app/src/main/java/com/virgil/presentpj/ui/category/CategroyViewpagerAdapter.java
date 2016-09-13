package com.virgil.presentpj.ui.category;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * 分类中viewpager的适配器
 */
public class CategroyViewpagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> mList;
    private String[] mTabTitles;

    public CategroyViewpagerAdapter(FragmentManager fm, List<Fragment> mList, String[] mTabTitles) {
        super(fm);
        this.mList = mList;
        this.mTabTitles = mTabTitles;
    }

    @Override
    public Fragment getItem(int position) {
        return mList.get(position);
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTabTitles[position];
    }
}

