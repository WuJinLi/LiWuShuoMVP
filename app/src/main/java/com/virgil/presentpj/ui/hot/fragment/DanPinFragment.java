package com.virgil.presentpj.ui.hot.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.virgil.presentpj.R;
import com.virgil.presentpj.ui.hot.HotFragment;
import com.virgil.presentpj.ui.hot.activity.ItemDianJiActivity;
import com.virgil.presentpj.ui.hot.adapter.GridViewAdapter;
import com.virgil.presentpj.ui.hot.adapter.HotAdapter;
import com.virgil.presentpj.ui.hot.bean.DataBean02;
import com.virgil.presentpj.ui.hot.bean.RecommendItemsBean;
import com.virgil.presentpj.ui.hot.config.UrlConfig;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/9/1.
 */
public class DanPinFragment extends Fragment implements DanPinContract.View{
    private DanPinContract.PreSenter preSenter;
    private ImageView danpin_activity_imageviewtop;
    private TextView danpin_activity_textviewtop;
    private TextView danpin_activity_textviewpric;
    private TextView danpin_activity_textviewjieshao;
    private ImageView danpin_activity_imageviewzheng;
    private ImageView danpin_activity_imageviewback;
    private GridView danpin_activity_gridview;
    private Context mContext=null;
    private String dataBean;
    private GridViewAdapter gridViewAdapter;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext=getContext();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_danpin,null);
        preSenter=new DanPinPresenter(this);
        danpin_activity_imageviewtop= (ImageView) view.findViewById(R.id.danpin_activity_imageviewtop);
        //danpin_activity_imageviewzheng= (ImageView) view.findViewById(R.id.danpin_activity_imageviewzheng);
        //danpin_activity_imageviewback= (ImageView) view.findViewById(R.id.danpin_activity_imageviewback);
        danpin_activity_textviewtop= (TextView) view.findViewById(R.id.danpin_activity_textviewtop);
        danpin_activity_textviewpric= (TextView) view.findViewById(R.id.danpin_activity_textviewpric);
        danpin_activity_textviewjieshao= (TextView) view.findViewById(R.id.danpin_activity_textviewjieshao);
        danpin_activity_gridview= (GridView) view.findViewById(R.id.danpin_activity_gridview);
        Map<String,String> params=new HashMap<>();
        params.put(UrlConfig.Key03.NUM,UrlConfig.DefaultValue03.NUM);
        params.put(UrlConfig.Key03.POST_NUM,UrlConfig.DefaultValue03.POST_NUM);
        preSenter.getDanPin(HotFragment.urlId);
        preSenter.getCaiNiXiHuang(HotFragment.urlId,params);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onGetDanPinSucess(DataBean02 dataBean02) {
        dataBean=dataBean02.getName();
        Log.i("---s>",dataBean+"");
        Toast.makeText(getContext(),"...................",Toast.LENGTH_LONG).show();
        //控件赋值
        danpin_activity_textviewtop.setText(dataBean02.getName());
        Log.i("====dd>",dataBean02.getName()
        + "");
        danpin_activity_textviewpric.setText(dataBean02.getPrice());
        danpin_activity_textviewjieshao.setText(dataBean02.getDescription());
        //图片赋值
        Glide.with(mContext).load(dataBean02.getCoverImageUrl()).into(danpin_activity_imageviewtop);
    }

    @Override
    public void onGetDanPinFail(String erro) {
        Toast.makeText(getContext(),"网络失败了",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onGetCaiNiXiHuangSucess(List<RecommendItemsBean> recommendItemsBeen) {
        gridViewAdapter=new GridViewAdapter(mContext,recommendItemsBeen);
        danpin_activity_gridview.setAdapter(gridViewAdapter);
        danpin_activity_gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent();
                intent.setClass(getActivity(), ItemDianJiActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onGetCaiNiXiHuangFail(String erro) {

    }
}
