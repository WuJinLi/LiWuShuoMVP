package com.virgil.presentpj.ui.category.gonglue;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.virgil.presentpj.R;
import com.virgil.presentpj.bean.PostsBean;
import com.virgil.presentpj.config.UrlConfig;
import com.virgil.presentpj.ui.MainActivity;
import com.virgil.presentpj.widget.ExpandListView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 点击栏目进入详情列表
 */
public class GLLanMuDetalsActivity extends AppCompatActivity implements GLLanMuDetailsContract
        .View {
    private Context mContext;
    private com.virgil.presentpj.widget.ExpandListView mListView;
    private TextView mTextview_details_description;
    private TextView mTextview_details_title;
    private ImageView mImageview_details_icon;
    private GLLanMuDetailsPresenter presenter;
    private ProgramaDetailsListAdapter mProgramaDetailsListAdapter;
    private String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gllan_mu_detals);
        //调用初始化UI控件的方法
        initView();
        //调用初始化数据的方法
        initData();
    }

    private void initData() {
        //初始化上下文对象
        mContext = this;
        Intent intent = getIntent();
        //获取上级传入的id
        id = intent.getIntExtra("id", -1) + "";
        //获取网址中的可变参数，封装在集合中
        Map<String, String> map = new HashMap<>();
        map.put(UrlConfig.Key.LIMIT, UrlConfig.DefaultValue.DEFAULT_LIMIT);
        map.put(UrlConfig.Key.OFFSET, UrlConfig.DefaultValue.DEFAULT_OFFSET);
        //初始化presenter对象
        presenter = new GLLanMuDetailsPresenter(this);
        presenter.getProgramaDetails(map, id);
    }

    //初始化UI控件的方法
    private void initView() {
        mListView = (ExpandListView) findViewById(R.id.listview_details_list);
        mTextview_details_description = (TextView) findViewById(R.id.textview_details_description);
        mTextview_details_title = (TextView) findViewById(R.id.textview_details_title);
        mImageview_details_icon = (ImageView) findViewById(R.id.imageview_details_icon);
    }


    //数据加载成功，显示网络加载的数据
    @Override
    public void getProgramaDetailsSuccess(List<PostsBean> parmas, String imageUrl, String
            description, String title) {
        mTextview_details_description.setText(description);
        mTextview_details_title.setText(title);
        //加载网络图片
        Glide.with(this).load(imageUrl).into(mImageview_details_icon);

        //初始化适配器
        mProgramaDetailsListAdapter = new ProgramaDetailsListAdapter(mContext, parmas);
        //为listView设置适配器
        mListView.setAdapter(mProgramaDetailsListAdapter);
        //添加listView的点击事件

    }

    //网络数据加载数据失败提示用户
    @Override
    public void getProgramaDetailsFail(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }
}
