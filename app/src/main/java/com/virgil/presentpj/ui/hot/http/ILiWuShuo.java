package com.virgil.presentpj.ui.hot.http;

import com.virgil.presentpj.ui.hot.bean.DataBean;
import com.virgil.presentpj.ui.hot.config.UrlConfig;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by Administrator on 2016/8/31.
 */
public interface ILiWuShuo {

    //http://api.liwushuo.com/v2/items?gender=1&limit=20&offset=0&generation=2
    @GET(UrlConfig.Path.URL_HOT)
    Call<DataBean> getHotData(@QueryMap() Map<String, String> params);
}
