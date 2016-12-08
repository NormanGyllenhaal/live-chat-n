package com.rcplatform.livechat.common.constant;

/**
 * 标题、简要说明. <br>
 * 类详细说明.
 * <p>
 * Copyright: Menue,Inc Copyright (c) 2016年3月7日 下午5:53:42
 * <p>
 * Team:Menue Beijing
 * <p>
 *
 * @author yuan.baohua@menue.com.cn
 * @version 1.0.0
 */
public class RedisKeyConstant {

    /**
     * 应用名称
     */
    public static final String APP_NAME = "videochat";

    /**
     * redis key
     */
    public static final String USER = "user";

    /**
     * 保存token 的key
     */
    public static final String TOKEN = "token";


    /**
     * 用户性别key
     */
    public static final String GENDER = "gender";


    /**
     * 用户朋友key set
     */
    public static final String USERFRIEND = "userfriend";

    /**
     * 用户黑名单key  set
     */
    public static final String BLACKLIST = "blacklist";

    /**
     * 临时存储key  set
     */
    public static final String TEMP = "temp";


    /**
     * 用户匹配关系生存时间 key
     */
    public static final String USERSURVIVAL = "usersurvival";


    /**
     * 用户举报集合key
     */
    public static final String USERREPORT = "userreport";

    /**
     * 系统举报key
     */
    public static final String REPORT = "report";

    /**
     * 上次匹配的用户key
     */
    public static final String LASTUSER = "lastuser";

    /**
     * 国家key
     */
    public static final String COUNTRY = "country";

    /**
     * 地理位置
     */
    public static final String GEO="geo";


    /**
     * 临时地理位置存储
     */
    public static final String TEMPGEO ="tempgeo";


    /**
     * 临时并集key
     */
    public static final String TEMPSINTER="tempsinter";


    /**
     * 用户地理位置
     */
    public static final String USER_LOCATION = "userlocation";


    /**
     * 用户被举报时间 zset key
     */
    public static final String REPORT_TIME = "reporttime";


    /**
     * 管理员账号
     */
    public static final String ADMIN = "admin";


    /**
     * 用户生存时间key zset
     */
    public  static final String USER_LIVE_TIME ="userlivetime";



    /**
     * 用户id设备key hash
     */
    public static final String USER_DEVICE = "userdevice";


    /**
     * 匹配record
     */
    public static final String MATCH_STAT = "matchstat";


    /**
     * 用户主页查看次数 zset
     */
    public static final String USER_PROFILE = "userprofile";


    /**
     * 用户主页男性查看次数
     */
    public static final String USER_PROFILE_BOY ="userprofileboy";


    /**
     * 用户主页女性查看次数
     */
    public static final String USER_PROFILE_GIRL="userprofilegirl";


    /**
     * 用户登录时间 zset
     */
    public static final String USER_LOGIN_TIME = "userlogintime";


    /**
     * 用户匹配时上一次屏蔽的人集合
     */
    public static final String USER_LAST = "userlast";


    /**
     * 用户的关系key
     */
    public static final String USER_RELATION = "userrelation";


    /**
     * 用户性别选择条件key
     */
    public static final String USER_GENDER_CHOICE = "usergenderchoice";


    /**
     * 用户付费key
     */
    public static final String USER_PAY = "userpay";


    /**
     * 用户的视频时间
     */
    public static final String VIDEO_TIME = "videotime";


    /**
     * 用户匹配次数计数
     */
    public  static final String USER_MATCH_COUNT = "usermatchcount";


    /**
     * 用户next两次的人
     */
    public  static final String USER_NEXT ="usernext";


    /**
     * 用户跳过的人
     */
    public  static final String USER_SKIP = "userskip";

}
