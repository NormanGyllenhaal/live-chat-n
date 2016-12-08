package com.rcplatform.livechat.model;



import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_push_info")
public class PushInfo implements Serializable {

    public PushInfo() {
    }

    public PushInfo(Integer userId) {
        this.userId = userId;
    }

    public PushInfo(Integer userId, Integer gender, Integer platformType, String pushToken) {
        this.userId = userId;
        this.gender = gender;
        this.platformType = platformType;
        this.pushToken = pushToken;
    }

    public PushInfo(Integer userId, Integer gender, Integer platformType) {
        this.userId = userId;
        this.gender = gender;
        this.platformType = platformType;
    }

    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 用户的性别 用户性别 1 男性 2 女性
     */
    private Integer gender;

    /**
     * 用户设备平台类型 1 ios 2 android
     */
    @Column(name = "platform_type")
    private Integer platformType;

    /**
     * 用户推送token
     */
    @Column(name = "push_token")
    private String pushToken;

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
     * 获取用户的性别 用户性别 1 男性 2 女性
     *
     * @return gender - 用户的性别 用户性别 1 男性 2 女性
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置用户的性别 用户性别 1 男性 2 女性
     *
     * @param gender 用户的性别 用户性别 1 男性 2 女性
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 获取用户设备平台类型 1 ios 2 android
     *
     * @return platform_type - 用户设备平台类型 1 ios 2 android
     */
    public Integer getPlatformType() {
        return platformType;
    }

    /**
     * 设置用户设备平台类型 1 ios 2 android
     *
     * @param platformType 用户设备平台类型 1 ios 2 android
     */
    public void setPlatformType(Integer platformType) {
        this.platformType = platformType;
    }

    /**
     * 获取用户推送token
     *
     * @return push_token - 用户推送token
     */
    public String getPushToken() {
        return pushToken;
    }

    /**
     * 设置用户推送token
     *
     * @param pushToken 用户推送token
     */
    public void setPushToken(String pushToken) {
        this.pushToken = pushToken;
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
        sb.append(", userId=").append(userId);
        sb.append(", gender=").append(gender);
        sb.append(", platformType=").append(platformType);
        sb.append(", pushToken=").append(pushToken);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}