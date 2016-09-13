package com.virgil.presentpj.ui.hot.fragment.xiangqing;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.virgil.presentpj.R;
import com.virgil.presentpj.ui.hot.HotFragment;
import com.virgil.presentpj.ui.hot.bean.DataBean02;
import com.virgil.presentpj.ui.hot.bean.XiangQing2Bean;
import com.virgil.presentpj.ui.hot.fragment.pinglun.PingLunContract;

/**
 * Created by Administrator on 2016/9/1.
 */
public class XinagQingFragment extends Fragment implements XiangQingContract.View{
    private XiangQingContract.PreSenter preSenter;
    private Context mContext=null;
    private ImageView hot_xiangqing_imageview01;
    private ImageView hot_xiangqing_imageview02;
    private ImageView hot_xiangqing_imageview03;
    private ImageView hot_xiangqing_imageview04;
    private ImageView hot_xiangqing_imageview05;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        preSenter=new XiangQingPresenter(this);
        mContext=getContext();
        View view=inflater.inflate(R.layout.fragment_xiangqing,container,false);
        hot_xiangqing_imageview01= (ImageView) view.findViewById(R.id.hot_xiangqing_imageview01);
        hot_xiangqing_imageview02= (ImageView) view.findViewById(R.id.hot_xiangqing_imageview02);
        hot_xiangqing_imageview03= (ImageView) view.findViewById(R.id.hot_xiangqing_imageview03);
        hot_xiangqing_imageview04= (ImageView) view.findViewById(R.id.hot_xiangqing_imageview04);
        hot_xiangqing_imageview05= (ImageView) view.findViewById(R.id.hot_xiangqing_imageview05);
        preSenter.getXinagQing(HotFragment.urlId);
        return view;
    }

    @Override
    public void onGetXinagQingSucess(XiangQing2Bean dataBean02) {
        //图片赋值
        Glide.with(mContext).load(dataBean02.getCoverWebpUrl()).into(hot_xiangqing_imageview01);
        Glide.with(mContext).load(dataBean02.getPurchaseUrl()).into(hot_xiangqing_imageview02);
        Glide.with(mContext).load(dataBean02.getCoverImageUrl()).into(hot_xiangqing_imageview03);
//        Glide.with(mContext).load(dataBean02.getImageUrls()).into(hot_xiangqing_imageview04);
        Glide.with(mContext).load(dataBean02.getCoverWebpUrl()).into(hot_xiangqing_imageview05);
    }

    @Override
    public void onGetXinagQingFail(String erro) {

    }
}
