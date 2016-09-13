package com.virgil.presentpj.ui.category.search.searchdanpin;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.Toast;

import com.virgil.presentpj.R;
import com.virgil.presentpj.bean.SearchDanPinBean;
import com.virgil.presentpj.bean.SearchDanPinItemBean;
import com.virgil.presentpj.config.UrlConfig;

import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 搜索详情单品
 */
public class SDDanpinFragment extends Fragment implements SDDanpinContract.View {
    private String keyword;
    private GridView gridview_sddanpinFragment;
    private SDDanpinGridAdapter sdDanpinGridAdapter;
    private SDDanpinPresenter presenter;
    private Context mContext;

    public SDDanpinFragment(String keyword) {
        this.keyword = keyword;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
    Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sddanpin, container, false);
        gridview_sddanpinFragment = (GridView) view.findViewById(R.id.gridview_sddanpinFragment);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mContext = getContext();
        presenter = new SDDanpinPresenter(this);
        Map<String, String> map = new HashMap<>();
        map.put(UrlConfig.Key.LIMIT, UrlConfig.DefaultValue.DEFAULT_LIMIT);
        map.put(UrlConfig.Key.OFFSET, UrlConfig.DefaultValue.DEFAULT_OFFSET);
        map.put(UrlConfig.Key.KEYWORD, keyword);
        presenter.getSDDanPinBean(map);
    }

    @Override
    public void getSDDanPinBeanSuccess(List<SearchDanPinItemBean> params) {
        sdDanpinGridAdapter = new SDDanpinGridAdapter(mContext, params);
        gridview_sddanpinFragment.setAdapter(sdDanpinGridAdapter);
    }

    @Override
    public void getSDDanPinBeanFail(String error) {
        Toast.makeText(mContext, error, Toast.LENGTH_SHORT).show();
    }
}
