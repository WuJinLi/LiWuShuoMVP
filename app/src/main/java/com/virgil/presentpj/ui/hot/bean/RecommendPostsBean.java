package com.virgil.presentpj.ui.hot.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2016/9/2.
 */
public class RecommendPostsBean {
        @SerializedName("content_url")
        private String contentUrl;
        @SerializedName("cover_image_url")
        private String coverImageUrl;
        @SerializedName("cover_webp_url")
        private String coverWebpUrl;
        @SerializedName("created_at")
        private int createdAt;
        @SerializedName("editor_id")
        private Object editorId;
        @SerializedName("id")
        private int id;
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
        @SerializedName("updated_at")
        private int updatedAt;
        @SerializedName("url")
        private String url;
        @SerializedName("label_ids")
        private List<?> labelIds;

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

        public Object getEditorId() {
            return editorId;
        }

        public void setEditorId(Object editorId) {
            this.editorId = editorId;
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

        public List<?> getLabelIds() {
            return labelIds;
        }

        public void setLabelIds(List<?> labelIds) {
            this.labelIds = labelIds;
        }
}
