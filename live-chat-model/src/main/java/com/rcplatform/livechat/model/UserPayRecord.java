package com.rcplatform.livechat.model;



import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "rc_user_pay_record")

public class UserPayRecord implements Serializable {

    public UserPayRecord() {
    }

    public UserPayRecord(Integer userId, Integer commodityId, BigDecimal goldNum, BigDecimal money, String receiptData, String rechargeId, Integer verifyResult, String userDeviceId, Integer payPlatform, Date createTime, Date verifyTime) {
        this.userId = userId;
        this.commodityId = commodityId;
        this.goldNum = goldNum;
        this.money = money;
        this.receiptData = receiptData;
        this.rechargeId = rechargeId;
        this.verifyResult = verifyResult;
        this.userDeviceId = userDeviceId;
        this.payPlatform = payPlatform;
        this.createTime = createTime;
        this.verifyTime = verifyTime;
    }

    public UserPayRecord(Integer userId, String signture, String signturedata, Integer commodityId, BigDecimal goldNum, BigDecimal money, Integer verifyResult, String userDeviceId, Integer payPlatform, Date createTime, Date verifyTime) {
        this.userId = userId;
        this.signture = signture;
        this.signturedata = signturedata;
        this.commodityId = commodityId;
        this.goldNum = goldNum;
        this.money = money;
        this.verifyResult = verifyResult;
        this.userDeviceId = userDeviceId;
        this.payPlatform = payPlatform;
        this.createTime = createTime;
        this.verifyTime = verifyTime;
    }

