package com.virgil.presentpj.ui.category;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.virgil.presentpj.R;
import com.virgil.presentpj.ui.category.danpin.DanPinFragment;
import com.virgil.presentpj.ui.category.gonglue.GongLueFragment;
import com.virgil.presentpj.ui.category.search.SearchActivity;

import java.util.ArrayList;
import java.util.List;


/**
 * 用于数据的展示
 */
public class CategoryFragment extends Fragment {
    private TabLayout mTablayout;
    private TextView mTextview;
    private ViewPager mViewpager;
    private List<Fragment> mList = new ArrayList<>();
    private GongLueFragment mGongLueFragment;
    private DanPinFragment mDanPinFragment;
    private String[] mTabTitles;
    private CategroyViewpagerAdapter mGongLueViewpagerAdapter;
    private LinearLayout linearlayout_categroy_search;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
    Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_categroy, container, false);
        mTablayout = (TabLayout) view.findViewById(R.id.tablayout_categroy_tab);
        mTextview = (TextView) view.findViewById(R.id.textview_categroy_title);
        mViewpager = (ViewPager) view.findViewById(R.id.viewpager_category_viewpager);
        linearlayout_categroy_search = (LinearLayout) view.findViewById(R.id
                .linearlayout_categroy_search);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mGongLueFragment = new GongLueFragment();
        mDanPinFragment = new DanPinFragment();
        mList.add(mGongLueFragment);
        mList.add(mDanPinFragment);
        mTabTitles = getActivity().getResources().getStringArray(R.array.tabTitles);
        mGongLueViewpagerAdapter = new CategroyViewpagerAdapter(getActivity()
                .getSupportFragmentManager(), mList, mTabTitles);
        mViewpager.setOffscreenPageLimit(2);
        mViewpager.setAdapter(mGongLueViewpagerAdapter);
        mTablayout.setupWithViewPager(mViewpager);


        //点击搜索页面进行页面跳转
        linearlayout_categroy_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), SearchActivity.class));
            }
        });
    }
}
