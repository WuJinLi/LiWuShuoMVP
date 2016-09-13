package com.virgil.presentpj.ui.hot.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2016/9/3.
 */
public class PingLun3CommentsBean {
        @SerializedName("content")
        private String content;
        @SerializedName("created_at")
        private int createdAt;
        @SerializedName("id")
        private int id;
        @SerializedName("item_id")
        private int itemId;
        @SerializedName("reply_to_id")
        private Object replyToId;
        @SerializedName("show")
        private boolean show;
        @SerializedName("status")
        private int status;
        /**
         * avatar_url : http://img01.liwushuo.com/avatar/160902/3cdbb54a6_a-w180
         * can_mobile_login : true
         * guest_uuid : null
         * id : 7432830
         * nickname : 小店冲流量有优惠
         * role : 0
         */

        @SerializedName("user")
        private UserBean user;
        /**
         * h : 567
         * original : http://img02.liwushuo.com/comment/160902/22574b59e_a.png?imageView2/2/w/957/q/85/format/webp
         * thumbnail : http://img02.liwushuo.com/comment/160902/22574b59e_a.png?imageView2/2/w/506/q/85/format/webp
         * url : comment/160902/22574b59e_a.png
         * w : 957
         */

        @SerializedName("images")
        private List<ImagesBean> images;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
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

        public int getItemId() {
            return itemId;
        }

        public void setItemId(int itemId) {
            this.itemId = itemId;
        }

        public Object getReplyToId() {
            return replyToId;
        }

        public void setReplyToId(Object replyToId) {
            this.replyToId = replyToId;
        }

        public boolean isShow() {
            return show;
        }

        public void setShow(boolean show) {
            this.show = show;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public List<ImagesBean> getImages() {
            return images;
        }

        public void setImages(List<ImagesBean> images) {
            this.images = images;
        }

        public static class UserBean {
            @SerializedName("avatar_url")
            private String avatarUrl;
            @SerializedName("can_mobile_login")
            private boolean canMobileLogin;
            @SerializedName("guest_uuid")
            private Object guestUuid;
            @SerializedName("id")
            private int id;
            @SerializedName("nickname")
            private String nickname;
            @SerializedName("role")
            private int role;

            public String getAvatarUrl() {
                return avatarUrl;
            }

            public void setAvatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
            }

            public boolean isCanMobileLogin() {
                return canMobileLogin;
            }

            public void setCanMobileLogin(boolean canMobileLogin) {
                this.canMobileLogin = canMobileLogin;
            }

            public Object getGuestUuid() {
                return guestUuid;
            }

            public void setGuestUuid(Object guestUuid) {
                this.guestUuid = guestUuid;
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

            public int getRole() {
                return role;
            }

            public void setRole(int role) {
                this.role = role;
            }
        }

        public static class ImagesBean {
            @SerializedName("h")
            private int h;
            @SerializedName("original")
            private String original;
            @SerializedName("thumbnail")
            private String thumbnail;
            @SerializedName("url")
            private String url;
            @SerializedName("w")
            private int w;

            public int getH() {
                return h;
            }

            public void setH(int h) {
                this.h = h;
            }

            public String getOriginal() {
                return original;
            }

            public void setOriginal(String original) {
                this.original = original;
            }

            public String getThumbnail() {
                return thumbnail;
            }

            public void setThumbnail(String thumbnail) {
                this.thumbnail = thumbnail;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getW() {
                return w;
            }

            public void setW(int w) {
                this.w = w;
            }
        }
}
