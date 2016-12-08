package com.rcplatform.livechat.common.enums;


/**
 * Created by yang peng on 2016/8/16.
 */

public enum BaseInfoTypeEnum implements IEnum {


    ALL(0,"送花"),


    COUNTRY(1,"国家"),


    LANGUAGE(2,"语言"),


    CONSUME(3,"消费品"),


    FREE_COMMODITY(4,"免费商品");


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    BaseInfoTypeEnum(int key, String desc) {
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
