package com.virgil.presentpj.ui.category.gonglue;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.virgil.presentpj.R;
import com.virgil.presentpj.bean.ColumnsBean;
import com.virgil.presentpj.bean.ProgramaBean;

import java.util.List;

/**
 * Created by My on 2016/8/31.
 */
public class ProgramaAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<ColumnsBean> list;
    private Context context;
    private LayoutInflater inflater;
    private OnItemClickedListener listener;
    private RecyclerView recyclerView;

    public ProgramaAdapter(Context context, List<ColumnsBean> list,RecyclerView recyclerView) {
        this.context = context;
        this.list = list;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.recyclerView=recyclerView;
    }
    public void setOnItemClickedListener(OnItemClickedListener _listener){
        listener=_listener;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //填充布局文件
        View view = inflater.inflate(R.layout.item_recyclerview_programa, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        //为控件进行赋值
        MyViewHolder myViewHolder = (MyViewHolder) holder;
       ColumnsBean columnsBean = list.get(position);
        String author = columnsBean.getAuthor();
        String title = columnsBean.getTitle();
        String subtitle = columnsBean.getSubtitle();
        String bannerImageUrl = columnsBean.getBannerImageUrl();
        if (author != null) {
            myViewHolder.textview_item_author.setText(author);
        }
        if (title != null) {
            myViewHolder.textview_item_title.setText(title);
        }
        if (subtitle != null) {
            myViewHolder.textview_item_subtitle.setText(subtitle);
        }
        if (bannerImageUrl != null) {
            Glide.with(context).load(bannerImageUrl).into(myViewHolder.imageview_item_icon);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageview_item_icon;
        public TextView textview_item_title;
        public TextView textview_item_subtitle;
        public TextView textview_item_author;
        //进行控件的声明

        public MyViewHolder(View itemView) {
            super(itemView);
            //进行控件的初始化
            imageview_item_icon = (ImageView) itemView.findViewById(R.id
                    .imageview_item_icon);
            textview_item_title = (TextView) itemView.findViewById(R.id.textview_item_title);
            textview_item_subtitle = (TextView) itemView.findViewById(R.id.textview_item_subtitle);
            textview_item_author = (TextView) itemView.findViewById(R.id.textview_item_author);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener!=null){
                        int position=recyclerView.getChildAdapterPosition(v);
                        listener.onItemClick(position);
                    }
                }
            });
        }
    }

    public interface OnItemClickedListener{
        void onItemClick(int position);
    }
}
