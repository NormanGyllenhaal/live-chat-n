package com.rcplatform.livechat.common.enums;

/**
 * Created by yang peng on 2016/9/8.
 */
public enum IsPushEnum implements IEnum {

    PUSH(1,"已经推送"),

    NO_PUSH(2,"，没有推送");


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    IsPushEnum(int key, String desc) {
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
