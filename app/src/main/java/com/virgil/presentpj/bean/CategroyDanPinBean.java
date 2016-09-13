package com.virgil.presentpj.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by My on 2016/9/2.
 */
public class CategroyDanPinBean {

    /**
     * code : 200
     * data : {"categories":[{"icon_url":"http://img01.liwushuo.com/image/150615/3nc5tejwl
     * .png-pw144","id":1,"name":"热门分类","order":11,"status":0,
     * "subcategories":[{"icon_url":"http://img01.liwushuo.com/image/150615/urgs9vy8a.png-pw144",
     * "id":7,"items_count":-51,"name":"智能设备","order":7,"parent_id":1,"status":0},
     * {"icon_url":"http://img03.liwushuo.com/image/150615/d4dhjw1we.png-pw144","id":6,
     * "items_count":-211,"name":"鲜花蛋糕","order":6,"parent_id":1,"status":0},
     * {"icon_url":"http://img03.liwushuo.com/image/150626/itxjlg4jh.png-pw144","id":5,
     * "items_count":-19,"name":"书 ","order":5,"parent_id":1,"status":0},
     * {"icon_url":"http://img02.liwushuo.com/image/150615/12vqbzrkq.png-pw144","id":4,
     * "items_count":-138,"name":"模型拼图","order":4,"parent_id":1,"status":0},
     * {"icon_url":"http://img02.liwushuo.com/image/150312/xdjtcaanm.png-pw144","id":3,
     * "items_count":-70,"name":"毛绒公仔","order":3,"parent_id":1,"status":0},
     * {"icon_url":"http://img03.liwushuo.com/image/150615/dsu66u5k2.png-pw144","id":2,
     * "items_count":-73,"name":"动漫/明星周边","order":2,"parent_id":1,"status":0},
     * {"icon_url":"http://img01.liwushuo.com/image/150615/v65bdnets.png-pw144","id":1,
     * "items_count":-497,"name":"创意礼品","order":1,"parent_id":1,"status":0},
     * {"icon_url":"http://img01.liwushuo.com/image/160826/twnvs9g39.png-pw144","id":193,
     * "items_count":0,"name":"处女座礼物清单","order":0,"parent_id":1,"status":0}]},
     * {"icon_url":"http://img01.liwushuo.com/image/150427/as9ys97f0.png-pw144","id":2,
     * "name":"个性配饰 ","order":10,"status":0,"subcategories":[{"icon_url":"http://img01.liwushuo
     * .com/image/150615/80mkxagby.png-pw144","id":13,"items_count":-37,"name":"手饰","order":6,
     * "parent_id":2,"status":0},{"icon_url":"http://img03.liwushuo.com/image/150615/vprcl0vym
     * .png-pw144","id":12,"items_count":-96,"name":"手表","order":5,"parent_id":2,"status":0},
     * {"icon_url":"http://img01.liwushuo.com/image/150615/w0h2yoa72.png-pw144","id":11,
     * "items_count":202,"name":"帽子","order":4,"parent_id":2,"status":0},
     * {"icon_url":"http://img02.liwushuo.com/image/150615/9k7a3umu1.png-pw144","id":10,
     * "items_count":22,"name":"镜框","order":3,"parent_id":2,"status":0},{"icon_url":"http://img02
     * .liwushuo.com/image/150615/u7txf6xvn.png-pw144","id":9,"items_count":-209,"name":"发饰",
     * "order":2,"parent_id":2,"status":0},{"icon_url":"http://img01.liwushuo
     * .com/image/150615/u8pq01q9t.png-pw144","id":8,"items_count":72,"name":"耳饰","order":1,
     * "parent_id":2,"status":0},{"icon_url":"http://img02.liwushuo.com/image/150615/0b8w4xhis
     * .png-pw144","id":14,"items_count":3,"name":"手套","order":0,"parent_id":2,"status":0},
     * {"icon_url":"http://img03.liwushuo.com/image/150615/ijgrwvrn5.png-pw144","id":15,
     * "items_count":209,"name":"围巾/口罩","order":0,"parent_id":2,"status":0},
     * {"icon_url":"http://img03.liwushuo.com/image/150615/mkhkh14j8.png-pw144","id":16,
     * "items_count":-75,"name":"项链","order":0,"parent_id":2,"status":0},
     * {"icon_url":"http://img03.liwushuo.com/image/150615/0yw7qk140.png-pw144","id":91,
     * "items_count":-18,"name":"领结/领带/腰带","order":0,"parent_id":2,"status":0},
     * {"icon_url":"http://img03.liwushuo.com/image/150615/0m85d9pts.png-pw144","id":96,
     * "items_count":157,"name":"袜子","order":0,"parent_id":2,"status":0}]},
     * {"icon_url":"http://img03.liwushuo.com/image/150615/ap97rx8is.png-pw144","id":3,
     * "name":"温暖家居","order":9,"status":0,"subcategories":[{"icon_url":"http://img02.liwushuo
     * .com/image/150615/bj9ch14r1.png-pw144","id":18,"items_count":34,"name":"抱枕/靠垫/坐垫",
     * "order":0,"parent_id":3,"status":0},{"icon_url":"http://img01.liwushuo
     * .com/image/150615/kijh56ebm.png-pw144","id":29,"items_count":75,"name":"装饰画","order":0,
     * "parent_id":3,"status":0},{"icon_url":"http://img03.liwushuo.com/image/150615/78a2812io
     * .png-pw144","id":28,"items_count":-439,"name":"钟表摆件","order":0,"parent_id":3,"status":0},
     * {"icon_url":"http://img02.liwushuo.com/image/150615/hjyqt8u8j.png-pw144","id":27,
     * "items_count":4,"name":"香薰用品","order":0,"parent_id":3,"status":0},
     * {"icon_url":"http://img03.liwushuo.com/image/150615/9mdsiq7sa.png-pw144","id":26,
     * "items_count":406,"name":"收纳整理","order":0,"parent_id":3,"status":0},
     * {"icon_url":"http://img01.liwushuo.com/image/150615/rjxihwrxq.png-pw144","id":25,
     * "items_count":185,"name":"生活神器","order":0,"parent_id":3,"status":0},
     * {"icon_url":"http://img03.liwushuo.com/image/150615/1mlvwwz03.png-pw144","id":24,
     * "items_count":70,"name":"生活家电","order":0,"parent_id":3,"status":0},
     * {"icon_url":"http://img02.liwushuo.com/image/150615/scggy105e.png-pw144","id":23,
     * "items_count":-134,"name":"伞","order":0,"parent_id":3,"status":0},
     * {"icon_url":"http://img03.liwushuo.com/image/150615/56t6d6ca8.png-pw144","id":22,
     * "items_count":375,"name":"家居纺饰","order":0,"parent_id":3,"status":0},
     * {"icon_url":"http://img02.liwushuo.com/image/150615/7l6ljnnbq.png-pw144","id":19,
     * "items_count":-23,"name":"宠物用品","order":0,"parent_id":3,"status":0},
     * {"icon_url":"http://img01.liwushuo.com/image/150615/az2zg2gxm.png-pw144","id":95,
     * "items_count":27,"name":"手帕/毛巾","order":0,"parent_id":3,"status":0}]},
     * {"icon_url":"http://img02.liwushuo.com/image/150427/qk1wazhvq.png-pw144","id":4,
     * "name":"美味厨房","order":8,"status":0,"subcategories":[{"icon_url":"http://img03.liwushuo
     * .com/image/150615/2ep8pn54p.png-pw144","id":30,"items_count":73,"name":"保温杯/便当盒",
     * "order":0,"parent_id":4,"status":0},{"icon_url":"http://img02.liwushuo
     * .com/image/150615/9twbl537b.png-pw144","id":31,"items_count":-133,"name":"杯子","order":0,
     * "parent_id":4,"status":0},{"icon_url":"http://img02.liwushuo.com/image/150615/zdve42knm
     * .png-pw144","id":32,"items_count":258,"name":"餐具","order":0,"parent_id":4,"status":0},
     * {"icon_url":"http://img03.liwushuo.com/image/150615/o0rddf4if.png-pw144","id":33,
     * "items_count":-116,"name":"吃货神器","order":0,"parent_id":4,"status":0},
     * {"icon_url":"http://img03.liwushuo.com/image/150615/x8qnoc2js.png-pw144","id":34,
     * "items_count":106,"name":"厨具","order":0,"parent_id":4,"status":0},
     * {"icon_url":"http://img01.liwushuo.com/image/150615/wp808rzwm.png-pw144","id":35,
     * "items_count":42,"name":"烘焙道具","order":0,"parent_id":4,"status":0},
     * {"icon_url":"http://img01.liwushuo.com/image/150615/vog9lruq6.png-pw144","id":38,
     * "items_count":50,"name":"酒具/茶具","order":0,"parent_id":4,"status":0}]},
     * {"icon_url":"http://img01.liwushuo.com/image/150615/p3k0won53.png-pw144","id":5,
     * "name":"美味礼物","order":7,"status":0,"subcategories":[{"icon_url":"http://img01.liwushuo
     * .com/image/150615/1ivpiljyw.png-pw144","id":81,"items_count":-12,"name":"茶","order":0,
     * "parent_id":5,"status":0},{"icon_url":"http://img02.liwushuo.com/image/150615/ujwwahqmf
     * .png-pw144","id":97,"items_count":345,"name":"速食/即食小零嘴","order":0,"parent_id":5,
     * "status":0},{"icon_url":"http://img03.liwushuo.com/image/150626/dzrf65l0u.png-pw144",
     * "id":92,"items_count":93,"name":"健康代餐","order":0,"parent_id":5,"status":0},
     * {"icon_url":"http://img03.liwushuo.com/image/150312/6jcr63wt9.png-pw144","id":89,
     * "items_count":-89,"name":"糖果糕点","order":0,"parent_id":5,"status":0},
     * {"icon_url":"http://img01.liwushuo.com/image/150312/ouiup1wr8.png-pw144","id":88,
     * "items_count":15,"name":"曲奇饼干","order":0,"parent_id":5,"status":0},
     * {"icon_url":"http://img02.liwushuo.com/image/150312/ct3oe3mcs.png-pw144","id":87,
     * "items_count":5,"name":"巧克力","order":0,"parent_id":5,"status":0},{"icon_url":"http://img02
     * .liwushuo.com/image/150312/y3x76old0.png-pw144","id":86,"items_count":-7,"name":"膨化食品",
     * "order":0,"parent_id":5,"status":0},{"icon_url":"http://img02.liwushuo
     * .com/image/150312/0uw6m16bf.png-pw144","id":85,"items_count":63,"name":"咖啡/冲饮","order":0,
     * "parent_id":5,"status":0},{"icon_url":"http://img03.liwushuo.com/image/150626/f3id397qy
     * .png-pw144","id":84,"items_count":-142,"name":"酒","order":0,"parent_id":5,"status":0},
     * {"icon_url":"http://img01.liwushuo.com/image/150312/s80qg0agp.png-pw144","id":83,
     * "items_count":81,"name":"坚果","order":0,"parent_id":5,"status":0},{"icon_url":"http://img01
     * .liwushuo.com/image/150312/asuck0uit.png-pw144","id":82,"items_count":52,"name":"果干/果酱",
     * "order":0,"parent_id":5,"status":0},{"icon_url":"http://img01.liwushuo
     * .com/image/150626/i9y1n8vo9.png-pw144","id":189,"items_count":104,"name":"饮料/冷饮/雪糕",
     * "order":0,"parent_id":5,"status":0}]},{"icon_url":"http://img02.liwushuo
     * .com/image/150615/qybe9x9i9.png-pw144","id":6,"name":"数码小物","order":6,"status":0,
     * "subcategories":[{"icon_url":"http://img01.liwushuo.com/image/150615/ptgedps6p.png-pw144",
     * "id":39,"items_count":44,"name":"电脑周边","order":0,"parent_id":6,"status":0},
     * {"icon_url":"http://img02.liwushuo.com/image/150615/v3i1dg38w.png-pw144","id":40,
     * "items_count":32,"name":"耳机/音响","order":0,"parent_id":6,"status":0},
     * {"icon_url":"http://img03.liwushuo.com/image/150615/dhsjxciof.png-pw144","id":41,
     * "items_count":-71,"name":"摄影周边","order":0,"parent_id":6,"status":0},
     * {"icon_url":"http://img02.liwushuo.com/image/150615/zkpa4vgxn.png-pw144","id":42,
     * "items_count":62,"name":"手机壳","order":0,"parent_id":6,"status":0},
     * {"icon_url":"http://img02.liwushuo.com/image/150615/trpwpogjx.png-pw144","id":43,
     * "items_count":39,"name":"手机周边","order":0,"parent_id":6,"status":0},
     * {"icon_url":"http://img03.liwushuo.com/image/150615/vh71v3pt2.png-pw144","id":46,
     * "items_count":-134,"name":"移动电源","order":0,"parent_id":6,"status":0}]},
     * {"icon_url":"http://img03.liwushuo.com/image/150427/cu47bnpjd.png-pw144","id":7,
     * "name":"创意文具","order":5,"status":0,"subcategories":[{"icon_url":"http://img01.liwushuo
     * .com/image/150615/xxj9mc56l.png-pw144","id":47,"items_count":22,"name":"办公收纳","order":0,
     * "parent_id":7,"status":0},{"icon_url":"http://img01.liwushuo.com/image/150615/kjimkl1a6
     * .png-pw144","id":48,"items_count":-97,"name":"本子/本子周边","order":0,"parent_id":7,
     * "status":0},{"icon_url":"http://img02.liwushuo.com/image/150615/sepkbig9t.png-pw144",
     * "id":49,"items_count":-15,"name":"笔/笔袋/笔周边","order":0,"parent_id":7,"status":0},
     * {"icon_url":"http://img01.liwushuo.com/image/150615/bdvheomms.png-pw144","id":50,
     * "items_count":-39,"name":"贺卡/明信片/印章","order":0,"parent_id":7,"status":0},
     * {"icon_url":"http://img01.liwushuo.com/image/150615/acqz3hex7.png-pw144","id":51,
     * "items_count":-45,"name":"卡包/卡套/钥匙包","order":0,"parent_id":7,"status":0},
     * {"icon_url":"http://img01.liwushuo.com/image/150615/8bumqnb7i.png-pw144","id":52,
     * "items_count":4,"name":"手账相关","order":0,"parent_id":7,"status":0},
     * {"icon_url":"http://img02.liwushuo.com/image/150615/6jjkn23rz.png-pw144","id":53,
     * "items_count":14,"name":"台历/日历","order":0,"parent_id":7,"status":0},
     * {"icon_url":"http://img03.liwushuo.com/image/150615/rrv9lv9os.png-pw144","id":54,
     * "items_count":-68,"name":"相框/相册","order":0,"parent_id":7,"status":0},
     * {"icon_url":"http://img01.liwushuo.com/image/150615/8871axj54.png-pw144","id":141,
     * "items_count":-2,"name":"书签","order":0,"parent_id":7,"status":0}]},
     * {"icon_url":"http://img02.liwushuo.com/image/150615/6f7muy9up.png-pw144","id":19,
     * "name":"美容护肤","order":3,"status":0,"subcategories":[{"icon_url":"http://img02.liwushuo
     * .com/image/150615/44tdn77p4.png-pw144","id":143,"items_count":-57,"name":"女士香水","order":0,
     * "parent_id":19,"status":0},{"icon_url":"http://img01.liwushuo.com/image/150615/i158z5269
     * .png-pw144","id":154,"items_count":15,"name":"唇部护理","order":0,"parent_id":19,"status":0},
     * {"icon_url":"http://img03.liwushuo.com/image/150615/dtekdo2dt.png-pw144","id":155,
     * "items_count":86,"name":"手部护理","order":0,"parent_id":19,"status":0},
     * {"icon_url":"http://img02.liwushuo.com/image/150615/mj0q3nwln.png-pw144","id":157,
     * "items_count":-128,"name":"身体护理","order":0,"parent_id":19,"status":0},
     * {"icon_url":"http://img02.liwushuo.com/image/150615/2kk3wmbyk.png-pw144","id":159,
     * "items_count":-89,"name":"头发护理","order":0,"parent_id":19,"status":0},
     * {"icon_url":"http://img02.liwushuo.com/image/150625/94nxv41fa.png-pw144","id":160,
     * "items_count":161,"name":"护肤套装","order":0,"parent_id":19,"status":0},
     * {"icon_url":"http://img02.liwushuo.com/image/150615/h9sk40oia.png-pw144","id":162,
     * "items_count":-31,"name":"男士护肤","order":0,"parent_id":19,"status":0},
     * {"icon_url":"http://img03.liwushuo.com/image/150615/j1xbva318.png-pw144","id":163,
     * "items_count":11,"name":"剃须刀","order":0,"parent_id":19,"status":0},
     * {"icon_url":"http://img03.liwushuo.com/image/150625/lc444bcha.png-pw144","id":181,
     * "items_count":-7,"name":"手工皂","order":0,"parent_id":19,"status":0},
     * {"icon_url":"http://img02.liwushuo.com/image/150615/bx3bl18wm.png-pw144","id":153,
     * "items_count":33,"name":"眼部护理","order":0,"parent_id":19,"status":0},
     * {"icon_url":"http://img01.liwushuo.com/image/150615/jq6zajwvy.png-pw144","id":152,
     * "items_count":8,"name":"防晒/晒后修复","order":0,"parent_id":19,"status":0},
     * {"icon_url":"http://img01.liwushuo.com/image/150615/c5ybjltxc.png-pw144","id":144,
     * "items_count":-76,"name":"男士香水","order":0,"parent_id":19,"status":0},
     * {"icon_url":"http://img02.liwushuo.com/image/150615/gigpur622.png-pw144","id":145,
     * "items_count":1,"name":"卸妆","order":0,"parent_id":19,"status":0},{"icon_url":"http://img03
     * .liwushuo.com/image/150615/mwblar564.png-pw144","id":146,"items_count":90,"name":"洁面",
     * "order":0,"parent_id":19,"status":0},{"icon_url":"http://img02.liwushuo
     * .com/image/150615/g0mes7en6.png-pw144","id":147,"items_count":1,"name":"爽肤水","order":0,
     * "parent_id":19,"status":0},{"icon_url":"http://img03.liwushuo.com/image/150615/3twtwf7a5
     * .png-pw144","id":148,"items_count":106,"name":"乳液/面霜","order":0,"parent_id":19,
     * "status":0},{"icon_url":"http://img02.liwushuo.com/image/150615/np4eyslm9.png-pw144",
     * "id":149,"items_count":71,"name":"精华","order":0,"parent_id":19,"status":0},
     * {"icon_url":"http://img03.liwushuo.com/image/150615/wuwgxd89e.png-pw144","id":150,
     * "items_count":13,"name":"喷雾","order":0,"parent_id":19,"status":0},
     * {"icon_url":"http://img02.liwushuo.com/image/150615/htl7msds7.png-pw144","id":151,
     * "items_count":72,"name":"面膜","order":0,"parent_id":19,"status":0},
     * {"icon_url":"http://img03.liwushuo.com/image/150625/jqn1bzyhc.png-pw144","id":182,
     * "items_count":3,"name":"鼻部清洁","order":0,"parent_id":19,"status":0}]},
     * {"icon_url":"http://img02.liwushuo.com/image/150615/y5j8mr3uf.png-pw144","id":20,
     * "name":"精致彩妆","order":3,"status":0,"subcategories":[{"icon_url":"http://img01.liwushuo
     * .com/image/150626/4q7omzsaj.png-pw144","id":166,"items_count":-29,"name":"底妆","order":0,
     * "parent_id":20,"status":0},{"icon_url":"http://img01.liwushuo.com/image/150615/gc3d24sx9
     * .png-pw144","id":167,"items_count":-15,"name":"腮红","order":0,"parent_id":20,"status":0},
     * {"icon_url":"http://img02.liwushuo.com/image/150615/kti126se9.png-pw144","id":169,
     * "items_count":0,"name":"高光","order":0,"parent_id":20,"status":0},{"icon_url":"http://img03
     * .liwushuo.com/image/150615/x10ftruft.png-pw144","id":170,"items_count":31,"name":"眼妆",
     * "order":0,"parent_id":20,"status":0},{"icon_url":"http://img01.liwushuo
     * .com/image/150615/6akinbxu7.png-pw144","id":171,"items_count":-56,"name":"唇彩/口红",
     * "order":0,"parent_id":20,"status":0},{"icon_url":"http://img03.liwushuo
     * .com/image/150615/r8ck3dd11.png-pw144","id":172,"items_count":21,"name":"美甲","order":0,
     * "parent_id":20,"status":0},{"icon_url":"http://img02.liwushuo.com/image/150615/qzd06srrt
     * .png-pw144","id":173,"items_count":6,"name":"美妆工具","order":0,"parent_id":20,"status":0},
     * {"icon_url":"http://img03.liwushuo.com/image/150615/cjx5ewf8a.png-pw144","id":174,
     * "items_count":45,"name":"彩妆套装","order":0,"parent_id":20,"status":0},
     * {"icon_url":"http://img01.liwushuo.com/image/150625/mhe65vdr3.png-pw144","id":187,
     * "items_count":7,"name":"假发","order":0,"parent_id":20,"status":0}]},
     * {"icon_url":"http://img01.liwushuo.com/image/150615/r6wh62t18.png-pw144","id":12,
     * "name":"运动户外","order":2,"status":0,"subcategories":[{"icon_url":"http://img01.liwushuo
     * .com/image/150615/3s68njf01.png-pw144","id":79,"items_count":26,"name":"户外装备","order":0,
     * "parent_id":12,"status":0},{"icon_url":"http://img03.liwushuo.com/image/150615/hghom1qk6
     * .png-pw144","id":80,"items_count":-22,"name":"运动健身","order":0,"parent_id":12,
     * "status":0}]},{"icon_url":"http://img02.liwushuo.com/image/150615/wuo31309v.png-pw144",
     * "id":9,"name":"身体保健","order":2,"status":0,"subcategories":[{"icon_url":"http://img02
     * .liwushuo.com/image/150615/ut6y3bdkt.png-pw144","id":63,"items_count":172,"name":"保健品",
     * "order":0,"parent_id":9,"status":0},{"icon_url":"http://img03.liwushuo
     * .com/image/150615/q46rgdaym.png-pw144","id":66,"items_count":-51,"name":"口腔护理","order":0,
     * "parent_id":9,"status":0},{"icon_url":"http://img02.liwushuo.com/image/150625/2n0q354tn
     * .png-pw144","id":72,"items_count":-17,"name":"眼部保健","order":0,"parent_id":9,"status":0},
     * {"icon_url":"http://img03.liwushuo.com/image/150615/bxlv87kfx.png-pw144","id":93,
     * "items_count":41,"name":"女性护理","order":0,"parent_id":9,"status":0},
     * {"icon_url":"http://img02.liwushuo.com/image/150626/46at9bfe6.png-pw144","id":98,
     * "items_count":26,"name":"情趣用品","order":0,"parent_id":9,"status":0}]},
     * {"icon_url":"http://img02.liwushuo.com/image/150615/ssonm636m.png-pw144","id":13,
     * "name":"女装","order":1,"status":0,"subcategories":[{"icon_url":"http://img02.liwushuo
     * .com/image/150615/w01wjnzql.png-pw144","id":99,"items_count":219,"name":"短袖T恤","order":0,
     * "parent_id":13,"status":0},{"icon_url":"http://img02.liwushuo.com/image/150615/zjga336ec
     * .png-pw144","id":176,"items_count":659,"name":"冬季外套","order":0,"parent_id":13,"status":0},
     * {"icon_url":"http://img03.liwushuo.com/image/150625/dtnge8hys.png-pw144","id":175,
     * "items_count":74,"name":"无袖背心","order":0,"parent_id":13,"status":0},
     * {"icon_url":"http://img02.liwushuo.com/image/150615/uzysk736w.png-pw144","id":168,
     * "items_count":108,"name":"情侣装","order":0,"parent_id":13,"status":0},
     * {"icon_url":"http://img03.liwushuo.com/image/150615/9tcujdarw.png-pw144","id":116,
     * "items_count":-12,"name":"泳衣","order":0,"parent_id":13,"status":0},
     * {"icon_url":"http://img01.liwushuo.com/image/150615/bm41n1t1l.png-pw144","id":114,
     * "items_count":101,"name":"内衣","order":0,"parent_id":13,"status":0},
     * {"icon_url":"http://img01.liwushuo.com/image/150615/g691hmqtc.png-pw144","id":113,
     * "items_count":124,"name":"家居服","order":0,"parent_id":13,"status":0},
     * {"icon_url":"http://img02.liwushuo.com/image/150615/mgnodc6a5.png-pw144","id":111,
     * "items_count":506,"name":"长裤","order":0,"parent_id":13,"status":0},
     * {"icon_url":"http://img02.liwushuo.com/image/150615/wyu0cvzex.png-pw144","id":110,
     * "items_count":107,"name":"短裤","order":0,"parent_id":13,"status":0},
     * {"icon_url":"http://img02.liwushuo.com/image/150615/354h7hf5p.png-pw144","id":109,
     * "items_count":139,"name":"套装","order":0,"parent_id":13,"status":0},
     * {"icon_url":"http://img02.liwushuo.com/image/150615/vxjnaamvy.png-pw144","id":108,
     * "items_count":400,"name":"半身裙","order":0,"parent_id":13,"status":0},
     * {"icon_url":"http://img02.liwushuo.com/image/150615/cl6rptpqm.png-pw144","id":107,
     * "items_count":614,"name":"连衣裙","order":0,"parent_id":13,"status":0},
     * {"icon_url":"http://img03.liwushuo.com/image/150615/dwt0l66tx.png-pw144","id":106,
     * "items_count":-4,"name":"运动套装","order":0,"parent_id":13,"status":0},
     * {"icon_url":"http://img01.liwushuo.com/image/150625/r0h9ei9i0.png-pw144","id":105,
     * "items_count":459,"name":"春夏 外套/开衫","order":0,"parent_id":13,"status":0},
     * {"icon_url":"http://img03.liwushuo.com/image/150615/b27mks7o6.png-pw144","id":104,
     * "items_count":182,"name":"卫衣","order":0,"parent_id":13,"status":0},
     * {"icon_url":"http://img03.liwushuo.com/image/150615/c5df083ti.png-pw144","id":102,
     * "items_count":87,"name":"长袖T恤","order":0,"parent_id":13,"status":0},
     * {"icon_url":"http://img01.liwushuo.com/image/150615/w8snm75vo.png-pw144","id":101,
     * "items_count":338,"name":"衬衫","order":0,"parent_id":13,"status":0},
     * {"icon_url":"http://img02.liwushuo.com/image/150615/q02613jgo.png-pw144","id":100,
     * "items_count":17,"name":"雪纺衫","order":0,"parent_id":13,"status":0},
     * {"icon_url":"http://img03.liwushuo.com/image/150625/n0a3hbx2i.png-pw144","id":178,
     * "items_count":598,"name":"毛衣","order":0,"parent_id":13,"status":0}]},
     * {"icon_url":"http://img01.liwushuo.com/image/150427/do1zl00v5.png-pw144","id":8,
     * "name":"箱包","order":1,"status":0,"subcategories":[{"icon_url":"http://img01.liwushuo
     * .com/image/150615/gvfq4j1mm.png-pw144","id":55,"items_count":534,"name":"单肩包","order":0,
     * "parent_id":8,"status":0},{"icon_url":"http://img01.liwushuo.com/image/150615/79v2pdq56
     * .png-pw144","id":57,"items_count":21,"name":"化妆包","order":0,"parent_id":8,"status":0},
     * {"icon_url":"http://img03.liwushuo.com/image/150626/0vm6j2bzc.png-pw144","id":58,
     * "items_count":48,"name":"女士钱包","order":0,"parent_id":8,"status":0},
     * {"icon_url":"http://img03.liwushuo.com/image/150615/g3n1v3lor.png-pw144","id":59,
     * "items_count":55,"name":"手拿包","order":0,"parent_id":8,"status":0},
     * {"icon_url":"http://img01.liwushuo.com/image/150615/u4r94trxx.png-pw144","id":60,
     * "items_count":58,"name":"手提包","order":0,"parent_id":8,"status":0},
     * {"icon_url":"http://img02.liwushuo.com/image/150615/n359evuhg.png-pw144","id":61,
     * "items_count":81,"name":"双肩包","order":0,"parent_id":8,"status":0},
     * {"icon_url":"http://img01.liwushuo.com/image/150615/lqbfw3b05.png-pw144","id":62,
     * "items_count":-10,"name":"行李箱","order":0,"parent_id":8,"status":0},
     * {"icon_url":"http://img02.liwushuo.com/image/150615/cygdl9yim.png-pw144","id":142,
     * "items_count":50,"name":"男士钱包","order":0,"parent_id":8,"status":0},
     * {"icon_url":"http://img01.liwushuo.com/image/150626/uv8fbv07r.png-pw144","id":188,
     * "items_count":10,"name":"帆布包/帆布袋","order":0,"parent_id":8,"status":0}]},
     * {"icon_url":"http://img01.liwushuo.com/image/150615/ih649shak.png-pw144","id":16,
     * "name":"女鞋","order":0,"status":0,"subcategories":[{"icon_url":"http://img03.liwushuo
     * .com/image/150615/jyt4i7jji.png-pw144","id":117,"items_count":147,"name":"平底单鞋","order":0,
     * "parent_id":16,"status":0},{"icon_url":"http://img01.liwushuo.com/image/150615/w3juz5k0g
     * .png-pw144","id":118,"items_count":103,"name":"高跟鞋","order":0,"parent_id":16,"status":0},
     * {"icon_url":"http://img01.liwushuo.com/image/150615/6atqyxbmy.png-pw144","id":122,
     * "items_count":133,"name":"凉鞋/凉拖","order":0,"parent_id":16,"status":0},
     * {"icon_url":"http://img01.liwushuo.com/image/150615/o8poapf24.png-pw144","id":123,
     * "items_count":51,"name":"休闲鞋","order":0,"parent_id":16,"status":0},
     * {"icon_url":"http://img02.liwushuo.com/image/150615/0djl99ez3.png-pw144","id":124,
     * "items_count":117,"name":"运动鞋","order":0,"parent_id":16,"status":0},
     * {"icon_url":"http://img01.liwushuo.com/image/150625/30shonv0s.png-pw144","id":125,
     * "items_count":73,"name":"家居鞋","order":0,"parent_id":16,"status":0},
     * {"icon_url":"http://img01.liwushuo.com/image/150625/7wyqicpy7.png-pw144","id":183,
     * "items_count":42,"name":"帆布鞋","order":0,"parent_id":16,"status":0},
     * {"icon_url":"http://img03.liwushuo.com/image/150625/l5kul4mub.png-pw144","id":185,
     * "items_count":9,"name":"雨鞋","order":0,"parent_id":16,"status":0},{"icon_url":"http://img02
     * .liwushuo.com/image/150625/qal3rme0u.png-pw144","id":186,"items_count":202,"name":"短靴",
     * "order":0,"parent_id":16,"status":0}]},{"icon_url":"http://img02.liwushuo
     * .com/image/150615/zamuxwjdh.png-pw144","id":17,"name":"男装","order":0,"status":0,
     * "subcategories":[{"icon_url":"http://img01.liwushuo.com/image/150615/r5zplg7f9.png-pw144",
     * "id":129,"items_count":18,"name":"男士衬衫","order":0,"parent_id":17,"status":0},
     * {"icon_url":"http://img01.liwushuo.com/image/150615/2uqjktxfd.png-pw144","id":130,
     * "items_count":9,"name":"男士短袖T恤","order":0,"parent_id":17,"status":0},
     * {"icon_url":"http://img01.liwushuo.com/image/150615/9s4j8lhxm.png-pw144","id":131,
     * "items_count":-15,"name":"男士T恤","order":0,"parent_id":17,"status":0},
     * {"icon_url":"http://img03.liwushuo.com/image/150615/lo59qrrq9.png-pw144","id":132,
     * "items_count":1,"name":"男士短裤","order":0,"parent_id":17,"status":0},
     * {"icon_url":"http://img01.liwushuo.com/image/150615/mlimuvr92.png-pw144","id":133,
     * "items_count":11,"name":"男士长裤","order":0,"parent_id":17,"status":0},
     * {"icon_url":"http://img02.liwushuo.com/image/150626/xdgdi7rhk.png-pw144","id":135,
     * "items_count":56,"name":"男士外套","order":0,"parent_id":17,"status":0},
     * {"icon_url":"http://img02.liwushuo.com/image/150626/4zohcyeqm.png-pw144","id":177,
     * "items_count":7,"name":"男士卫衣","order":0,"parent_id":17,"status":0},
     * {"icon_url":"http://img03.liwushuo.com/image/150625/1b9z1s4b2.png-pw144","id":179,
     * "items_count":-3,"name":"男士内衣/内裤","order":0,"parent_id":17,"status":0},
     * {"icon_url":"http://img01.liwushuo.com/image/150626/v6yotd8w3.png-pw144","id":180,
     * "items_count":34,"name":"男士毛衣","order":0,"parent_id":17,"status":0}]},
     * {"icon_url":"http://img03.liwushuo.com/image/150615/epf9btjx5.png-pw144","id":18,
     * "name":"男鞋","order":0,"status":0,"subcategories":[{"icon_url":"http://img02.liwushuo
     * .com/image/150625/8j7by3pvh.png-pw144","id":136,"items_count":5,"name":"皮鞋","order":0,
     * "parent_id":18,"status":0},{"icon_url":"http://img03.liwushuo.com/image/150615/kbplcvs2w
     * .png-pw144","id":138,"items_count":22,"name":"男士休闲鞋","order":0,"parent_id":18,"status":0},
     * {"icon_url":"http://img03.liwushuo.com/image/150615/5p66polm2.png-pw144","id":139,
     * "items_count":42,"name":"男士运动鞋","order":0,"parent_id":18,"status":0},
     * {"icon_url":"http://img02.liwushuo.com/image/150625/2bmwjcyg4.png-pw144","id":184,
     * "items_count":6,"name":"男士帆布鞋","order":0,"parent_id":18,"status":0}]},
     * {"icon_url":"http://img03.liwushuo.com/image/150615/h8jc0xq01.png-pw144","id":10,
     * "name":"母婴","order":-1,"status":0,"subcategories":[{"icon_url":"http://img01.liwushuo
     * .com/image/150615/aec8nigkk.png-pw144","id":73,"items_count":41,"name":"宝宝食品","order":0,
     * "parent_id":10,"status":0},{"icon_url":"http://img02.liwushuo.com/image/150615/cw21m8c10
     * .png-pw144","id":74,"items_count":-4,"name":"宝宝衣物","order":0,"parent_id":10,"status":0},
     * {"icon_url":"http://img02.liwushuo.com/image/150615/jnhot47ib.png-pw144","id":75,
     * "items_count":74,"name":"宝宝用品","order":0,"parent_id":10,"status":0},
     * {"icon_url":"http://img01.liwushuo.com/image/150615/e0orqx1zs.png-pw144","id":76,
     * "items_count":-34,"name":"儿童玩具","order":0,"parent_id":10,"status":0},
     * {"icon_url":"http://img02.liwushuo.com/image/150615/mrvjapo2k.png-pw144","id":77,
     * "items_count":43,"name":"孕妇用品","order":0,"parent_id":10,"status":0},
     * {"icon_url":"http://img02.liwushuo.com/image/150615/d5qa0hrfi.png-pw144","id":78,
     * "items_count":-3,"name":"早教益智","order":0,"parent_id":10,"status":0}]}]}
     * message : OK
     */

