package com.virgil.presentpj.ui.category.gonglue;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.virgil.presentpj.R;
import com.virgil.presentpj.bean.PostsBean;

import java.util.List;

/**
 * Created by My on 2016/9/1.
 */
public class ProgramaDetailsListAdapter extends BaseAdapter {
    private List<PostsBean> list;
    private Context context;
    private LayoutInflater inflater;

    public ProgramaDetailsListAdapter(Context context, List<PostsBean> list) {
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
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_listview_programadetials, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        PostsBean postsBean = list.get(position);
        String nickname = postsBean.getAuthor().getNickname();
        String title = postsBean.getTitle();
        String coverImageUrl = postsBean.getCoverImageUrl();
        if (nickname != null) {
            holder.textview_item_nickname.setText(nickname);
        }
        if (title != null) {
            holder.textview_item_title.setText(title);
        }

        if (convertView != null) {
            Glide.with(context).load(coverImageUrl).into(holder.imageview_item_icon);
        }
        return convertView;
    }

    class ViewHolder {
        public ImageView imageview_item_icon;
        public TextView textview_item_title;
        public TextView textview_item_nickname;

        public ViewHolder(View convertView) {
            textview_item_title = (TextView) convertView.findViewById(R.id.textview_item_title);
            textview_item_nickname = (TextView) convertView.findViewById(R.id
                    .textview_item_nickname);
            imageview_item_icon = (ImageView) convertView.findViewById(R.id.imageview_item_icon);
        }
    }
}
