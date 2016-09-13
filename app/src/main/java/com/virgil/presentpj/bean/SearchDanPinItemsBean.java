package com.virgil.presentpj.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SearchDanPinItemsBean {
    @SerializedName("only_selection")
    private boolean onlySelection;
    /**
     * next_url : http://api.liwushuo
     * .com/v2/search/item?limit=20&keyword=%E6%9C%88%E9%A5%BC&offset=20
     */

    @SerializedName("paging")
    private PagingBean paging;
    @SerializedName("total")
    private int total;
    /**
     * ad_monitors : []
     * cover_image_url : http://img02.liwushuo.com/image/160824/ixfniy7pd.jpg-w720
     * cover_webp_url : http://img02.liwushuo.com/image/160824/ixfniy7pd
     * .jpg?imageView2/2/w/720/q/85/format/webp
     * description :
     * 和想家的萌兔子一起吃月饼 几行·“一个月亮”中秋礼盒，采用可交互式包装设计，和翘首望月的萌玉兔共鸣思乡情，赠您一份“红酒与抹茶齐飞，柚子共朱古力同桌”的团圆盛宴。
     * favorites_count : 1817
     * id : 1067446
     * in_rank : 1
     * liked : false
     * likes_count : 1817
     * name : 几行·一个月亮中秋月饼礼盒
     * price : 188.00
     * purchase_status : 1
     * purchase_type : 1
     * selection : 1
     * short_description : 玉兔穿越星空，带回百种祝福
     */

    @SerializedName("items")
    private List<SearchDanPinItemBean> items;

    public boolean isOnlySelection() {
        return onlySelection;
    }

    public void setOnlySelection(boolean onlySelection) {
        this.onlySelection = onlySelection;
    }

    public PagingBean getPaging() {
        return paging;
    }

    public void setPaging(PagingBean paging) {
        this.paging = paging;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<SearchDanPinItemBean> getItems() {
        return items;
    }

    public void setItems(List<SearchDanPinItemBean> items) {
        this.items = items;
    }

}
