package com.virgil.presentpj.ui.hot;

import com.virgil.presentpj.ui.hot.bean.DataBean;
import com.virgil.presentpj.ui.hot.http.HttpUtils;

import java.util.Map;

import retrofit2.Callback;

/**
 * Created by virgil on 2016/8/30.
 * email 841864388@qq.com
 */
public class HotModle implements HotContract.Modle{
    @Override
    public void getHot(Map<String, String> parmas, Callback<DataBean> callback) {
        HttpUtils.getInstance().getHotData(parmas,callback);
    }
}
