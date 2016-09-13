package com.virgil.presentpj.ui.hot.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2016/8/31.
 */
public class DetailsBean {
        /**
         * ad_monitors : []
         * brand_id : null
         * brand_order : null
         * category_id : 5
         * cover_image_url : http://img02.liwushuo.com/image/160824/ixfniy7pd.jpg-w720
         * cover_webp_url : http://img02.liwushuo.com/image/160824/ixfniy7pd.jpg?imageView2/2/w/720/q/85/format/webp
         * created_at : 1472011622
         * description : 和想家的萌兔子一起吃月饼 几行·“一个月亮”中秋礼盒，采用可交互式包装设计，和翘首望月的萌玉兔共鸣思乡情，赠您一份“红酒与抹茶齐飞，柚子共朱古力同桌”的团圆盛宴。
         * editor_id : 1023
         * favorites_count : 1500
         * id : 1067446
         * image_urls : ["http://img01.liwushuo.com/image/160824/7xvszvhv6.jpg-w720","http://img02.liwushuo.com/image/160824/ixfniy7pd.jpg-w720","http://img01.liwushuo.com/image/160824/3iy0nki04.jpg-w720","http://img01.liwushuo.com/image/160824/6t9dufdn1.jpg-w720","http://img01.liwushuo.com/image/160824/h42mx0y59.jpg-w720"]
         * is_favorite : false
         * keywords :
         * name : 几行·一个月亮中秋月饼礼盒
         * post_ids : []
         * price : 168.00
         * purchase_id : 536714352283
         * purchase_shop_id : 145344873
         * purchase_status : 1
         * purchase_type : 1
         * purchase_url : http://s.click.taobao.com/t?e=m%3D2%26s%3D4dj%2FS%2B9WzcEcQipKwQzePOeEDrYVVa64XoO8tOebS%2BdRAdhuF14FMR9DmL7ISRbO79%2FTFaMDK6StgmtnxDX9deVMA5qBABUs5mPg1WiM1P5OS0OzHKBZzQIomwaXGXUs78FqzS29vh5nPjZ5WWqolN%2FWWjML5JdM90WyHry0om0NJv3%2BwdMu3pQX4dde%2FR%2FXoqfgwpohDtE9uiXcuPLLag%3D%3D
         * short_description : null
         * subcategory_id : 89
         * updated_at : 1472011622
         * url : http://www.liwushuo.com/items/1067446
         * webp_urls : ["http://img01.liwushuo.com/image/160824/7xvszvhv6.jpg?imageView2/2/w/720/q/85/format/webp","http://img02.liwushuo.com/image/160824/ixfniy7pd.jpg?imageView2/2/w/720/q/85/format/webp","http://img01.liwushuo.com/image/160824/3iy0nki04.jpg?imageView2/2/w/720/q/85/format/webp","http://img01.liwushuo.com/image/160824/6t9dufdn1.jpg?imageView2/2/w/720/q/85/format/webp","http://img01.liwushuo.com/image/160824/h42mx0y59.jpg?imageView2/2/w/720/q/85/format/webp"]
         */

