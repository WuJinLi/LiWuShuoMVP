package com.virgil.presentpj.ui.hot;

import com.virgil.presentpj.ui.hot.base.IBaseModle;
import com.virgil.presentpj.ui.hot.base.IBasePreSenter;
import com.virgil.presentpj.ui.hot.base.IBaseView;
import com.virgil.presentpj.ui.hot.bean.DataBean;
import com.virgil.presentpj.ui.hot.bean.DetailsBean;

import java.util.List;
import java.util.Map;

import retrofit2.Callback;

/**
 * Created by virgil on 2016/8/30.
 * email 841864388@qq.com
 */
public class HotContract {
    public interface View extends IBaseView{
        public void onGetHotSucess(List<DetailsBean> roomBean);
        public void onGetHotFail(String err);
    }
    public interface Modle extends IBaseModle{
        public void getHot(Map<String,String> parmas, Callback<DataBean> callback);
    }
    public interface PreSenter extends IBasePreSenter{
        public void getHot(Map<String,String> parmas);
    }
}
