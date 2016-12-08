package com.rcplatform.livechat.common.enums;

/**
 * Created by yang peng on 2016/10/25.
 */
public enum UserRecordTypeEnum implements IEnum {


    SIGN_UP(1,"，注册"),


    LOGIN(2,"登录");


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    UserRecordTypeEnum(int key, String desc) {
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
