package com.virgil.presentpj.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public  class ProgramaBean {
    /**
     * next_url : http://api.liwushuo.com/v2/columns?limit=11&offset=11
     */
    @SerializedName("paging")
    private PagingBean paging;
    @SerializedName("columns")
    private List<ColumnsBean> columns;
    public PagingBean getPaging() {
        return paging;
    }
    public void setPaging(PagingBean paging) {
        this.paging = paging;
    }

    public List<ColumnsBean> getColumns() {
        return columns;
    }
    public void setColumns(List<ColumnsBean> columns) {
        this.columns = columns;
    }


}