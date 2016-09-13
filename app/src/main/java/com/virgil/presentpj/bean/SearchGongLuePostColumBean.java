package com.virgil.presentpj.bean;

import com.google.gson.annotations.SerializedName;

/**
 * Created by My on 2016/9/2.
 */
public class SearchGongLuePostColumBean {

    @SerializedName("banner_image_url")
    private String bannerImageUrl;
    @SerializedName("category")
    private String category;
    @SerializedName("cover_image_url")
    private String coverImageUrl;
    @SerializedName("created_at")
    private int createdAt;
    @SerializedName("description")
    private String description;
    @SerializedName("id")
    private int id;
    @SerializedName("order")
    private int order;
    @SerializedName("status")
    private int status;
    @SerializedName("subtitle")
    private String subtitle;
    @SerializedName("title")
    private String title;
    @SerializedName("updated_at")
    private int updatedAt;

    public String getBannerImageUrl() {
        return bannerImageUrl;
    }

    public void setBannerImageUrl(String bannerImageUrl) {
        this.bannerImageUrl = bannerImageUrl;
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
