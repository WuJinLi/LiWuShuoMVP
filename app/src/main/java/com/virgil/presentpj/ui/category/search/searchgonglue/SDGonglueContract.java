package com.virgil.presentpj.ui.category.search.searchgonglue;

import com.virgil.presentpj.base.IBaseModle;
import com.virgil.presentpj.base.IBasePresenter;
import com.virgil.presentpj.base.IBaseView;
import com.virgil.presentpj.bean.SearchGongLueBean;
import com.virgil.presentpj.bean.SearchGongLuePostsBean;

import java.util.List;
import java.util.Map;

import retrofit2.Callback;

/**
 * 搜索详情攻略
 */
public class SDGonglueContract {
    public interface View extends IBaseView {
        public void getSearchGongLueBeanSuccess(List<SearchGongLuePostsBean> params);

        public void getSearchGongLueBeanFail(String error);
    }

    public interface Modle extends IBaseModle {
        public void getSearchGongLueBean(Map<String, String> params, Callback<SearchGongLueBean>
                callback);
    }

    public interface Presenter extends IBasePresenter {
        public void getSearchGongLueBean(Map<String, String> params);
    }
}
