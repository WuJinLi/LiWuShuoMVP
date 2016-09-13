package com.virgil.presentpj.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by My on 2016/9/2.
 */
public class SearchGongLueBean {

    /**
     * code : 200
     * data : {"paging":{"next_url":"http://api.liwushuo
     * .com/v2/search/post?sort=&limit=20&keyword=%E6%9C%88%E9%A5%BC&offset=20"},
     * "posts":[{"ad_monitors":[],"author":{"avatar_url":"http://img03.liwushuo
     * .com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,
     * "nickname":"小礼君"},"column":{"banner_image_url":"http://img03.liwushuo
     * .com/image/160623/qywichk8q.jpg-w300","category":"手工","cover_image_url":"http://img01
     * .liwushuo.com/image/160628/qs7ac2voo.jpg-w720","created_at":1466495336,
     * "description":"对于匠心的坚守，是古老中国的传承。厌倦了流水线上的毫无差别，我们只爱手工制品的独特活力。","id":57,"order":-1,
     * "status":0,"subtitle":"已完结","title":"DIY手工党","updated_at":1466495336},
     * "cover_image_url":"http://img03.liwushuo.com/image/150917/97ctrpi7m.jpg-w720",
     * "cover_webp_url":"http://img03.liwushuo.com/image/150917/97ctrpi7m
     * .jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1013394,
     * "liked":false,"likes_count":58440,"published_at":1441684399,"selection":0,
     * "title":"中秋DIY专属心意月饼，满满的都是爱","type":"post"},{"ad_monitors":[],
     * "author":{"avatar_url":"http://img02.liwushuo.com/image/160617/hzkkl1ohn.jpg",
     * "avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},
     * "column":{"banner_image_url":"http://img02.liwushuo.com/image/160623/4e241fwj7.jpg-w300",
     * "category":"美食","cover_image_url":"http://img02.liwushuo.com/image/160628/zlou6xduv
     * .jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。",
     * "id":64,"order":-1,"post_published_at":1469502000,"status":0,"subtitle":"已完结",
     * "title":"美食の情书","updated_at":1471430208},"cover_image_url":"http://img03.liwushuo
     * .com/image/150831/jmqto2sbq.jpg-w720","cover_webp_url":"http://img03.liwushuo
     * .com/image/150831/jmqto2sbq.jpg?imageView2/2/w/720/q/85/format/webp",
     * "hidden_cover_image":false,"id":1011038,"liked":false,"likes_count":37534,
     * "published_at":1439085956,"selection":0,"title":"赏一轮明月，品美味月饼","type":"post"},
     * {"ad_monitors":[],"author":{"avatar_url":"http://img02.liwushuo.com/image/160617/hzkkl1ohn
     * .jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},
     * "column":{"banner_image_url":"http://img02.liwushuo.com/image/160623/4e241fwj7.jpg-w300",
     * "category":"美食","cover_image_url":"http://img02.liwushuo.com/image/160628/zlou6xduv
     * .jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。",
     * "id":64,"order":-1,"post_published_at":1469502000,"status":0,"subtitle":"已完结",
     * "title":"美食の情书","updated_at":1471430208},"cover_image_url":"http://img01.liwushuo
     * .com/image/150826/ojxeuv04q.jpg-w720","cover_webp_url":"http://img01.liwushuo
     * .com/image/150826/ojxeuv04q.jpg?imageView2/2/w/720/q/85/format/webp",
     * "hidden_cover_image":false,"id":1010186,"liked":false,"likes_count":35770,
     * "published_at":1439690528,"selection":0,"title":"中秋佳节，月饼代表我的思念","type":"post"},
     * {"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160617/hzkkl1ohn
     * .jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},
     * "column":{"banner_image_url":"http://img03.liwushuo.com/image/160623/qywichk8q.jpg-w300",
     * "category":"手工","cover_image_url":"http://img03.liwushuo.com/image/160628/qs7ac2voo
     * .jpg-w720","created_at":1466495336,
     * "description":"对于匠心的坚守，是古老中国的传承。厌倦了流水线上的毫无差别，我们只爱手工制品的独特活力。","id":57,"order":-1,
     * "status":0,"subtitle":"已完结","title":"DIY手工党","updated_at":1466495336},
     * "cover_image_url":"http://img01.liwushuo.com/image/140831/vciaq7a9k_w.jpg-w720",
     * "cover_webp_url":"http://img01.liwushuo.com/image/140831/vciaq7a9k_w
     * .jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":110,
     * "liked":false,"likes_count":35268,"published_at":1401267548,"selection":0,
     * "title":"收到这些月饼，幸福感直线上升！","type":"post"},{"ad_monitors":[],
     * "author":{"avatar_url":"http://img02.liwushuo.com/image/160617/hzkkl1ohn.jpg",
     * "avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},
     * "column":{"banner_image_url":"http://img01.liwushuo.com/image/160623/qywichk8q.jpg-w300",
     * "category":"手工","cover_image_url":"http://img03.liwushuo.com/image/160628/qs7ac2voo
     * .jpg-w720","created_at":1466495336,
     * "description":"对于匠心的坚守，是古老中国的传承。厌倦了流水线上的毫无差别，我们只爱手工制品的独特活力。","id":57,"order":-1,
     * "status":0,"subtitle":"已完结","title":"DIY手工党","updated_at":1466495336},
     * "cover_image_url":"http://img01.liwushuo.com/image/140901/se5pddtp9_w.jpg-w720",
     * "cover_webp_url":"http://img01.liwushuo.com/image/140901/se5pddtp9_w
     * .jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":122,
     * "liked":false,"likes_count":66605,"published_at":1409654067,"selection":0,
     * "title":"卖萌必备，送给外貌协会的手工冰皮月饼","type":"post"},{"ad_monitors":[],
     * "author":{"avatar_url":"http://img03.liwushuo.com/image/160617/hzkkl1ohn.jpg",
     * "avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},
     * "column":{"banner_image_url":"http://img01.liwushuo.com/image/160623/qywichk8q.jpg-w300",
     * "category":"手工","cover_image_url":"http://img02.liwushuo.com/image/160628/qs7ac2voo
     * .jpg-w720","created_at":1466495336,
     * "description":"对于匠心的坚守，是古老中国的传承。厌倦了流水线上的毫无差别，我们只爱手工制品的独特活力。","id":57,"order":-1,
     * "status":0,"subtitle":"已完结","title":"DIY手工党","updated_at":1466495336},
     * "cover_image_url":"http://img02.liwushuo.com/image/140901/9anbg8t1q_w.jpg-w720",
     * "cover_webp_url":"http://img02.liwushuo.com/image/140901/9anbg8t1q_w
     * .jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":121,
     * "liked":false,"likes_count":56023,"published_at":1401264331,"selection":0,
     * "title":"实战总结出的最佳配方：奶黄冰皮月饼","type":"post"},{"ad_monitors":[],
     * "author":{"avatar_url":"http://img02.liwushuo.com/image/160615/ozwl236qx.jpg",
     * "avatar_webp_url":null,"created_at":1465974288,"id":9,"nickname":"小C"},
     * "column":{"banner_image_url":"http://img03.liwushuo.com/image/160608/kd1dy4pi3.jpg-w300",
     * "category":"礼物","cover_image_url":"http://img01.liwushuo.com/image/160713/y2arp77qx
     * .jpg-w720","created_at":1462501381,
     * "description":"如果青春不会散场，时光可以珍藏。如果你的每一个米粒大小念想，都能找到与之匹配的美物安放...这样的店你会不会来？","id":5,"order":0,
     * "post_published_at":1472636033,"status":0,"subtitle":"","title":"不打烊的礼物店",
     * "updated_at":1472626010},"cover_image_url":"http://img03.liwushuo
     * .com/image/160831/0adz7hj50.jpg-w720","cover_webp_url":"http://img03.liwushuo
     * .com/image/160831/0adz7hj50.jpg?imageView2/2/w/720/q/85/format/webp",
     * "hidden_cover_image":false,"id":1045455,"liked":false,"likes_count":5682,
     * "published_at":1472634060,"selection":0,"title":"第145期 | 不送月饼？商务送礼今年玩出新花样","type":"post"},
     * {"ad_monitors":[],"author":{"avatar_url":"http://img02.liwushuo.com/image/160615/htaxrecse
     * .jpg","avatar_webp_url":null,"created_at":1465974614,"id":13,"nickname":"美物娘"},
     * "column":{"banner_image_url":"http://img02.liwushuo.com/image/160608/8nluue8yx.jpg-w300",
     * "category":"美物","cover_image_url":"http://img02.liwushuo.com/image/160713/zlsbvl5it
     * .jpg-w720","created_at":1462501829,"description":"贪念时间所有美好的东西，唯一不吝啬的，就是与你分享。","id":19,
     * "order":0,"post_published_at":1472695200,"status":0,"subtitle":"","title":"美物收割机",
     * "updated_at":1472640625},"cover_image_url":"http://img01.liwushuo
     * .com/image/160829/8p88oshwj.jpg-w720","cover_webp_url":"http://img01.liwushuo
     * .com/image/160829/8p88oshwj.jpg?imageView2/2/w/720/q/85/format/webp",
     * "hidden_cover_image":false,"id":1045475,"liked":false,"likes_count":140,
     * "published_at":1472748281,"selection":0,"title":"第87期 | 中秋送月饼，不如送一个\u201c兔子\u201d",
     * "type":"post"},{"ad_monitors":[],"author":{"avatar_url":"http://img02.liwushuo
     * .com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,
     * "nickname":"小礼君"},"column":{"banner_image_url":"http://img01.liwushuo
     * .com/image/160623/56osnquwa.jpg-w300","category":"礼物","cover_image_url":"http://img01
     * .liwushuo.com/image/160628/fwwz5zua2.jpg-w720","created_at":1466495336,
     * "description":"完美礼物指南，送亲人送爱人送友人送陌生人，一次性拯救你的选礼困难症。","id":59,"order":-1,
     * "post_published_at":1472518701,"status":0,"subtitle":"已完结","title":"万能礼物清单",
     * "updated_at":1472518702},"cover_image_url":"http://img03.liwushuo
     * .com/image/141203/wc5br88j5.jpg-w720","cover_webp_url":"http://img03.liwushuo
     * .com/image/141203/wc5br88j5.jpg?imageView2/2/w/720/q/85/format/webp",
     * "hidden_cover_image":false,"id":115,"liked":false,"likes_count":30624,
     * "published_at":1409185290,"selection":0,"title":"除了月饼，中秋节还可以送这些礼物","type":"post"},
     * {"ad_monitors":[],"author":{"avatar_url":"http://img02.liwushuo.com/image/160617/hzkkl1ohn
     * .jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},
     * "column":{"banner_image_url":"http://img03.liwushuo.com/image/160630/npssjj3yc.jpg-w300",
     * "category":"美食","cover_image_url":"http://img02.liwushuo.com/image/160713/l0nb4kpud
     * .jpg-w720","created_at":1467265951,
     * "description":"无论是山珍海味还是街边小吃，\r\n无论是飞禽走兽还是五谷香料，\r\n美食不分贵贱没有国界\r\n我们都犯着一种罪，叫做\u201c
     * 食宗最\u201d","id":83,"order":0,"post_published_at":1472688000,"status":0,"subtitle":"",
     * "title":"吃货俱乐部","updated_at":1472697817},"cover_image_url":"http://img03.liwushuo
     * .com/image/160824/bemadxp67.jpg-w720","cover_webp_url":"http://img03.liwushuo
     * .com/image/160824/bemadxp67.jpg?imageView2/2/w/720/q/85/format/webp",
     * "hidden_cover_image":false,"id":1045216,"liked":false,"likes_count":16654,
     * "published_at":1471478400,"selection":0,"title":"美味与颜值并存的月饼礼盒，快Mark住！","type":"post"},
     * {"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160617/hzkkl1ohn
     * .jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},
     * "column":{"banner_image_url":"http://img03.liwushuo.com/image/160623/qywichk8q.jpg-w300",
     * "category":"手工","cover_image_url":"http://img03.liwushuo.com/image/160628/qs7ac2voo
     * .jpg-w720","created_at":1466495336,
     * "description":"对于匠心的坚守，是古老中国的传承。厌倦了流水线上的毫无差别，我们只爱手工制品的独特活力。","id":57,"order":-1,
     * "status":0,"subtitle":"已完结","title":"DIY手工党","updated_at":1466495336},
     * "cover_image_url":"http://img01.liwushuo.com/image/140826/3x775zz66_w.jpg-w720",
     * "cover_webp_url":"http://img01.liwushuo.com/image/140826/3x775zz66_w
     * .jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":109,
     * "liked":false,"likes_count":58365,"published_at":1409043863,"selection":0,
     * "title":"又是一年月圆时，亲手送份彩花冰皮月饼","type":"post"},{"ad_monitors":[],
     * "author":{"avatar_url":"http://img03.liwushuo.com/image/160615/z4wubgarw.jpg",
     * "avatar_webp_url":null,"created_at":1465975797,"id":14,"nickname":"鹿欧尼"},
     * "column":{"banner_image_url":"http://img01.liwushuo.com/image/160630/npssjj3yc.jpg-w300",
     * "category":"美食","cover_image_url":"http://img01.liwushuo.com/image/160713/l0nb4kpud
     * .jpg-w720","created_at":1467265951,
     * "description":"无论是山珍海味还是街边小吃，\r\n无论是飞禽走兽还是五谷香料，\r\n美食不分贵贱没有国界\r\n我们都犯着一种罪，叫做\u201c
     * 食宗最\u201d","id":83,"order":0,"post_published_at":1472688000,"status":0,"subtitle":"",
     * "title":"吃货俱乐部","updated_at":1472697817},"cover_image_url":"http://img02.liwushuo
     * .com/image/160830/pshjuzlts.jpg-w720","cover_webp_url":"http://img02.liwushuo
     * .com/image/160830/pshjuzlts.jpg?imageView2/2/w/720/q/85/format/webp",
     * "hidden_cover_image":false,"id":1045466,"liked":false,"likes_count":10897,
     * "published_at":1472547780,"selection":0,"title":"第27期 | 中秋月饼食不完，茶叶照样能尽孝","type":"post"},
     * {"ad_monitors":[],"author":{"avatar_url":"http://img03.liwushuo.com/image/160708/yactcsfo5
     * .jpg","avatar_webp_url":null,"created_at":1467971922,"id":35,"nickname":"凹凸曼"},
     * "column":{"banner_image_url":"http://img03.liwushuo.com/image/160708/or81k6fea.jpg-w300",
     * "category":"礼物","cover_image_url":"http://img02.liwushuo.com/image/160720/xdt9kjriy
     * .jpg-w720","created_at":1467970933,
     * "description":"会买不一定\u201c惠\u201d买，每日10款超低价，举双手奉上。\u2014\u2014from亚马逊良心出品","id":90,
     * "order":0,"post_published_at":1472601600,"status":0,"subtitle":"","title":"省钱大总攻",
     * "updated_at":1472632486},"cover_image_url":"http://img01.liwushuo
     * .com/image/160826/990ie05m8.jpg-w720","cover_webp_url":"http://img01.liwushuo
     * .com/image/160826/990ie05m8.jpg?imageView2/2/w/720/q/85/format/webp",
     * "hidden_cover_image":false,"id":1045443,"liked":false,"likes_count":8392,
     * "published_at":1472428800,"selection":0,"title":"第51期 | 又是中秋月圆时，把爱装进月饼礼盒带回家",
     * "type":"post"}],"total":13}
     * message : OK
     */

