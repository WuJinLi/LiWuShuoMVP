package com.virgil.presentpj.ui.hot.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2016/9/2.
 */
public class DataBeanGridviewBean {
        /**
         * ad_monitors : null
         * brand_id : null
         * brand_order : null
         * category_id : 7
         * cover_image_url : http://img01.liwushuo.com/image/160624/0s1qdxgos.jpg-w720
         * cover_webp_url : http://img01.liwushuo.com/image/160624/0s1qdxgos.jpg?imageView2/2/w/720/q/85/format/webp
         * created_at : 1466760783
         * description : WG 正版包邮涂一年(秘密花园的原创涂绘手帐) 名字很凶残画面萌萌哒 创意水彩彩铅蜡笔自我疗愈 减压静心涂鸦涂色记事手账
         * editor_id : 1102
         * favorites_count : 679
         * id : 1060698
         * image_urls : ["http://img02.liwushuo.com/image/160624/0s1qdxgos.jpg-w720"]
         * keywords : null
         * name : 秘密花园的原创涂绘手帐
         * post_ids : []
         * price : 29.00
         * purchase_id : 530316768289
         * purchase_shop_id : 117237100
         * purchase_status : 1
         * purchase_type : 2
         * purchase_url : http://s.click.taobao.com/t?e=m%3D2%26s%3D7wg3ogf4of0cQipKwQzePOeEDrYVVa64yK8Cckff7TVRAdhuF14FMZJeI7%2FZTaQct4hWD5k2kjOtgmtnxDX9deVMA5qBABUs5mPg1WiM1P5OS0OzHKBZzQIomwaXGXUs78FqzS29vh5nPjZ5WWqolN%2FWWjML5JdM90WyHry0om1e4oHRRORGevHdcMOA77kp5hcP%2FVn1aMTN0sefRRlOrg%3D%3D
         * subcategory_id : 52
         * updated_at : 1466760783
         * url : liwushuo:///page?type=item&page_action=navigation&item_id=1060698
         * webp_urls : ["http://img02.liwushuo.com/image/160624/0s1qdxgos.jpg?imageView2/2/w/720/q/85/format/webp"]
         */

        @SerializedName("recommend_items")
        private List<RecommendItemsBean> recommendItems;
        /**
         * content_url : http://www.liwushuo.com/posts/16/content
         * cover_image_url : http://img01.liwushuo.com/image/140705/dedqjrbsp_w.jpg-w720
         * cover_webp_url : http://img01.liwushuo.com/image/140705/dedqjrbsp_w.jpg?imageView2/2/w/720/q/85/format/webp
         * created_at : 1404397269
         * editor_id : null
         * id : 16
         * label_ids : []
         * likes_count : 88519
         * published_at : 1404572243
         * share_msg : 每件手工礼物都是这个世界上独一无二的珍藏。每一针一线，每一粘一折，都投入了满满的爱与真心。
         * short_title : 手工制礼物
         * status : 0
         * template :
         * title : 羊毛毡DIY：送Ta一只萌萌的大眼仔
         * updated_at : 1404570069
         * url : liwushuo:///page?page_action=navigation&login=false&type=post&post_id=16
         */

        @SerializedName("recommend_posts")
        private List<RecommendPostsBean> recommendPosts;

        public List<RecommendItemsBean> getRecommendItems() {
            return recommendItems;
        }

        public void setRecommendItems(List<RecommendItemsBean> recommendItems) {
            this.recommendItems = recommendItems;
        }

        public List<RecommendPostsBean> getRecommendPosts() {
            return recommendPosts;
        }

        public void setRecommendPosts(List<RecommendPostsBean> recommendPosts) {
            this.recommendPosts = recommendPosts;
        }

}
