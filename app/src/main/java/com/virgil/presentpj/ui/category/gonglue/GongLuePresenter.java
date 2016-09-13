package com.virgil.presentpj.ui.category.gonglue;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.ListView;

import com.virgil.presentpj.bean.CategroyProgramabean;
import com.virgil.presentpj.bean.ChannelGroupsBean;
import com.virgil.presentpj.bean.ChannelsBean;
import com.virgil.presentpj.bean.ColumnsBean;
import com.virgil.presentpj.bean.GongLueBean;
import com.virgil.presentpj.bean.PagingBean;
import com.virgil.presentpj.bean.ProgramaBean;
import com.virgil.presentpj.ui.category.gonglue.GongLueContract;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * CategoryPresenter进行数据逻辑的处理
 */
public class GongLuePresenter implements GongLueContract.Presenter {
    private GongLueContract.View view;
    private GongLueContract.Modle modle;

    private List<ColumnsBean> columns = new ArrayList<>();
    private List<ChannelsBean> list_pinlei = new ArrayList<>();
    private List<ChannelsBean> list_pinlei_more = new ArrayList<>();
    private List<ChannelsBean> list_style = new ArrayList<>();
    private List<ChannelsBean> list_object_more = new ArrayList<>();
    private List<ChannelsBean> list_object = new ArrayList<>();
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 0:
                    view.onGetProgramaFail("数据加载失败");
                    break;
                case 1:
                    view.onGetProgramaSuccess(columns);
                    break;
                case 2:
                    view.onGetChannelPinSuccess(list_pinlei);
                    view.onGetChannelStyleSuccess(list_style);
                    view.onGetChannelObjectSuccess(list_object);
                    view.onGetListForNetSuccess(list_pinlei_more, list_object_more);
                    break;
            }
        }
    };
    public GongLuePresenter(GongLueContract.View view) {
        this.view = view;
        this.modle = new GongLueModle();
    }
    @Override
    public void getPrograma() {
        //进行modle传来数据的逻辑处理
        modle.getPrograma(new Callback<CategroyProgramabean>() {
            @Override
            public void onResponse(Call<CategroyProgramabean> call, Response<CategroyProgramabean
                    > response) {
                //获取网络数据
                CategroyProgramabean body = response.body();
                ProgramaBean data = body.getData();
                columns = data.getColumns();
                handler.sendEmptyMessage(1);

            }
            //联网下载数据失败
            @Override
            public void onFailure(Call<CategroyProgramabean> call, Throwable t) {
                t.printStackTrace();
                handler.sendEmptyMessage(0);
            }
        });
    }

    @Override
    public void getChannel() {
        modle.getChannel(new Callback<GongLueBean>() {
            @Override
            public void onResponse(Call<GongLueBean> call, Response<GongLueBean> response) {
                GongLueBean body = response.body();
                GongLueBean.DataBean data = body.getData();
                List<ChannelGroupsBean> channelGroups = data.getChannelGroups();
                for (int i = 0; i < 6; i++) {
                    list_pinlei.add(channelGroups.get(0).getChannels().get(i));
                }
                list_pinlei_more = channelGroups.get(0).getChannels();

                for (int i = 0; i < 6; i++) {
                    list_style.add(channelGroups.get(1).getChannels().get(i));
                }

                for (int i = 0; i < 6; i++) {
                    list_object.add(channelGroups.get(2).getChannels().get(i));
                }
                list_object_more = channelGroups.get(2).getChannels();
                handler.sendEmptyMessage(2);
            }

            @Override
            public void onFailure(Call<GongLueBean> call, Throwable t) {
                t.printStackTrace();
                handler.sendEmptyMessage(0);
            }
        });
    }
}
