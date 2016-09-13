package com.virgil.presentpj.bean;

import com.google.gson.annotations.SerializedName;

public class SubcategoriesBean {
    @SerializedName("icon_url")
    private String iconUrl;
    @SerializedName("id")
    private int id;
    @SerializedName("items_count")
    private int itemsCount;
    @SerializedName("name")
    private String name;
    @SerializedName("order")
    private int order;
    @SerializedName("parent_id")
    private int parentId;
    @SerializedName("status")
    private int status;

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getItemsCount() {
        return itemsCount;
    }

    public void setItemsCount(int itemsCount) {
        this.itemsCount = itemsCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}