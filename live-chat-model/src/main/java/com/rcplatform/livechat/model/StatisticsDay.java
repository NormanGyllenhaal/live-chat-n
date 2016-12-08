package com.rcplatform.livechat.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_statistics_day")
public class StatisticsDay implements Serializable {
    @Id
    private Integer id;

    /**
     * 筛选女性的点击数
     */
    @Column(name = "woman_click")
    private Integer womanClick;

    /**
     * 筛选男性的点击数
     */
    @Column(name = "boy_click")
    private Integer boyClick;

    /**
     * 筛选全部的点击数
     */
    @Column(name = "both_click")
    private Integer bothClick;

    /**
     * 匹配跳过的次数
     */
    @Column(name = "match_skip_count")
    private Integer matchSkipCount;

    /**
     * 男性使用kiss 的次数
     */
    @Column(name = "kiss_boy_count")
    private Integer kissBoyCount;

    /**
     * 女性使用kiss 的次数
     */
    @Column(name = "kiss_girl_count")
    private Integer kissGirlCount;

    /**
     * 送花的次数
     */
    @Column(name = "flower_count")
    private Integer flowerCount;

    /**
     * 巴掌的使用次数
     */
    @Column(name = "hand_count")
    private Integer handCount;

    /**
     * 视频时男性退出使用的次数
     */
    @Column(name = "video_boy_leave_count")
    private Integer videoBoyLeaveCount;

    /**
     * 视频时男性退出的人数
     */
    @Column(name = "video_boy_leave_people")
    private Integer videoBoyLeavePeople;

    /**
     * 视频时女性退出使用的次数
     */
    @Column(name = "video_girl_leave_count")
    private Integer videoGirlLeaveCount;

    /**
     * 视频时女性退出使用的次数
     */
    @Column(name = "video_girl_leave_people")
    private Integer videoGirlLeavePeople;

    /**
     * 男性退出的时长
     */
    @Column(name = "video_boy_leave_time")
    private Integer videoBoyLeaveTime;

    /**
     * 女性退出的时长
     */
    @Column(name = "video_girl_leave_time")
    private Integer videoGirlLeaveTime;

    /**
     * 随机视频匹配的视频通话总时长
     */
    @Column(name = "match_video_time")
    private Integer matchVideoTime;

    /**
     * 随机匹配的视频总人数
     */
    @Column(name = "match_video_people")
    private Integer matchVideoPeople;

    /**
     * 双向好友累计
     */
    @Column(name = "both_friend_total")
    private Integer bothFriendTotal;

    /**
     * 双向好友新增
     */
    @Column(name = "both_friend_day")
    private Integer bothFriendDay;

    /**
     * 匹配时成为好友的总人数
     */
    @Column(name = "video_befriend_count")
    private Integer videoBefriendCount;

    /**
     * 女性在视频时添加好友的次数
     */
    @Column(name = "video_girl_add_friend_count")
    private Integer videoGirlAddFriendCount;

    /**
     * 3分钟到时提示继续加好友成功次数
     */
    @Column(name = "three_chat_add_friend_count")
    private Integer threeChatAddFriendCount;

    /**
     * 3分钟到时提示继续 男性离开次数
     */
    @Column(name = "three_chat_boy_leave_count")
    private Integer threeChatBoyLeaveCount;

    /**
     * 3分钟到时提示继续女性离开次数
     */
    @Column(name = "three_chat_girl_leave_count")
    private Integer threeChatGirlLeaveCount;

    /**
     * 3分钟以内聊天平均时长
     */
    @Column(name = "three_chat_avg_time")
    private Integer threeChatAvgTime;

    /**
     * 聊天到达3分钟的次数
     */
    @Column(name = "three_chat_count")
    private Integer threeChatCount;

    /**
     * 在匹配列表聊天点击次数
     */
    @Column(name = "match_page_chat_click_count")
    private Integer matchPageChatClickCount;

    /**
     * 匹配列表男性付费人数
     */
    @Column(name = "boy_pay_people")
    private Integer boyPayPeople;

    /**
     * 匹配列表男性付费次数
     */
    @Column(name = "boy_pay_count")
    private Integer boyPayCount;

    /**
     * 匹配列表女性付费人数
     */
    @Column(name = "girl_pay_people")
    private Integer girlPayPeople;

