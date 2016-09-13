package com.virgil.presentpj.ui.category.gonglue;

import com.virgil.presentpj.bean.CategroyProgramabean;
import com.virgil.presentpj.bean.GongLueBean;
import com.virgil.presentpj.http.HttpUtils;
import com.virgil.presentpj.ui.category.gonglue.GongLueContract;

import retrofit2.Callback;

/**
 * CategoryModle用于数据的获取
 */
public class GongLueModle implements GongLueContract.Modle {
    @Override
    public void getPrograma(Callback<CategroyProgramabean> callback) {
        HttpUtils.getSingleton().getCategroyProgramaData(callback);
    }

    @Override
    public void getChannel(Callback<GongLueBean> callback) {
        HttpUtils.getSingleton().getGongLueBean( callback);
    }
}
