package com.virgil.presentpj.ui.hot.fragment.pinglun;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.virgil.presentpj.R;
import com.virgil.presentpj.ui.hot.HotFragment;
import com.virgil.presentpj.ui.hot.adapter.HotPingLunBaseAdapter;
import com.virgil.presentpj.ui.hot.bean.PingLun3CommentsBean;
import com.virgil.presentpj.ui.hot.bean.PingLunTwoBean;
import com.virgil.presentpj.ui.hot.config.UrlConfig;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/9/1.
 */
public class PingLunFragment extends Fragment implements PingLunContract.View{
    private PingLunContract.Presenter presenter;
    private Context mContext=null;
    private PullToRefreshListView hot_pinglun_listview;
    private HotPingLunBaseAdapter pingLunBaseAdapter;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext=getContext();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_pinglun,container,false);
        hot_pinglun_listview= (PullToRefreshListView) view.findViewById(R.id.hot_pinglun_listview);
        presenter=new PingLunPresenter(this);
        Map<String,String> parmas=new HashMap<>();
        parmas.put(UrlConfig.Key04.LIMIT,UrlConfig.DefaultValue04.LIMIT);
        parmas.put(UrlConfig.Key04.OFFSET,UrlConfig.DefaultValue04.OFFSET);
        presenter.getPingLun(HotFragment.urlId,parmas);
        return view;
    }

    @Override
    public void onGetPingLunSucess(List<PingLun3CommentsBean> pingLun3CommentsBeen) {
        pingLunBaseAdapter=new HotPingLunBaseAdapter(mContext,pingLun3CommentsBeen);
        hot_pinglun_listview.setAdapter(pingLunBaseAdapter);
    }

    @Override
    public void onGetPingLunFail(String err) {

    }
}
