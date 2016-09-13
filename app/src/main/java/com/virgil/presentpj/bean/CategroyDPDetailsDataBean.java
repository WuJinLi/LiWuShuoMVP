package com.virgil.presentpj.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public  class CategroyDPDetailsDataBean {
        /**
         * next_url : http://api.liwushuo.com/v2/item_subcategories/7/items?limit=20&offset=20
         */

        @SerializedName("paging")
        private PagingBean paging;
        /**
         * ad_monitors : null
         * brand_id : null
         * brand_order : null
         * category_id : 1
         * cover_image_url : http://img02.liwushuo.com/image/160819/efe2rab13_w.jpg-w720
         * cover_webp_url : http://img02.liwushuo.com/image/160819/efe2rab13_w
         * .jpg?imageView2/2/w/720/q/85/format/webp
         * created_at : 1471571033
         * description : 主体是由12颗LED显示运动进度和时间，纽扣电池续航时间6个月，有多种颜色可供选择，同时具备防水功能；内置3
         * 轴加速计可以监测并记录用户一整天的运动和睡眠情况；可以与 iPhone、iPad 或 iPod touch 上免费的 app
         * 同步，从而追踪你的活动水平。Misfit根据不同运动需求，定制Flash，Shine，Cyclist等智能手环。
         * editor_id : 1131
         * favorites_count : 45
         * id : 1066922
         * image_urls : ["http://img03.liwushuo.com/image/160819/efe2rab13_w.jpg-w720"]
         * keywords :
         * name : Misfit Shine2 第二代智能手环金色
         * post_ids : []
         * price : 549.00
         * purchase_id : null
         * purchase_shop_id : null
         * purchase_status : 1
         * purchase_type : 4
         * purchase_url : https://www.amazon
         * .cn/gp/product/B0175VT2MS/ref=as_li_qf_sp_asin_il_tl?ie=UTF8&camp=536&creative=3200
         * &creativeASIN=B0175VT2MS&linkCode=as2&tag=liwushuo09-23
         * short_description :
         * subcategory_id : 7
         * updated_at : 1471571033
         * url : http://www.liwushuo.com/items/1066922
         * webp_urls : ["http://img03.liwushuo.com/image/160819/efe2rab13_w
         * .jpg?imageView2/2/w/720/q/85/format/webp"]
         */

        @SerializedName("items")
        private List<CategroyDPDetailsItemsBean> items;

        public PagingBean getPaging() {
            return paging;
        }

        public void setPaging(PagingBean paging) {
            this.paging = paging;
        }

        public List<CategroyDPDetailsItemsBean> getItems() {
            return items;
        }

        public void setItems(List<CategroyDPDetailsItemsBean> items) {
            this.items = items;
        }
    }