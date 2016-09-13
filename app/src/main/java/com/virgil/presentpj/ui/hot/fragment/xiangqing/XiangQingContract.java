package com.virgil.presentpj.ui.hot.fragment.xiangqing;

import com.virgil.presentpj.ui.hot.base.IBaseModle;
import com.virgil.presentpj.ui.hot.base.IBasePreSenter;
import com.virgil.presentpj.ui.hot.base.IBaseView;
import com.virgil.presentpj.ui.hot.bean.DataBean02;
import com.virgil.presentpj.ui.hot.bean.DataBean03;
import com.virgil.presentpj.ui.hot.bean.ItemsDetailsBean;
import com.virgil.presentpj.ui.hot.bean.RecommendItemsBean;
import com.virgil.presentpj.ui.hot.bean.XiangQing2Bean;
import com.virgil.presentpj.ui.hot.bean.XinagQing1Bean;

import java.util.List;
import java.util.Map;

import retrofit2.Callback;

/**
 * Created by Administrator on 2016/9/3.
 */
public class XiangQingContract {
    public interface View extends IBaseView{
        public void onGetXinagQingSucess(XiangQing2Bean xiangQing2Bean);
        public void onGetXinagQingFail(String erro);
    }
    public interface Modle extends IBaseModle{
        public void getXinagQing(String parmas, Callback<XinagQing1Bean> callback);

    }
    public interface PreSenter extends IBasePreSenter{
        public void getXinagQing(String params);

    }
}
