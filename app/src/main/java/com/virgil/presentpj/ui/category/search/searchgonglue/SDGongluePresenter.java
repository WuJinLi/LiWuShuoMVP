package com.virgil.presentpj.ui.category.search.searchgonglue;

import android.os.Handler;
import android.os.Message;

import com.virgil.presentpj.bean.SearchGongLueBean;
import com.virgil.presentpj.bean.SearchGongLuePostsBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * 搜索详情攻略
 */
public class SDGongluePresenter implements SDGonglueContract.Presenter {
    private SDGonglueContract.View view;
    private SDGonglueContract.Modle modle;
    private List<SearchGongLuePostsBean> list = new ArrayList<>();
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 0:
                    view.getSearchGongLueBeanFail("数据加载失败");
                    break;
                case 1:
                    view.getSearchGongLueBeanSuccess(list);
                    break;
            }
        }
    };

    public SDGongluePresenter(SDGonglueContract.View view) {
        this.view = view;
        this.modle = new SDGonglueModle();
    }

    @Override
    public void getSearchGongLueBean(Map<String, String> params) {
        modle.getSearchGongLueBean(params, new Callback<SearchGongLueBean>() {
            @Override
            public void onResponse(Call<SearchGongLueBean> call, Response<SearchGongLueBean>
                    response) {

                SearchGongLueBean body = response.body();
                SearchGongLueBean.DataBean data = body.getData();
                list = data.getPosts();
                handler.sendEmptyMessage(1);
            }

            @Override
            public void onFailure(Call<SearchGongLueBean> call, Throwable t) {
                t.printStackTrace();
                handler.sendEmptyMessage(0);
            }
        });
    }
}
