package com.virgil.presentpj.ui.hot.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.virgil.presentpj.R;
import com.virgil.presentpj.ui.hot.bean.DetailsBean;

import java.util.List;

/**
 * Created by Administrator on 2016/8/31.
 */
public class HotAdapter extends BaseAdapter{
    private Context mContext=null;
    private List<DetailsBean> list;
    private LayoutInflater inflater;
    public HotAdapter(Context mContext, List<DetailsBean> list){
        this.mContext=mContext;
        this.list=list;
        inflater= (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder01 mViewHolder01=null;
        if (convertView==null){
            convertView=inflater.inflate(R.layout.frgment_hot_grideview,parent,false);
            mViewHolder01=new ViewHolder01(convertView);
            convertView.setTag(mViewHolder01);
        }else {
            mViewHolder01= (ViewHolder01) convertView.getTag();
        }
        //控件赋值
        mViewHolder01.hot_gridview_textview.setText(list.get(position).getData().getName());
        //图片赋值
        Glide.with(mContext).load(list.get(position).getData().getCoverImageUrl()).into(mViewHolder01.hot_gridview_imageview);
        return convertView;
    }

    class ViewHolder01{
        ImageView hot_gridview_imageview;
        TextView hot_gridview_textview;

         public ViewHolder01 (View convertView){
            hot_gridview_imageview= (ImageView) convertView.findViewById(R.id.hot_gridview_imageview);
            hot_gridview_textview= (TextView) convertView.findViewById(R.id.hot_gridview_textview);
        }
    }
    //刷新
    public void reloadListView(List<DetailsBean> data,boolean isClear){
        if (isClear){
            list.clear();
        }
        list.addAll(data);
        notifyDataSetChanged();
    }

}
