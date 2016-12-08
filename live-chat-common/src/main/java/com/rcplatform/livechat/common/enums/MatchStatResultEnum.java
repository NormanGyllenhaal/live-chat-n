package com.rcplatform.livechat.common.enums;

/**
 * Created by yang peng on 2016/10/17.
 */
public enum MatchStatResultEnum implements IEnum {

    SUCCESS(1,"成功"),

    FAIL(2,"失败");


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    MatchStatResultEnum(int key, String desc) {
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
