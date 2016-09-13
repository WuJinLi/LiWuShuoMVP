package com.virgil.presentpj.ui.profile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.virgil.presentpj.R;

import java.util.ArrayList;
import java.util.List;

/**
 * 我的碎片
 */
public class ProfileFragment extends Fragment implements View.OnClickListener {

    private Button button_profile_car;
    private Button button_profile_order;
    private Button button_profile_gif;
    private Button button_profile_attention;
    private Button button_profile_service;

    private ImageView imageview_profile_photo;
    private ImageView imageview_profile_message;
    private ImageView imageview_prifile_setting;
    private ImageView imageview_profile_scan;

    private TextView textview_profile_nickname;

    private TabLayout tabLayout_profile_tab;

    private ViewPager viewpager_profile_pager;
    private String[] tabTitles;
    private Context mContext;

    private PrifileViewPagerAdapter viewPagerAdapter;
    private List<Fragment> fragmentList = new ArrayList<>();
    private ProfileDanPinFragment profileDanPinFragment;
    private ProfileGongLueFragment profileGongLueFragment;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
    Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        tabLayout_profile_tab = (TabLayout) view.findViewById(R.id.tabLayout_profile_tab);
        textview_profile_nickname = (TextView) view.findViewById(R.id.textview_profile_nickname);
        imageview_profile_scan = (ImageView) view.findViewById(R.id.imageview_profile_scan);
        imageview_prifile_setting = (ImageView) view.findViewById(R.id.imageview_prifile_setting);
        imageview_profile_message = (ImageView) view.findViewById(R.id.imageview_profile_message);
        imageview_profile_photo = (ImageView) view.findViewById(R.id.imageview_profile_photo);
        button_profile_car = (Button) view.findViewById(R.id.button_profile_car);
        button_profile_order = (Button) view.findViewById(R.id.button_profile_order);
        button_profile_gif = (Button) view.findViewById(R.id.button_profile_gif);
        button_profile_attention = (Button) view.findViewById(R.id.button_profile_attention);
        button_profile_service = (Button) view.findViewById(R.id.button_profile_service);
        viewpager_profile_pager = (ViewPager) view.findViewById(R.id.viewpager_profile_pager);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        button_profile_attention.setOnClickListener(this);
        button_profile_car.setOnClickListener(this);
        button_profile_order.setOnClickListener(this);
        button_profile_gif.setOnClickListener(this);
        button_profile_service.setOnClickListener(this);
        tabTitles = getResources().getStringArray(R.array.sdtabTitles);

        profileDanPinFragment = new ProfileDanPinFragment();
        profileGongLueFragment = new ProfileGongLueFragment();
        fragmentList.add(profileDanPinFragment);
        fragmentList.add(profileGongLueFragment);
        viewPagerAdapter = new PrifileViewPagerAdapter(getActivity().getSupportFragmentManager(),
                fragmentList, tabTitles);
        viewpager_profile_pager.setOffscreenPageLimit(2);
        viewpager_profile_pager.setAdapter(viewPagerAdapter);
        tabLayout_profile_tab.setupWithViewPager(viewpager_profile_pager);


        imageview_profile_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startActivity(new Intent(getContext(), LoginActivity.class));
            }
        });

        imageview_prifile_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startActivity(new Intent(getContext(), SettingActivity.class));
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_profile_car:
                break;
            case R.id.button_profile_order:
                break;
            case R.id.button_profile_gif:
                break;
            case R.id.button_profile_attention:
                break;
            case R.id.button_profile_service:
                break;
        }
        ;
    }
}
