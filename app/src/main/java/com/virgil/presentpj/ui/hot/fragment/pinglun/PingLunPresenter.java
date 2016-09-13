package com.virgil.presentpj.ui.hot.fragment.pinglun;

import android.os.Handler;
import android.os.Looper;

import com.virgil.presentpj.ui.hot.bean.PingLun3CommentsBean;
import com.virgil.presentpj.ui.hot.bean.PingLunOneBean;
import com.virgil.presentpj.ui.hot.bean.PingLunTwoBean;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Administrator on 2016/9/2.
 */
public class PingLunPresenter implements PingLunContract.Presenter{
    private PingLunContract.View view;
    private PingLunContract.Modle modle;

    public PingLunPresenter(PingLunContract.View view){
        this.view=view;
        modle=new PingLunModle();
    }
    @Override
    public void getPingLun(String path, Map<String, String> params) {
        modle.getPingLun(path, params, new Callback<PingLunOneBean>() {
            @Override
            public void onResponse(Call<PingLunOneBean> call, Response<PingLunOneBean> response) {
                PingLunOneBean pingLunOneBean=response.body();
                final List<PingLun3CommentsBean> pingLun3CommentsBeen=pingLunOneBean.getData().getComments();
                Handler handler=new Handler(Looper.getMainLooper());
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        view.onGetPingLunSucess(pingLun3CommentsBeen);
                    }
                });
            }

            @Override
            public void onFailure(Call<PingLunOneBean> call, Throwable t) {

            }
        });
    }
}
