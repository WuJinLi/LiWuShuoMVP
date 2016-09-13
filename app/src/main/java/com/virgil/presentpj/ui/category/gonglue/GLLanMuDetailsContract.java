package com.virgil.presentpj.ui.category.gonglue;

import com.virgil.presentpj.base.IBaseModle;
import com.virgil.presentpj.base.IBasePresenter;
import com.virgil.presentpj.base.IBaseView;
import com.virgil.presentpj.bean.PostsBean;
import com.virgil.presentpj.bean.ProgramaDetailsBean;

import java.security.PublicKey;
import java.util.List;
import java.util.Map;

import retrofit2.Callback;

/**
 * Created by My on 2016/9/1.
 */
public class GLLanMuDetailsContract {
    public interface View extends IBaseView {
        public void getProgramaDetailsSuccess(List<PostsBean> parmas, String imageUrl, String
                description,String title);

        public void getProgramaDetailsFail(String error);
    }

    public interface Modle extends IBaseModle {
        public void getProgramaDetails(Map<String, String> params, String id,
                                       Callback<ProgramaDetailsBean> callback);
    }

    public interface Presenter extends IBasePresenter {
        public void getProgramaDetails(Map<String, String> params, String id);
    }
}
