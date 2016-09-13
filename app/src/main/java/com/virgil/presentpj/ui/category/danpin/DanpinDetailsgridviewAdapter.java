package com.virgil.presentpj.ui.category.danpin;

import android.content.Context;
import android.support.v7.widget.LinearSmoothScroller;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.virgil.presentpj.R;
import com.virgil.presentpj.bean.CategroyDPDetailsItemsBean;

import java.util.List;

/**
 * Created by My on 2016/9/3.
 */
public class DanpinDetailsgridviewAdapter extends BaseAdapter {
    private List<CategroyDPDetailsItemsBean> list;
    private Context context;
    private LayoutInflater inflater;

    public DanpinDetailsgridviewAdapter(Context context, List<CategroyDPDetailsItemsBean> list) {
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
            convertView = inflater.inflate(R.layout.item_gridview_sddanpin, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        CategroyDPDetailsItemsBean categroyDPDetailsItemsBean = list.get(position);
        String coverImageUrl = categroyDPDetailsItemsBean.getCoverImageUrl();
        String name = categroyDPDetailsItemsBean.getName();
        String price = categroyDPDetailsItemsBean.getPrice();

        if (name != null) {
            holder.textview_item_sddanpin_name.setText(name);
        }
        if (price != null) {
            holder.textview_item_sddanpin_price.setText(price);
        }
        if (coverImageUrl != null) {
            Glide.with(context).load(coverImageUrl).into(holder.imageview_item_sddanpin_icon);
        }
        return convertView;
    }

    class ViewHolder {
        private ImageView imageview_item_sddanpin_icon;
        private TextView textview_item_sddanpin_name;
        private TextView textview_item_sddanpin_price;

        public ViewHolder(View convertView) {
            imageview_item_sddanpin_icon = (ImageView) convertView.findViewById(R.id
                    .imageview_item_sddanpin_icon);
            textview_item_sddanpin_name = (TextView) convertView.findViewById(R.id
                    .textview_item_sddanpin_name);
            textview_item_sddanpin_price = (TextView) convertView.findViewById(R.id
                    .textview_item_sddanpin_price);
        }
    }
}
