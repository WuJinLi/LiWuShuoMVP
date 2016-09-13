package com.virgil.presentpj.ui.hot.fragment.pinglun;

import com.virgil.presentpj.ui.hot.base.IBaseModle;
import com.virgil.presentpj.ui.hot.base.IBasePreSenter;
import com.virgil.presentpj.ui.hot.base.IBaseView;
import com.virgil.presentpj.ui.hot.bean.PingLun3CommentsBean;
import com.virgil.presentpj.ui.hot.bean.PingLunOneBean;
import com.virgil.presentpj.ui.hot.bean.PingLunTwoBean;

import java.util.List;
import java.util.Map;

import retrofit2.Callback;

/**
 * Created by Administrator on 2016/9/2.
 */
public class PingLunContract {

    public interface View extends IBaseView{
        public void onGetPingLunSucess(List<PingLun3CommentsBean> pingLunTwoBeen);
        public void onGetPingLunFail(String err);
    }
    public interface Modle extends IBaseModle{
        public void getPingLun(String path, Map<String,String> params,Callback<PingLunOneBean>
                                       callback);
    }
    public interface Presenter extends IBasePreSenter{
        public void getPingLun(String path, Map<String,String> params);
    }

}
