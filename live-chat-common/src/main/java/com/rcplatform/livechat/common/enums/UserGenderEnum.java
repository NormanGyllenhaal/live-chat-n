package com.rcplatform.livechat.common.enums;

/**
 * Created by yang peng on 2016/8/3.
 */
public enum UserGenderEnum implements IEnum {

    ALL(0,"所有性别"),

    BOY(1,"男"),

    GIRL(2,"女");


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    UserGenderEnum(int key, String desc) {
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