        @SerializedName("data")
        private DataBean data;
        @SerializedName("type")
        private String type;

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public static class DataBean {
            @SerializedName("brand_id")
            private Object brandId;
            @SerializedName("brand_order")
            private Object brandOrder;
            @SerializedName("category_id")
            private int categoryId;
            @SerializedName("cover_image_url")
            private String coverImageUrl;
            @SerializedName("cover_webp_url")
            private String coverWebpUrl;
            @SerializedName("created_at")
            private int createdAt;
            @SerializedName("description")
            private String description;
            @SerializedName("editor_id")
            private int editorId;
            @SerializedName("favorites_count")
            private int favoritesCount;
            @SerializedName("id")
            private int id;
            @SerializedName("is_favorite")
            private boolean isFavorite;
            @SerializedName("keywords")
            private String keywords;
            @SerializedName("name")
            private String name;
            @SerializedName("price")
            private String price;
            @SerializedName("purchase_id")
            private String purchaseId;
            @SerializedName("purchase_shop_id")
            private String purchaseShopId;
            @SerializedName("purchase_status")
            private int purchaseStatus;
            @SerializedName("purchase_type")
            private int purchaseType;
            @SerializedName("purchase_url")
            private String purchaseUrl;
            @SerializedName("short_description")
            private Object shortDescription;
            @SerializedName("subcategory_id")
            private int subcategoryId;
            @SerializedName("updated_at")
            private int updatedAt;
            @SerializedName("url")
            private String url;
            @SerializedName("ad_monitors")
            private List<?> adMonitors;
            @SerializedName("image_urls")
            private List<String> imageUrls;
            @SerializedName("post_ids")
            private List<?> postIds;
            @SerializedName("webp_urls")
            private List<String> webpUrls;

            public Object getBrandId() {
                return brandId;
            }

            public void setBrandId(Object brandId) {
                this.brandId = brandId;
            }

            public Object getBrandOrder() {
                return brandOrder;
            }

            public void setBrandOrder(Object brandOrder) {
                this.brandOrder = brandOrder;
            }

            public int getCategoryId() {
                return categoryId;
            }

            public void setCategoryId(int categoryId) {
                this.categoryId = categoryId;
            }

            public String getCoverImageUrl() {
                return coverImageUrl;
            }

            public void setCoverImageUrl(String coverImageUrl) {
                this.coverImageUrl = coverImageUrl;
            }

            public String getCoverWebpUrl() {
                return coverWebpUrl;
            }

            public void setCoverWebpUrl(String coverWebpUrl) {
                this.coverWebpUrl = coverWebpUrl;
            }

            public int getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(int createdAt) {
                this.createdAt = createdAt;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public int getEditorId() {
                return editorId;
            }

            public void setEditorId(int editorId) {
                this.editorId = editorId;
            }

            public int getFavoritesCount() {
                return favoritesCount;
            }

            public void setFavoritesCount(int favoritesCount) {
                this.favoritesCount = favoritesCount;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public boolean isIsFavorite() {
                return isFavorite;
            }

            public void setIsFavorite(boolean isFavorite) {
                this.isFavorite = isFavorite;
            }

            public String getKeywords() {
                return keywords;
            }

            public void setKeywords(String keywords) {
                this.keywords = keywords;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public String getPurchaseId() {
                return purchaseId;
            }

            public void setPurchaseId(String purchaseId) {
                this.purchaseId = purchaseId;
            }

            public String getPurchaseShopId() {
                return purchaseShopId;
            }

            public void setPurchaseShopId(String purchaseShopId) {
                this.purchaseShopId = purchaseShopId;
            }

            public int getPurchaseStatus() {
                return purchaseStatus;
            }

            public void setPurchaseStatus(int purchaseStatus) {
                this.purchaseStatus = purchaseStatus;
            }

            public int getPurchaseType() {
                return purchaseType;
            }

            public void setPurchaseType(int purchaseType) {
                this.purchaseType = purchaseType;
            }

            public String getPurchaseUrl() {
                return purchaseUrl;
            }

            public void setPurchaseUrl(String purchaseUrl) {
                this.purchaseUrl = purchaseUrl;
            }

            public Object getShortDescription() {
                return shortDescription;
            }

            public void setShortDescription(Object shortDescription) {
                this.shortDescription = shortDescription;
            }

            public int getSubcategoryId() {
                return subcategoryId;
            }

            public void setSubcategoryId(int subcategoryId) {
                this.subcategoryId = subcategoryId;
            }

            public int getUpdatedAt() {
                return updatedAt;
            }

            public void setUpdatedAt(int updatedAt) {
                this.updatedAt = updatedAt;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public List<?> getAdMonitors() {
                return adMonitors;
            }

            public void setAdMonitors(List<?> adMonitors) {
                this.adMonitors = adMonitors;
            }

            public List<String> getImageUrls() {
                return imageUrls;
            }

            public void setImageUrls(List<String> imageUrls) {
                this.imageUrls = imageUrls;
            }

            public List<?> getPostIds() {
                return postIds;
            }

            public void setPostIds(List<?> postIds) {
                this.postIds = postIds;
            }

            public List<String> getWebpUrls() {
                return webpUrls;
            }

            public void setWebpUrls(List<String> webpUrls) {
                this.webpUrls = webpUrls;
            }
        }
    }
