package com.virgil.presentpj.ui.category.search.searchdanpin;

import com.virgil.presentpj.base.IBaseModle;
import com.virgil.presentpj.base.IBasePresenter;
import com.virgil.presentpj.base.IBaseView;
import com.virgil.presentpj.bean.SearchDanPinBean;
import com.virgil.presentpj.bean.SearchDanPinItemBean;

import java.util.List;
import java.util.Map;

import retrofit2.Callback;

/**
 * 搜索详情单品
 */
public class SDDanpinContract {

    public interface View extends IBaseView {
        public void getSDDanPinBeanSuccess(List<SearchDanPinItemBean> params);

        public void getSDDanPinBeanFail(String error);
    }

    public interface Presenter extends IBasePresenter {
        public void getSDDanPinBean(Map<String, String> params);
    }

    public interface Modle extends IBaseModle {
        public void getSDDanPinBean(Map<String, String> params, Callback<SearchDanPinBean>
                callback);
    }

}
