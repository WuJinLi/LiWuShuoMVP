package com.virgil.presentpj.ui.category.gonglue;

import com.virgil.presentpj.base.IBaseModle;
import com.virgil.presentpj.base.IBasePresenter;
import com.virgil.presentpj.base.IBaseView;
import com.virgil.presentpj.bean.OtherDetailsBean;
import com.virgil.presentpj.bean.OtherItemsBean;

import java.util.List;
import java.util.Map;

import retrofit2.Callback;

/**
 * Created by My on 2016/9/1.
 */
public class GLOtherContract {
    public interface View extends IBaseView{
        public void getOtherDetailsBeanSuccess(List<OtherItemsBean> params);
        public void getOtherDetailsBeanFail(String error);
    }
    public interface Modle extends IBaseModle{
        public void getOtherDetailsBean(Map<String,String> params, String id, Callback<OtherDetailsBean> callback);
    }
    public interface Presenter extends IBasePresenter{
        public void getOtherDetailsBean(Map<String,String> params,String id);
    }
}
