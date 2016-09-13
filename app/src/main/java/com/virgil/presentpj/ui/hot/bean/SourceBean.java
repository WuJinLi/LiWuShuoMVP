package com.virgil.presentpj.ui.hot.bean;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2016/9/2.
 */
public class SourceBean {
        @SerializedName("button_title")
        private String buttonTitle;
        @SerializedName("name")
        private String name;
        @SerializedName("page_title")
        private String pageTitle;
        @SerializedName("type")
        private String type;

        public String getButtonTitle() {
            return buttonTitle;
        }

        public void setButtonTitle(String buttonTitle) {
            this.buttonTitle = buttonTitle;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPageTitle() {
            return pageTitle;
        }

        public void setPageTitle(String pageTitle) {
            this.pageTitle = pageTitle;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

