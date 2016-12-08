package com.rcplatform.livechat.common.enums;

/**
 * Created by yang peng on 2016/8/5.
 */
public enum FriendTypeEnum implements IEnum {

    ONEWAY(1,"单向"),

    BOTHWAY(2,"双向"),

    YOU_FRIEND(3,"对方和我是朋友");


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    FriendTypeEnum(int key, String desc) {
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
