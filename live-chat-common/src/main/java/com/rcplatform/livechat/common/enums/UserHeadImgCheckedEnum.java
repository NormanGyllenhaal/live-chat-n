package com.rcplatform.livechat.common.enums;

/**
 * Created by yang peng on 2016/9/12.
 */
public enum UserHeadImgCheckedEnum implements IEnum {

    PASS(1,"通过"),

    UNPASS(2,"没有通过");


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    UserHeadImgCheckedEnum(int key, String desc) {
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