    /**
     * 匹配列表女性付费次数
     */
    @Column(name = "girl_pay_count")
    private Integer girlPayCount;

    /**
     * 在匹配列表付费的人数
     */
    @Column(name = "match_page_pay_people")
    private Integer matchPagePayPeople;

    /**
     * 匹配列表头像点击次数
     */
    @Column(name = "match_page_head_click_count")
    private Integer matchPageHeadClickCount;

    /**
     * 匹配列表聊天付费次数
     */
    @Column(name = "match_page_pay_count")
    private Integer matchPagePayCount;

    /**
     * 聊天页面会话的点击人数
     */
    @Column(name = "chat_page_people")
    private Integer chatPagePeople;

    /**
     * 聊天页面会话的点击次数
     */
    @Column(name = "chat_page_count")
    private Integer chatPageCount;

    /**
     * 个人主页图片编辑次数
     */
    @Column(name = "image_modify_count")
    private Integer imageModifyCount;

    /**
     * 应用的分享次数
     */
    @Column(name = "share_num")
    private Integer shareNum;

    /**
     * 每日视频通话总时长
     */
    @Column(name = "video_time")
    private Integer videoTime;

    /**
     * 每日视频通话的总人数
     */
    @Column(name = "video_people")
    private Integer videoPeople;

    /**
     * 每日好友视频通话的总时长
     */
    @Column(name = "friend_video_time")
    private Integer friendVideoTime;

    /**
     * 每日好友视频通话人数
     */
    @Column(name = "friend_video_people")
    private Integer friendVideoPeople;

    /**
     * 每日好友视频通话次数
     */
    @Column(name = "friend_video_count")
    private Integer friendVideoCount;

    /**
     * 女女通话次数
     */
    @Column(name = "girl_girl_video_count")
    private Integer girlGirlVideoCount;

    /**
     * 男女通话次数
     */
    @Column(name = "boy_girl_video_count")
    private Integer boyGirlVideoCount;

    /**
     * 男男通话次数
     */
    @Column(name = "boy_boy_video_count")
    private Integer boyBoyVideoCount;

    /**
     * 女性匹配消耗金币总数
     */
    @Column(name = "girl_match_gold")
    private Integer girlMatchGold;

    /**
     * 男性匹配消耗金币总数
     */
    @Column(name = "boy_match_gold")
    private Integer boyMatchGold;

    /**
     * android匹配消耗金币总数
     */
    @Column(name = "android_match_gold")
    private Integer androidMatchGold;

    /**
     * ios匹配消耗金币总数
     */
    @Column(name = "ios_match_gold")
    private Integer iosMatchGold;

    /**
     * 匹配消耗金币总数
     */
    @Column(name = "match_gold")
    private Integer matchGold;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取筛选女性的点击数
     *
     * @return woman_click - 筛选女性的点击数
     */
    public Integer getWomanClick() {
        return womanClick;
    }

    /**
     * 设置筛选女性的点击数
     *
     * @param womanClick 筛选女性的点击数
     */
    public void setWomanClick(Integer womanClick) {
        this.womanClick = womanClick;
    }

    /**
     * 获取筛选男性的点击数
     *
     * @return boy_click - 筛选男性的点击数
     */
    public Integer getBoyClick() {
        return boyClick;
    }

    /**
     * 设置筛选男性的点击数
     *
     * @param boyClick 筛选男性的点击数
     */
    public void setBoyClick(Integer boyClick) {
        this.boyClick = boyClick;
    }

    /**
     * 获取筛选全部的点击数
     *
     * @return both_click - 筛选全部的点击数
     */
    public Integer getBothClick() {
        return bothClick;
    }

    /**
     * 设置筛选全部的点击数
     *
     * @param bothClick 筛选全部的点击数
     */
    public void setBothClick(Integer bothClick) {
        this.bothClick = bothClick;
    }

    /**
     * 获取匹配跳过的次数
     *
     * @return match_skip_count - 匹配跳过的次数
     */
    public Integer getMatchSkipCount() {
        return matchSkipCount;
    }

    /**
     * 设置匹配跳过的次数
     *
     * @param matchSkipCount 匹配跳过的次数
     */
    public void setMatchSkipCount(Integer matchSkipCount) {
        this.matchSkipCount = matchSkipCount;
    }

