package com.virgil.presentpj.ui.category.gonglue;

import com.virgil.presentpj.bean.CategroyProgramabean;
import com.virgil.presentpj.bean.ProgramaDetailsBean;
import com.virgil.presentpj.http.HttpUtils;

import java.util.Map;

import retrofit2.Callback;

/**
 * 栏目详情的modle
 */
public class GLLanMuDetailsModle implements GLLanMuDetailsContract.Modle {
    //连接网络，获取网络数据
    @Override
    public void getProgramaDetails(Map<String, String> params, String id,
                                   Callback<ProgramaDetailsBean> callback) {
        HttpUtils.getSingleton().getProgramaDetailsBean(params, id, callback);
    }
}
