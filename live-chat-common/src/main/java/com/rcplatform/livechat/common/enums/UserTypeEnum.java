package com.rcplatform.livechat.common.enums;

/**
 * Created by yang peng on 2016/8/2.
 */
public enum UserTypeEnum implements IEnum {

    EMAIL(1,"邮箱"),

    FACEBOOK(2,"facebook");


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    UserTypeEnum(int key, String desc) {
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
