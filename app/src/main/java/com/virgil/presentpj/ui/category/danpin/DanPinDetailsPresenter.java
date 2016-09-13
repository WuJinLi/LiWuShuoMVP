package com.virgil.presentpj.ui.category.danpin;


import android.os.Handler;
import android.os.Message;

import com.virgil.presentpj.bean.CategroyDPDetailsBean;
import com.virgil.presentpj.bean.CategroyDPDetailsDataBean;
import com.virgil.presentpj.bean.CategroyDPDetailsItemsBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DanPinDetailsPresenter implements DanPinDetailsContract.Presenter {
    private DanPinDetailsContract.View view;
    private DanPinDetailsContract.Modle modle;
    private List<CategroyDPDetailsItemsBean> list = new ArrayList<>();
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 0:
                    view.getCategroyDPDetailsBeanFail("获取数据失败");
                    break;
                case 1:
                    view.getCategroyDPDetailsBeanSuccess(list);
                    break;
            }
        }
    };
    public DanPinDetailsPresenter(DanPinDetailsContract.View view) {
        this.view = view;
        this.modle = new DanPinDetailsModle();
    }

    @Override
    public void getCategroyDPDetailsBean(String id, Map<String, String> map) {
        modle.getCategroyDPDetailsBean(id, map, new Callback<CategroyDPDetailsBean>() {
            @Override
            public void onResponse(Call<CategroyDPDetailsBean> call,
                                   Response<CategroyDPDetailsBean> response) {

                CategroyDPDetailsBean body = response.body();
                CategroyDPDetailsDataBean data = body.getData();
                list = data.getItems();
                handler.sendEmptyMessage(1);
            }

            @Override
            public void onFailure(Call<CategroyDPDetailsBean> call, Throwable t) {
                t.printStackTrace();
                handler.sendEmptyMessage(0);
            }
        });
    }
}