    @SerializedName("code")
    private int code;
    /**
     * paging : {"next_url":"http://api.liwushuo
     * .com/v2/search/post?sort=&limit=20&keyword=%E6%9C%88%E9%A5%BC&offset=20"}
     * posts : [{"ad_monitors":[],"author":{"avatar_url":"http://img03.liwushuo
     * .com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,
     * "nickname":"小礼君"},"column":{"banner_image_url":"http://img03.liwushuo
     * .com/image/160623/qywichk8q.jpg-w300","category":"手工","cover_image_url":"http://img01
     * .liwushuo.com/image/160628/qs7ac2voo.jpg-w720","created_at":1466495336,
     * "description":"对于匠心的坚守，是古老中国的传承。厌倦了流水线上的毫无差别，我们只爱手工制品的独特活力。","id":57,"order":-1,
     * "status":0,"subtitle":"已完结","title":"DIY手工党","updated_at":1466495336},
     * "cover_image_url":"http://img03.liwushuo.com/image/150917/97ctrpi7m.jpg-w720",
     * "cover_webp_url":"http://img03.liwushuo.com/image/150917/97ctrpi7m
     * .jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1013394,
     * "liked":false,"likes_count":58440,"published_at":1441684399,"selection":0,
     * "title":"中秋DIY专属心意月饼，满满的都是爱","type":"post"},{"ad_monitors":[],
     * "author":{"avatar_url":"http://img02.liwushuo.com/image/160617/hzkkl1ohn.jpg",
     * "avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},
     * "column":{"banner_image_url":"http://img02.liwushuo.com/image/160623/4e241fwj7.jpg-w300",
     * "category":"美食","cover_image_url":"http://img02.liwushuo.com/image/160628/zlou6xduv
     * .jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。",
     * "id":64,"order":-1,"post_published_at":1469502000,"status":0,"subtitle":"已完结",
     * "title":"美食の情书","updated_at":1471430208},"cover_image_url":"http://img03.liwushuo
     * .com/image/150831/jmqto2sbq.jpg-w720","cover_webp_url":"http://img03.liwushuo
     * .com/image/150831/jmqto2sbq.jpg?imageView2/2/w/720/q/85/format/webp",
     * "hidden_cover_image":false,"id":1011038,"liked":false,"likes_count":37534,
     * "published_at":1439085956,"selection":0,"title":"赏一轮明月，品美味月饼","type":"post"},
     * {"ad_monitors":[],"author":{"avatar_url":"http://img02.liwushuo.com/image/160617/hzkkl1ohn
     * .jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},
     * "column":{"banner_image_url":"http://img02.liwushuo.com/image/160623/4e241fwj7.jpg-w300",
     * "category":"美食","cover_image_url":"http://img02.liwushuo.com/image/160628/zlou6xduv
     * .jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。",
     * "id":64,"order":-1,"post_published_at":1469502000,"status":0,"subtitle":"已完结",
     * "title":"美食の情书","updated_at":1471430208},"cover_image_url":"http://img01.liwushuo
     * .com/image/150826/ojxeuv04q.jpg-w720","cover_webp_url":"http://img01.liwushuo
     * .com/image/150826/ojxeuv04q.jpg?imageView2/2/w/720/q/85/format/webp",
     * "hidden_cover_image":false,"id":1010186,"liked":false,"likes_count":35770,
     * "published_at":1439690528,"selection":0,"title":"中秋佳节，月饼代表我的思念","type":"post"},
     * {"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160617/hzkkl1ohn
     * .jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},
     * "column":{"banner_image_url":"http://img03.liwushuo.com/image/160623/qywichk8q.jpg-w300",
     * "category":"手工","cover_image_url":"http://img03.liwushuo.com/image/160628/qs7ac2voo
     * .jpg-w720","created_at":1466495336,
     * "description":"对于匠心的坚守，是古老中国的传承。厌倦了流水线上的毫无差别，我们只爱手工制品的独特活力。","id":57,"order":-1,
     * "status":0,"subtitle":"已完结","title":"DIY手工党","updated_at":1466495336},
     * "cover_image_url":"http://img01.liwushuo.com/image/140831/vciaq7a9k_w.jpg-w720",
     * "cover_webp_url":"http://img01.liwushuo.com/image/140831/vciaq7a9k_w
     * .jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":110,
     * "liked":false,"likes_count":35268,"published_at":1401267548,"selection":0,
     * "title":"收到这些月饼，幸福感直线上升！","type":"post"},{"ad_monitors":[],
     * "author":{"avatar_url":"http://img02.liwushuo.com/image/160617/hzkkl1ohn.jpg",
     * "avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},
     * "column":{"banner_image_url":"http://img01.liwushuo.com/image/160623/qywichk8q.jpg-w300",
     * "category":"手工","cover_image_url":"http://img03.liwushuo.com/image/160628/qs7ac2voo
     * .jpg-w720","created_at":1466495336,
     * "description":"对于匠心的坚守，是古老中国的传承。厌倦了流水线上的毫无差别，我们只爱手工制品的独特活力。","id":57,"order":-1,
     * "status":0,"subtitle":"已完结","title":"DIY手工党","updated_at":1466495336},
     * "cover_image_url":"http://img01.liwushuo.com/image/140901/se5pddtp9_w.jpg-w720",
     * "cover_webp_url":"http://img01.liwushuo.com/image/140901/se5pddtp9_w
     * .jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":122,
     * "liked":false,"likes_count":66605,"published_at":1409654067,"selection":0,
     * "title":"卖萌必备，送给外貌协会的手工冰皮月饼","type":"post"},{"ad_monitors":[],
     * "author":{"avatar_url":"http://img03.liwushuo.com/image/160617/hzkkl1ohn.jpg",
     * "avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},
     * "column":{"banner_image_url":"http://img01.liwushuo.com/image/160623/qywichk8q.jpg-w300",
     * "category":"手工","cover_image_url":"http://img02.liwushuo.com/image/160628/qs7ac2voo
     * .jpg-w720","created_at":1466495336,
     * "description":"对于匠心的坚守，是古老中国的传承。厌倦了流水线上的毫无差别，我们只爱手工制品的独特活力。","id":57,"order":-1,
     * "status":0,"subtitle":"已完结","title":"DIY手工党","updated_at":1466495336},
     * "cover_image_url":"http://img02.liwushuo.com/image/140901/9anbg8t1q_w.jpg-w720",
     * "cover_webp_url":"http://img02.liwushuo.com/image/140901/9anbg8t1q_w
     * .jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":121,
     * "liked":false,"likes_count":56023,"published_at":1401264331,"selection":0,
     * "title":"实战总结出的最佳配方：奶黄冰皮月饼","type":"post"},{"ad_monitors":[],
     * "author":{"avatar_url":"http://img02.liwushuo.com/image/160615/ozwl236qx.jpg",
     * "avatar_webp_url":null,"created_at":1465974288,"id":9,"nickname":"小C"},
     * "column":{"banner_image_url":"http://img03.liwushuo.com/image/160608/kd1dy4pi3.jpg-w300",
     * "category":"礼物","cover_image_url":"http://img01.liwushuo.com/image/160713/y2arp77qx
     * .jpg-w720","created_at":1462501381,
     * "description":"如果青春不会散场，时光可以珍藏。如果你的每一个米粒大小念想，都能找到与之匹配的美物安放...这样的店你会不会来？","id":5,"order":0,
     * "post_published_at":1472636033,"status":0,"subtitle":"","title":"不打烊的礼物店",
     * "updated_at":1472626010},"cover_image_url":"http://img03.liwushuo
     * .com/image/160831/0adz7hj50.jpg-w720","cover_webp_url":"http://img03.liwushuo
     * .com/image/160831/0adz7hj50.jpg?imageView2/2/w/720/q/85/format/webp",
     * "hidden_cover_image":false,"id":1045455,"liked":false,"likes_count":5682,
     * "published_at":1472634060,"selection":0,"title":"第145期 | 不送月饼？商务送礼今年玩出新花样","type":"post"},
     * {"ad_monitors":[],"author":{"avatar_url":"http://img02.liwushuo.com/image/160615/htaxrecse
     * .jpg","avatar_webp_url":null,"created_at":1465974614,"id":13,"nickname":"美物娘"},
     * "column":{"banner_image_url":"http://img02.liwushuo.com/image/160608/8nluue8yx.jpg-w300",
     * "category":"美物","cover_image_url":"http://img02.liwushuo.com/image/160713/zlsbvl5it
     * .jpg-w720","created_at":1462501829,"description":"贪念时间所有美好的东西，唯一不吝啬的，就是与你分享。","id":19,
     * "order":0,"post_published_at":1472695200,"status":0,"subtitle":"","title":"美物收割机",
     * "updated_at":1472640625},"cover_image_url":"http://img01.liwushuo
     * .com/image/160829/8p88oshwj.jpg-w720","cover_webp_url":"http://img01.liwushuo
     * .com/image/160829/8p88oshwj.jpg?imageView2/2/w/720/q/85/format/webp",
     * "hidden_cover_image":false,"id":1045475,"liked":false,"likes_count":140,
     * "published_at":1472748281,"selection":0,"title":"第87期 | 中秋送月饼，不如送一个\u201c兔子\u201d",
     * "type":"post"},{"ad_monitors":[],"author":{"avatar_url":"http://img02.liwushuo
     * .com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,
     * "nickname":"小礼君"},"column":{"banner_image_url":"http://img01.liwushuo
     * .com/image/160623/56osnquwa.jpg-w300","category":"礼物","cover_image_url":"http://img01
     * .liwushuo.com/image/160628/fwwz5zua2.jpg-w720","created_at":1466495336,
     * "description":"完美礼物指南，送亲人送爱人送友人送陌生人，一次性拯救你的选礼困难症。","id":59,"order":-1,
     * "post_published_at":1472518701,"status":0,"subtitle":"已完结","title":"万能礼物清单",
     * "updated_at":1472518702},"cover_image_url":"http://img03.liwushuo
     * .com/image/141203/wc5br88j5.jpg-w720","cover_webp_url":"http://img03.liwushuo
     * .com/image/141203/wc5br88j5.jpg?imageView2/2/w/720/q/85/format/webp",
     * "hidden_cover_image":false,"id":115,"liked":false,"likes_count":30624,
     * "published_at":1409185290,"selection":0,"title":"除了月饼，中秋节还可以送这些礼物","type":"post"},
     * {"ad_monitors":[],"author":{"avatar_url":"http://img02.liwushuo.com/image/160617/hzkkl1ohn
     * .jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},
     * "column":{"banner_image_url":"http://img03.liwushuo.com/image/160630/npssjj3yc.jpg-w300",
     * "category":"美食","cover_image_url":"http://img02.liwushuo.com/image/160713/l0nb4kpud
     * .jpg-w720","created_at":1467265951,
     * "description":"无论是山珍海味还是街边小吃，\r\n无论是飞禽走兽还是五谷香料，\r\n美食不分贵贱没有国界\r\n我们都犯着一种罪，叫做\u201c
     * 食宗最\u201d","id":83,"order":0,"post_published_at":1472688000,"status":0,"subtitle":"",
     * "title":"吃货俱乐部","updated_at":1472697817},"cover_image_url":"http://img03.liwushuo
     * .com/image/160824/bemadxp67.jpg-w720","cover_webp_url":"http://img03.liwushuo
     * .com/image/160824/bemadxp67.jpg?imageView2/2/w/720/q/85/format/webp",
     * "hidden_cover_image":false,"id":1045216,"liked":false,"likes_count":16654,
     * "published_at":1471478400,"selection":0,"title":"美味与颜值并存的月饼礼盒，快Mark住！","type":"post"},
     * {"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160617/hzkkl1ohn
     * .jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},
     * "column":{"banner_image_url":"http://img03.liwushuo.com/image/160623/qywichk8q.jpg-w300",
     * "category":"手工","cover_image_url":"http://img03.liwushuo.com/image/160628/qs7ac2voo
     * .jpg-w720","created_at":1466495336,
     * "description":"对于匠心的坚守，是古老中国的传承。厌倦了流水线上的毫无差别，我们只爱手工制品的独特活力。","id":57,"order":-1,
     * "status":0,"subtitle":"已完结","title":"DIY手工党","updated_at":1466495336},
     * "cover_image_url":"http://img01.liwushuo.com/image/140826/3x775zz66_w.jpg-w720",
     * "cover_webp_url":"http://img01.liwushuo.com/image/140826/3x775zz66_w
     * .jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":109,
     * "liked":false,"likes_count":58365,"published_at":1409043863,"selection":0,
     * "title":"又是一年月圆时，亲手送份彩花冰皮月饼","type":"post"},{"ad_monitors":[],
     * "author":{"avatar_url":"http://img03.liwushuo.com/image/160615/z4wubgarw.jpg",
     * "avatar_webp_url":null,"created_at":1465975797,"id":14,"nickname":"鹿欧尼"},
     * "column":{"banner_image_url":"http://img01.liwushuo.com/image/160630/npssjj3yc.jpg-w300",
     * "category":"美食","cover_image_url":"http://img01.liwushuo.com/image/160713/l0nb4kpud
     * .jpg-w720","created_at":1467265951,
     * "description":"无论是山珍海味还是街边小吃，\r\n无论是飞禽走兽还是五谷香料，\r\n美食不分贵贱没有国界\r\n我们都犯着一种罪，叫做\u201c
     * 食宗最\u201d","id":83,"order":0,"post_published_at":1472688000,"status":0,"subtitle":"",
     * "title":"吃货俱乐部","updated_at":1472697817},"cover_image_url":"http://img02.liwushuo
     * .com/image/160830/pshjuzlts.jpg-w720","cover_webp_url":"http://img02.liwushuo
     * .com/image/160830/pshjuzlts.jpg?imageView2/2/w/720/q/85/format/webp",
     * "hidden_cover_image":false,"id":1045466,"liked":false,"likes_count":10897,
     * "published_at":1472547780,"selection":0,"title":"第27期 | 中秋月饼食不完，茶叶照样能尽孝","type":"post"},
     * {"ad_monitors":[],"author":{"avatar_url":"http://img03.liwushuo.com/image/160708/yactcsfo5
     * .jpg","avatar_webp_url":null,"created_at":1467971922,"id":35,"nickname":"凹凸曼"},
     * "column":{"banner_image_url":"http://img03.liwushuo.com/image/160708/or81k6fea.jpg-w300",
     * "category":"礼物","cover_image_url":"http://img02.liwushuo.com/image/160720/xdt9kjriy
     * .jpg-w720","created_at":1467970933,
     * "description":"会买不一定\u201c惠\u201d买，每日10款超低价，举双手奉上。\u2014\u2014from亚马逊良心出品","id":90,
     * "order":0,"post_published_at":1472601600,"status":0,"subtitle":"","title":"省钱大总攻",
     * "updated_at":1472632486},"cover_image_url":"http://img01.liwushuo
     * .com/image/160826/990ie05m8.jpg-w720","cover_webp_url":"http://img01.liwushuo
     * .com/image/160826/990ie05m8.jpg?imageView2/2/w/720/q/85/format/webp",
     * "hidden_cover_image":false,"id":1045443,"liked":false,"likes_count":8392,
     * "published_at":1472428800,"selection":0,"title":"第51期 | 又是中秋月圆时，把爱装进月饼礼盒带回家","type":"post"}]
     * total : 13
     */

