package com.example.gangplank.fangjiaxiangmu;

import java.util.List;

/**
 * Created by GANGPLANK on 2019/3/3.
 */

public class News {
    private String ERRORCODE;
    private RESULTBean RESULT;

    public String getERRORCODE() {
        return ERRORCODE;
    }

    public void setERRORCODE(String ERRORCODE) {
        this.ERRORCODE = ERRORCODE;
    }

    public RESULTBean getRESULT() {
        return RESULT;
    }

    public void setRESULT(RESULTBean RESULT) {
        this.RESULT = RESULT;
    }

    public static class RESULTBean {
        /**
         * newsList : [{"publishTime":"2018-09-25 09:31:09","newsId":"af28bf77b52875b55d85261743c3eb15","newsImg":"//inews.gtimg.com/newsapp_ls/0/5463033620_150120/0","source":"影过客","category":"娱乐","title":"张丹峰洪欣再合体，带女儿骑马幸福十足，身边已换男助理"},{"publishTime":"2018-09-25 09:30:57","newsId":"49e9d3b5cef0462249d7075ae01b51eb","newsImg":"//inews.gtimg.com/newsapp_ls/0/5462992997_150120/0","source":"明星粉丝团","category":"娱乐","title":"莫小贝或许不能成为一个大明星，但能成为一个好演员"},{"publishTime":"2018-09-25 08:45:44","newsId":"6a9a12fdf64c6b3dad302a7e94adb9e8","newsImg":"//inews.gtimg.com/newsapp_ls/0/5462545071_150120/0","source":"三十立铺","category":"娱乐","title":"贾斯汀比伯与海莉什么时候办婚礼？海莉堂姐：婚礼放缓了"},{"publishTime":"2018-09-25 08:42:26","newsId":"f3bd671496757c14c9005bb433d49137","newsImg":"//inews.gtimg.com/newsapp_ls/0/5462472656_150120/0","source":"明星粉丝团","category":"娱乐","title":"外媒不修图的迪丽热巴，一脸憔悴根本不惊艳"},{"publishTime":"2018-09-25 08:02:39","newsId":"84befd3ab84e01eb1ea29e39157b101e","newsImg":"//inews.gtimg.com/newsapp_ls/0/5462110784_150120/0","source":"影视口碑榜","category":"娱乐","title":"《如懿传》舒妃领盒饭，真心爱皇上的后妃都不得善终？"},{"publishTime":"2018-09-25 07:42:22","newsId":"d9e27cee54cbd96f5ed2961a9fde6320","newsImg":"//inews.gtimg.com/newsapp_ls/0/5461974111_150120/0","source":"橘子娱乐","category":"娱乐","title":"还记得《粉红女郎》里的男人婆吗？她孩子都这么大啦"},{"publishTime":"2018-09-25 07:42:14","newsId":"c69bbf5aed0232e27b99150db0769cea","newsImg":"//inews.gtimg.com/newsapp_ls/0/5461980837_150120/0","source":"橘子娱乐","category":"娱乐","title":"许凯回应机场臭脸 刘雯献唱《白月光》"},{"publishTime":"2018-09-25 07:41:51","newsId":"438484f086063715c19a1ac0d8551a08","newsImg":"//inews.gtimg.com/newsapp_ls/0/5461968907_150120/0","source":"娱与娱","category":"娱乐","title":"陈伟霆恋情坐实？圈内好友爆料其曾带女友录音"},{"publishTime":"2018-09-25 07:30:12","newsId":"f9538e068408d0c7a88a6f1cb0fa5011","newsImg":"//inews.gtimg.com/newsapp_ls/0/5461942622_150120/0","source":"疯狂娱乐资讯","category":"娱乐","title":"网友塞班岛偶遇李晨拍戏，两次路透照对比李晨脸型凹陷又瘦了"},{"publishTime":"2018-09-25 07:24:30","newsId":"b0bd411f70f83b153db1edae67053d3b","newsImg":"//inews.gtimg.com/newsapp_ls/0/5461847646_150120/0","source":"秃顶少女裘千尺","category":"娱乐","title":"张钧甯：她终于等到了好演员的春天"},{"publishTime":"2018-09-25 06:45:04","newsId":"7e69e09d9ac87540ae4f919fc8ae0c03","newsImg":"//inews.gtimg.com/newsapp_ls/0/5461554334_150120/0","source":"宝二姨","category":"娱乐","title":"好友发声维护佟丽娅：全年无休没毛病，难道天天在家要死要活吗？"},{"publishTime":"2018-09-25 06:30:24","newsId":"ee8f8cb4a7009fc6cce5b5a71c2bccd0","newsImg":"//inews.gtimg.com/newsapp_ls/0/5461461177_150120/0","source":"谈资","category":"娱乐","title":"金卡戴珊家最没存在感的小儿子，被侃爷单独带出门简直乐开了花"},{"publishTime":"2018-09-25 01:10:43","newsId":"f39c659dedbb73fd1c76d8d651cf3e39","newsImg":"//inews.gtimg.com/newsapp_ls/0/5462221209_150120/0","source":"指尖星娱","category":"娱乐","title":"秦岚与古巨基同框笑容甜美，嘟嘴斗鸡眼画风有点萌"},{"publishTime":"2018-09-25 00:26:24","newsId":"30d8337f04a0e88e705d6ab66a624846","newsImg":"//inews.gtimg.com/newsapp_ls/0/5459123789_150120/0","source":"广电独家","category":"娱乐","title":"从\u201c单打独斗\u201d到\u201c抱团取暖\u201d，编剧公司靠什么成为影视新力量？"},{"publishTime":"2018-09-24 23:58:00","newsId":"2e9c6b43dc32ba7c29685ed4c6826294","newsImg":"//inews.gtimg.com/newsapp_ls/0/5458830299_150120/0","source":"麻辣表哥","category":"娱乐","title":"吴秀波小三撕小四爆出育子花边，还挖出朱亚文暗讽趣事，这瓜真大"},{"publishTime":"2018-09-24 23:48:29","newsId":"c44e0efacaf164e526bef4fe08aca5b8","newsImg":"//inews.gtimg.com/newsapp_ls/0/5458753506_150120/0","source":"刘艺侨Joe","category":"娱乐","title":"吴秀波给小三张芷溪买剧本拍电视剧？作者辟谣：她自己买的版权"},{"publishTime":"2018-09-24 23:47:51","newsId":"f3c9271a717665f2e41c35ad3df84349","newsImg":"//inews.gtimg.com/newsapp_ls/0/5458748180_150120/0","source":"娱大嫂","category":"娱乐","title":"章子怡中秋节晒全家福, 不料却被大女儿抢了风头，颜值赶超后妈"},{"publishTime":"2018-09-24 23:44:48","newsId":"805431073e7271cb8fc6042465a33b3d","newsImg":"//inews.gtimg.com/newsapp_ls/0/5462486132_150120/0","source":"方舟先生","category":"娱乐","title":"张庭未受老公出轨风波影响，晒一家四口穿亲子装秀幸福"},{"publishTime":"2018-09-24 23:32:15","newsId":"45838ae2f1946f3e8d6ff1a26cc46f8a","newsImg":"//inews.gtimg.com/newsapp_ls/0/5458625533_150120/0","source":"三十立铺","category":"娱乐","title":"金卡戴珊全家为碧昂斯夫妇演唱会站台，终于破了两家不合传闻"},{"publishTime":"2018-09-24 23:30:31","newsId":"3ee053f2b1d7ff7421bbd67563eb3d38","newsImg":"//inews.gtimg.com/newsapp_ls/0/5458610517_150120/0","source":"水星fashion","category":"娱乐","title":"潘粤明对董洁难以忘怀？这一举动疑透露还关注前妻董洁一举一动"},{"publishTime":"2018-09-24 23:15:01","newsId":"a60cb5f9254363ee9baebcac2bfc499c","newsImg":"//inews.gtimg.com/newsapp_ls/0/5462442548_150120/0","source":"方舟先生","category":"娱乐","title":"田亮晒与女儿同框吃月饼，森碟梳双马尾模样俏皮可爱"},{"publishTime":"2018-09-24 23:02:02","newsId":"4c639ae92b19ad94badee17efa679e2a","newsImg":"//inews.gtimg.com/newsapp_ls/0/5458367954_150120/0","source":"水星fashion","category":"娱乐","title":"词圣林夕被曝曾是高考状元，扬言只做第一不习惯第二"},{"publishTime":"2018-09-24 22:55:38","newsId":"3662b2a2c5e46b932d71875e832e37ad","newsImg":"//inews.gtimg.com/newsapp_ls/0/5458314629_150120/0","source":"新氧App","category":"娱乐","title":"粉丝晒丑娃，送土味烧饼，买南极人，现在追星都流行又丑又土？"},{"publishTime":"2018-09-24 22:51:50","newsId":"cbf84dbfcdf45d0fe93d803726b898f4","newsImg":"//inews.gtimg.com/newsapp_ls/0/5458282007_150120/0","source":"饭后八卦","category":"娱乐","title":"和好如初？李小璐晒团圆饭秀幸福，贾乃亮早就用四个字预告了"},{"publishTime":"2018-09-24 22:43:49","newsId":"35f71f4db994e5acc69d37262c43c3fc","newsImg":"//inews.gtimg.com/newsapp_ls/0/5458262089_150120/0","source":"八卦研究院","category":"娱乐","title":"方媛古装造型 回眸一笑被赞美得不可方物"},{"publishTime":"2018-09-24 22:43:07","newsId":"74526278babe49ba59e7db492278839c","newsImg":"//inews.gtimg.com/newsapp_ls/0/5458202752_150120/0","source":"好丹TV","category":"娱乐","title":"李小璐中秋大餐是婆婆的厨艺，与贾乃亮月圆人圆？"},{"publishTime":"2018-09-24 22:38:53","newsId":"55ae0a24c9e0b5be3bd086e2fe9b1268","newsImg":"//inews.gtimg.com/newsapp_ls/0/5458164362_150120/0","source":"新氧App","category":"娱乐","title":"把热巴连身材带脸被秒得渣都不剩，泰国一线小花都这么强势了吗？"},{"publishTime":"2018-09-24 22:31:42","newsId":"c69a29d3dab7a28780905d739c62eca3","newsImg":"//inews.gtimg.com/newsapp_ls/0/5458091665_150120/0","source":"水星娱评","category":"娱乐","title":"戚薇小姑子26岁意外离世，距离戚薇李承铉完婚仅过两月"},{"publishTime":"2018-09-24 22:25:41","newsId":"5ed1ede4e46f1fd907d61d077ce3db3f","newsImg":"//inews.gtimg.com/newsapp_ls/0/5458620541_150120/0","source":"八卦船","category":"娱乐","title":"章子怡中秋节晒一家四口团聚照  网友吐槽：汪峰最丑"},{"publishTime":"2018-09-24 22:20:37","newsId":"faeb360aa1313bed2f3528e6c85dce3a","newsImg":"//inews.gtimg.com/newsapp_ls/0/5457983634_150120/0","source":"戏子评","category":"娱乐","title":"《如懿传》如懿再怀孕，永琪不开心还问是男是女，海兰的做法大赞"}]
         * page : 1
         * allPage : 3
         */

