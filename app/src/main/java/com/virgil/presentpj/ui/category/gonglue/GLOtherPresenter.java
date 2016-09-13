package com.virgil.presentpj.ui.category.gonglue;

import android.os.Handler;
import android.os.Message;

import com.virgil.presentpj.bean.OtherBean;
import com.virgil.presentpj.bean.OtherDetailsBean;
import com.virgil.presentpj.bean.OtherItemsBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by My on 2016/9/1.
 */
public class GLOtherPresenter implements GLOtherContract.Presenter {
    private GLOtherContract.View view;
    private GLOtherContract.Modle modle;
    private List<OtherItemsBean> list=new ArrayList<>();
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 0:
                    view.getOtherDetailsBeanFail("连接网络失败");
                    break;
                case 1:
                    view.getOtherDetailsBeanSuccess(list);
                    break;
            }
        }
    };

    public GLOtherPresenter(GLOtherContract.View view) {
        this.view = view;
        this.modle=new GLOtherModle();
    }

    @Override
    public void getOtherDetailsBean(Map<String, String> params, String id) {
        modle.getOtherDetailsBean(params, id, new Callback<OtherDetailsBean>() {
            @Override
            public void onResponse(Call<OtherDetailsBean> call, Response<OtherDetailsBean>
                    response) {
                OtherDetailsBean body = response.body();
                OtherBean data = body.getData();
                list = data.getItems();
                handler.sendEmptyMessage(1);
            }

            @Override
            public void onFailure(Call<OtherDetailsBean> call, Throwable t) {
                handler.sendEmptyMessage(0);
            }
        });
    }
}
