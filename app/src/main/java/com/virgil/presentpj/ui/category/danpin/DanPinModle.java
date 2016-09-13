package com.virgil.presentpj.ui.category.danpin;

import com.virgil.presentpj.bean.CategroyDanPinBean;
import com.virgil.presentpj.http.HttpUtils;

import retrofit2.Callback;

/**
 * CategoryModle用于数据的获取
 */
public class DanPinModle implements DanPinContract.Modle {
    @Override
    public void getCategroyDanPinBean(Callback<CategroyDanPinBean> callback) {
        HttpUtils.getSingleton().getCategroyDanPinBean(callback);
    }
}
