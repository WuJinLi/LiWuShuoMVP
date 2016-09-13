package com.virgil.presentpj.ui.hot.fragment.pinglun;

import com.virgil.presentpj.ui.hot.bean.PingLunOneBean;
import com.virgil.presentpj.ui.hot.fragment.DanPinContract;
import com.virgil.presentpj.ui.hot.http.HttpUtils;

import java.util.Map;

import retrofit2.Callback;

/**
 * Created by Administrator on 2016/9/2.
 */
public class PingLunModle implements PingLunContract.Modle{
    @Override
    public void getPingLun(String path, Map<String, String> params, Callback<PingLunOneBean> callback) {
        HttpUtils.getInstance().grtPingLunData(path,params,callback);
    }
}
