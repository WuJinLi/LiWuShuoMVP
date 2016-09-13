package com.virgil.presentpj.ui.hot.fragment.xiangqing;

import android.os.Handler;
import android.os.Looper;

import com.virgil.presentpj.ui.hot.bean.DataBean02;
import com.virgil.presentpj.ui.hot.bean.ItemsDetailsBean;
import com.virgil.presentpj.ui.hot.bean.XiangQing2Bean;
import com.virgil.presentpj.ui.hot.bean.XinagQing1Bean;
import com.virgil.presentpj.ui.hot.fragment.pinglun.PingLunContract;

import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Administrator on 2016/9/3.
 */
public class XiangQingPresenter implements XiangQingContract.PreSenter{
    private XiangQingContract.Modle modle;
    private XiangQingContract.View view;

    public XiangQingPresenter(XiangQingContract.View view){
        this.view=view;
        modle=new XinagQingModle();
    }

    @Override
    public void getXinagQing(String params) {
        modle.getXinagQing(params, new Callback<XinagQing1Bean>() {
            @Override
            public void onResponse(Call<XinagQing1Bean> call, Response<XinagQing1Bean> response) {
                XinagQing1Bean xinagQing1Bean=response.body();
                final XiangQing2Bean xiangQing2Bean=xinagQing1Bean.getData();
                Handler handler=new Handler(Looper.getMainLooper());
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        view.onGetXinagQingSucess(xiangQing2Bean);
                    }
                });
            }

            @Override
            public void onFailure(Call<XinagQing1Bean> call, Throwable t) {

            }
        });
    }
}
