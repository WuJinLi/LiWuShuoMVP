package com.virgil.presentpj.ui.hot.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2016/8/31.
 */
    public  class ProductBean {
        /**
         * next_url : http://api.liwushuo.com/v2/items?generation=2&gender=1&limit=20&offset=20
         */

        @SerializedName("paging")
        private PagingBean paging;
        /**
         * data : {"ad_monitors":[],"brand_id":null,"brand_order":null,"category_id":5,"cover_image_url":"http://img02.liwushuo.com/image/160824/ixfniy7pd.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/160824/ixfniy7pd.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1472011622,"description":"和想家的萌兔子一起吃月饼\u2028几行·\u201c一个月亮\u201d中秋礼盒，采用可交互式包装设计，和翘首望月的萌玉兔共鸣思乡情，赠您一份\u201c红酒与抹茶齐飞，柚子共朱古力同桌\u201d的团圆盛宴。","editor_id":1023,"favorites_count":1500,"id":1067446,"image_urls":["http://img01.liwushuo.com/image/160824/7xvszvhv6.jpg-w720","http://img02.liwushuo.com/image/160824/ixfniy7pd.jpg-w720","http://img01.liwushuo.com/image/160824/3iy0nki04.jpg-w720","http://img01.liwushuo.com/image/160824/6t9dufdn1.jpg-w720","http://img01.liwushuo.com/image/160824/h42mx0y59.jpg-w720"],"is_favorite":false,"keywords":"","name":"几行·一个月亮中秋月饼礼盒","post_ids":[],"price":"168.00","purchase_id":"536714352283","purchase_shop_id":"145344873","purchase_status":1,"purchase_type":1,"purchase_url":"http://s.click.taobao.com/t?e=m%3D2%26s%3D4dj%2FS%2B9WzcEcQipKwQzePOeEDrYVVa64XoO8tOebS%2BdRAdhuF14FMR9DmL7ISRbO79%2FTFaMDK6StgmtnxDX9deVMA5qBABUs5mPg1WiM1P5OS0OzHKBZzQIomwaXGXUs78FqzS29vh5nPjZ5WWqolN%2FWWjML5JdM90WyHry0om0NJv3%2BwdMu3pQX4dde%2FR%2FXoqfgwpohDtE9uiXcuPLLag%3D%3D","short_description":null,"subcategory_id":89,"updated_at":1472011622,"url":"http://www.liwushuo.com/items/1067446","webp_urls":["http://img01.liwushuo.com/image/160824/7xvszvhv6.jpg?imageView2/2/w/720/q/85/format/webp","http://img02.liwushuo.com/image/160824/ixfniy7pd.jpg?imageView2/2/w/720/q/85/format/webp","http://img01.liwushuo.com/image/160824/3iy0nki04.jpg?imageView2/2/w/720/q/85/format/webp","http://img01.liwushuo.com/image/160824/6t9dufdn1.jpg?imageView2/2/w/720/q/85/format/webp","http://img01.liwushuo.com/image/160824/h42mx0y59.jpg?imageView2/2/w/720/q/85/format/webp"]}
         * type : item
         */

        @SerializedName("items")
        private List<DetailsBean> items;

        public PagingBean getPaging() {
            return paging;
        }

        public void setPaging(PagingBean paging) {
            this.paging = paging;
        }

        public List<DetailsBean> getItems() {
            return items;
        }

        public void setItems(List<DetailsBean> items) {
            this.items = items;
        }
}
