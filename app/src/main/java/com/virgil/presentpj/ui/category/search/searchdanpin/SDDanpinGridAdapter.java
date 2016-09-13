package com.virgil.presentpj.ui.category.search.searchdanpin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.virgil.presentpj.R;
import com.virgil.presentpj.bean.SearchDanPinBean;
import com.virgil.presentpj.bean.SearchDanPinItemBean;

import java.util.List;

/**
 *搜索详情单品
 */
public class SDDanpinGridAdapter extends BaseAdapter {
    private Context context;
    private List<SearchDanPinItemBean> list;
    private LayoutInflater inflater;

    public SDDanpinGridAdapter(Context context, List<SearchDanPinItemBean> list) {
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
        SearchDanPinItemBean searchDanPinItemBean = list.get(position);
        String name = searchDanPinItemBean.getName();
        String coverImageUrl = searchDanPinItemBean.getCoverImageUrl();
        String price = searchDanPinItemBean.getPrice();
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
        public ImageView imageview_item_sddanpin_icon;
        public TextView textview_item_sddanpin_name;
        public TextView textview_item_sddanpin_price;

        public ViewHolder(View convertView) {
            textview_item_sddanpin_price = (TextView) convertView.findViewById(R.id
                    .textview_item_sddanpin_price);
            textview_item_sddanpin_name = (TextView) convertView.findViewById(R.id
                    .textview_item_sddanpin_name);
            imageview_item_sddanpin_icon = (ImageView) convertView.findViewById(R.id
                    .imageview_item_sddanpin_icon);

        }
    }
}