    @SerializedName("data")
    private DataBean data;
    @SerializedName("message")
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static class DataBean {
        /**
         * next_url : http://api.liwushuo
         * .com/v2/search/post?sort=&limit=20&keyword=%E6%9C%88%E9%A5%BC&offset=20
         */

        @SerializedName("paging")
        private PagingBean paging;
        @SerializedName("total")
        private int total;
        /**
         * ad_monitors : []
         * author : {"avatar_url":"http://img03.liwushuo.com/image/160617/hzkkl1ohn.jpg",
         * "avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"}
         * column : {"banner_image_url":"http://img03.liwushuo.com/image/160623/qywichk8q
         * .jpg-w300","category":"手工","cover_image_url":"http://img01.liwushuo
         * .com/image/160628/qs7ac2voo.jpg-w720","created_at":1466495336,
         * "description":"对于匠心的坚守，是古老中国的传承。厌倦了流水线上的毫无差别，我们只爱手工制品的独特活力。","id":57,"order":-1,
         * "status":0,"subtitle":"已完结","title":"DIY手工党","updated_at":1466495336}
         * cover_image_url : http://img03.liwushuo.com/image/150917/97ctrpi7m.jpg-w720
         * cover_webp_url : http://img03.liwushuo.com/image/150917/97ctrpi7m
         * .jpg?imageView2/2/w/720/q/85/format/webp
         * hidden_cover_image : false
         * id : 1013394
         * liked : false
         * likes_count : 58440
         * published_at : 1441684399
         * selection : 0
         * title : 中秋DIY专属心意月饼，满满的都是爱
         * type : post
         */

        @SerializedName("posts")
        private List<SearchGongLuePostsBean> posts;

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

        public List<SearchGongLuePostsBean> getPosts() {
            return posts;
        }

        public void setPosts(List<SearchGongLuePostsBean> posts) {
            this.posts = posts;
        }

    }
}
