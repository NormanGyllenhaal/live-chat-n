package com.rcplatform.livechat.common.enums;

/**
 * Created by yang peng on 2016/8/26.
 */
public enum HeadImgTypeEnum implements IEnum{

    HEAD_IMG(1,"头像"),

    BACKGROUND(2,"背景图片");



    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    HeadImgTypeEnum(int key, String desc) {
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
