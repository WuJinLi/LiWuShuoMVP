package com.virgil.presentpj.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by My on 2016/9/2.
 */
public class SearchGongLuePostsBean {

    /**
     * avatar_url : http://img03.liwushuo.com/image/160617/hzkkl1ohn.jpg
     * avatar_webp_url : null
     * created_at : 1465802857
     * id : 1
     * nickname : 小礼君
     */

    @SerializedName("author")
    private SearchGongLuePostAuthorBean author;
    /**
     * banner_image_url : http://img03.liwushuo.com/image/160623/qywichk8q.jpg-w300
     * category : 手工
     * cover_image_url : http://img01.liwushuo.com/image/160628/qs7ac2voo.jpg-w720
     * created_at : 1466495336
     * description : 对于匠心的坚守，是古老中国的传承。厌倦了流水线上的毫无差别，我们只爱手工制品的独特活力。
     * id : 57
     * order : -1
     * status : 0
     * subtitle : 已完结
     * title : DIY手工党
     * updated_at : 1466495336
     */

    @SerializedName("column")
    private SearchGongLuePostColumBean column;
    @SerializedName("cover_image_url")
    private String coverImageUrl;
    @SerializedName("cover_webp_url")
    private String coverWebpUrl;
    @SerializedName("hidden_cover_image")
    private boolean hiddenCoverImage;
    @SerializedName("id")
    private int id;
    @SerializedName("liked")
    private boolean liked;
    @SerializedName("likes_count")
    private int likesCount;
    @SerializedName("published_at")
    private int publishedAt;
    @SerializedName("selection")
    private int selection;
    @SerializedName("title")
    private String title;
    @SerializedName("type")
    private String type;
    @SerializedName("ad_monitors")
    private List<?> adMonitors;

    public SearchGongLuePostAuthorBean getAuthor() {
        return author;
    }

    public void setAuthor(SearchGongLuePostAuthorBean author) {
        this.author = author;
    }

    public SearchGongLuePostColumBean getColumn() {
        return column;
    }

    public void setColumn(SearchGongLuePostColumBean column) {
        this.column = column;
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

    public boolean isHiddenCoverImage() {
        return hiddenCoverImage;
    }

    public void setHiddenCoverImage(boolean hiddenCoverImage) {
        this.hiddenCoverImage = hiddenCoverImage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(int publishedAt) {
        this.publishedAt = publishedAt;
    }

    public int getSelection() {
        return selection;
    }

    public void setSelection(int selection) {
        this.selection = selection;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<?> getAdMonitors() {
        return adMonitors;
    }

    public void setAdMonitors(List<?> adMonitors) {
        this.adMonitors = adMonitors;
    }




}

