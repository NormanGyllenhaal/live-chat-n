package com.rcplatform.livechat.common.enums;

/**
 * Created by yang peng on 2016/8/23.
 */
public enum LocationOpenEnum implements IEnum {

    OPEN(1,"打开"),

    CLOSE(2,"关闭");


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    LocationOpenEnum(int key, String desc) {
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