        private int page;
        private int allPage;
        private List<NewsListBean> newsList;

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public int getAllPage() {
            return allPage;
        }

        public void setAllPage(int allPage) {
            this.allPage = allPage;
        }

        public List<NewsListBean> getNewsList() {
            return newsList;
        }

        public void setNewsList(List<NewsListBean> newsList) {
            this.newsList = newsList;
        }

        public static class NewsListBean {
            /**
             * publishTime : 2018-09-25 09:31:09
             * newsId : af28bf77b52875b55d85261743c3eb15
             * newsImg : //inews.gtimg.com/newsapp_ls/0/5463033620_150120/0
             * source : 影过客
             * category : 娱乐
             * title : 张丹峰洪欣再合体，带女儿骑马幸福十足，身边已换男助理
             */

            private String publishTime;
            private String newsId;
            private String newsImg;
            private String source;
            private String category;
            private String title;

            public String getPublishTime() {
                return publishTime;
            }

            public void setPublishTime(String publishTime) {
                this.publishTime = publishTime;
            }

            public String getNewsId() {
                return newsId;
            }

            public void setNewsId(String newsId) {
                this.newsId = newsId;
            }

            public String getNewsImg() {
                return newsImg;
            }

            public void setNewsImg(String newsImg) {
                this.newsImg = newsImg;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }
    }
}

