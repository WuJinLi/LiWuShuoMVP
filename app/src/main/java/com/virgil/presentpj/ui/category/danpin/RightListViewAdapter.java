package com.virgil.presentpj.ui.category.danpin;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.virgil.presentpj.R;
import com.virgil.presentpj.bean.CategoriesBean;
import com.virgil.presentpj.bean.SubcategoriesBean;
import com.virgil.presentpj.widget.MyGridView;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by My on 2016/9/2.
 */
public class RightListViewAdapter extends BaseAdapter {
    private List<CategoriesBean> list;
    private Context context;
    private LayoutInflater inflater;

    public RightListViewAdapter(Context context, List<CategoriesBean> list) {
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
            convertView = inflater.inflate(R.layout.item_rightlistview, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        CategoriesBean categoriesBean = list.get(position);
        String name = categoriesBean.getName();
        List<SubcategoriesBean> subcategories = categoriesBean.getSubcategories();
        final RightGridViewAdapter rightGridViewAdapter = new RightGridViewAdapter(context,
                subcategories);
        holder.textview_item_name.setText(name);
        holder.gridview_item_grid.setAdapter(rightGridViewAdapter);

        holder.gridview_item_grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(context, DanPinDetailsActivity.class);
                SubcategoriesBean bean = (SubcategoriesBean) rightGridViewAdapter.getItem(position);
                int id1 = bean.getId();
                intent.putExtra("intentId",id1);
                Log.i("intentId",id1+"");
                context.startActivity(intent);
            }
        });
        return convertView;
    }

    class ViewHolder {
        private TextView textview_item_name;
        private com.virgil.presentpj.widget.MyGridView gridview_item_grid;

        public ViewHolder(View convertView) {
            gridview_item_grid = (MyGridView) convertView.findViewById(R.id.gridview_item_grid);
            textview_item_name = (TextView) convertView.findViewById(R.id.textview_item_name);
        }
    }
}
