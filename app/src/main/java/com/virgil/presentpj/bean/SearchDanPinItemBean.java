package com.virgil.presentpj.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SearchDanPinItemBean {
            @SerializedName("cover_image_url")
            private String coverImageUrl;
            @SerializedName("cover_webp_url")
            private String coverWebpUrl;
            @SerializedName("description")
            private String description;
            @SerializedName("favorites_count")
            private int favoritesCount;
            @SerializedName("id")
            private int id;
            @SerializedName("in_rank")
            private int inRank;
            @SerializedName("liked")
            private boolean liked;
            @SerializedName("likes_count")
            private int likesCount;
            @SerializedName("name")
            private String name;
            @SerializedName("price")
            private String price;
            @SerializedName("purchase_status")
            private int purchaseStatus;
            @SerializedName("purchase_type")
            private int purchaseType;
            @SerializedName("selection")
            private int selection;
            @SerializedName("short_description")
            private String shortDescription;
            @SerializedName("ad_monitors")
            private List<?> adMonitors;

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

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
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

            public int getInRank() {
                return inRank;
            }

            public void setInRank(int inRank) {
                this.inRank = inRank;
            }

            public boolean isLiked() {
                return liked;
            }

            public void setLiked(boolean liked) {
                this.liked = liked;
            }

            public int getLikesCount() {
                return likesCount;
            }

            public void setLikesCount(int likesCount) {
                this.likesCount = likesCount;
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

            public int getSelection() {
                return selection;
            }

            public void setSelection(int selection) {
                this.selection = selection;
            }

            public String getShortDescription() {
                return shortDescription;
            }

            public void setShortDescription(String shortDescription) {
                this.shortDescription = shortDescription;
            }

            public List<?> getAdMonitors() {
                return adMonitors;
            }

            public void setAdMonitors(List<?> adMonitors) {
                this.adMonitors = adMonitors;
            }
        }