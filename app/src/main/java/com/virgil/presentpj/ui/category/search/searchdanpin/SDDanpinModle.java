package com.virgil.presentpj.ui.category.search.searchdanpin;

import com.virgil.presentpj.bean.SearchDanPinBean;
import com.virgil.presentpj.http.HttpUtils;

import java.util.Map;

import retrofit2.Callback;

/**
 * 搜索详情单品
 */
public class SDDanpinModle implements SDDanpinContract.Modle {
    @Override
    public void getSDDanPinBean(Map<String, String> params, Callback<SearchDanPinBean> callback) {
        HttpUtils.getSingleton().getSearchDanPinBean(params, callback);
    }
}
