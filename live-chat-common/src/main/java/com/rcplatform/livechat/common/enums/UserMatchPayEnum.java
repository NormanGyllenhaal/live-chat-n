package com.rcplatform.livechat.common.enums;

/**
 * Created by yang peng on 2016/11/3.
 */
public enum UserMatchPayEnum implements IEnum {

    PAY(1,"付费的"),


    NO_PAY(2,"没有付费的");



    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    UserMatchPayEnum(int key, String desc) {
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
