package com.virgil.presentpj.ui.hot.http;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.virgil.presentpj.ui.hot.bean.DataBean;
import com.virgil.presentpj.ui.hot.config.UrlConfig;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2016/8/31.
 */
public class HttpUtils {
    public static volatile HttpUtils singleton;
    private Retrofit retrofit;
    private ILiWuShuo liwushuo;

    private HttpUtils(){
        retrofit=createRetrofit();
        liwushuo=createLiWuShuo();
    }

    public static HttpUtils getInstance() {
        if (singleton==null){
            synchronized (HttpUtils.class){
                if (singleton==null){
                    singleton=new HttpUtils();
                }
            }
        }
        return singleton;
    }
    //创建retorfit的实例
    private Retrofit createRetrofit(){

        return new Retrofit.Builder()
                .baseUrl(UrlConfig.Path.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    //创建gson实例，用于retrofit解析返回的结果
    private Gson createGson(){
        Gson gson=new GsonBuilder()
                .serializeNulls()
                .create();
        return gson;
    }
    //创建网络连接接口的实例
    private ILiWuShuo createLiWuShuo(){
        ILiWuShuo liwushuo=retrofit.create(ILiWuShuo.class);
        return liwushuo;
    }
    //获取颜值的方法
    //params:参数列表 包含俩个参数 limit和offset，gen...
    //callback:访问数据的回调接口
    public void getHotData(Map<String,String> params, Callback<DataBean> callback){
        Call<DataBean> call=liwushuo.getHotData(params);
        call.enqueue(callback);
    }

}