    /**
     * 获取男性使用kiss 的次数
     *
     * @return kiss_boy_count - 男性使用kiss 的次数
     */
    public Integer getKissBoyCount() {
        return kissBoyCount;
    }

    /**
     * 设置男性使用kiss 的次数
     *
     * @param kissBoyCount 男性使用kiss 的次数
     */
    public void setKissBoyCount(Integer kissBoyCount) {
        this.kissBoyCount = kissBoyCount;
    }

    /**
     * 获取女性使用kiss 的次数
     *
     * @return kiss_girl_count - 女性使用kiss 的次数
     */
    public Integer getKissGirlCount() {
        return kissGirlCount;
    }

    /**
     * 设置女性使用kiss 的次数
     *
     * @param kissGirlCount 女性使用kiss 的次数
     */
    public void setKissGirlCount(Integer kissGirlCount) {
        this.kissGirlCount = kissGirlCount;
    }

    /**
     * 获取送花的次数
     *
     * @return flower_count - 送花的次数
     */
    public Integer getFlowerCount() {
        return flowerCount;
    }

    /**
     * 设置送花的次数
     *
     * @param flowerCount 送花的次数
     */
    public void setFlowerCount(Integer flowerCount) {
        this.flowerCount = flowerCount;
    }

    /**
     * 获取巴掌的使用次数
     *
     * @return hand_count - 巴掌的使用次数
     */
    public Integer getHandCount() {
        return handCount;
    }

    /**
     * 设置巴掌的使用次数
     *
     * @param handCount 巴掌的使用次数
     */
    public void setHandCount(Integer handCount) {
        this.handCount = handCount;
    }

    /**
     * 获取视频时男性退出使用的次数
     *
     * @return video_boy_leave_count - 视频时男性退出使用的次数
     */
    public Integer getVideoBoyLeaveCount() {
        return videoBoyLeaveCount;
    }

    /**
     * 设置视频时男性退出使用的次数
     *
     * @param videoBoyLeaveCount 视频时男性退出使用的次数
     */
    public void setVideoBoyLeaveCount(Integer videoBoyLeaveCount) {
        this.videoBoyLeaveCount = videoBoyLeaveCount;
    }

    /**
     * 获取视频时男性退出的人数
     *
     * @return video_boy_leave_people - 视频时男性退出的人数
     */
    public Integer getVideoBoyLeavePeople() {
        return videoBoyLeavePeople;
    }

    /**
     * 设置视频时男性退出的人数
     *
     * @param videoBoyLeavePeople 视频时男性退出的人数
     */
    public void setVideoBoyLeavePeople(Integer videoBoyLeavePeople) {
        this.videoBoyLeavePeople = videoBoyLeavePeople;
    }

    /**
     * 获取视频时女性退出使用的次数
     *
     * @return video_girl_leave_count - 视频时女性退出使用的次数
     */
    public Integer getVideoGirlLeaveCount() {
        return videoGirlLeaveCount;
    }

    /**
     * 设置视频时女性退出使用的次数
     *
     * @param videoGirlLeaveCount 视频时女性退出使用的次数
     */
    public void setVideoGirlLeaveCount(Integer videoGirlLeaveCount) {
        this.videoGirlLeaveCount = videoGirlLeaveCount;
    }

    /**
     * 获取视频时女性退出使用的次数
     *
     * @return video_girl_leave_people - 视频时女性退出使用的次数
     */
    public Integer getVideoGirlLeavePeople() {
        return videoGirlLeavePeople;
    }

    /**
     * 设置视频时女性退出使用的次数
     *
     * @param videoGirlLeavePeople 视频时女性退出使用的次数
     */
    public void setVideoGirlLeavePeople(Integer videoGirlLeavePeople) {
        this.videoGirlLeavePeople = videoGirlLeavePeople;
    }

    /**
     * 获取男性退出的时长
     *
     * @return video_boy_leave_time - 男性退出的时长
     */
    public Integer getVideoBoyLeaveTime() {
        return videoBoyLeaveTime;
    }

    /**
     * 设置男性退出的时长
     *
     * @param videoBoyLeaveTime 男性退出的时长
     */
    public void setVideoBoyLeaveTime(Integer videoBoyLeaveTime) {
        this.videoBoyLeaveTime = videoBoyLeaveTime;
    }

