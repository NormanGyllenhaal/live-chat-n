package com.rcplatform.livechat.common.enums;

/**
 * Created by admin on 2016/7/14.
 */
public enum StatEnum implements IEnum {

    STAT_SUCCESS(10000,"正常返回"),
    STAT_ARGE_EXCEPTION(10001,"参数异常"),
    STAT_SERVER_EXCEPTION(10002,"服务异常"),
    STAT_ERROR(10003,"服务器错误"),
    STAT_EMPTY(10004,"无返回数据"),
    STAT_EMAIL_HAS(10005,"用户注册email重复"),
    PASSWORD_ERROR(10006,"用户名或密码错误"),
    USER_NOLOGIN(10008,"用户未登录"),
    USER_LOGIN(10009,"用户已经登录"),
    USER_MATCHED(10010,"用户匹配中"),
    TOKEN_ERROR(10011,"token错误"),
    EMAIL_NOFOUND(10012,"邮箱不存在"),
    USER_NOFOUND(10013,"没有找到匹配用户"),
    GOLD_NOT_ENOUGH(10014,"金币不足"),
    NOT_FRIEND(10015,"不是朋友关系"),
    PAY_ERROR(10016,"支付失败"),
    FILE_TYPE_ERROR(10017,"非法的文件类型"),
    FILE_SIZE_ERROR(10018,"文件大小不得超过1M"),
    THREE_PARTY_USER(10019,"你是第三方用户，请直接登录"),
    EMAIL_VERIFY_ERROR(10020,"非法的url参数"),
    VERIFY_TIME_OUT(10021,"你的验证已失效，请重新发送"),
    PASSWORD_MODIFY_ERROR(10021,"用户密码修改失败"),
    USER_REPORT(10022,"你已被举报"),
    USER_OTHER_DEVICE(10023,"用户已在其他设备上登录"),
    USER_IMG_DELETE(10024,"你的头像审核未通过，已被删除"),
    AGE_OVERFLOW(10025,"你的年龄小于17岁"),
    EVALUATE_ALREADY(10026,"你已经评价过了"),
    NO_MORE_DEVICE(10027,"该设备注册账号已超过限制");





    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;


    StatEnum( int key, String desc ) {
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
