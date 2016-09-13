package com.virgil.presentpj.ui.category.danpin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.virgil.presentpj.R;
import com.virgil.presentpj.bean.SubcategoriesBean;

import java.util.List;

/**
 * Created by My on 2016/9/2.
 */
public class RightGridViewAdapter extends BaseAdapter {
    private Context context;
    private List<SubcategoriesBean> list;
    private LayoutInflater inflater;

    public RightGridViewAdapter(Context context, List<SubcategoriesBean> list) {
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
            convertView = inflater.inflate(R.layout.item_gridview_righet, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        String iconUrl = list.get(position).getIconUrl();
        String name = list.get(position).getName();
        Glide.with(context).load(iconUrl).into(holder.imageview_item_icon);
        holder.textview_item_name.setText(name);
        return convertView;
    }


    class ViewHolder {
        public ImageView imageview_item_icon;
        public TextView textview_item_name;

        public ViewHolder(View convertView) {
            textview_item_name = (TextView) convertView.findViewById(R.id.textview_item_name);
            imageview_item_icon = (ImageView) convertView.findViewById(R.id.imageview_item_icon);
        }
    }
}
