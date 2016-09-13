package com.virgil.presentpj.ui.category.search.searchgonglue;

import com.virgil.presentpj.bean.SearchGongLueBean;
import com.virgil.presentpj.http.HttpUtils;

import java.util.Map;

import retrofit2.Callback;

/**
 * 搜索详情攻略
 */
public class SDGonglueModle implements SDGonglueContract.Modle {
    @Override
    public void getSearchGongLueBean(Map<String, String> params, Callback<SearchGongLueBean>
            callback) {
        HttpUtils.getSingleton().getSearchGongLueBean(params, callback);
    }
}
