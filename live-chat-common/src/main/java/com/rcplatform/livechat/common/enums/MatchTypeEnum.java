package com.rcplatform.livechat.common.enums;

/**
 * Created by yang peng on 2016/8/4.
 */
public enum MatchTypeEnum implements IEnum {

    SEARCH(1,"查找"),

    CUT(2,"切换");


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    MatchTypeEnum(int key, String desc) {
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
