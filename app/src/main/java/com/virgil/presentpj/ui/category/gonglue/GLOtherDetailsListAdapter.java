package com.virgil.presentpj.ui.category.gonglue;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.virgil.presentpj.R;
import com.virgil.presentpj.bean.OtherAuthorBean;
import com.virgil.presentpj.bean.OtherColumnBean;
import com.virgil.presentpj.bean.OtherItemsBean;


import java.util.List;

/**
 * Created by My on 2016/9/1.
 */
public class GLOtherDetailsListAdapter extends BaseAdapter {
    private Context context;
    private List<OtherItemsBean> list;
    private LayoutInflater inflater;

    public GLOtherDetailsListAdapter(Context context, List<OtherItemsBean> list) {
        this.context = context;
        this.list = list;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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
        MyViewHolder holder = null;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_listview_other, parent, false);
            holder = new MyViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (MyViewHolder) convertView.getTag();
        }
        OtherItemsBean otherItemsBean = list.get(position);
        String descTitle1 = otherItemsBean.getTitle();
        String coverImageUrl = otherItemsBean.getCoverImageUrl();

        OtherAuthorBean author = otherItemsBean.getAuthor();
        String avatarUrl = author.getAvatarUrl();
        String nickname = author.getNickname();

        OtherColumnBean column = otherItemsBean.getColumn();
        String category = column.getCategory();
        String title = column.getTitle();

        holder.textview_item_other_author.setText(nickname);
        holder.textview_item_other_categroy.setText(category);
        holder.textview_item_other_title.setText(title);
        holder.textview_item_other_descTitle.setText(descTitle1);
        Glide.with(context).load(avatarUrl).into(holder.imageview_item_other_avatar);
        Glide.with(context).load(coverImageUrl).into(holder.imageview_item_other_icon);
        return convertView;
    }


    class MyViewHolder {
        public TextView textview_item_other_categroy;
        public TextView textview_item_other_title;
        public TextView textview_item_other_author;
        public TextView textview_item_other_descTitle;
        public ImageView imageview_item_other_avatar;
        public ImageView imageview_item_other_icon;

        public MyViewHolder(View convertView) {
            textview_item_other_categroy = (TextView) convertView.findViewById(R.id
                    .textview_item_other_categroy);
            textview_item_other_title = (TextView) convertView.findViewById(R.id
                    .textview_item_other_title);
            textview_item_other_author = (TextView) convertView.findViewById(R.id
                    .textview_item_other_author);
            textview_item_other_descTitle = (TextView) convertView.findViewById(R.id
                    .textview_item_other_descTitle);
            imageview_item_other_avatar = (ImageView) convertView.findViewById(R.id
                    .imageview_item_other_avatar);
            imageview_item_other_icon = (ImageView) convertView.findViewById(R.id
                    .imageview_item_other_icon);
        }
    }
}
