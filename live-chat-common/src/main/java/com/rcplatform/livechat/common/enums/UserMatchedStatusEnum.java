package com.rcplatform.livechat.common.enums;

/**
 * Created by yang peng on 2016/8/5.
 */
public enum UserMatchedStatusEnum implements IEnum {


    NORMA(1,"正常"),

    DELETE(2,"已删除");


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    UserMatchedStatusEnum(int key, String desc) {
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
