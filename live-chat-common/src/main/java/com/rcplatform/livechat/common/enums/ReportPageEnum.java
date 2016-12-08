package com.rcplatform.livechat.common.enums;

/**
 * Created by yang peng on 2016/9/12.
 */
public enum ReportPageEnum implements  IEnum{

    VIDEO(1,"视频页面"),

    SHOW(2,"个人主页");


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    ReportPageEnum(int key, String desc) {
        this.key = key;
        this.desc = desc;
    }

    @Override
    public int key() {
        return key;
    }

    @Override
    public String desc() {
        return desc;
    }
}
