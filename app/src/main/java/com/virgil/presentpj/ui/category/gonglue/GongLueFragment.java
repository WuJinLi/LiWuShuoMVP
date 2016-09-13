package com.virgil.presentpj.ui.category.gonglue;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

import com.virgil.presentpj.R;
import com.virgil.presentpj.bean.ChannelsBean;
import com.virgil.presentpj.bean.ColumnsBean;
import com.virgil.presentpj.bean.ProgramaBean;
import com.virgil.presentpj.widget.MyGridView;

import java.nio.channels.Channels;
import java.util.List;

/**
 * Created by My on 2016/8/31.
 */
public class GongLueFragment extends Fragment implements GongLueContract.View {
    //声明recyclerview的实例
    private RecyclerView mRecyclerview;
    private ProgramaAdapter mProgramaAdapter;
    private Context mContext;
    private GongLuePresenter mGongLuePresenter;
    private TextView textview_gonglue_pinlei_more;
    private TextView textview_gonglue_object_more;

    private com.virgil.presentpj.widget.MyGridView gridview_pinlei;
    private com.virgil.presentpj.widget.MyGridView gridview_style;
    private com.virgil.presentpj.widget.MyGridView gridview_object;
    private GongLueAdapter mGongLueAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
    Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gonglue, container, false);
        mRecyclerview = (RecyclerView) view.findViewById(R.id.recyclerview_lanmu);
        gridview_pinlei = (MyGridView) view.findViewById(R.id.gridview_pinlei);
        gridview_style = (MyGridView) view.findViewById(R.id.gridview_style);
        gridview_object = (MyGridView) view.findViewById(R.id.gridview_object);
        textview_gonglue_pinlei_more= (TextView) view.findViewById(R.id.textview_gonglue_pinlei_more);
        textview_gonglue_object_more= (TextView) view.findViewById(R.id.textview_gonglue_object_more);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mContext = getContext();
        mGongLuePresenter = new GongLuePresenter(this);
        mGongLuePresenter.getPrograma();
        mGongLuePresenter.getChannel();
        //初始化布局管理器
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3,
                StaggeredGridLayoutManager.HORIZONTAL);
        mRecyclerview.setHasFixedSize(true);
        mRecyclerview.setLayoutManager(layoutManager);


        textview_gonglue_pinlei_more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("tag","点击获取更多");
                Intent intent=new Intent(getContext(),MoreActivity.class);
                intent.putExtra("tag",1);
                startActivity(intent);
            }
        });


        textview_gonglue_object_more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("tag","点击获取更多");
                Intent intent=new Intent(getContext(),MoreActivity.class);
                intent.putExtra("tag",2);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onGetProgramaSuccess(final List<ColumnsBean> columns) {
        //数据加载成功
        //初始化适配器
        mProgramaAdapter = new ProgramaAdapter(mContext, columns, mRecyclerview);
        mRecyclerview.setAdapter(mProgramaAdapter);

        mProgramaAdapter.setOnItemClickedListener(new ProgramaAdapter.OnItemClickedListener() {
            @Override
            public void onItemClick(int position) {
                //点击条目进行页面的跳转,查看详情
                ColumnsBean columnsBean = columns.get(position);
                int id = columnsBean.getId();
                Intent intent = new Intent(getActivity(), GLLanMuDetalsActivity.class);
                intent.putExtra("id", id);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onGetProgramaFail(String error) {
        //数据加载失败
        Toast.makeText(mContext, error, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onGetChannelPinSuccess(final List<ChannelsBean> columns) {
        mGongLueAdapter = new GongLueAdapter(mContext, columns);
        gridview_pinlei.setAdapter(mGongLueAdapter);

        gridview_pinlei.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ChannelsBean channelsBean = columns.get(position);
                //进行intent传值
                int id1 = channelsBean.getId();
                Intent intent = new Intent(getActivity(), GLOtherActivity.class);
                intent.putExtra("id", id1);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onGetChannelStyleSuccess(final List<ChannelsBean> columns) {
        mGongLueAdapter = new GongLueAdapter(mContext, columns);
        gridview_style.setAdapter(mGongLueAdapter);
        gridview_style.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ChannelsBean channelsBean = columns.get(position);
                int id1 = channelsBean.getId();
                Intent intent = new Intent(getActivity(), GLOtherActivity.class);
                intent.putExtra("id", id1);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onGetChannelObjectSuccess(final List<ChannelsBean> columns) {
        mGongLueAdapter = new GongLueAdapter(mContext, columns);
        gridview_object.setAdapter(mGongLueAdapter);

        gridview_object.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ChannelsBean channelsBean = columns.get(position);
                int id1 = channelsBean.getId();
                Intent intent = new Intent(getActivity(), GLOtherActivity.class);
                intent.putExtra("id", id1);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onGetListForNetSuccess(List<ChannelsBean> list_pinlei, List<ChannelsBean>
            list_object) {
    }
}
