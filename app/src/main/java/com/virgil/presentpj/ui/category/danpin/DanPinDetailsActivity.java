package com.virgil.presentpj.ui.category.danpin;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.virgil.presentpj.R;
import com.virgil.presentpj.bean.CategroyDPDetailsItemsBean;
import com.virgil.presentpj.config.UrlConfig;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DanPinDetailsActivity extends AppCompatActivity implements DanPinDetailsContract.View {

    private GridView gridview_danpindetails;
    private DanpinDetailsgridviewAdapter detailsgridviewAdapter;
    private DanPinDetailsPresenter presenter;
    private String intentId;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dan_pin_details);
        initView();
        initData();
    }

    private void initData() {
        mContext = this;
        Intent intent=getIntent();
        intentId = intent.getIntExtra("intentId",-1)+"";
        //初始化presenter对象
        presenter = new DanPinDetailsPresenter(this);
        //拼凑map数据源
        Map<String, String> map = new HashMap<>();
        map.put(UrlConfig.Key.LIMIT, UrlConfig.DefaultValue.DEFAULT_LIMIT);
        map.put(UrlConfig.Key.OFFSET, UrlConfig.DefaultValue.DEFAULT_OFFSET);
        //调用获取数据的方法
        presenter.getCategroyDPDetailsBean(intentId, map);
    }

    private void initView() {
        gridview_danpindetails = (GridView) findViewById(R.id.gridview_danpindetails);
    }

    @Override
    public void getCategroyDPDetailsBeanSuccess(List<CategroyDPDetailsItemsBean> params) {
        //初始化适配器
        detailsgridviewAdapter = new DanpinDetailsgridviewAdapter(mContext, params);
        //设置适配器
        gridview_danpindetails.setAdapter(detailsgridviewAdapter);
    }

    @Override
    public void getCategroyDPDetailsBeanFail(String error) {

    }
}
