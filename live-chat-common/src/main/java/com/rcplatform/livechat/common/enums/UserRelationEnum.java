package com.rcplatform.livechat.common.enums;

/**
 * Created by yang peng on 2016/8/24.
 */
public enum UserRelationEnum implements IEnum {



    MY_FRIEND(1,"我和你是朋友"),

    BOTH_FRIEND(2,"双向好友"),

    YOU_FRIEND(3,"你和我是朋友"),

    NOT_FRIEND(4,"不是朋友");


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    UserRelationEnum(int key, String desc) {
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
