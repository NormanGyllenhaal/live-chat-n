package com.rcplatform.livechat.common.enums;

/**
 * Created by yang peng on 2016/9/8.
 */
public enum PushTypeEnum  implements IEnum {

    ALL(1,"查找"),

    BOY(2,"男性"),

    GIRL(3,"女性"),

    TEXT(4,"筛选");


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    PushTypeEnum(int key, String desc) {
        this.key = key;
        this.desc = desc;
    }

    public static PushTypeEnum valueOf(Integer i){
        switch (i){
            case 1:
                return ALL;
            case 2:
                return BOY;
            case 3:
                return GIRL;
            case 4:
                return TEXT;
            default:
                return null;

        }
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
