package com.virgil.presentpj.ui.home;

import android.telecom.Call;

import com.virgil.presentpj.base.IBaseModle;
import com.virgil.presentpj.base.IBasePresenter;
import com.virgil.presentpj.base.IBaseView;
import com.virgil.presentpj.bean.HomeTabLayoutBean;
import com.virgil.presentpj.bean.HomeTabLayoutData;

import java.util.List;
import java.util.Map;

import retrofit2.Callback;

/**
 * Created by virgil on 2016/8/30.
 * email 841864388@qq.com
 */
public class HomeContract {
    public interface View extends IBaseView {
        //网络访问数据成功
        public void onGetHomeTabDataSuccess(List<HomeTabLayoutData.ChannelsBean> tabLayoutDatas);
        //网络访问数据失败
        public void onGetHomeTabDataFail(String error);
    }

    public interface Modle extends IBaseModle {
        //获取主页面标签数据
        public void getHomeTabData(Map<String, String> params, Callback<HomeTabLayoutBean> callback);
    }

    public interface Presenter extends IBasePresenter {
        //获取主页面标签数据
        public void getHomeTabData(Map<String, String> params);
    }
}
