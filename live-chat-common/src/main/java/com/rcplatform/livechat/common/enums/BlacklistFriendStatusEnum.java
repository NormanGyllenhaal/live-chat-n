package com.rcplatform.livechat.common.enums;

/**
 * Created by Administrator on 2016/8/7.
 */
public enum BlacklistFriendStatusEnum implements IEnum {

    FRIEND(1,"是朋友关系"),


    NO_FRIEND(2,"非朋友关系");


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    BlacklistFriendStatusEnum(int key, String desc) {
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
