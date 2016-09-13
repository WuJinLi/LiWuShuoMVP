package com.virgil.presentpj.ui.hot.fragment.xiangqing;

import com.virgil.presentpj.ui.hot.bean.DataBean03;
import com.virgil.presentpj.ui.hot.bean.ItemsDetailsBean;
import com.virgil.presentpj.ui.hot.bean.XinagQing1Bean;
import com.virgil.presentpj.ui.hot.fragment.DanPinContract;
import com.virgil.presentpj.ui.hot.http.HttpUtils;

import java.util.Map;

import retrofit2.Callback;

/**
 * Created by Administrator on 2016/9/3.
 */
public class XinagQingModle implements XiangQingContract.Modle {

    @Override
    public void getXinagQing(String parmas, Callback<XinagQing1Bean> callback) {
        HttpUtils.getInstance().getXiangQingData(parmas,callback);
    }
}
