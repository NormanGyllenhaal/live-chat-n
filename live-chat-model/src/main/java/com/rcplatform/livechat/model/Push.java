package com.rcplatform.livechat.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "rc_push")
public class Push implements Serializable {

    public Push() {
    }

    public Push(Integer isPush) {
        this.isPush = isPush;
    }

    public Push(Integer id, Integer isPush, Integer fail, Integer success) {
        this.id = id;
        this.isPush = isPush;
        this.fail = fail;
        this.success = success;
    }

    /**
     * 主键
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 应用id
     */
    @Column(name = "app_id")
    private Integer appId;

    /**
     * 推送的标题
     */
    @NotNull
    private String title;

    /**
     * 推送的url
     */
    private String url;

    /**
     * 客户端响应方式 0 唤醒
     */
    private Integer mode;

    /**
     * 推送的内容信息
     */
    private String content;

    /**
     * 赠送金币数量
     */
    private BigDecimal gold;

    /**
     * 推送的时间
     */
    @Column(name = "push_time")
    @NotNull
    private Date pushTime;

    /**
     * 是否已推送 1. 推送 2,没有推送
     */
    @Column(name = "is_push")
    private Integer isPush;

    /**
     * 推送的类型 1 全部 2 男 3女 4 条件筛选
     */
    @NotNull
    private Integer type;

    /**
     * 推送失败次数
     */
    private Integer fail;

    /**
     * 推送的种类 1 赠送金币 2 消息
     */
    @NotNull
    @Column(name = "push_way")
    private Integer pushWay;

    /**
     * 推送成功次数
     */
    private Integer success;

    /**
     * 创建的时间
     */
    @Column(name = "create_time")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取应用id
     *
     * @return app_id - 应用id
     */
    public Integer getAppId() {
        return appId;
    }

    /**
     * 设置应用id
     *
     * @param appId 应用id
     */
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    /**
     * 获取推送的标题
     *
     * @return title - 推送的标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置推送的标题
     *
     * @param title 推送的标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取推送的url
     *
     * @return url - 推送的url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置推送的url
     *
     * @param url 推送的url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取客户端响应方式 0 唤醒
     *
     * @return mode - 客户端响应方式 0 唤醒
     */
    public Integer getMode() {
        return mode;
    }

    /**
     * 设置客户端响应方式 0 唤醒
     *
     * @param mode 客户端响应方式 0 唤醒
     */
    public void setMode(Integer mode) {
        this.mode = mode;
    }

    /**
     * 获取推送的内容信息
     *
     * @return content - 推送的内容信息
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置推送的内容信息
     *
     * @param content 推送的内容信息
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取赠送金币数量
     *
     * @return gold - 赠送金币数量
     */
    public BigDecimal getGold() {
        return gold;
    }

    /**
     * 设置赠送金币数量
     *
     * @param gold 赠送金币数量
     */
    public void setGold(BigDecimal gold) {
        this.gold = gold;
    }

    /**
     * 获取推送的时间
     *
     * @return push_time - 推送的时间
     */
    public Date getPushTime() {
        return pushTime;
    }

    /**
     * 设置推送的时间
     *
     * @param pushTime 推送的时间
     */
    public void setPushTime(Date pushTime) {
        this.pushTime = pushTime;
    }

    /**
     * 获取是否已推送 1. 推送 2,没有推送
     *
     * @return is_push - 是否已推送 1. 推送 2,没有推送
     */
    public Integer getIsPush() {
        return isPush;
    }

    /**
     * 设置是否已推送 1. 推送 2,没有推送
     *
     * @param isPush 是否已推送 1. 推送 2,没有推送
     */
    public void setIsPush(Integer isPush) {
        this.isPush = isPush;
    }

    /**
     * 获取推送的类型 1 全部 2 男 3女 4 条件筛选
     *
     * @return type - 推送的类型 1 全部 2 男 3女 4 条件筛选
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置推送的类型 1 全部 2 男 3女 4 条件筛选
     *
     * @param type 推送的类型 1 全部 2 男 3女 4 条件筛选
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取推送失败次数
     *
     * @return fail - 推送失败次数
     */
    public Integer getFail() {
        return fail;
    }

    /**
     * 设置推送失败次数
     *
     * @param fail 推送失败次数
     */
    public void setFail(Integer fail) {
        this.fail = fail;
    }

    /**
     * 获取推送的种类 1 赠送金币 2 消息
     *
     * @return push_way - 推送的种类 1 赠送金币 2 消息
     */
    public Integer getPushWay() {
        return pushWay;
    }

    /**
     * 设置推送的种类 1 赠送金币 2 消息
     *
     * @param pushWay 推送的种类 1 赠送金币 2 消息
     */
    public void setPushWay(Integer pushWay) {
        this.pushWay = pushWay;
    }

    /**
     * 获取推送成功次数
     *
     * @return success - 推送成功次数
     */
    public Integer getSuccess() {
        return success;
    }

    /**
     * 设置推送成功次数
     *
     * @param success 推送成功次数
     */
    public void setSuccess(Integer success) {
        this.success = success;
    }

    /**
     * 获取创建的时间
     *
     * @return create_time - 创建的时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建的时间
     *
     * @param createTime 创建的时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", appId=").append(appId);
        sb.append(", title=").append(title);
        sb.append(", url=").append(url);
        sb.append(", mode=").append(mode);
        sb.append(", content=").append(content);
        sb.append(", gold=").append(gold);
        sb.append(", pushTime=").append(pushTime);
        sb.append(", isPush=").append(isPush);
        sb.append(", type=").append(type);
        sb.append(", fail=").append(fail);
        sb.append(", pushWay=").append(pushWay);
        sb.append(", success=").append(success);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}