package com.virgil.presentpj.ui.hot.fragment;

import android.util.Log;

import com.virgil.presentpj.ui.hot.bean.DataBean03;
import com.virgil.presentpj.ui.hot.bean.ItemsDetailsBean;
import com.virgil.presentpj.ui.hot.http.HttpUtils;

import java.util.Map;

import retrofit2.Callback;

/**
 * Created by Administrator on 2016/9/1.
 */
public class DanPinModle implements DanPinContract.Modle {
    @Override
    public void getDanPin(String params, Callback<ItemsDetailsBean> callback) {
        HttpUtils.getInstance().getDanPinData(params,callback);
    }

    @Override
    public void getCaiNiXiHuang(String path, Map<String, String> params, Callback<DataBean03> callback) {
        HttpUtils.getInstance().getCaiNiXiHuangData(path,params,callback);
    }
}
