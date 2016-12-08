package com.rcplatform.livechat.common.enums;

/**
 * Created by yang peng on 2016/8/26.
 */
public enum AddFriendWhenEnum implements IEnum {

    MATCH_ADD(1,"匹配时添加"),

    PAYADD_ADD(2,"付费添加");


    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    AddFriendWhenEnum(int key, String desc) {
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
