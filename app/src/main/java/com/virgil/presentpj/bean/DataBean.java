package com.virgil.presentpj.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DataBean {
    /**
     * next_url : http://api.liwushuo.com/v2/items?items=1014855&limit=20&offset=20
     */

    @SerializedName("paging")
    private PagingBean paging;
    /**
     * data : {"ad_monitors":[],"brand_id":null,"brand_order":null,"category_id":7,"cover_image_url":"http://img02.liwushuo.com/image/160802/ymw3ha887.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/160802/ymw3ha887.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1432108301,"description":"精挑细选的小叶和花瓣，花和叶错落有致。信纸表面薄而不透，花色清新自然。还微微带有清香之气，这份雅致的美送给Ta。","editor_id":1022,"favorites_count":12434,"id":1021260,"image_urls":["http://img02.liwushuo.com/image/160802/g2jx9cici.jpg-w720"],"is_favorite":false,"keywords":"undefined","name":"天然花叶花瓣手工信纸","post_ids":[],"price":"9.90","purchase_id":"527815677175","purchase_shop_id":null,"purchase_status":1,"purchase_type":2,"purchase_url":"http://s.click.taobao.com/t?e=m%3D2%26s%3DrhFVoJ91dGkcQipKwQzePOeEDrYVVa64yK8Cckff7TVRAdhuF14FMbr44018Ilpd5x%2BIUlGKNpWtgmtnxDX9deVMA5qBABUs5mPg1WiM1P5OS0OzHKBZzQIomwaXGXUs78FqzS29vh5nPjZ5WWqolN%2FWWjML5JdM90WyHry0om2shD2kMRwQKV668MK2FoIl6xLEcdp937kIv0wsbEmLog%3D%3D","short_description":"","subcategory_id":52,"updated_at":1432108301,"url":"http://www.liwushuo.com/items/1021260","webp_urls":["http://img02.liwushuo.com/image/160802/g2jx9cici.jpg?imageView2/2/w/720/q/85/format/webp"]}
     * type : item
     */

    @SerializedName("items")
    private List<ItemsBean> items;

    public PagingBean getPaging() {
        return paging;
    }

    public void setPaging(PagingBean paging) {
        this.paging = paging;
    }

    public List<ItemsBean> getItems() {
        return items;
    }

    public void setItems(List<ItemsBean> items) {
        this.items = items;
    }



}