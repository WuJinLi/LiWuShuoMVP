package com.virgil.presentpj.ui.category.danpin;

import com.virgil.presentpj.base.IBaseModle;
import com.virgil.presentpj.base.IBasePresenter;
import com.virgil.presentpj.base.IBaseView;
import com.virgil.presentpj.bean.CategoriesBean;
import com.virgil.presentpj.bean.CategroyDanPinBean;
import com.virgil.presentpj.bean.SubcategoriesBean;

import java.util.List;
import java.util.Map;

import retrofit2.Callback;

/**
 * 自定义约束类，用于存放继承base的接口
 */
public class DanPinContract {
    public interface View extends IBaseView {
        public void getCategroyDanPinBeanSuccess(List<Map<String,String>> titles, List<CategoriesBean>
                params);
        public void getCategroyDanPinBeanFail(String error);
    }

    public interface Modle extends IBaseModle {
        public void getCategroyDanPinBean(Callback<CategroyDanPinBean> callback);
    }

    public interface Presenter extends IBasePresenter {
        public void getCategroyDanPinBean();
    }
}
