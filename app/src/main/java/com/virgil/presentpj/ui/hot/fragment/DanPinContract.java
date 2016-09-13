package com.virgil.presentpj.ui.hot.fragment;

import com.virgil.presentpj.ui.hot.base.IBaseModle;
import com.virgil.presentpj.ui.hot.base.IBasePreSenter;
import com.virgil.presentpj.ui.hot.base.IBaseView;
import com.virgil.presentpj.ui.hot.bean.DataBean02;
import com.virgil.presentpj.ui.hot.bean.DataBean03;
import com.virgil.presentpj.ui.hot.bean.ItemsDetailsBean;
import com.virgil.presentpj.ui.hot.bean.RecommendItemsBean;

import java.util.List;
import java.util.Map;

import retrofit2.Callback;

/**
 * Created by Administrator on 2016/9/1.
 */
public class DanPinContract {
    public interface View extends IBaseView{
        public void onGetDanPinSucess(DataBean02 dataBean02);
        public void onGetDanPinFail(String erro);
        //猜你喜欢
        public void onGetCaiNiXiHuangSucess(List<RecommendItemsBean> recommendItemsBeen);
        public void onGetCaiNiXiHuangFail(String erro);
    }
    public interface Modle extends IBaseModle{
        public void getDanPin(String parmas, Callback<ItemsDetailsBean> callback);
        //猜你喜欢
        public void getCaiNiXiHuang(String path,Map<String,String> params,Callback<DataBean03> callback);
    }
    public interface PreSenter extends IBasePreSenter{
        public void getDanPin(String urlId);
        //猜你喜欢
        public void getCaiNiXiHuang(String path,Map<String,String> params);
    }

}