    /**
     * 获取女性退出的时长
     *
     * @return video_girl_leave_time - 女性退出的时长
     */
    public Integer getVideoGirlLeaveTime() {
        return videoGirlLeaveTime;
    }

    /**
     * 设置女性退出的时长
     *
     * @param videoGirlLeaveTime 女性退出的时长
     */
    public void setVideoGirlLeaveTime(Integer videoGirlLeaveTime) {
        this.videoGirlLeaveTime = videoGirlLeaveTime;
    }

    /**
     * 获取随机视频匹配的视频通话总时长
     *
     * @return match_video_time - 随机视频匹配的视频通话总时长
     */
    public Integer getMatchVideoTime() {
        return matchVideoTime;
    }

    /**
     * 设置随机视频匹配的视频通话总时长
     *
     * @param matchVideoTime 随机视频匹配的视频通话总时长
     */
    public void setMatchVideoTime(Integer matchVideoTime) {
        this.matchVideoTime = matchVideoTime;
    }

    /**
     * 获取随机匹配的视频总人数
     *
     * @return match_video_people - 随机匹配的视频总人数
     */
    public Integer getMatchVideoPeople() {
        return matchVideoPeople;
    }

    /**
     * 设置随机匹配的视频总人数
     *
     * @param matchVideoPeople 随机匹配的视频总人数
     */
    public void setMatchVideoPeople(Integer matchVideoPeople) {
        this.matchVideoPeople = matchVideoPeople;
    }

    /**
     * 获取双向好友累计
     *
     * @return both_friend_total - 双向好友累计
     */
    public Integer getBothFriendTotal() {
        return bothFriendTotal;
    }

    /**
     * 设置双向好友累计
     *
     * @param bothFriendTotal 双向好友累计
     */
    public void setBothFriendTotal(Integer bothFriendTotal) {
        this.bothFriendTotal = bothFriendTotal;
    }

    /**
     * 获取双向好友新增
     *
     * @return both_friend_day - 双向好友新增
     */
    public Integer getBothFriendDay() {
        return bothFriendDay;
    }

    /**
     * 设置双向好友新增
     *
     * @param bothFriendDay 双向好友新增
     */
    public void setBothFriendDay(Integer bothFriendDay) {
        this.bothFriendDay = bothFriendDay;
    }

    /**
     * 获取匹配时成为好友的总人数
     *
     * @return video_befriend_count - 匹配时成为好友的总人数
     */
    public Integer getVideoBefriendCount() {
        return videoBefriendCount;
    }

    /**
     * 设置匹配时成为好友的总人数
     *
     * @param videoBefriendCount 匹配时成为好友的总人数
     */
    public void setVideoBefriendCount(Integer videoBefriendCount) {
        this.videoBefriendCount = videoBefriendCount;
    }

    /**
     * 获取女性在视频时添加好友的次数
     *
     * @return video_girl_add_friend_count - 女性在视频时添加好友的次数
     */
    public Integer getVideoGirlAddFriendCount() {
        return videoGirlAddFriendCount;
    }

    /**
     * 设置女性在视频时添加好友的次数
     *
     * @param videoGirlAddFriendCount 女性在视频时添加好友的次数
     */
    public void setVideoGirlAddFriendCount(Integer videoGirlAddFriendCount) {
        this.videoGirlAddFriendCount = videoGirlAddFriendCount;
    }

    /**
     * 获取3分钟到时提示继续加好友成功次数
     *
     * @return three_chat_add_friend_count - 3分钟到时提示继续加好友成功次数
     */
    public Integer getThreeChatAddFriendCount() {
        return threeChatAddFriendCount;
    }

    /**
     * 设置3分钟到时提示继续加好友成功次数
     *
     * @param threeChatAddFriendCount 3分钟到时提示继续加好友成功次数
     */
    public void setThreeChatAddFriendCount(Integer threeChatAddFriendCount) {
        this.threeChatAddFriendCount = threeChatAddFriendCount;
    }

    /**
     * 获取3分钟到时提示继续 男性离开次数
     *
     * @return three_chat_boy_leave_count - 3分钟到时提示继续 男性离开次数
     */
    public Integer getThreeChatBoyLeaveCount() {
        return threeChatBoyLeaveCount;
    }

