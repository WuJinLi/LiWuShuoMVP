package com.virgil.presentpj.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public  class PDDataBean {
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
        @SerializedName("likes_count")
        private int likesCount;
        @SerializedName("order")
        private int order;
        /**
         * next_url : http://api.liwushuo.com/v2/columns/5?limit=20&offset=20
         */

        @SerializedName("paging")
        private PagingBean paging;
        @SerializedName("post_published_at")
        private int postPublishedAt;
        @SerializedName("share_url")
        private String shareUrl;
        @SerializedName("status")
        private int status;
        @SerializedName("subtitle")
        private String subtitle;
        @SerializedName("title")
        private String title;
        @SerializedName("updated_at")
        private int updatedAt;
        /**
         * ad_monitors : []
         * author : {"avatar_url":"http://img02.liwushuo.com/image/160615/ozwl236qx.jpg",
         * "created_at":1465974288,"id":9,"nickname":"小C"}
         * content_type : 1
         * content_url : http://www.liwushuo.com/posts/1045455/content
         * cover_image_url : http://img01.liwushuo.com/image/160831/0adz7hj50.jpg-w720
         * cover_webp_url : http://img01.liwushuo.com/image/160831/0adz7hj50
         * .jpg?imageView2/2/w/720/q/85/format/webp
         * created_at : 1472634060
         * editor_id : 1119
         * feature_list : []
         * id : 1045455
         * label_ids : []
         * liked : false
         * likes_count : 4033
         * published_at : 1472634060
         * share_msg :
         * 中秋节是商务送礼的好机会，还想着送月饼你就OUT
         * 了！小礼君给你搜罗了新花样，分为年轻派和沉稳派，看你的送礼对象是哪一类型，自行挑选就好啦，是不是超级省事儿？更重要的是，这些礼物还算挺小众的，但都很实用，所以一定会给对方留下好印象哒~
         * short_title :
         * status : 0
         * template :
         * title : 第145期 | 不送月饼？商务送礼今年玩出新花样
         * updated_at : 1472634848
         * url : http://www.liwushuo.com/posts/1045455
         */

        @SerializedName("posts")
        private List<PostsBean> posts;

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

        public int getLikesCount() {
            return likesCount;
        }

        public void setLikesCount(int likesCount) {
            this.likesCount = likesCount;
        }

        public int getOrder() {
            return order;
        }

        public void setOrder(int order) {
            this.order = order;
        }

        public PagingBean getPaging() {
            return paging;
        }

        public void setPaging(PagingBean paging) {
            this.paging = paging;
        }

        public int getPostPublishedAt() {
            return postPublishedAt;
        }

        public void setPostPublishedAt(int postPublishedAt) {
            this.postPublishedAt = postPublishedAt;
        }

        public String getShareUrl() {
            return shareUrl;
        }

        public void setShareUrl(String shareUrl) {
            this.shareUrl = shareUrl;
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

        public List<PostsBean> getPosts() {
            return posts;
        }

        public void setPosts(List<PostsBean> posts) {
            this.posts = posts;
        }

        public static class PagingBean {
            @SerializedName("next_url")
            private String nextUrl;

            public String getNextUrl() {
                return nextUrl;
            }

            public void setNextUrl(String nextUrl) {
                this.nextUrl = nextUrl;
            }
        }


    }