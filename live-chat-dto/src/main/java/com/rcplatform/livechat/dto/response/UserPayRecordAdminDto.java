package com.rcplatform.livechat.dto.response;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by yang peng on 2016/9/29.
 */

public class UserPayRecordAdminDto {


    @Id
    private Integer id;

    /**
     * 用户id
     */

    private Integer userId;


    /**
     * 用户名
     */

    private String userName;


    /**
     * 性别
     */

    private Integer gender;


    /**
     * 生日
     */

    private Date birthday;


    /**
     * 商品名称
     */

    private String commodityName;

    /**
     * 购买的商品id
     */

    private Integer commodityId;

    /**
     * 购买的金币数量
     */

    private BigDecimal goldNum;

    /**
     * 购买的所花的钱数
     */

    private BigDecimal money;


    /**
     * 验证支付的结果 1 成功 2 失败
     */

    private Integer verifyResult;

    /**
     * 交易设备的id
     */

    private String userDeviceId;

    /**
     * 支付的平台 1 google 支付 2. 苹果内购支付
     */

    private Integer payPlatform;

    /**
     * 交易创建时间
     */

    private Date createTime;

    /**
     * 交易的验证时间点
     */

    private Date verifyTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public BigDecimal getGoldNum() {
        return goldNum;
    }

    public void setGoldNum(BigDecimal goldNum) {
        this.goldNum = goldNum;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Integer getVerifyResult() {
        return verifyResult;
    }

    public void setVerifyResult(Integer verifyResult) {
        this.verifyResult = verifyResult;
    }

    public String getUserDeviceId() {
        return userDeviceId;
    }

    public void setUserDeviceId(String userDeviceId) {
        this.userDeviceId = userDeviceId;
    }

    public Integer getPayPlatform() {
        return payPlatform;
    }

    public void setPayPlatform(Integer payPlatform) {
        this.payPlatform = payPlatform;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getVerifyTime() {
        return verifyTime;
    }

    public void setVerifyTime(Date verifyTime) {
        this.verifyTime = verifyTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserPayRecordAdminDto{");
        sb.append("id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", gender=").append(gender);
        sb.append(", birthday=").append(birthday);
        sb.append(", commodityName='").append(commodityName).append('\'');
        sb.append(", commodityId=").append(commodityId);
        sb.append(", goldNum=").append(goldNum);
        sb.append(", money=").append(money);
        sb.append(", verifyResult=").append(verifyResult);
        sb.append(", userDeviceId='").append(userDeviceId).append('\'');
        sb.append(", payPlatform=").append(payPlatform);
        sb.append(", createTime=").append(createTime);
        sb.append(", verifyTime=").append(verifyTime);
        sb.append('}');
        return sb.toString();
    }
}
