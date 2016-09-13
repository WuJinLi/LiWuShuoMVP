package com.virgil.presentpj.ui.hot.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2016/9/2.
 */
public class RecommendItemsBean {
        @SerializedName("ad_monitors")
        private Object adMonitors;
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
        @SerializedName("keywords")
        private Object keywords;
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
        @SerializedName("subcategory_id")
        private int subcategoryId;
        @SerializedName("updated_at")
        private int updatedAt;
        @SerializedName("url")
        private String url;
        @SerializedName("image_urls")
        private List<String> imageUrls;
        @SerializedName("post_ids")
        private List<?> postIds;
        @SerializedName("webp_urls")
        private List<String> webpUrls;

        public Object getAdMonitors() {
            return adMonitors;
        }

        public void setAdMonitors(Object adMonitors) {
            this.adMonitors = adMonitors;
        }

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

        public Object getKeywords() {
            return keywords;
        }

        public void setKeywords(Object keywords) {
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
