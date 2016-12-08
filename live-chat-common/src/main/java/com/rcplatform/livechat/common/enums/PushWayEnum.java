package com.rcplatform.livechat.common.enums;

/**
 * Created by yang peng on 2016/11/10.
 */
public enum PushWayEnum implements IEnum {


    GOLD(1,"金币"),

    MESSAGE(2,"消息");


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    PushWayEnum(int key, String desc) {
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
