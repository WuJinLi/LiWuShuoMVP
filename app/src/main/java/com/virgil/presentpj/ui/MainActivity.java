package com.virgil.presentpj.ui;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.virgil.presentpj.R;
import com.virgil.presentpj.ui.hot.HotFragment;
import com.virgil.presentpj.ui.category.CategoryFragment;
import com.virgil.presentpj.ui.home.HomeFragment;
import com.virgil.presentpj.ui.profile.ProfileFragment;

/*
* 主页面的activity，包含底部按钮和底部按钮对应的碎片
 */
public class MainActivity extends AppCompatActivity {
    //声明碎片
    private CategoryFragment categoryFragment;
    private HomeFragment homeFragment;
    private HotFragment hotFragment;
    private ProfileFragment profileFragment;
    //声明碎片管理者
    private FragmentManager manager;
    //声明按钮
    private Button button_main_home;
    private Button button_main_hot;
    private Button button_main_category;
    private Button button_main_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView() {
        button_main_home = (Button) findViewById(R.id.button_main_home);
        button_main_hot = (Button) findViewById(R.id.button_main_hot);
        button_main_category = (Button) findViewById(R.id.button_main_category);
        button_main_profile = (Button) findViewById(R.id.button_main_profile);
    }

    private void initData() {
        manager = getSupportFragmentManager();
        setSection(0);
        button_main_home.setSelected(true);
    }


    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_main_home:
                button_main_home.setSelected(true);
                button_main_hot.setSelected(false);
                button_main_category.setSelected(false);
                button_main_profile.setSelected(false);
                setSection(0);
                break;
            case R.id.button_main_hot:
                button_main_home.setSelected(false);
                button_main_hot.setSelected(true);
                button_main_category.setSelected(false);
                button_main_profile.setSelected(false);
                setSection(1);
                break;
            case R.id.button_main_category:
                button_main_home.setSelected(false);
                button_main_hot.setSelected(false);
                button_main_category.setSelected(true);
                button_main_profile.setSelected(false);
                setSection(2);
                break;
            case R.id.button_main_profile:
                button_main_home.setSelected(false);
                button_main_hot.setSelected(false);
                button_main_category.setSelected(false);
                button_main_profile.setSelected(true);
                setSection(3);
                break;
        }
    }

    public void setSection(int tabIndex) {
        FragmentTransaction ft = manager.beginTransaction();
        hindFragment(ft);
        switch (tabIndex) {
            case 0:
                if (homeFragment == null) {
                    homeFragment = new HomeFragment();
                    ft.add(R.id.frameLayout_container, homeFragment);
                } else {
                    ft.show(homeFragment);
                }
                break;
            case 1:
                if (hotFragment == null) {
                    hotFragment = new HotFragment();
                    ft.add(R.id.frameLayout_container, hotFragment);
                } else {
                    ft.show(hotFragment);
                }
                break;
            case 2:
                if (categoryFragment == null) {
                    categoryFragment = new CategoryFragment();
                    ft.add(R.id.frameLayout_container, categoryFragment);
                } else {
                    ft.show(categoryFragment);
                }
                break;
            case 3:
                if (profileFragment == null) {
                    profileFragment = new ProfileFragment();
                    ft.add(R.id.frameLayout_container, profileFragment);
                } else {
                    ft.show(profileFragment);
                }
                break;
        }
        ft.commit();
    }

    public void hindFragment(FragmentTransaction ft) {
        if (homeFragment != null) {
            ft.hide(homeFragment);
        }
        if (hotFragment != null) {
            ft.hide(hotFragment);
        }
        if (categoryFragment != null) {
            ft.hide(categoryFragment);
        }
        if (profileFragment != null) {
            ft.hide(profileFragment);
        }
    }
}
