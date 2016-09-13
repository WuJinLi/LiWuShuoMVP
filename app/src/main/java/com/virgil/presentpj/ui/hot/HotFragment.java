package com.virgil.presentpj.ui.hot;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.handmark.pulltorefresh.library.PullToRefreshGridView;
import com.virgil.presentpj.R;
import com.virgil.presentpj.ui.hot.adapter.HotAdapter;
import com.virgil.presentpj.ui.hot.bean.DetailsBean;
import com.virgil.presentpj.ui.hot.config.UrlConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 热门的碎片
 */
public class HotFragment extends Fragment implements HotContract.View{
    private HotContract.PreSenter preSenter;
    private PullToRefreshGridView gridView_hot;
    private HotAdapter hotAdapter;
    private Context mContext;
    private int currpage=0;
    private List<DetailsBean>list=new ArrayList<>();
    private Handler handler=new Handler();
    private Toolbar hot_gridview_toolbar;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext=getContext();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
    Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_hot,container,false);
        gridView_hot= (PullToRefreshGridView) view.findViewById(R.id.hot_gridview);
        hot_gridview_toolbar= (Toolbar) view.findViewById(R.id.hot_gridview_toolbar);
        preSenter=new HotPresenter(this);
        Map<String,String> params=new HashMap<>();
        params.put(UrlConfig.Key.GENDER,UrlConfig.DefaultValue.GENDER);
        params.put(UrlConfig.Key.LIMIT,UrlConfig.DefaultValue.LIMIT);
        params.put(UrlConfig.Key.GENERATION,UrlConfig.DefaultValue.GENERATION);
        preSenter.getHot(params);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onGetHotSucess(List<DetailsBean> roomBean) {
        hotAdapter=new HotAdapter(mContext,roomBean);
        gridView_hot.setAdapter(hotAdapter);
        hot_gridview_toolbar.setTitle("");
        ((AppCompatActivity) getActivity()).setSupportActionBar(hot_gridview_toolbar);
        Intent intent=new Intent();
        //intent.setClass(getActivity(),);
    }

    @Override
    public void onGetHotFail(String err) {

    }
}
