package com.rcplatform.livechat.common.enums;

/**
 * Created by yang peng on 2016/8/3.
 */
public enum ConsumeIdEnum implements IEnum {

    FLOWER(1,"送花"),

    HANDLE(2,"巴掌"),

    KISS(3,"kiss"),

    ADDFRIEND(4,"添加朋友");


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    ConsumeIdEnum(int key, String desc) {
        this.key = key;
        this.desc = desc;
    }


    public static ConsumeIdEnum valueOf(Integer i){
        switch (i){
            case 1:
                return FLOWER;
            case 2:
                return HANDLE;
            case 3:
                return KISS;
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
