package com.virgil.presentpj.ui.category.danpin;

import android.os.Handler;
import android.os.Message;

import com.virgil.presentpj.bean.CategoriesBean;
import com.virgil.presentpj.bean.CategroyDanPinBean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * CategoryPresenter进行数据逻辑的处理
 */
public class DanPinPresenter implements DanPinContract.Presenter {
    private DanPinContract.View view;
    private DanPinContract.Modle modle;
    private List<Map<String, String>> titles = new ArrayList<>();
    private List<CategoriesBean> list = new ArrayList<>();
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 0:
                    view.getCategroyDanPinBeanFail("数据加载失败");
                    break;
                case 1:
                    view.getCategroyDanPinBeanSuccess(titles, list);
                    break;
                case 2:
                    break;
            }
        }
    };

    public DanPinPresenter(DanPinContract.View view) {
        this.view = view;
        this.modle = new DanPinModle();
    }

    @Override
    public void getCategroyDanPinBean() {
        modle.getCategroyDanPinBean(new Callback<CategroyDanPinBean>() {
            @Override
            public void onResponse(Call<CategroyDanPinBean> call, Response<CategroyDanPinBean>
                    response) {
                CategroyDanPinBean body = response.body();
                CategroyDanPinBean.DataBean data = body.getData();
                list = data.getCategories();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Map<String, String> map = new HashMap<String, String>();
                    map.put("name", list.get(i).getName());
                    titles.add(map);
                }
                handler.sendEmptyMessage(1);
            }

            @Override
            public void onFailure(Call<CategroyDanPinBean> call, Throwable t) {
                t.printStackTrace();
                handler.sendEmptyMessage(0);
            }
        });
    }
}
