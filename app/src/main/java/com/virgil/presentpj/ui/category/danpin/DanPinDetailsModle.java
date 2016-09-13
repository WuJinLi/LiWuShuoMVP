package com.virgil.presentpj.ui.category.danpin;


import com.virgil.presentpj.bean.CategroyDPDetailsBean;
import com.virgil.presentpj.http.HttpUtils;

import java.util.Map;

import retrofit2.Callback;

public class DanPinDetailsModle implements DanPinDetailsContract.Modle {


    @Override
    public void getCategroyDPDetailsBean(String id, Map<String, String> map,
                                         Callback<CategroyDPDetailsBean> callback) {
        HttpUtils.getSingleton().getCategroyDPDetailsBean(id, map, callback);
    }
}