    @Id
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "user_id")

    private Integer userId;

    /**
     * google签名字符串
     */

    private String signture;

    /**
     * google 签名的数据
     */
    @Column(name = "signtureData")

    private String signturedata;

    /**
     * 购买的商品id
     */
    @Column(name = "commodity_id")

    private Integer commodityId;

    /**
     * 购买的金币数量
     */
    @Column(name = "gold_num")

    private BigDecimal goldNum;

    /**
     * 购买的所花的钱数
     */

    private BigDecimal money;

    /**
     * ios交易验证码
     */
    @Column(name = "receipt_data")

    private String receiptData;

    /**
     * ios交易号
     */
    @Column(name = "recharge_id")

    private String rechargeId;

    /**
     * ios的交易id
     */
    @Column(name = "transaction_id")

    private String transactionId;

    /**
     * 验证支付的结果 1 成功 2 失败
     */
    @Column(name = "verify_result")

    private Integer verifyResult;

    /**
     * 交易设备的id
     */
    @Column(name = "user_device_id")

    private String userDeviceId;

    /**
     * 支付的平台 1 google 支付 2. 苹果内购支付
     */
    @Column(name = "pay_platform")

    private Integer payPlatform;

    /**
     * 交易创建时间
     */
    @Column(name = "create_time")

    private Date createTime;

    /**
     * 交易的验证时间点
     */
    @Column(name = "verify_time")

    private Date verifyTime;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取google签名字符串
     *
     * @return signture - google签名字符串
     */
    public String getSignture() {
        return signture;
    }

    /**
     * 设置google签名字符串
     *
     * @param signture google签名字符串
     */
    public void setSignture(String signture) {
        this.signture = signture;
    }

    /**
     * 获取google 签名的数据
     *
     * @return signtureData - google 签名的数据
     */
    public String getSignturedata() {
        return signturedata;
    }

    /**
     * 设置google 签名的数据
     *
     * @param signturedata google 签名的数据
     */
    public void setSignturedata(String signturedata) {
        this.signturedata = signturedata;
    }

    /**
     * 获取购买的商品id
     *
     * @return commodity_id - 购买的商品id
     */
    public Integer getCommodityId() {
        return commodityId;
    }

    /**
     * 设置购买的商品id
     *
     * @param commodityId 购买的商品id
     */
    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    /**
     * 获取购买的金币数量
     *
     * @return gold_num - 购买的金币数量
     */
    public BigDecimal getGoldNum() {
        return goldNum;
    }

    /**
     * 设置购买的金币数量
     *
     * @param goldNum 购买的金币数量
     */
    public void setGoldNum(BigDecimal goldNum) {
        this.goldNum = goldNum;
    }

    /**
     * 获取购买的所花的钱数
     *
     * @return money - 购买的所花的钱数
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * 设置购买的所花的钱数
     *
     * @param money 购买的所花的钱数
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * 获取ios交易验证码
     *
     * @return receipt_data - ios交易验证码
     */
    public String getReceiptData() {
        return receiptData;
    }

    /**
     * 设置ios交易验证码
     *
     * @param receiptData ios交易验证码
     */
    public void setReceiptData(String receiptData) {
        this.receiptData = receiptData;
    }

    /**
     * 获取ios交易号
     *
     * @return recharge_id - ios交易号
     */
    public String getRechargeId() {
        return rechargeId;
    }

    /**
     * 设置ios交易号
     *
     * @param rechargeId ios交易号
     */
    public void setRechargeId(String rechargeId) {
        this.rechargeId = rechargeId;
    }

    /**
     * 获取ios的交易id
     *
     * @return transaction_id - ios的交易id
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * 设置ios的交易id
     *
     * @param transactionId ios的交易id
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * 获取验证支付的结果 1 成功 2 失败
     *
     * @return verify_result - 验证支付的结果 1 成功 2 失败
     */
    public Integer getVerifyResult() {
        return verifyResult;
    }

    /**
     * 设置验证支付的结果 1 成功 2 失败
     *
     * @param verifyResult 验证支付的结果 1 成功 2 失败
     */
    public void setVerifyResult(Integer verifyResult) {
        this.verifyResult = verifyResult;
    }

    /**
     * 获取交易设备的id
     *
     * @return user_device_id - 交易设备的id
     */
    public String getUserDeviceId() {
        return userDeviceId;
    }

    /**
     * 设置交易设备的id
     *
     * @param userDeviceId 交易设备的id
     */
    public void setUserDeviceId(String userDeviceId) {
        this.userDeviceId = userDeviceId;
    }

    /**
     * 获取支付的平台 1 google 支付 2. 苹果内购支付
     *
     * @return pay_platform - 支付的平台 1 google 支付 2. 苹果内购支付
     */
    public Integer getPayPlatform() {
        return payPlatform;
    }

    /**
     * 设置支付的平台 1 google 支付 2. 苹果内购支付
     *
     * @param payPlatform 支付的平台 1 google 支付 2. 苹果内购支付
     */
    public void setPayPlatform(Integer payPlatform) {
        this.payPlatform = payPlatform;
    }

    /**
     * 获取交易创建时间
     *
     * @return create_time - 交易创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置交易创建时间
     *
     * @param createTime 交易创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取交易的验证时间点
     *
     * @return verify_time - 交易的验证时间点
     */
    public Date getVerifyTime() {
        return verifyTime;
    }

    /**
     * 设置交易的验证时间点
     *
     * @param verifyTime 交易的验证时间点
     */
    public void setVerifyTime(Date verifyTime) {
        this.verifyTime = verifyTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", signture=").append(signture);
        sb.append(", signturedata=").append(signturedata);
        sb.append(", commodityId=").append(commodityId);
        sb.append(", goldNum=").append(goldNum);
        sb.append(", money=").append(money);
        sb.append(", receiptData=").append(receiptData);
        sb.append(", rechargeId=").append(rechargeId);
        sb.append(", transactionId=").append(transactionId);
        sb.append(", verifyResult=").append(verifyResult);
        sb.append(", userDeviceId=").append(userDeviceId);
        sb.append(", payPlatform=").append(payPlatform);
        sb.append(", createTime=").append(createTime);
        sb.append(", verifyTime=").append(verifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}