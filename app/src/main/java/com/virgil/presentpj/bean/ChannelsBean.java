package com.virgil.presentpj.bean;

import com.google.gson.annotations.SerializedName;
/*
* 攻略中品类，风格，对象的实体类
* */
public  class ChannelsBean {
                @SerializedName("cover_image_url")
                private String coverImageUrl;
                @SerializedName("group_id")
                private int groupId;
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
                @SerializedName("status")
                private int status;
                @SerializedName("url")
                private String url;

                public String getCoverImageUrl() {
                    return coverImageUrl;
                }

                public void setCoverImageUrl(String coverImageUrl) {
                    this.coverImageUrl = coverImageUrl;
                }

                public int getGroupId() {
                    return groupId;
                }

                public void setGroupId(int groupId) {
                    this.groupId = groupId;
                }

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

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }