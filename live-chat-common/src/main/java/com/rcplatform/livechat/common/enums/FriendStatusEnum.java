package com.rcplatform.livechat.common.enums;

/**
 * Created by yang peng on 2016/9/13.
 */
public enum FriendStatusEnum implements IEnum {

    NORMAL(1,"正常"),

    BLACKLIST(2,"黑名单");


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    FriendStatusEnum(int key, String desc) {
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
