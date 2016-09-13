package com.virgil.presentpj.bean;

import com.google.gson.annotations.SerializedName;

/**
 * Created by My on 2016/9/2.
 */
public class SearchGongLuePostAuthorBean {
        @SerializedName("avatar_url")
        private String avatarUrl;
        @SerializedName("avatar_webp_url")
        private Object avatarWebpUrl;
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

        public Object getAvatarWebpUrl() {
            return avatarWebpUrl;
        }

        public void setAvatarWebpUrl(Object avatarWebpUrl) {
            this.avatarWebpUrl = avatarWebpUrl;
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
