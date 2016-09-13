package com.virgil.presentpj.ui.home;

import com.virgil.presentpj.bean.HomeTabLayoutBean;
import com.virgil.presentpj.http.HttpUtils;

import java.util.Map;

import retrofit2.Callback;

/**
 * Created by virgil on 2016/8/30.
 * email 841864388@qq.com
 */
public class HomeModle implements HomeContract.Modle {
    @Override
    public void getHomeTabData(Map<String, String> params, Callback<HomeTabLayoutBean> callback) {
        HttpUtils.getSingleton().getHomeTabData(params, callback);
    }
}
