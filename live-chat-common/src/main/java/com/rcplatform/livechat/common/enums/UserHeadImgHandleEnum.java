package com.rcplatform.livechat.common.enums;

/**
 * Created by yang peng on 2016/9/12.
 */
public enum UserHeadImgHandleEnum implements IEnum {


    HANDLE(1,"已处理"),

    UNHANDLE(2,"未处理");


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    UserHeadImgHandleEnum(int key, String desc) {
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
