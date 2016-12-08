package com.rcplatform.livechat.common.enums;

/**
 * Created by yang peng on 2016/10/12.
 */
public enum  VideoRecordIsFriendEnum implements IEnum {

    NO(1,"非好友"),

    YES(2,"好友");



    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    VideoRecordIsFriendEnum(int key, String desc) {
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
