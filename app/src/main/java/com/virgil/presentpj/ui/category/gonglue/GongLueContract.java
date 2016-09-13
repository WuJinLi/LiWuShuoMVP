package com.virgil.presentpj.ui.category.gonglue;

import com.virgil.presentpj.base.IBaseModle;
import com.virgil.presentpj.base.IBasePresenter;
import com.virgil.presentpj.base.IBaseView;
import com.virgil.presentpj.bean.CategroyProgramabean;
import com.virgil.presentpj.bean.ChannelsBean;
import com.virgil.presentpj.bean.ColumnsBean;
import com.virgil.presentpj.bean.GongLueBean;
import com.virgil.presentpj.bean.ProgramaBean;

import java.nio.channels.Channels;
import java.util.List;

import retrofit2.Callback;

/**
 * 自定义约束类，用于存放继承base的接口
 */
public class GongLueContract {
    public interface View extends IBaseView {
        public void onGetProgramaSuccess(List<ColumnsBean> columns);
        public void onGetProgramaFail(String error);

        public void onGetChannelPinSuccess(List<ChannelsBean> columns);

        public void onGetChannelStyleSuccess(List<ChannelsBean> columns);

        public void onGetChannelObjectSuccess(List<ChannelsBean> columns);

        public void onGetListForNetSuccess(List<ChannelsBean> list_pinlei, List<ChannelsBean>
                list_object);

    }

    public interface Modle extends IBaseModle {
        public void getPrograma(Callback<CategroyProgramabean> callback);

        public void getChannel(Callback<GongLueBean> callback);
    }

    public interface Presenter extends IBasePresenter {
        public void getPrograma();

        public void getChannel();
    }
}
