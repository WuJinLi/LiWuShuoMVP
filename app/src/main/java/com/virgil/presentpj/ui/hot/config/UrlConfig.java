package com.virgil.presentpj.ui.hot.config;

/**
 * Created by Administrator on 2016/8/31.
 */
public class UrlConfig {
    //http://api.liwushuo.com/v2/items?gender=1&limit=20&offset=0&generation=2
    //http://capi.douyucdn.cn/api/v1/getVerticalRoom?limit=20&amp;offset=0
    public static class Path{
        public static final String BASE_URL="http://api.liwushuo.com/";
        public static final String URL_HOT="v2/items";
    }

    public static class Key{
        public static final String GENDER="gender";
        public static final String LIMIT="limit";
        public static final String GENERATION="generation";
        //public static final String OFFSET="offset";
    }

    public static class DefaultValue{
        public static final String GENDER="1";
        public static final String LIMIT="100";
        public static final String GENERATION="2";
       //public static final String OFFSET="0";
    }

}
