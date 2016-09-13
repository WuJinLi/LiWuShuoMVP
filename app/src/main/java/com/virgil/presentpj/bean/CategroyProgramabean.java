package com.virgil.presentpj.bean;

import com.google.gson.annotations.SerializedName;

/**
 * 分类中栏目的实体类
 */
public class CategroyProgramabean {

    /**
     * code : 200
     * data : {"columns":[{"author":"小C","banner_image_url":"http://img01.liwushuo
     * .com/image/160608/kd1dy4pi3.jpg-w300","banner_webp_url":"http://img01.liwushuo
     * .com/image/160608/kd1dy4pi3.jpg?imageView2/2/w/300/q/85/format/webp","category":"礼物",
     * "cover_image_url":"http://img02.liwushuo.com/image/160713/y2arp77qx.jpg-w720",
     * "cover_webp_url":"http://img02.liwushuo.com/image/160713/y2arp77qx
     * .jpg?imageView2/2/w/720/q/85/format/webp","created_at":1462501381,
     * "description":"如果青春不会散场，时光可以珍藏。如果你的每一个米粒大小念想，都能找到与之匹配的美物安放...这样的店你会不会来？","id":5,"order":0,
     * "post_published_at":1472612400,"status":0,"subtitle":"更新至第144期","title":"不打烊的礼物店",
     * "updated_at":1472626010},{"author":"穿衣大队长","banner_image_url":"http://img02.liwushuo
     * .com/image/160608/ygqtl238c.jpg-w300","banner_webp_url":"http://img02.liwushuo
     * .com/image/160608/ygqtl238c.jpg?imageView2/2/w/300/q/85/format/webp","category":"穿搭",
     * "cover_image_url":"http://img01.liwushuo.com/image/160713/4egoefdla.jpg-w720",
     * "cover_webp_url":"http://img01.liwushuo.com/image/160713/4egoefdla
     * .jpg?imageView2/2/w/720/q/85/format/webp","created_at":1462501669,
     * "description":"做你的私人搭配师，每日搭配治好你的选择困难症，满足你多睡5分钟的小小心愿。","id":13,"order":0,
     * "post_published_at":1472515200,"status":0,"subtitle":"更新至第100期","title":"明天穿什么",
     * "updated_at":1472625079},{"author":"凹凸曼","banner_image_url":"http://img01.liwushuo
     * .com/image/160708/or81k6fea.jpg-w300","banner_webp_url":"http://img01.liwushuo
     * .com/image/160708/or81k6fea.jpg?imageView2/2/w/300/q/85/format/webp","category":"礼物",
     * "cover_image_url":"http://img03.liwushuo.com/image/160720/xdt9kjriy.jpg-w720",
     * "cover_webp_url":"http://img03.liwushuo.com/image/160720/xdt9kjriy
     * .jpg?imageView2/2/w/720/q/85/format/webp","created_at":1467970933,
     * "description":"会买不一定\u201c惠\u201d买，每日10款超低价，举双手奉上。\u2014\u2014from亚马逊良心出品","id":90,
     * "order":0,"post_published_at":1472601600,"status":0,"subtitle":"更新至第53期","title":"省钱大总攻",
     * "updated_at":1472623259},{"author":"Miss. talk ","banner_image_url":"http://img03.liwushuo
     * .com/image/160712/3c1fj1dq6.jpg-w300","banner_webp_url":"http://img03.liwushuo
     * .com/image/160712/3c1fj1dq6.jpg?imageView2/2/w/300/q/85/format/webp","category":"涨姿势",
     * "cover_image_url":"http://img02.liwushuo.com/image/160713/74m5db26q.jpg-w720",
     * "cover_webp_url":"http://img02.liwushuo.com/image/160713/74m5db26q
     * .jpg?imageView2/2/w/720/q/85/format/webp","created_at":1462771521,
     * "description
     * ":"同一件事，你怎么想，他怎么看，平行生活里的你我他，也许正经历同样的情绪，分享着类似的槽点，不管你是围观的吃瓜群众，还是森森被困扰的当事人甲，在shall we
     * talk里，和Miss. talk一起聚众吐槽吧~  ","id":24,"order":0,"post_published_at":1472472000,"status":0,
     * "subtitle":"更新至第116期","title":"Shall we talk","updated_at":1472560762},{"author":"小礼君",
     * "banner_image_url":"http://img02.liwushuo.com/image/160630/npssjj3yc.jpg-w300",
     * "banner_webp_url":"http://img02.liwushuo.com/image/160630/npssjj3yc
     * .jpg?imageView2/2/w/300/q/85/format/webp","category":"美食","cover_image_url":"http://img01
     * .liwushuo.com/image/160713/l0nb4kpud.jpg-w720","cover_webp_url":"http://img01.liwushuo
     * .com/image/160713/l0nb4kpud.jpg?imageView2/2/w/720/q/85/format/webp",
     * "created_at":1467265951,"description":"无论是山珍海味还是街边小吃，\r\n无论是飞禽走兽还是五谷香料，\r\n美食不分贵贱没有国界\r\n
     * 我们都犯着一种罪，叫做\u201c食宗最\u201d","id":83,"order":0,"post_published_at":1472515200,"status":0,
     * "subtitle":"","title":"吃货俱乐部","updated_at":1472553795},{"author":"叫我小公举",
     * "banner_image_url":"http://img03.liwushuo.com/image/160608/muk9fdsya.jpg-w300",
     * "banner_webp_url":"http://img03.liwushuo.com/image/160608/muk9fdsya
     * .jpg?imageView2/2/w/300/q/85/format/webp","category":"美物","cover_image_url":"http://img02
     * .liwushuo.com/image/160713/1p98sh06h.jpg-w720","cover_webp_url":"http://img02.liwushuo
     * .com/image/160713/1p98sh06h.jpg?imageView2/2/w/720/q/85/format/webp",
     * "created_at":1462501717,"description":"僻静的街角有一家杂货铺，或许你带着忧愁走进店中，但不期而遇的小物却让你展露欢颜。","id":14,
     * "order":0,"post_published_at":1472547600,"status":0,"subtitle":"更新至第53期","title":"解忧杂货铺",
     * "updated_at":1472542303},{"author":"爱因烧钱","banner_image_url":"http://img03.liwushuo
     * .com/image/160608/17r75edcn.jpg-w300","banner_webp_url":"http://img03.liwushuo
     * .com/image/160608/17r75edcn.jpg?imageView2/2/w/300/q/85/format/webp","category":"数码",
     * "cover_image_url":"http://img03.liwushuo.com/image/160713/4bbshlkvr.jpg-w720",
     * "cover_webp_url":"http://img03.liwushuo.com/image/160713/4bbshlkvr
     * .jpg?imageView2/2/w/720/q/85/format/webp","created_at":1462501635,
     * "description":"爱科技爱创新爱开放源码，要智能要有范要异军突起。不止于全息影像虚拟现实，数码控们不要最贵只要Geek！","id":11,"order":0,
     * "post_published_at":1472612400,"status":0,"subtitle":"更新至第72期","title":"数码家",
     * "updated_at":1472541436},{"author":"淘局长","banner_image_url":"http://img01.liwushuo
     * .com/image/160608/rcmok6bpq.jpg-w300","banner_webp_url":"http://img01.liwushuo
     * .com/image/160608/rcmok6bpq.jpg?imageView2/2/w/300/q/85/format/webp","category":"海淘",
     * "cover_image_url":"http://img02.liwushuo.com/image/160713/5cbekga4c.jpg-w720",
     * "cover_webp_url":"http://img02.liwushuo.com/image/160713/5cbekga4c
     * .jpg?imageView2/2/w/720/q/85/format/webp","created_at":1462500836,
     * "description":"你想要的全世界，我都有！","id":3,"order":0,"post_published_at":1472374800,"status":0,
     * "subtitle":"更新至第68期","title":"海淘情报局","updated_at":1472540710},{"author":"灰姑娘",
     * "banner_image_url":"http://img01.liwushuo.com/image/160608/qojypq4pe.jpg-w300",
     * "banner_webp_url":"http://img01.liwushuo.com/image/160608/qojypq4pe
     * .jpg?imageView2/2/w/300/q/85/format/webp","category":"美护","cover_image_url":"http://img03
     * .liwushuo.com/image/160713/en5n83z34.jpg-w720","cover_webp_url":"http://img03.liwushuo
     * .com/image/160713/en5n83z34.jpg?imageView2/2/w/720/q/85/format/webp",
     * "created_at":1462501946,"description":"好看就行。\u2014\u2014玛丽莲·赫本·千颂伊","id":23,"order":0,
     * "post_published_at":1472612400,"status":0,"subtitle":"更新至第61期","title":"靠脸吃饭",
     * "updated_at":1472535707},{"author":"美物娘","banner_image_url":"http://img03.liwushuo
     * .com/image/160608/8nluue8yx.jpg-w300","banner_webp_url":"http://img03.liwushuo
     * .com/image/160608/8nluue8yx.jpg?imageView2/2/w/300/q/85/format/webp","category":"美物",
     * "cover_image_url":"http://img02.liwushuo.com/image/160713/zlsbvl5it.jpg-w720",
     * "cover_webp_url":"http://img02.liwushuo.com/image/160713/zlsbvl5it
     * .jpg?imageView2/2/w/720/q/85/format/webp","created_at":1462501829,
     * "description":"贪念时间所有美好的东西，唯一不吝啬的，就是与你分享。","id":19,"order":0,
     * "post_published_at":1472601600,"status":0,"subtitle":"更新至第85期","title":"美物收割机",
     * "updated_at":1472466366},{"author":"资优生","banner_image_url":"http://img01.liwushuo
     * .com/image/160608/okz87zmtn.jpg-w300","banner_webp_url":"http://img01.liwushuo
     * .com/image/160608/okz87zmtn.jpg?imageView2/2/w/300/q/85/format/webp","category":"美护",
     * "cover_image_url":"http://img01.liwushuo.com/image/160713/d4vtwm69h.jpg-w720",
     * "cover_webp_url":"http://img01.liwushuo.com/image/160713/d4vtwm69h
     * .jpg?imageView2/2/w/720/q/85/format/webp","created_at":1462501863,
     * "description":"完美卸妆的正确步骤，每片面膜的成分功效，这里都知道。","id":21,"order":0,
     * "post_published_at":1472526000,"status":0,"subtitle":"更新至第68期","title":"完美护肤指南",
     * "updated_at":1472465201}],"paging":{"next_url":"http://api.liwushuo
     * .com/v2/columns?limit=11&offset=11"}}
     * message : OK
     */

    @SerializedName("code")
    private int code;

    @SerializedName("data")
    private ProgramaBean data;
    @SerializedName("message")
    private String message;
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public ProgramaBean getData() {
        return data;
    }
    public void setData(ProgramaBean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
