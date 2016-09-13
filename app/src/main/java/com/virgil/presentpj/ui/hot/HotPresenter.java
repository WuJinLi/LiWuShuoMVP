package com.virgil.presentpj.ui.hot;

import android.os.Handler;
import android.os.Looper;

import com.virgil.presentpj.ui.hot.bean.DataBean;
import com.virgil.presentpj.ui.hot.bean.DetailsBean;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by virgil on 2016/8/30.
 * email 841864388@qq.com
 */
public class HotPresenter implements HotContract.PreSenter{
    private HotContract.View view;
    private HotContract.Modle modle;

    public HotPresenter(HotContract.View view){
        this.view=view;
        modle=new HotModle();
    }

    @Override
    public void getHot(Map<String, String> parmas) {
        modle.getHot(parmas, new Callback<DataBean>() {
            @Override
            public void onResponse(Call<DataBean> call, Response<DataBean> response) {
                DataBean databean=response.body();
                final List<DetailsBean> roomBeen= databean.getData().getItems();
                Handler handler=new Handler(Looper.getMainLooper());
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        view.onGetHotSucess(roomBeen);
                    }
                });
            }

            @Override
            public void onFailure(Call<DataBean> call, Throwable t) {
                Handler handler=new Handler();
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        view.onGetHotFail("网络连接失败");
                    }
                });
            }
        });
    }
}
