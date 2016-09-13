package com.virgil.presentpj.ui.category.gonglue;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.virgil.presentpj.R;
import com.virgil.presentpj.bean.ChannelsBean;
import com.virgil.presentpj.bean.ColumnsBean;

import java.util.List;

public class MoreActivity extends AppCompatActivity implements GongLueContract.View {

    private GridView gridview_more;
    private GongLueAdapter gongLueAdapter;
    private GongLuePresenter presenter;
    private int tag = 0;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);
        initView();
        initData();
    }

    private void initData() {
        mContext = this;
        presenter = new GongLuePresenter(this);
        presenter.getChannel();
        //上一级传入的标签
        tag = getIntent().getIntExtra("tag", -1);
    }

    private void initView() {
        gridview_more = (GridView) findViewById(R.id.gridview_more);
    }
    @Override
    public void onGetProgramaSuccess(List<ColumnsBean> columns) {
    }
    @Override
    public void onGetProgramaFail(String error) {
    }
    @Override
    public void onGetChannelPinSuccess(List<ChannelsBean> columns) {
    }
    @Override
    public void onGetChannelStyleSuccess(List<ChannelsBean> columns) {
    }
    @Override
    public void onGetChannelObjectSuccess(List<ChannelsBean> columns) {
    }
    @Override
    public void onGetListForNetSuccess(List<ChannelsBean> list_pinlei, List<ChannelsBean>
            list_object) {
        if (tag == 0) {
            Toast.makeText(mContext, "没有数据", Toast.LENGTH_SHORT).show();
        } else {
            if (tag == 1) {
                gongLueAdapter = new GongLueAdapter(mContext, list_pinlei);
            }
            if (tag == 2) {
                gongLueAdapter = new GongLueAdapter(mContext, list_object);
            }
            gridview_more.setAdapter(gongLueAdapter);

            if (tag == 1) {
                gridview_more.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long
                            id) {
                        ChannelsBean channelsBean = (ChannelsBean) gongLueAdapter.getItem(position);
                        int id1 = channelsBean.getId();
                        Intent intent = new Intent(MoreActivity.this, GLOtherActivity.class);
                        intent.putExtra("id", id1);
                        startActivity(intent);
                    }
                });
            }
            if (tag == 2) {
                gridview_more.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long
                            id) {
                        ChannelsBean channelsBean = (ChannelsBean) gongLueAdapter.getItem(position);
                        int id1 = channelsBean.getId();
                        Intent intent = new Intent(MoreActivity.this, GLOtherActivity.class);
                        intent.putExtra("id", id1);
                        startActivity(intent);
                    }
                });
            }
        }
    }
}
