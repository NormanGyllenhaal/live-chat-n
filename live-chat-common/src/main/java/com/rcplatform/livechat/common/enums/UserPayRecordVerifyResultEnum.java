package com.rcplatform.livechat.common.enums;

/**
 * Created by yang peng on 2016/8/8.
 */
public enum UserPayRecordVerifyResultEnum implements IEnum {

    SUCCESS(1,"success"),

    FAIL(2,"fali");


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    UserPayRecordVerifyResultEnum(int key, String desc) {
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
