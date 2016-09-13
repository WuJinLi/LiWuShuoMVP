package com.virgil.presentpj.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public  class CategoriesBean {
            @SerializedName("icon_url")
            private String iconUrl;
            @SerializedName("id")
            private int id;
            @SerializedName("name")
            private String name;
            @SerializedName("order")
            private int order;
            @SerializedName("status")
            private int status;
            /**
             * icon_url : http://img01.liwushuo.com/image/150615/urgs9vy8a.png-pw144
             * id : 7
             * items_count : -51
             * name : 智能设备
             * order : 7
             * parent_id : 1
             * status : 0
             */

            @SerializedName("subcategories")
            private List<SubcategoriesBean> subcategories;

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

            public List<SubcategoriesBean> getSubcategories() {
                return subcategories;
            }

            public void setSubcategories(List<SubcategoriesBean> subcategories) {
                this.subcategories = subcategories;
            }


        }