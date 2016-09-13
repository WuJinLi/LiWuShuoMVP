package com.virgil.presentpj.ui.hot.bean;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2016/8/31.
 */
public class PagingBean {
        @SerializedName("next_url")
        private String nextUrl;

        public String getNextUrl() {
            return nextUrl;
        }

        public void setNextUrl(String nextUrl) {
            this.nextUrl = nextUrl;
        }
}