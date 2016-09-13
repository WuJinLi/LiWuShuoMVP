package com.virgil.presentpj.ui.category.search;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.virgil.presentpj.R;
import com.virgil.presentpj.ui.category.search.searchdanpin.SDDanpinFragment;
import com.virgil.presentpj.ui.category.search.searchgonglue.SDGonglueFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * 搜索页面详情
 */

public class SearchDetailsActivity extends AppCompatActivity {

    private String mSearchContent;
    private EditText edittext_searchBar;
    private String[] tabTitles;
    private SDDanpinFragment sdDanpinFragment;
    private SDGonglueFragment sdGonglueFragment;
    private List<Fragment> mList = new ArrayList<>();
    private SDViewPagerAdapter sdViewPagerAdapter;
    private TabLayout tab_searchdetails_tab;
    private ViewPager viewpager_searchdetails_viewpager;
    private ImageView imageview_searchBar_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_details);
        initView();
        initData();
        edittext_searchBar.setText(mSearchContent);
        sdViewPagerAdapter = new SDViewPagerAdapter(getSupportFragmentManager(), mList, tabTitles);
        viewpager_searchdetails_viewpager.setAdapter(sdViewPagerAdapter);
        tab_searchdetails_tab.setupWithViewPager(viewpager_searchdetails_viewpager);
        imageview_searchBar_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    private void initView() {
        imageview_searchBar_back = (ImageView) findViewById(R.id.imageview_searchBar_back);
        edittext_searchBar = (EditText) findViewById(R.id.edittext_searchBar);
        viewpager_searchdetails_viewpager = (ViewPager) findViewById(R.id
                .viewpager_searchdetails_viewpager);
        tab_searchdetails_tab = (TabLayout) findViewById(R.id.tab_searchdetails_tab);
        imageview_searchBar_back = (ImageView) findViewById(R.id.imageview_searchBar_back);
    }

    private void initData() {
        mSearchContent = getIntent().getStringExtra("search");
        tabTitles = getResources().getStringArray(R.array.sdtabTitles);
        sdDanpinFragment = new SDDanpinFragment(mSearchContent);
        sdGonglueFragment = new SDGonglueFragment(mSearchContent);
        mList.add(sdDanpinFragment);
        mList.add(sdGonglueFragment);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
