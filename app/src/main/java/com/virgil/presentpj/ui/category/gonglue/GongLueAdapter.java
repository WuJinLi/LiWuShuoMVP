package com.virgil.presentpj.ui.category.gonglue;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.virgil.presentpj.R;
import com.virgil.presentpj.bean.ChannelsBean;

import java.nio.channels.Channels;
import java.util.List;

/**
 * Created by My on 2016/8/31.
 */
public class GongLueAdapter extends BaseAdapter {
    private List<ChannelsBean> list;
    private Context context;
    private LayoutInflater inflater;

    public GongLueAdapter(Context context, List<ChannelsBean> list) {
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
            convertView = inflater.inflate(R.layout.item_gridview_gonglue, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        ChannelsBean channelsBean = list.get(position);
        String iconUrl = channelsBean.getCoverImageUrl();
        if (iconUrl != null) {
            Glide.with(context).load(iconUrl).into(holder.imageview_item_gonglue);
        }
        return convertView;
    }

    class ViewHolder {
        private ImageView imageview_item_gonglue;

        public ViewHolder(View convertView) {
            imageview_item_gonglue = (ImageView) convertView.findViewById(R.id
                    .imageview_item_gonglue);
        }
    }
}
