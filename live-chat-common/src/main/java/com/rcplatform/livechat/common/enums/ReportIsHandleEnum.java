package com.rcplatform.livechat.common.enums;

/**
 * Created by yang peng on 2016/8/3.
 */
public enum ReportIsHandleEnum implements IEnum {

    NOHANDLE(1,"未处理"),

    HANDLE(2,"已处理");


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    ReportIsHandleEnum(int key, String desc) {
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
