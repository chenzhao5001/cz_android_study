package com.cz.pic;

import java.util.ArrayList;
import java.util.List;

public class ImageResource {
    static ImageResource imageResource = null;

    public static ImageResource getInstance() {
        if (imageResource == null) {
            imageResource = new ImageResource();
        }
        return imageResource;
    }

    public List<String> getResourceList() {
        List<String> list = new ArrayList<>();
        list.add("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fpic1.win4000.com%2Fpic%2F2%2F5a%2Fed28411748.jpg%3Fdown&refer=http%3A%2F%2Fpic1.win4000.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1670126357&t=b4dd0556d6a6654dd8c105b789f3b3d4");
        list.add("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fhbimg.b0.upaiyun.com%2F4ed24b475ac3384cacb1d16e40bcf28e0e5dc0931471c-0a9jrA_fw658&refer=http%3A%2F%2Fhbimg.b0.upaiyun.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1670126357&t=2402ecfddd719b56b5d488e61193578e");
        list.add("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fhbimg.b0.upaiyun.com%2Fad261a0a003fdc4ff6906e83171604ba124da93c3ae1-mRR9KY_fw658&refer=http%3A%2F%2Fhbimg.b0.upaiyun.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1670126357&t=ad8e6715c669c7c206147ede2dfbd754");
        list.add("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fhbimg.b0.upaiyun.com%2F1b8887931ee87418fcb1e29a46696eb99fb158ac2d931-kvE4Za_fw658&refer=http%3A%2F%2Fhbimg.b0.upaiyun.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1670126357&t=2e89ec2daac974e48a1f9c87f2ea8534");
        list.add("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fpic1.win4000.com%2Fpic%2F3%2F5a%2Fe84f1116220.jpg&refer=http%3A%2F%2Fpic1.win4000.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1670126357&t=7ba2d5f20e0f2c6a2208513dbff28fef");
        list.add("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fpic1.win4000.com%2Fpic%2F8%2F31%2F95f7394564.jpg&refer=http%3A%2F%2Fpic1.win4000.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1670126357&t=5e200f8c1c57985c3639d07a3e1df339");
        list.add("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fm4.biz.itc.cn%2Fpic%2Fnew%2Fn%2F19%2F52%2FImg8185219_n.jpg&refer=http%3A%2F%2Fm4.biz.itc.cn&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1670126357&t=dab15565abda927380fe00145088802a");
        list.add("https://img1.baidu.com/it/u=3850439389,302445216&fm=253&fmt=auto&app=138&f=JPEG?w=756&h=500");
        list.add("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fwww.yuntu.cn%2Fd%2Ffile%2F1906%2F74dcf29899868775f521b6518ec4145a.jpg&refer=http%3A%2F%2Fwww.yuntu.cn&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1670126357&t=9f00535d52312756037611fd95d029ea");
        list.add("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fpiccn.ihuaben.com%2Fpic%2Fbook%2F201808%2F7312061-1534557918795-F323Cha83b_298-398.jpeg%3Fx-oss-process%3Dimage%2Fresize%2Cw_210&refer=http%3A%2F%2Fpiccn.ihuaben.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1670126357&t=28665b048b5a15c8d2c6f623bd7b2b74");
        list.add("https://gimg2.baidu.com/image_search/src=http%3A%2F%2F5b0988e595225.cdn.sohucs.com%2Fq_70%2Cc_zoom%2Cw_640%2Fimages%2F20171201%2Fbcd2cb6af30d4d5e809309d2ba50181a.jpeg&refer=http%3A%2F%2F5b0988e595225.cdn.sohucs.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1670126357&t=41a98aaa2abbecd8df84397e5ce19421");
        list.add("https://img1.baidu.com/it/u=3005269031,2835358672&fm=253&fmt=auto&app=138&f=JPEG?w=499&h=333");
        list.add("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fwww.yuntu.cn%2Fd%2Ffile%2F1906%2F2fca89181ca55263846be461c0b949ec.jpg&refer=http%3A%2F%2Fwww.yuntu.cn&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1670126357&t=1421002b36e204bb5003890a9cd2a151");
        list.add("https://p3-sign.toutiaoimg.com/tos-cn-i-qvj2lq49k0/fe9ea28951de4640ad67632393c4d5e6~noop.image?_iz=58558&from=article.pc_detail&x-expires=1668139502&x-signature=iiVBZkAlKkmQHsc5EoZ2KKP%2Br7E%3D");
        list.add("https://p3-sign.toutiaoimg.com/tos-cn-i-qvj2lq49k0/16cb786acd5d485381915472306644f8~noop.image?_iz=58558&from=article.pc_detail&x-expires=1668139502&x-signature=UwULL1jqHfS6eYJAfKiHLRW5PSg%3D");
        list.add("https://p3-sign.toutiaoimg.com/tos-cn-i-qvj2lq49k0/348b7e0af4cb4acd976723dedf11eebe~noop.image?_iz=58558&from=article.pc_detail&x-expires=1668139502&x-signature=F4ardHKfhCV8qljSCseKnYHSiKk%3D");
        list.add("https://p3-sign.toutiaoimg.com/tos-cn-i-qvj2lq49k0/8011611316ef4315b7c0d99fc695c07b~noop.image?_iz=58558&from=article.pc_detail&x-expires=1668139502&x-signature=SmELQy%2FuLlR77O4BHyvUVVeQRsA%3D");
        list.add("https://p3-sign.toutiaoimg.com/tos-cn-i-qvj2lq49k0/69774a2a7cc645d787c2b27ba83f7a66~noop.image?_iz=58558&from=article.pc_detail&x-expires=1668139502&x-signature=2DIcL26uCkZ05pmAei28phQiCOk%3D");
        list.add("https://p3-sign.toutiaoimg.com/tos-cn-i-qvj2lq49k0/f1bc8ca7ab3843b19f38ec65a9fcdc44~noop.image?_iz=58558&from=article.pc_detail&x-expires=1668139502&x-signature=OAaQx8fSbT2QsAuk%2BbcCU17nZQY%3D");
        list.add("https://p3-sign.toutiaoimg.com/tos-cn-i-qvj2lq49k0/a8e5eb99ea4e4ece875fe1aab903988c~noop.image?_iz=58558&from=article.pc_detail&x-expires=1668139614&x-signature=ctSYLrm2WanIq%2FnhZg3XqX5qWsI%3D");
        list.add("https://p3-sign.toutiaoimg.com/tos-cn-i-qvj2lq49k0/8c5ec5498dfd4a16910b7ca108ada8c4~noop.image?_iz=58558&from=article.pc_detail&x-expires=1668139614&x-signature=xri%2FiGLXF8NHHXVBZuoc05IQfhs%3D");
        list.add("https://p3-sign.toutiaoimg.com/tos-cn-i-qvj2lq49k0/d3f2726e01d94dcc96ddb9fa99991ee2~noop.image?_iz=58558&from=article.pc_detail&x-expires=1668139614&x-signature=OQeMr76CQyD5DzUmTIbI8dCjNFk%3D");
        list.add("https://p3-sign.toutiaoimg.com/tos-cn-i-qvj2lq49k0/ce363331755d4f849c119ef649ed4fb5~noop.image?_iz=58558&from=article.pc_detail&x-expires=1668139614&x-signature=txZMb5nqW3bR4%2BTe3SPNEYmnY0E%3D");
        return list;
    }
}
