package com.virgil.presentpj.bean;

import com.google.gson.annotations.SerializedName;

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