package com.virgil.presentpj.config;

import com.virgil.presentpj.ui.category.search.SDViewPagerAdapter;

/**
 * 用于存放数据对对应的网址
 */
public class UrlConfig {
    //http://api.liwushuo.com/v2/item_subcategories/7/items?limit=20&offset=0
    public static class Path {
        //主页标签导航
        public static final String TAB_BASEURL = "http://api.liwushuo.com/";
        public static final String TAB_URL = "v2/channels/preset";
        //攻略中栏目的地址
        public static final String CATEGROY_PROGRAMA = "v2/columns";
        //攻略对象，品类的地址
        public static final String CHANNEL_GROUPS = "v2/channel_groups/all";
        //栏目条目详情地址
        public static final String PROGRAMA_DETAILS = "v2/columns/{" + UrlPart.ID + "}";

        //品类等的条目详情网址
        public static final String OTHER_DETAILS = "v2/channels/{" + UrlPart.ID + "}/items_v2";
        public static final String SEARCH_DANPIN = "v2/search/item";
        public static final String SEARCH_GONGLUE = "v2/search/post";
        //分类的单品
        public static final String CATEGROY_DANPIN = "v2/item_categories/tree";
        //分类单品详情
        public static final String CATEGROY_DANPIN_DETALS = "v2/item_subcategories/{" + UrlPart
                .ID + "}/items";
    }

    public static class UrlPart {
        public static final String ID = "id";
    }

    public static class Key {
        //主页标签导航
        public static final String GENDER = "gender";
        public static final String GENERATION = "generation";
        public static final String LIMIT = "limit";
        public static final String OFFSET = "offset";
        public static final String KEYWORD = "keyword";
    }

    public static class DefaultValue {
        //主页标签导航
        public static final String GENDER = "1";
        public static final String GENERATION = "2";
        public static final String DEFAULT_LIMIT = "20";
        public static final String DEFAULT_OFFSET = "0";
    }
}
