package com.virgil.presentpj.ui.category.danpin;


import com.virgil.presentpj.base.IBaseModle;
import com.virgil.presentpj.base.IBasePresenter;
import com.virgil.presentpj.base.IBaseView;
import com.virgil.presentpj.bean.CategroyDPDetailsBean;
import com.virgil.presentpj.bean.CategroyDPDetailsItemsBean;

import java.util.List;
import java.util.Map;

import retrofit2.Callback;

public class DanPinDetailsContract {
    public interface View extends IBaseView {
        public void getCategroyDPDetailsBeanSuccess(List<CategroyDPDetailsItemsBean> params);

        public void getCategroyDPDetailsBeanFail(String error);
    }

    public interface Modle extends IBaseModle {
        public void getCategroyDPDetailsBean(String id, Map<String, String> map,
                                             Callback<CategroyDPDetailsBean> callback);
    }

    public interface Presenter extends IBasePresenter {
        public void getCategroyDPDetailsBean(String id, Map<String, String> map);
    }
}
