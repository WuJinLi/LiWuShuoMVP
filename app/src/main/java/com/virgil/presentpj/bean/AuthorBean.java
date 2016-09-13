package com.virgil.presentpj.bean;

import com.google.gson.annotations.SerializedName;

public class AuthorBean {
    @SerializedName("avatar_url")
    private String avatarUrl;
    @SerializedName("created_at")
    private int createdAt;
    @SerializedName("id")
    private int id;
    @SerializedName("nickname")
    private String nickname;

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public int getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(int createdAt) {
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}