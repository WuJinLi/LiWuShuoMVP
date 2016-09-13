package com.virgil.presentpj.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public  class OtherItemsBean {
            /**
             * avatar_url : http://img03.liwushuo.com/image/160615/ozwl236qx.jpg
             * avatar_webp_url : null
             * created_at : 1465974288
             * id : 9
             * nickname : 小C
             */

            @SerializedName("author")
            private OtherAuthorBean author;
            /**
             * banner_image_url : http://img01.liwushuo.com/image/160608/kd1dy4pi3.jpg-w300
             * category : 礼物
             * cover_image_url : http://img02.liwushuo.com/image/160713/y2arp77qx.jpg-w720
             * created_at : 1462501381
             * description : 如果青春不会散场，时光可以珍藏。如果你的每一个米粒大小念想，都能找到与之匹配的美物安放...这样的店你会不会来？
             * id : 5
             * order : 0
             * post_published_at : 1472636033
             * status : 0
             * subtitle : 
             * title : 不打烊的礼物店
             * updated_at : 1472695036
             */

            @SerializedName("column")
            private OtherColumnBean column;
            @SerializedName("content_type")
            private int contentType;
            @SerializedName("content_url")
            private String contentUrl;
            @SerializedName("cover_image_url")
            private String coverImageUrl;
            @SerializedName("cover_webp_url")
            private String coverWebpUrl;
            @SerializedName("created_at")
            private int createdAt;
            @SerializedName("editor_id")
            private int editorId;
            @SerializedName("hidden_cover_image")
            private boolean hiddenCoverImage;
            @SerializedName("id")
            private int id;
            @SerializedName("liked")
            private boolean liked;
            @SerializedName("likes_count")
            private int likesCount;
            @SerializedName("published_at")
            private int publishedAt;
            @SerializedName("share_msg")
            private String shareMsg;
            @SerializedName("short_title")
            private String shortTitle;
            @SerializedName("status")
            private int status;
            @SerializedName("template")
            private String template;
            @SerializedName("title")
            private String title;
            @SerializedName("type")
            private String type;
            @SerializedName("updated_at")
            private int updatedAt;
            @SerializedName("url")
            private String url;
            @SerializedName("ad_monitors")
            private List<?> adMonitors;
            @SerializedName("feature_list")
            private List<?> featureList;
            @SerializedName("labels")
            private List<?> labels;

            public OtherAuthorBean getAuthor() {
                return author;
            }

            public void setAuthor(OtherAuthorBean author) {
                this.author = author;
            }

            public OtherColumnBean getColumn() {
                return column;
            }

            public void setColumn(OtherColumnBean column) {
                this.column = column;
            }

            public int getContentType() {
                return contentType;
            }

            public void setContentType(int contentType) {
                this.contentType = contentType;
            }

            public String getContentUrl() {
                return contentUrl;
            }

            public void setContentUrl(String contentUrl) {
                this.contentUrl = contentUrl;
            }

            public String getCoverImageUrl() {
                return coverImageUrl;
            }

            public void setCoverImageUrl(String coverImageUrl) {
                this.coverImageUrl = coverImageUrl;
            }

            public String getCoverWebpUrl() {
                return coverWebpUrl;
            }

            public void setCoverWebpUrl(String coverWebpUrl) {
                this.coverWebpUrl = coverWebpUrl;
            }

            public int getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(int createdAt) {
                this.createdAt = createdAt;
            }

            public int getEditorId() {
                return editorId;
            }

            public void setEditorId(int editorId) {
                this.editorId = editorId;
            }

            public boolean isHiddenCoverImage() {
                return hiddenCoverImage;
            }

            public void setHiddenCoverImage(boolean hiddenCoverImage) {
                this.hiddenCoverImage = hiddenCoverImage;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public boolean isLiked() {
                return liked;
            }

            public void setLiked(boolean liked) {
                this.liked = liked;
            }

            public int getLikesCount() {
                return likesCount;
            }

            public void setLikesCount(int likesCount) {
                this.likesCount = likesCount;
            }

            public int getPublishedAt() {
                return publishedAt;
            }

            public void setPublishedAt(int publishedAt) {
                this.publishedAt = publishedAt;
            }

            public String getShareMsg() {
                return shareMsg;
            }

            public void setShareMsg(String shareMsg) {
                this.shareMsg = shareMsg;
            }

            public String getShortTitle() {
                return shortTitle;
            }

            public void setShortTitle(String shortTitle) {
                this.shortTitle = shortTitle;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getTemplate() {
                return template;
            }

            public void setTemplate(String template) {
                this.template = template;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public int getUpdatedAt() {
                return updatedAt;
            }

            public void setUpdatedAt(int updatedAt) {
                this.updatedAt = updatedAt;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public List<?> getAdMonitors() {
                return adMonitors;
            }

            public void setAdMonitors(List<?> adMonitors) {
                this.adMonitors = adMonitors;
            }

            public List<?> getFeatureList() {
                return featureList;
            }

            public void setFeatureList(List<?> featureList) {
                this.featureList = featureList;
            }

            public List<?> getLabels() {
                return labels;
            }

            public void setLabels(List<?> labels) {
                this.labels = labels;
            }
        }