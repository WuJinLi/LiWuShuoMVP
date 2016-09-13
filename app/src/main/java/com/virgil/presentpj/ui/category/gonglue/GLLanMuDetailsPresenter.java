package com.virgil.presentpj.ui.category.gonglue;

import android.os.Handler;
import android.os.Message;

import com.virgil.presentpj.bean.PDDataBean;
import com.virgil.presentpj.bean.PostsBean;
import com.virgil.presentpj.bean.ProgramaDetailsBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * 栏目详情的presenter
 */
public class GLLanMuDetailsPresenter implements GLLanMuDetailsContract.Presenter {
    private GLLanMuDetailsContract.View view;
    private GLLanMuDetailsContract.Modle modle;

    private String description;
    private String title;
    private String coverImageUrl;
    private List<PostsBean> posts = new ArrayList<>();
    //初始化handler
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            //根据具体的标记执行对应的方法
            switch (msg.what) {
                case 0:
                    view.getProgramaDetailsFail("网络连接失败");
                    break;
                case 1:
                    view.getProgramaDetailsSuccess(posts, coverImageUrl, description,title);
                    break;

            }
        }
    };

    public GLLanMuDetailsPresenter(GLLanMuDetailsContract.View view) {
        this.view = view;
        this.modle = new GLLanMuDetailsModle();
    }

    //处理modle传来的数据
    @Override
    public void getProgramaDetails(Map<String, String> params, String id) {
        modle.getProgramaDetails(params, id, new Callback<ProgramaDetailsBean>() {
            //成功获取网络数据，进行对象数据的提取和赋值
            @Override
            public void onResponse(Call<ProgramaDetailsBean> call, Response<ProgramaDetailsBean>
                    response) {
                ProgramaDetailsBean body = response.body();
                PDDataBean data = body.getData();
                description = data.getDescription();
                coverImageUrl = data.getCoverImageUrl();
                 title = data.getTitle();
                posts = data.getPosts();
                handler.sendEmptyMessage(1);
            }

            @Override
            public void onFailure(Call<ProgramaDetailsBean> call, Throwable t) {
                handler.sendEmptyMessage(0);
            }
        });
    }
}
