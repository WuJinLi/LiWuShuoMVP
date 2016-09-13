package com.virgil.presentpj.ui.hot.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.virgil.presentpj.R;
import com.virgil.presentpj.ui.hot.bean.RecommendItemsBean;

import java.util.List;

/**
 * Created by Administrator on 2016/9/2.
 */
public class GridViewAdapter extends BaseAdapter {
    private Context mContext=null;
    private List<RecommendItemsBean> list;
    private LayoutInflater inflater;

    public GridViewAdapter(Context mContext,List<RecommendItemsBean> list){
        this.mContext=mContext;
        this.list=list;
        inflater= (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        Log.i("hhh>",list.size()+"");
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
        ViewHolder02 mViewHolder02=null;
        if (convertView==null){
            convertView=inflater.inflate(R.layout.item_hot_gridview,parent,false);
            mViewHolder02=new ViewHolder02(convertView);
            convertView.setTag(mViewHolder02);
        }else {
            mViewHolder02= (ViewHolder02) convertView.getTag();
        }
        //控件赋值
        mViewHolder02.hot_gridview_textview02.setText(list.get(position).getName());
        Log.i("ppp>",list.get(position).getName()+"");
        mViewHolder02.hot_gridview_textviewpric.setText(list.get(position).getPrice());
        //图片赋值
        Glide.with(mContext).load(list.get(position).getCoverImageUrl()).into(mViewHolder02.hot_gridview_imageview02);
        return convertView;
    }

    public class ViewHolder02{
        ImageView hot_gridview_imageview02;
        TextView hot_gridview_textview02;
        TextView hot_gridview_textviewpric;
        public ViewHolder02(View convertView){
            hot_gridview_imageview02= (ImageView) convertView.findViewById(R.id.hot_gridview_imageview02);
            hot_gridview_textview02= (TextView) convertView.findViewById(R.id.hot_gridview_textview02);
            hot_gridview_textviewpric= (TextView) convertView.findViewById(R.id.hot_gridview_textviewpric);
        }
    }
}
