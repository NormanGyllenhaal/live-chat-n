package com.rcplatform.livechat.common.enums;

/**
 * Created by yang peng on 2016/11/2.
 */
public enum  ChargeRecordModeEnum implements IEnum {

    FREE(1,"免费"),


    PAY(2,"付费");


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    ChargeRecordModeEnum(int key, String desc) {
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
