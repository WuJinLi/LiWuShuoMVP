package com.virgil.presentpj.ui.category.search.searchgonglue;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.virgil.presentpj.R;
import com.virgil.presentpj.bean.SearchDanPinBean;
import com.virgil.presentpj.bean.SearchGongLuePostsBean;
import com.virgil.presentpj.config.UrlConfig;
import com.virgil.presentpj.ui.category.gonglue.GLOtherDetailsListAdapter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 搜索详情攻略
 */
public class SDGonglueFragment extends Fragment implements SDGonglueContract.View {
    private String keyword;
    private ListView listview_other_list;
    private SDGonglueListAdapter sdGonglueListAdapter;
    private SDGongluePresenter presenter;
    private Context mContext;

    public SDGonglueFragment(String keyword) {
        this.keyword = keyword;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
    Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_glother, container, false);
        listview_other_list = (ListView) view.findViewById(R.id.listview_other_list);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        presenter = new SDGongluePresenter(this);
        mContext = getContext();
        Map<String, String> map = new HashMap<>();
        map.put(UrlConfig.Key.OFFSET, UrlConfig.DefaultValue.DEFAULT_OFFSET);
        map.put(UrlConfig.Key.LIMIT, UrlConfig.DefaultValue.DEFAULT_LIMIT);
        map.put(UrlConfig.Key.KEYWORD, keyword);
        presenter.getSearchGongLueBean(map);
    }

    @Override
    public void getSearchGongLueBeanSuccess(List<SearchGongLuePostsBean> params) {
        //初始化适配器
        sdGonglueListAdapter = new SDGonglueListAdapter(mContext, params);
        //设置适配器
        listview_other_list.setAdapter(sdGonglueListAdapter);
    }

    @Override
    public void getSearchGongLueBeanFail(String error) {
        Toast.makeText(mContext, error, Toast.LENGTH_SHORT).show();
    }
}
