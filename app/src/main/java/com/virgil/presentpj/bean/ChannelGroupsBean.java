package com.virgil.presentpj.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public  class ChannelGroupsBean {
            @SerializedName("id")
            private int id;
            @SerializedName("name")
            private String name;
            @SerializedName("order")
            private int order;
            @SerializedName("status")
            private int status;
            /**
             * cover_image_url : http://img02.liwushuo.com/image/160624/hbd7w1sf4.png
             * group_id : 5
             * icon_url : http://img03.liwushuo.com/image/160414/kwzqtscoa.png-pw144
             * id : 111
             * items_count : 1165
             * name : 礼物
             * order : 10
             * status : 0
             * url :
             */

            @SerializedName("channels")
            private List<ChannelsBean> channels;

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

            public List<ChannelsBean> getChannels() {
                return channels;
            }

            public void setChannels(List<ChannelsBean> channels) {
                this.channels = channels;
            }
        }