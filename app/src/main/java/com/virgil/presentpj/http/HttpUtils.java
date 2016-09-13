package com.virgil.presentpj.http;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
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
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by virgil on 2016/8/30.
 * email 841864388@qq.com
 */
public class HttpUtils {

    ///////////////////////////////////////////////////////////////////////////
    // 单例创建HttpUtils对象
    ///////////////////////////////////////////////////////////////////////////

    private static volatile HttpUtils singleton;
    private Retrofit retrofit;
    private IPresentPJ iPresent;

    private HttpUtils() {
        retrofit = createRetrofit();
        iPresent = createPresent();
    }

    public static HttpUtils getSingleton() {
        if (singleton == null) {
            synchronized (HttpUtils.class) {
                if (singleton == null) {
                    singleton = new HttpUtils();
                }
            }
        }
        return singleton;
    }

    ///////////////////////////////////////////////////////////////////////////
    // 自定义方法集
    ///////////////////////////////////////////////////////////////////////////

    /**
     * 创建retrofit实例
     *
     * @return
     */
    private Retrofit createRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(UrlConfig.Path.TAB_BASEURL)
                .addConverterFactory(GsonConverterFactory.create(createGson()))
                .build();
    }

    /**
     * 创建gson实例,用于retrofit解析返回的结果
     *
     * @return
     */
    private Gson createGson() {
        Gson gson = new GsonBuilder()
                .serializeNulls()
                .create();
        return gson;
    }

    /**
     * 创建网络接口的实例
     *
     * @return
     */
    private IPresentPJ createPresent() {
        IPresentPJ iPresent = retrofit.create(IPresentPJ.class);
        return iPresent;
    }

    /**
     * 网络访问获取主页面标签数据的方法
     *
     * @param params
     * @param callback
     */
    public void getHomeTabData(Map<String, String> params, Callback<HomeTabLayoutBean> callback) {
        Call<HomeTabLayoutBean> call = iPresent.getHomeTabData(params);
        call.enqueue(callback);
    }

    /**
     * 网络访问获取分类页面栏目数据的方法
     */
    public void getCategroyProgramaData(Callback<CategroyProgramabean> callback) {
        Call<CategroyProgramabean> call = iPresent.getCategroyPrograma();
        call.enqueue(callback);
    }

    /**
     * 网络访问获取分类页面品类等数据的方法
     */
    public void getGongLueBean(Callback<GongLueBean> callback) {
        Call<GongLueBean> call = iPresent.getGongLueBean();
        call.enqueue(callback);
    }

    /**
     * 网络访问获取分类页面栏目详情数据的方法
     */
    public void getProgramaDetailsBean(Map<String, String> parmas, String id,
                                       Callback<ProgramaDetailsBean> callback) {
        Call<ProgramaDetailsBean> call = iPresent.getProgramaDetailsBean(id, (HashMap<String,
                String>) parmas);
        call.enqueue(callback);
    }

    /**
     * 网络访问获取分类页面条目等详情数据的方法
     */
    public void getOtherDetailsBean(Map<String, String> parmas, String id,
                                    Callback<OtherDetailsBean> callback) {
        Call<OtherDetailsBean> call = iPresent.getOtherDetailsBean(id, (HashMap<String, String>)
                parmas);
        call.enqueue(callback);
    }


    /**
     * 网络访问获取搜索单品单品详情数据的方法
     */
    public void getSearchDanPinBean(Map<String, String> parmas, Callback<SearchDanPinBean>
            callback) {
        Call<SearchDanPinBean> call = iPresent.getSearchDanPinBean((HashMap<String, String>)
                parmas);
        call.enqueue(callback);
    }
    //搜索详情攻略
    public void getSearchGongLueBean(Map<String, String> parmas, Callback<SearchGongLueBean>
            callback) {
        Call<SearchGongLueBean> call = iPresent.getSearchGongLueBean((HashMap<String, String>)
                parmas);
        call.enqueue(callback);
    }

    //分类单品
    public void getCategroyDanPinBean(Callback<CategroyDanPinBean> callback) {
        Call<CategroyDanPinBean> call = iPresent.getCategroyDanPinBean();
        call.enqueue(callback);
    }
    //分类单品详情
    public void getCategroyDPDetailsBean(String id,Map<String,String> params,Callback<CategroyDPDetailsBean> callback) {
        Call<CategroyDPDetailsBean> call = iPresent.getCategroyDPDetailsBeanBean(id, (HashMap
                <String, String>) params);
        call.enqueue(callback);
    }
}