    /**
     * 设置3分钟到时提示继续 男性离开次数
     *
     * @param threeChatBoyLeaveCount 3分钟到时提示继续 男性离开次数
     */
    public void setThreeChatBoyLeaveCount(Integer threeChatBoyLeaveCount) {
        this.threeChatBoyLeaveCount = threeChatBoyLeaveCount;
    }

    /**
     * 获取3分钟到时提示继续女性离开次数
     *
     * @return three_chat_girl_leave_count - 3分钟到时提示继续女性离开次数
     */
    public Integer getThreeChatGirlLeaveCount() {
        return threeChatGirlLeaveCount;
    }

    /**
     * 设置3分钟到时提示继续女性离开次数
     *
     * @param threeChatGirlLeaveCount 3分钟到时提示继续女性离开次数
     */
    public void setThreeChatGirlLeaveCount(Integer threeChatGirlLeaveCount) {
        this.threeChatGirlLeaveCount = threeChatGirlLeaveCount;
    }

    /**
     * 获取3分钟以内聊天平均时长
     *
     * @return three_chat_avg_time - 3分钟以内聊天平均时长
     */
    public Integer getThreeChatAvgTime() {
        return threeChatAvgTime;
    }

    /**
     * 设置3分钟以内聊天平均时长
     *
     * @param threeChatAvgTime 3分钟以内聊天平均时长
     */
    public void setThreeChatAvgTime(Integer threeChatAvgTime) {
        this.threeChatAvgTime = threeChatAvgTime;
    }

    /**
     * 获取聊天到达3分钟的次数
     *
     * @return three_chat_count - 聊天到达3分钟的次数
     */
    public Integer getThreeChatCount() {
        return threeChatCount;
    }

    /**
     * 设置聊天到达3分钟的次数
     *
     * @param threeChatCount 聊天到达3分钟的次数
     */
    public void setThreeChatCount(Integer threeChatCount) {
        this.threeChatCount = threeChatCount;
    }

    /**
     * 获取在匹配列表聊天点击次数
     *
     * @return match_page_chat_click_count - 在匹配列表聊天点击次数
     */
    public Integer getMatchPageChatClickCount() {
        return matchPageChatClickCount;
    }

    /**
     * 设置在匹配列表聊天点击次数
     *
     * @param matchPageChatClickCount 在匹配列表聊天点击次数
     */
    public void setMatchPageChatClickCount(Integer matchPageChatClickCount) {
        this.matchPageChatClickCount = matchPageChatClickCount;
    }

    /**
     * 获取匹配列表男性付费人数
     *
     * @return boy_pay_people - 匹配列表男性付费人数
     */
    public Integer getBoyPayPeople() {
        return boyPayPeople;
    }

    /**
     * 设置匹配列表男性付费人数
     *
     * @param boyPayPeople 匹配列表男性付费人数
     */
    public void setBoyPayPeople(Integer boyPayPeople) {
        this.boyPayPeople = boyPayPeople;
    }

    /**
     * 获取匹配列表男性付费次数
     *
     * @return boy_pay_count - 匹配列表男性付费次数
     */
    public Integer getBoyPayCount() {
        return boyPayCount;
    }

    /**
     * 设置匹配列表男性付费次数
     *
     * @param boyPayCount 匹配列表男性付费次数
     */
    public void setBoyPayCount(Integer boyPayCount) {
        this.boyPayCount = boyPayCount;
    }

    /**
     * 获取匹配列表女性付费人数
     *
     * @return girl_pay_people - 匹配列表女性付费人数
     */
    public Integer getGirlPayPeople() {
        return girlPayPeople;
    }

    /**
     * 设置匹配列表女性付费人数
     *
     * @param girlPayPeople 匹配列表女性付费人数
     */
    public void setGirlPayPeople(Integer girlPayPeople) {
        this.girlPayPeople = girlPayPeople;
    }

    /**
     * 获取匹配列表女性付费次数
     *
     * @return girl_pay_count - 匹配列表女性付费次数
     */
    public Integer getGirlPayCount() {
        return girlPayCount;
    }

