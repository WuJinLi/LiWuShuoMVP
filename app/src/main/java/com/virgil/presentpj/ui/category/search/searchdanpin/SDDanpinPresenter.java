package com.virgil.presentpj.ui.category.search.searchdanpin;

import android.os.Handler;
import android.os.Message;

import com.virgil.presentpj.bean.SearchDanPinBean;
import com.virgil.presentpj.bean.SearchDanPinItemBean;
import com.virgil.presentpj.bean.SearchDanPinItemsBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * 搜索详情单品
 */
public class SDDanpinPresenter implements SDDanpinContract.Presenter {
    private SDDanpinContract.Modle modle;
    private SDDanpinContract.View view;
    private List<SearchDanPinItemBean> items = new ArrayList<>();
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 0:
                    view.getSDDanPinBeanFail("下载数据失败");
                    break;
                case 1:
                    view.getSDDanPinBeanSuccess(items);
                    break;
            }
        }
    };
    public SDDanpinPresenter(SDDanpinContract.View view) {
        this.modle = new SDDanpinModle();
        this.view = view;
    }
    @Override
    public void getSDDanPinBean(Map<String, String> params) {
        modle.getSDDanPinBean(params, new Callback<SearchDanPinBean>() {
            @Override
            public void onResponse(Call<SearchDanPinBean> call, Response<SearchDanPinBean>
                    response) {
                SearchDanPinBean body = response.body();
                SearchDanPinItemsBean data = body.getData();
                items = data.getItems();
                handler.sendEmptyMessage(1);
            }
            @Override
            public void onFailure(Call<SearchDanPinBean> call, Throwable t) {
                handler.sendEmptyMessage(0);
            }
        });
    }
}