    @SerializedName("code")
    private int code;
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
         * icon_url : http://img01.liwushuo.com/image/150615/3nc5tejwl.png-pw144
         * id : 1
         * name : 热门分类
         * order : 11
         * status : 0
         * subcategories : [{"icon_url":"http://img01.liwushuo.com/image/150615/urgs9vy8a
         * .png-pw144","id":7,"items_count":-51,"name":"智能设备","order":7,"parent_id":1,
         * "status":0},{"icon_url":"http://img03.liwushuo.com/image/150615/d4dhjw1we.png-pw144",
         * "id":6,"items_count":-211,"name":"鲜花蛋糕","order":6,"parent_id":1,"status":0},
         * {"icon_url":"http://img03.liwushuo.com/image/150626/itxjlg4jh.png-pw144","id":5,
         * "items_count":-19,"name":"书 ","order":5,"parent_id":1,"status":0},
         * {"icon_url":"http://img02.liwushuo.com/image/150615/12vqbzrkq.png-pw144","id":4,
         * "items_count":-138,"name":"模型拼图","order":4,"parent_id":1,"status":0},
         * {"icon_url":"http://img02.liwushuo.com/image/150312/xdjtcaanm.png-pw144","id":3,
         * "items_count":-70,"name":"毛绒公仔","order":3,"parent_id":1,"status":0},
         * {"icon_url":"http://img03.liwushuo.com/image/150615/dsu66u5k2.png-pw144","id":2,
         * "items_count":-73,"name":"动漫/明星周边","order":2,"parent_id":1,"status":0},
         * {"icon_url":"http://img01.liwushuo.com/image/150615/v65bdnets.png-pw144","id":1,"items_count":-497,"name":"创意礼品","order":1,"parent_id":1,"status":0},{"icon_url":"http://img01.liwushuo.com/image/160826/twnvs9g39.png-pw144","id":193,"items_count":0,"name":"处女座礼物清单","order":0,"parent_id":1,"status":0}]
         */

        @SerializedName("categories")
        private List<CategoriesBean> categories;

        public List<CategoriesBean> getCategories() {
            return categories;
        }

        public void setCategories(List<CategoriesBean> categories) {
            this.categories = categories;
        }


    }
}
