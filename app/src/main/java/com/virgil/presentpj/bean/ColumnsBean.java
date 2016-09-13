package com.virgil.presentpj.bean;

import com.google.gson.annotations.SerializedName;

public  class ColumnsBean {
    /**
     * author : 小C
     * banner_image_url : http://img01.liwushuo.com/image/160608/kd1dy4pi3.jpg-w300
     * banner_webp_url : http://img01.liwushuo.com/image/160608/kd1dy4pi3
     * .jpg?imageView2/2/w/300/q/85/format/webp
     * category : 礼物
     * cover_image_url : http://img02.liwushuo.com/image/160713/y2arp77qx.jpg-w720
     * cover_webp_url : http://img02.liwushuo.com/image/160713/y2arp77qx
     * .jpg?imageView2/2/w/720/q/85/format/webp
     * created_at : 1462501381
     * description : 如果青春不会散场，时光可以珍藏。如果你的每一个米粒大小念想，都能找到与之匹配的美物安放...这样的店你会不会来？
     * id : 5
     * order : 0
     * post_published_at : 1472612400
     * status : 0
     * subtitle : 更新至第144期
     * title : 不打烊的礼物店
     * updated_at : 1472626010
     */
        @SerializedName("author")
        private String author;
        @SerializedName("banner_image_url")
        private String bannerImageUrl;
        @SerializedName("banner_webp_url")
        private String bannerWebpUrl;
        @SerializedName("category")
        private String category;
        @SerializedName("cover_image_url")
        private String coverImageUrl;
        @SerializedName("cover_webp_url")
        private String coverWebpUrl;
        @SerializedName("created_at")
        private int createdAt;
        @SerializedName("description")
        private String description;
        @SerializedName("id")
        private int id;
        @SerializedName("order")
        private int order;
        @SerializedName("post_published_at")
        private int postPublishedAt;
        @SerializedName("status")
        private int status;
        @SerializedName("subtitle")
        private String subtitle;
        @SerializedName("title")
        private String title;
        @SerializedName("updated_at")
        private int updatedAt;

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getBannerImageUrl() {
            return bannerImageUrl;
        }

        public void setBannerImageUrl(String bannerImageUrl) {
            this.bannerImageUrl = bannerImageUrl;
        }

        public String getBannerWebpUrl() {
            return bannerWebpUrl;
        }

        public void setBannerWebpUrl(String bannerWebpUrl) {
            this.bannerWebpUrl = bannerWebpUrl;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
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

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getOrder() {
            return order;
        }

        public void setOrder(int order) {
            this.order = order;
        }

        public int getPostPublishedAt() {
            return postPublishedAt;
        }

        public void setPostPublishedAt(int postPublishedAt) {
            this.postPublishedAt = postPublishedAt;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getSubtitle() {
            return subtitle;
        }

        public void setSubtitle(String subtitle) {
            this.subtitle = subtitle;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(int updatedAt) {
            this.updatedAt = updatedAt;
        }
    }