    /**
     * 设置匹配列表女性付费次数
     *
     * @param girlPayCount 匹配列表女性付费次数
     */
    public void setGirlPayCount(Integer girlPayCount) {
        this.girlPayCount = girlPayCount;
    }

    /**
     * 获取在匹配列表付费的人数
     *
     * @return match_page_pay_people - 在匹配列表付费的人数
     */
    public Integer getMatchPagePayPeople() {
        return matchPagePayPeople;
    }

    /**
     * 设置在匹配列表付费的人数
     *
     * @param matchPagePayPeople 在匹配列表付费的人数
     */
    public void setMatchPagePayPeople(Integer matchPagePayPeople) {
        this.matchPagePayPeople = matchPagePayPeople;
    }

    /**
     * 获取匹配列表头像点击次数
     *
     * @return match_page_head_click_count - 匹配列表头像点击次数
     */
    public Integer getMatchPageHeadClickCount() {
        return matchPageHeadClickCount;
    }

    /**
     * 设置匹配列表头像点击次数
     *
     * @param matchPageHeadClickCount 匹配列表头像点击次数
     */
    public void setMatchPageHeadClickCount(Integer matchPageHeadClickCount) {
        this.matchPageHeadClickCount = matchPageHeadClickCount;
    }

    /**
     * 获取匹配列表聊天付费次数
     *
     * @return match_page_pay_count - 匹配列表聊天付费次数
     */
    public Integer getMatchPagePayCount() {
        return matchPagePayCount;
    }

    /**
     * 设置匹配列表聊天付费次数
     *
     * @param matchPagePayCount 匹配列表聊天付费次数
     */
    public void setMatchPagePayCount(Integer matchPagePayCount) {
        this.matchPagePayCount = matchPagePayCount;
    }

    /**
     * 获取聊天页面会话的点击人数
     *
     * @return chat_page_people - 聊天页面会话的点击人数
     */
    public Integer getChatPagePeople() {
        return chatPagePeople;
    }

    /**
     * 设置聊天页面会话的点击人数
     *
     * @param chatPagePeople 聊天页面会话的点击人数
     */
    public void setChatPagePeople(Integer chatPagePeople) {
        this.chatPagePeople = chatPagePeople;
    }

    /**
     * 获取聊天页面会话的点击次数
     *
     * @return chat_page_count - 聊天页面会话的点击次数
     */
    public Integer getChatPageCount() {
        return chatPageCount;
    }

    /**
     * 设置聊天页面会话的点击次数
     *
     * @param chatPageCount 聊天页面会话的点击次数
     */
    public void setChatPageCount(Integer chatPageCount) {
        this.chatPageCount = chatPageCount;
    }

    /**
     * 获取个人主页图片编辑次数
     *
     * @return image_modify_count - 个人主页图片编辑次数
     */
    public Integer getImageModifyCount() {
        return imageModifyCount;
    }

    /**
     * 设置个人主页图片编辑次数
     *
     * @param imageModifyCount 个人主页图片编辑次数
     */
    public void setImageModifyCount(Integer imageModifyCount) {
        this.imageModifyCount = imageModifyCount;
    }

    /**
     * 获取应用的分享次数
     *
     * @return share_num - 应用的分享次数
     */
    public Integer getShareNum() {
        return shareNum;
    }

    /**
     * 设置应用的分享次数
     *
     * @param shareNum 应用的分享次数
     */
    public void setShareNum(Integer shareNum) {
        this.shareNum = shareNum;
    }

    /**
     * 获取每日视频通话总时长
     *
     * @return video_time - 每日视频通话总时长
     */
    public Integer getVideoTime() {
        return videoTime;
    }

    /**
     * 设置每日视频通话总时长
     *
     * @param videoTime 每日视频通话总时长
     */
    public void setVideoTime(Integer videoTime) {
        this.videoTime = videoTime;
    }

    /**
     * 获取每日视频通话的总人数
     *
     * @return video_people - 每日视频通话的总人数
     */
    public Integer getVideoPeople() {
        return videoPeople;
    }

    /**
     * 设置每日视频通话的总人数
     *
     * @param videoPeople 每日视频通话的总人数
     */
    public void setVideoPeople(Integer videoPeople) {
        this.videoPeople = videoPeople;
    }

