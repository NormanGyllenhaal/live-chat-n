package com.rcplatform.livechat.common.enums;

/**
 * Created by yang peng on 2016/9/12.
 */
public enum ReportResultEnum implements IEnum {

    ACCEPT(1,"接受举报"),

    REFUSE(2,"拒绝举报");


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    ReportResultEnum(int key, String desc) {
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
