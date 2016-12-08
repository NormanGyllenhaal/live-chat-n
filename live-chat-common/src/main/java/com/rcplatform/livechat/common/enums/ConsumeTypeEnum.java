package com.rcplatform.livechat.common.enums;

/**
 * Created by yang peng on 2016/8/16.
 */
public enum  ConsumeTypeEnum implements IEnum {

    INTERACTION(1,"送花"),

    ADDFRIEND(2,"添加朋友"),

    MATCH_GENDER(3,"性别匹配");


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    ConsumeTypeEnum(int key, String desc) {
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
