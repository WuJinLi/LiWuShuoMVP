package com.virgil.presentpj.ui.hot.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2016/9/2.
 */
public class PingLunTwoBean {
        /**
         * next_url : http://api.liwushuo.com/v2/items/1021260/comments?limit=20&offset=20
         */

        @SerializedName("paging")
        private PagingBean paging;
        /**
         * content : 冲流量有优惠
         * created_at : 1472759341
         * id : 505614
         * images : [{"h":567,"original":"http://img02.liwushuo.com/comment/160902/22574b59e_a.png?imageView2/2/w/957/q/85/format/webp","thumbnail":"http://img02.liwushuo.com/comment/160902/22574b59e_a.png?imageView2/2/w/506/q/85/format/webp","url":"comment/160902/22574b59e_a.png","w":957}]
         * item_id : 1021260
         * reply_to_id : null
         * show : true
         * status : 1
         * user : {"avatar_url":"http://img01.liwushuo.com/avatar/160902/3cdbb54a6_a-w180","can_mobile_login":true,"guest_uuid":null,"id":7432830,"nickname":"小店冲流量有优惠","role":0}
         */

        @SerializedName("comments")
        private List<PingLun3CommentsBean> comments;

        public PagingBean getPaging() {
            return paging;
        }

        public void setPaging(PagingBean paging) {
            this.paging = paging;
        }

        public List<PingLun3CommentsBean> getComments() {
            return comments;
        }

        public void setComments(List<PingLun3CommentsBean> comments) {
            this.comments = comments;
        }

        public static class PagingBean {
            @SerializedName("next_url")
            private String nextUrl;

            public String getNextUrl() {
                return nextUrl;
            }

            public void setNextUrl(String nextUrl) {
                this.nextUrl = nextUrl;
            }
        }
}
