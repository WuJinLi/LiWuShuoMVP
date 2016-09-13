package com.virgil.presentpj.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public  class OtherBean {
        /**
         * next_url : http://api.liwushuo
         * .com/v2/channels/111/items_v2?limit=20&order_by=now&offset=20
         */

        @SerializedName("paging")
        private PagingBean paging;
        /**
         * ad_monitors : []
         * author : {"avatar_url":"http://img03.liwushuo.com/image/160615/ozwl236qx.jpg",
         * "avatar_webp_url":null,"created_at":1465974288,"id":9,"nickname":"小C"}
         * column : {"banner_image_url":"http://img01.liwushuo.com/image/160608/kd1dy4pi3
         * .jpg-w300","category":"礼物","cover_image_url":"http://img02.liwushuo
         * .com/image/160713/y2arp77qx.jpg-w720","created_at":1462501381,
         * "description":"如果青春不会散场，时光可以珍藏。如果你的每一个米粒大小念想，都能找到与之匹配的美物安放...这样的店你会不会来？","id":5,
         * "order":0,"post_published_at":1472636033,"status":0,"subtitle":"","title":"不打烊的礼物店",
         * "updated_at":1472695036}
         * content_type : 1
         * content_url : http://www.liwushuo.com/posts/1044394/content
         * cover_image_url : http://img01.liwushuo.com/image/160705/opjcuadr2.jpg-w720
         * cover_webp_url : http://img01.liwushuo.com/image/160705/opjcuadr2
         * .jpg?imageView2/2/w/720/q/85/format/webp
         * created_at : 1468808702
         * editor_id : 1018
         * feature_list : []
         * hidden_cover_image : false
         * id : 1044394
         * labels : []
         * liked : false
         * likes_count : 37183
         * published_at : 1468465200
         * share_msg : 
         * 每个女孩子都应该有一个漂亮的水杯，因为美丽的细节不仅仅再穿着打扮上，它更多地体现在生活的小细节上。而且，女孩子就要多喝水，这样才能够延缓衰老，让我们漂亮的脸蛋，更加的水润有弹性。不是都说女孩子是水做的吗，所以看到这么多漂亮的水杯都赶紧Get起来吧，买回去以后好好的补充水分。
         * short_title : 
         * status : 0
         * template : 
         * title : 第98期 | 送给不爱喝水君，一个漂亮随行杯
         * type : post
         * updated_at : 1468491062
         * url : http://www.liwushuo.com/posts/1044394
         */

        @SerializedName("items")
        private List<OtherItemsBean> items;

        public PagingBean getPaging() {
            return paging;
        }

        public void setPaging(PagingBean paging) {
            this.paging = paging;
        }

        public List<OtherItemsBean> getItems() {
            return items;
        }

        public void setItems(List<OtherItemsBean> items) {
            this.items = items;
        }


    }