package com.virgil.presentpj.ui.hot.fragment;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;

import com.virgil.presentpj.ui.hot.bean.DataBean02;
import com.virgil.presentpj.ui.hot.bean.DataBean03;
import com.virgil.presentpj.ui.hot.bean.DataBeanGridviewBean;
import com.virgil.presentpj.ui.hot.bean.ItemsDetailsBean;
import com.virgil.presentpj.ui.hot.bean.RecommendItemsBean;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Administrator on 2016/9/1.
 */
public class DanPinPresenter implements DanPinContract.PreSenter {
    private DanPinContract.View view;
    private DanPinContract.Modle modle;

    public DanPinPresenter(DanPinContract.View view){
        this.view=view;
        modle=new DanPinModle();
    }
    @Override
    public void getDanPin(String params) {
        modle.getDanPin(params, new Callback<ItemsDetailsBean>() {
            //网络有响应
            @Override
            public void onResponse(Call<ItemsDetailsBean> call, Response<ItemsDetailsBean> response) {
                ItemsDetailsBean itemsDetailsBean=response.body();
             final DataBean02 dataBean02=itemsDetailsBean.getData();
                Handler handler=new Handler(Looper.getMainLooper());
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        view.onGetDanPinSucess(dataBean02);
                    }
                });
            }
            //网络链接失败
            @Override
            public void onFailure(Call<ItemsDetailsBean> call, Throwable t) {
                Handler handler=new Handler(Looper.getMainLooper());
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        view.onGetDanPinFail("网络连接失败");
                    }
                });
            }
        });
    }

    @Override
    public void getCaiNiXiHuang(String path, Map<String, String> params) {
        modle.getCaiNiXiHuang(path, params, new Callback<DataBean03>() {
            @Override
            public void onResponse(Call<DataBean03> call, Response<DataBean03> response) {
                final DataBean03 dataBean03=response.body();
                final List<RecommendItemsBean> recommendItemsBean=dataBean03.getData().getRecommendItems();
                Log.i("wwww>",recommendItemsBean.size()+"");
                Handler handler=new Handler();
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        view.onGetCaiNiXiHuangSucess(recommendItemsBean);
                    }
                });
            }

            @Override
            public void onFailure(Call<DataBean03> call, Throwable t) {


            }
        });
    }
}
