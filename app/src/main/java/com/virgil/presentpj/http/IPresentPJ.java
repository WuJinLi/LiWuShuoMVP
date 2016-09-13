package com.virgil.presentpj.http;

import com.virgil.presentpj.bean.CategroyDPDetailsBean;
import com.virgil.presentpj.bean.CategroyDanPinBean;
import com.virgil.presentpj.bean.CategroyProgramabean;
import com.virgil.presentpj.bean.GongLueBean;
import com.virgil.presentpj.bean.HomeTabLayoutBean;
import com.virgil.presentpj.bean.OtherDetailsBean;
import com.virgil.presentpj.bean.ProgramaDetailsBean;
import com.virgil.presentpj.bean.SearchDanPinBean;
import com.virgil.presentpj.bean.SearchGongLueBean;
import com.virgil.presentpj.config.UrlConfig;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * 网址的拼接
 */
public interface IPresentPJ {

    //主页面书签
    @GET(UrlConfig.Path.TAB_URL)
    Call<HomeTabLayoutBean> getHomeTabData(@QueryMap() Map<String, String> params);

    //分类攻略栏目
    @GET(UrlConfig.Path.CATEGROY_PROGRAMA)
    Call<CategroyProgramabean> getCategroyPrograma();


    @GET(UrlConfig.Path.CHANNEL_GROUPS)
    Call<GongLueBean> getGongLueBean();

    //攻略栏目的详情
    @GET(UrlConfig.Path.PROGRAMA_DETAILS)
    Call<ProgramaDetailsBean> getProgramaDetailsBean(@Path(UrlConfig.UrlPart.ID) String id,
                                                     @QueryMap HashMap<String, String> params);

    //品类的详情
    @GET(UrlConfig.Path.OTHER_DETAILS)
    Call<OtherDetailsBean> getOtherDetailsBean(@Path(UrlConfig.UrlPart.ID) String id,
                                               @QueryMap HashMap<String, String> params);


    //搜索详情单品
    @GET(UrlConfig.Path.SEARCH_DANPIN)
    Call<SearchDanPinBean> getSearchDanPinBean(@QueryMap() Map<String, String> params);


    //搜索详情单品
    @GET(UrlConfig.Path.SEARCH_GONGLUE)
    Call<SearchGongLueBean> getSearchGongLueBean(@QueryMap() Map<String, String> params);

    //分类单品
    @GET(UrlConfig.Path.CATEGROY_DANPIN)
    Call<CategroyDanPinBean> getCategroyDanPinBean();

    //分类单品闲情
    @GET(UrlConfig.Path.CATEGROY_DANPIN_DETALS)
    Call<CategroyDPDetailsBean> getCategroyDPDetailsBeanBean(@Path(UrlConfig.UrlPart.ID) String id,
                                                             @QueryMap HashMap<String, String>
                                                                     params);
}
