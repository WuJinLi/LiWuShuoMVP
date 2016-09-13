package com.virgil.presentpj.ui.home;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import com.virgil.presentpj.bean.HomeTabLayoutBean;
import com.virgil.presentpj.bean.HomeTabLayoutData;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by virgil on 2016/8/30.
 * email 841864388@qq.com
 */
public class HomePresenter implements HomeContract.Presenter {
    private HomeContract.View view;
    private HomeContract.Modle modle;

    public HomePresenter(HomeContract.View view) {
        this.view = view;
        this.modle = new HomeModle();
    }

    @Override
    public void getHomeTabData(Map<String, String> params) {
        modle.getHomeTabData(params, new Callback<HomeTabLayoutBean>() {
            @Override
            public void onResponse(Call<HomeTabLayoutBean> call, Response<HomeTabLayoutBean> response) {
                HomeTabLayoutBean homeTabLayoutBean = response.body();
                final List<HomeTabLayoutData.ChannelsBean> tablayouts = homeTabLayoutBean.getData().getChannels();
                Handler handler = new Handler(Looper.getMainLooper());
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        view.onGetHomeTabDataSuccess(tablayouts);
                    }
                });
            }

            @Override
            public void onFailure(Call<HomeTabLayoutBean> call, Throwable t) {

            }
        });
    }
}