    /**
     * 获取每日好友视频通话的总时长
     *
     * @return friend_video_time - 每日好友视频通话的总时长
     */
    public Integer getFriendVideoTime() {
        return friendVideoTime;
    }

    /**
     * 设置每日好友视频通话的总时长
     *
     * @param friendVideoTime 每日好友视频通话的总时长
     */
    public void setFriendVideoTime(Integer friendVideoTime) {
        this.friendVideoTime = friendVideoTime;
    }

    /**
     * 获取每日好友视频通话人数
     *
     * @return friend_video_people - 每日好友视频通话人数
     */
    public Integer getFriendVideoPeople() {
        return friendVideoPeople;
    }

    /**
     * 设置每日好友视频通话人数
     *
     * @param friendVideoPeople 每日好友视频通话人数
     */
    public void setFriendVideoPeople(Integer friendVideoPeople) {
        this.friendVideoPeople = friendVideoPeople;
    }

    /**
     * 获取每日好友视频通话次数
     *
     * @return friend_video_count - 每日好友视频通话次数
     */
    public Integer getFriendVideoCount() {
        return friendVideoCount;
    }

    /**
     * 设置每日好友视频通话次数
     *
     * @param friendVideoCount 每日好友视频通话次数
     */
    public void setFriendVideoCount(Integer friendVideoCount) {
        this.friendVideoCount = friendVideoCount;
    }

    /**
     * 获取女女通话次数
     *
     * @return girl_girl_video_count - 女女通话次数
     */
    public Integer getGirlGirlVideoCount() {
        return girlGirlVideoCount;
    }

    /**
     * 设置女女通话次数
     *
     * @param girlGirlVideoCount 女女通话次数
     */
    public void setGirlGirlVideoCount(Integer girlGirlVideoCount) {
        this.girlGirlVideoCount = girlGirlVideoCount;
    }

    /**
     * 获取男女通话次数
     *
     * @return boy_girl_video_count - 男女通话次数
     */
    public Integer getBoyGirlVideoCount() {
        return boyGirlVideoCount;
    }

    /**
     * 设置男女通话次数
     *
     * @param boyGirlVideoCount 男女通话次数
     */
    public void setBoyGirlVideoCount(Integer boyGirlVideoCount) {
        this.boyGirlVideoCount = boyGirlVideoCount;
    }

    /**
     * 获取男男通话次数
     *
     * @return boy_boy_video_count - 男男通话次数
     */
    public Integer getBoyBoyVideoCount() {
        return boyBoyVideoCount;
    }

    /**
     * 设置男男通话次数
     *
     * @param boyBoyVideoCount 男男通话次数
     */
    public void setBoyBoyVideoCount(Integer boyBoyVideoCount) {
        this.boyBoyVideoCount = boyBoyVideoCount;
    }

    /**
     * 获取女性匹配消耗金币总数
     *
     * @return girl_match_gold - 女性匹配消耗金币总数
     */
    public Integer getGirlMatchGold() {
        return girlMatchGold;
    }

    /**
     * 设置女性匹配消耗金币总数
     *
     * @param girlMatchGold 女性匹配消耗金币总数
     */
    public void setGirlMatchGold(Integer girlMatchGold) {
        this.girlMatchGold = girlMatchGold;
    }

    /**
     * 获取男性匹配消耗金币总数
     *
     * @return boy_match_gold - 男性匹配消耗金币总数
     */
    public Integer getBoyMatchGold() {
        return boyMatchGold;
    }

    /**
     * 设置男性匹配消耗金币总数
     *
     * @param boyMatchGold 男性匹配消耗金币总数
     */
    public void setBoyMatchGold(Integer boyMatchGold) {
        this.boyMatchGold = boyMatchGold;
    }

    /**
     * 获取android匹配消耗金币总数
     *
     * @return android_match_gold - android匹配消耗金币总数
     */
    public Integer getAndroidMatchGold() {
        return androidMatchGold;
    }

    /**
     * 设置android匹配消耗金币总数
     *
     * @param androidMatchGold android匹配消耗金币总数
     */
    public void setAndroidMatchGold(Integer androidMatchGold) {
        this.androidMatchGold = androidMatchGold;
    }

    /**
     * 获取ios匹配消耗金币总数
     *
     * @return ios_match_gold - ios匹配消耗金币总数
     */
    public Integer getIosMatchGold() {
        return iosMatchGold;
    }

