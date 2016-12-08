package com.rcplatform.livechat.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_push_country")
public class PushCountry implements Serializable {


    public PushCountry() {
    }

    public PushCountry(Integer pushId, String countryId, Integer isPush, Date pushTime, Date createTime) {
        this.pushId = pushId;
        this.countryId = countryId;
        this.isPush = isPush;
        this.pushTime = pushTime;
        this.createTime = createTime;
    }

    public PushCountry(Integer id, Integer isPush) {
        this.id = id;
        this.isPush = isPush;
    }

    /**

     * 主键
     */
    @Id
    private Integer id;

    /**
     * pushid
     */
    @Column(name = "push_id")
    private Integer pushId;

    /**
     * 国家id
     */
    @Column(name = "country_id")
    private String countryId;

    /**
     * 是否推送
     */
    @Column(name = "is_push")
    private Integer isPush;

    /**
     * 推送时间
     */
    @Column(name = "push_time")
    private Date pushTime;

    /**
     * 创建时间
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
     * 获取pushid
     *
     * @return push_id - pushid
     */
    public Integer getPushId() {
        return pushId;
    }

    /**
     * 设置pushid
     *
     * @param pushId pushid
     */
    public void setPushId(Integer pushId) {
        this.pushId = pushId;
    }

    /**
     * 获取国家id
     *
     * @return country_id - 国家id
     */
    public String getCountryId() {
        return countryId;
    }

    /**
     * 设置国家id
     *
     * @param countryId 国家id
     */
    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    /**
     * 获取是否推送
     *
     * @return is_push - 是否推送
     */
    public Integer getIsPush() {
        return isPush;
    }

    /**
     * 设置是否推送
     *
     * @param isPush 是否推送
     */
    public void setIsPush(Integer isPush) {
        this.isPush = isPush;
    }

    /**
     * 获取推送时间
     *
     * @return push_time - 推送时间
     */
    public Date getPushTime() {
        return pushTime;
    }

    /**
     * 设置推送时间
     *
     * @param pushTime 推送时间
     */
    public void setPushTime(Date pushTime) {
        this.pushTime = pushTime;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
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
        sb.append(", pushId=").append(pushId);
        sb.append(", countryId=").append(countryId);
        sb.append(", isPush=").append(isPush);
        sb.append(", pushTime=").append(pushTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}