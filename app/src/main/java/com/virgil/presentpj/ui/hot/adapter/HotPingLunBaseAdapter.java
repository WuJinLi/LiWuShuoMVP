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
import com.virgil.presentpj.ui.hot.bean.PingLun3CommentsBean;
import com.virgil.presentpj.ui.hot.bean.PingLunTwoBean;

import java.util.List;

/**
 * Created by Administrator on 2016/9/3.
 */
public class HotPingLunBaseAdapter extends BaseAdapter {
    private List<PingLun3CommentsBean> list;
    private Context mContext=null;
    private LayoutInflater inflater;

    public HotPingLunBaseAdapter(Context mContext,List<PingLun3CommentsBean> list){
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
        ViewHolder03 mViewHolder03=null;
        if (convertView==null){
            convertView=inflater.inflate(R.layout.item_hot_pinglun_listview,parent,false);
            mViewHolder03=new ViewHolder03(convertView);
            convertView.setTag(mViewHolder03);
        }else {
            mViewHolder03= (ViewHolder03) convertView.getTag();
        }
        //控件赋值
        mViewHolder03.hot_pinglun_textviewTouXinag.setText(list.get(position).getUser().getNickname());
        mViewHolder03.hot_pinglun_textviewContent.setText(list.get(position).getContent());
        //图片赋值
        Glide.with(mContext).load(list.get(position).getUser().getAvatarUrl()).into(mViewHolder03.hot_pinglun_imagetitle);
        return convertView;
    }
    public class ViewHolder03{
        ImageView hot_pinglun_imagetitle;
        TextView hot_pinglun_textviewTouXinag;
        TextView hot_pinglun_textviewContent;
        public ViewHolder03(View convertView){
            hot_pinglun_imagetitle= (ImageView) convertView.findViewById(R.id.hot_pinglun_imagetitle);
            hot_pinglun_textviewTouXinag= (TextView) convertView.findViewById(R.id.hot_pinglun_textviewTouXinag);
            hot_pinglun_textviewContent= (TextView) convertView.findViewById(R.id.hot_pinglun_textviewContent);
        }
    }

}