    /**
     * 设置ios匹配消耗金币总数
     *
     * @param iosMatchGold ios匹配消耗金币总数
     */
    public void setIosMatchGold(Integer iosMatchGold) {
        this.iosMatchGold = iosMatchGold;
    }

    /**
     * 获取匹配消耗金币总数
     *
     * @return match_gold - 匹配消耗金币总数
     */
    public Integer getMatchGold() {
        return matchGold;
    }

    /**
     * 设置匹配消耗金币总数
     *
     * @param matchGold 匹配消耗金币总数
     */
    public void setMatchGold(Integer matchGold) {
        this.matchGold = matchGold;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", womanClick=").append(womanClick);
        sb.append(", boyClick=").append(boyClick);
        sb.append(", bothClick=").append(bothClick);
        sb.append(", matchSkipCount=").append(matchSkipCount);
        sb.append(", kissBoyCount=").append(kissBoyCount);
        sb.append(", kissGirlCount=").append(kissGirlCount);
        sb.append(", flowerCount=").append(flowerCount);
        sb.append(", handCount=").append(handCount);
        sb.append(", videoBoyLeaveCount=").append(videoBoyLeaveCount);
        sb.append(", videoBoyLeavePeople=").append(videoBoyLeavePeople);
        sb.append(", videoGirlLeaveCount=").append(videoGirlLeaveCount);
        sb.append(", videoGirlLeavePeople=").append(videoGirlLeavePeople);
        sb.append(", videoBoyLeaveTime=").append(videoBoyLeaveTime);
        sb.append(", videoGirlLeaveTime=").append(videoGirlLeaveTime);
        sb.append(", matchVideoTime=").append(matchVideoTime);
        sb.append(", matchVideoPeople=").append(matchVideoPeople);
        sb.append(", bothFriendTotal=").append(bothFriendTotal);
        sb.append(", bothFriendDay=").append(bothFriendDay);
        sb.append(", videoBefriendCount=").append(videoBefriendCount);
        sb.append(", videoGirlAddFriendCount=").append(videoGirlAddFriendCount);
        sb.append(", threeChatAddFriendCount=").append(threeChatAddFriendCount);
        sb.append(", threeChatBoyLeaveCount=").append(threeChatBoyLeaveCount);
        sb.append(", threeChatGirlLeaveCount=").append(threeChatGirlLeaveCount);
        sb.append(", threeChatAvgTime=").append(threeChatAvgTime);
        sb.append(", threeChatCount=").append(threeChatCount);
        sb.append(", matchPageChatClickCount=").append(matchPageChatClickCount);
        sb.append(", boyPayPeople=").append(boyPayPeople);
        sb.append(", boyPayCount=").append(boyPayCount);
        sb.append(", girlPayPeople=").append(girlPayPeople);
        sb.append(", girlPayCount=").append(girlPayCount);
        sb.append(", matchPagePayPeople=").append(matchPagePayPeople);
        sb.append(", matchPageHeadClickCount=").append(matchPageHeadClickCount);
        sb.append(", matchPagePayCount=").append(matchPagePayCount);
        sb.append(", chatPagePeople=").append(chatPagePeople);
        sb.append(", chatPageCount=").append(chatPageCount);
        sb.append(", imageModifyCount=").append(imageModifyCount);
        sb.append(", shareNum=").append(shareNum);
        sb.append(", videoTime=").append(videoTime);
        sb.append(", videoPeople=").append(videoPeople);
        sb.append(", friendVideoTime=").append(friendVideoTime);
        sb.append(", friendVideoPeople=").append(friendVideoPeople);
        sb.append(", friendVideoCount=").append(friendVideoCount);
        sb.append(", girlGirlVideoCount=").append(girlGirlVideoCount);
        sb.append(", boyGirlVideoCount=").append(boyGirlVideoCount);
        sb.append(", boyBoyVideoCount=").append(boyBoyVideoCount);
        sb.append(", girlMatchGold=").append(girlMatchGold);
        sb.append(", boyMatchGold=").append(boyMatchGold);
        sb.append(", androidMatchGold=").append(androidMatchGold);
        sb.append(", iosMatchGold=").append(iosMatchGold);
        sb.append(", matchGold=").append(matchGold);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}