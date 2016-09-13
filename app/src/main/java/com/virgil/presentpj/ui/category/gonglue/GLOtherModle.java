package com.virgil.presentpj.ui.category.gonglue;

import com.virgil.presentpj.bean.OtherDetailsBean;
import com.virgil.presentpj.http.HttpUtils;

import java.util.Map;

import retrofit2.Callback;

/**
 * Created by My on 2016/9/1.
 */
public class GLOtherModle implements GLOtherContract.Modle {
    @Override
    public void getOtherDetailsBean(Map<String, String> params, String id,
                                    Callback<OtherDetailsBean> callback) {
        HttpUtils.getSingleton().getOtherDetailsBean(params, id, callback);
    }
}
