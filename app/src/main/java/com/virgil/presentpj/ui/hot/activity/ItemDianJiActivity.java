package com.virgil.presentpj.ui.hot.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

import com.virgil.presentpj.R;
import com.virgil.presentpj.ui.hot.adapter.ItemsPageAdapter;
import com.virgil.presentpj.ui.hot.fragment.DanPinFragment;
import com.virgil.presentpj.ui.hot.fragment.pinglun.PingLunFragment;
import com.virgil.presentpj.ui.hot.fragment.xiangqing.XinagQingFragment;

import java.util.ArrayList;
import java.util.List;

import cn.sharesdk.framework.ShareSDK;

/**
 * Created by Administrator on 2016/9/1.
 */
public class ItemDianJiActivity extends AppCompatActivity {
    private Context mContext;
    private List<Fragment> totallist=new ArrayList<>();
    private TabLayout tabLayout_itemDianji;
    private ViewPager viewPager_itemDianji;
    private DanPinFragment danPinFragment;
    private XinagQingFragment xinagQingFragment;
    private PingLunFragment pingLunFragment;
    private String[] arrtablayout;
    private ItemsPageAdapter pageadapter;
    private ImageView tablayout_imageviewback;
    private RadioButton radiobutton_xin;
    private RadioButton radiobutton_fangkuai;
    private RadioButton radiobutton_gocat;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itemsdianji);
        //初始化控件
        initview();
        //获取tablayout
        arrtablayout=getResources().getStringArray(R.array.arrTabLayout);
        //添加frgment
        danPinFragment=new DanPinFragment();
        xinagQingFragment=new XinagQingFragment();
        pingLunFragment=new PingLunFragment();
        totallist.add(danPinFragment);
        totallist.add(xinagQingFragment);
        totallist.add(pingLunFragment);

        pageadapter=new ItemsPageAdapter(getSupportFragmentManager(),totallist,arrtablayout);
        viewPager_itemDianji.setAdapter(pageadapter);
        //设置模式
        tabLayout_itemDianji.setTabMode(TabLayout.MODE_FIXED);
        //设置viewpager和tablayout联动
        tabLayout_itemDianji.setupWithViewPager(viewPager_itemDianji);
        tablayout_imageviewback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        //点击分享
        radiobutton_fangkuai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShareSDK.initSDK(mContext,"16c899b55c1a1");
               // showShare();
                Toast.makeText(mContext,"jjjjj",Toast.LENGTH_LONG).show();
            }
        });

    }


    private void initview() {
        tabLayout_itemDianji= (TabLayout) findViewById(R.id.tablayout_itemsdianji);
        viewPager_itemDianji= (ViewPager) findViewById(R.id.viewpager_itemsdianji);
        tablayout_imageviewback= (ImageView) findViewById(R.id.tablayout_imageviewback);
        radiobutton_xin= (RadioButton) findViewById(R.id.radiobutton_xin);
        radiobutton_fangkuai= (RadioButton) findViewById(R.id.radiobutton_fangkuai);
        radiobutton_gocat= (RadioButton) findViewById(R.id.radiobutton_gocat);
        viewPager_itemDianji.setOffscreenPageLimit(3);
    }
//    private void showShare() {
//        ShareSDK.initSDK(this);
//        OnekeyShare oks = new OnekeyShare();
//        //关闭sso授权
//        oks.disableSSOWhenAuthorize();
//
//        // title标题，印象笔记、邮箱、信息、微信、人人网和QQ空间等使用
//        oks.setTitle("印象笔记");
//        // titleUrl是标题的网络链接，QQ和QQ空间等使用
//        oks.setTitleUrl("http://sharesdk.cn");
//        // text是分享文本，所有平台都需要这个字段
//        oks.setText("我是分享文本");
//        // imagePath是图片的本地路径，Linked-In以外的平台都支持此参数
//        //oks.setImagePath("/sdcard/test.jpg");//确保SDcard下面存在此张图片
//        // url仅在微信（包括好友和朋友圈）中使用
//        oks.setUrl("http://sharesdk.cn");
//        // comment是我对这条分享的评论，仅在人人网和QQ空间使用
//        oks.setComment("我是测试评论文本");
//        // site是分享此内容的网站名称，仅在QQ空间使用
//        oks.setSite(getString(R.string.app_name));
//        // siteUrl是分享此内容的网站地址，仅在QQ空间使用
//        oks.setSiteUrl("http://sharesdk.cn");
//
//// 启动分享GUI
//        oks.show(this);
//    }

}
