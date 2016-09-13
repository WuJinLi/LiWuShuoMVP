package com.virgil.presentpj.ui.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;

import com.virgil.presentpj.R;
import com.virgil.presentpj.adapter.HomeTabAdapter;
import com.virgil.presentpj.bean.HomeTabLayoutData;

import java.util.ArrayList;
import java.util.List;


/**
 * 首页的碎片:陈有余
 */
public class HomeFragment extends Fragment implements HomeContract.View{
    private TabLayout mTabLayout_home;
    private ViewPager mViewPager_home;
    private HomeTabAdapter adapter=null;
    private FragmentManager manager=null;
    private List<Fragment>  totalList=new ArrayList<>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
    Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        mTabLayout_home = (TabLayout) view.findViewById(R.id.tabLayout_home);
        mViewPager_home= (ViewPager) view.findViewById(R.id.viewPager_home);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    ///////////////////////////////////////////////////////////////////////////
    // 网络访问数据结果
    ///////////////////////////////////////////////////////////////////////////

    @Override
    public void onGetHomeTabDataSuccess(List<HomeTabLayoutData.ChannelsBean> tabLayoutDatas) {

    }

    @Override
    public void onGetHomeTabDataFail(String error) {

    }
}
