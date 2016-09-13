package com.virgil.presentpj.ui.category.gonglue;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import com.virgil.presentpj.R;
import com.virgil.presentpj.bean.OtherItemsBean;
import com.virgil.presentpj.config.UrlConfig;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GLOtherActivity extends AppCompatActivity implements GLOtherContract.View {

    private GLOtherDetailsListAdapter otherDetailsListAdapter;
    private ListView listview_other_list;
    private GLOtherPresenter presenter;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glother);
        initView();
        initData();

    }

    private void initData() {
        mContext = this;
        Intent intent = getIntent();
        String id = intent.getIntExtra("id", -1) + "";
        Map<String, String> map = new HashMap<>();
        map.put(UrlConfig.Key.LIMIT, UrlConfig.DefaultValue.DEFAULT_LIMIT);
        map.put(UrlConfig.Key.OFFSET, UrlConfig.DefaultValue.DEFAULT_OFFSET);
        presenter = new GLOtherPresenter(this);
        presenter.getOtherDetailsBean(map, id);
    }

    private void initView() {
        listview_other_list = (ListView) findViewById(R.id.listview_other_list);
    }

    @Override
    public void getOtherDetailsBeanSuccess(List<OtherItemsBean> params) {
        otherDetailsListAdapter = new GLOtherDetailsListAdapter(mContext, params);
        Log.i("paramas",params.size()+"");
        for (int i = 0; i < params.size(); i++) {
            Log.i("pa",params.get(i).getCoverImageUrl());
        }
        listview_other_list.setAdapter(otherDetailsListAdapter);
    }

    @Override
    public void getOtherDetailsBeanFail(String error) {
        Toast.makeText(mContext, error, Toast.LENGTH_SHORT).show();
    }
}
