package com.rcplatform.livechat.common.enums;

/**
 * Created by yang peng on 2016/9/8.
 */
public enum PlatformTypeEnum implements IEnum {


    IOS(1,"ios"),

    ANDROID(2,"android");


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    PlatformTypeEnum(int key, String desc) {
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
