package com.rcplatform.livechat.model;



import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_user_record")

public class UserRecord implements Serializable {


    public UserRecord() {
    }

    public UserRecord(Integer userId, Integer accountType, Integer gender, Integer type, Integer deviceType) {
        this.userId = userId;
        this.accountType = accountType;
        this.gender = gender;
        this.type = type;
        this.deviceType = deviceType;
    }

    /**
     * 用户主键
     */
    @Id
    private Integer id;

    /**
     * 用户的id
     */
    @Column(name = "user_id")

    private Integer userId;

    /**
     * 用户的账号类型 1 注册登录，2 facebook登录，3 ，google+登录
     */
    @Column(name = "account_type")

    private Integer accountType;

    /**
     * 用户的性别 1 男性 2 女性
     */

    private Integer gender;

    /**
     * 用户的操作类型 1 注册 2 登录 3 图片编辑 4 分享
     */

    private Integer type;

    /**
     * 用户使用的设备类型 1 ios 2 android
     */
    @Column(name = "device_type")

    private Integer deviceType;

    /**
     * 用户操作的时间
     */
    @Column(name = "create_time")

    private Date createTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取用户主键
     *
     * @return id - 用户主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置用户主键
     *
     * @param id 用户主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户的id
     *
     * @return user_id - 用户的id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户的id
     *
     * @param userId 用户的id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取用户的账号类型 1 注册登录，2 facebook登录，3 ，google+登录
     *
     * @return account_type - 用户的账号类型 1 注册登录，2 facebook登录，3 ，google+登录
     */
    public Integer getAccountType() {
        return accountType;
    }

    /**
     * 设置用户的账号类型 1 注册登录，2 facebook登录，3 ，google+登录
     *
     * @param accountType 用户的账号类型 1 注册登录，2 facebook登录，3 ，google+登录
     */
    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    /**
     * 获取用户的性别 1 男性 2 女性
     *
     * @return gender - 用户的性别 1 男性 2 女性
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置用户的性别 1 男性 2 女性
     *
     * @param gender 用户的性别 1 男性 2 女性
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 获取用户的操作类型 1 注册 2 登录 3 图片编辑 4 分享
     *
     * @return type - 用户的操作类型 1 注册 2 登录 3 图片编辑 4 分享
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置用户的操作类型 1 注册 2 登录 3 图片编辑 4 分享
     *
     * @param type 用户的操作类型 1 注册 2 登录 3 图片编辑 4 分享
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取用户使用的设备类型 1 ios 2 android
     *
     * @return device_type - 用户使用的设备类型 1 ios 2 android
     */
    public Integer getDeviceType() {
        return deviceType;
    }

    /**
     * 设置用户使用的设备类型 1 ios 2 android
     *
     * @param deviceType 用户使用的设备类型 1 ios 2 android
     */
    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * 获取用户操作的时间
     *
     * @return create_time - 用户操作的时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置用户操作的时间
     *
     * @param createTime 用户操作的时间
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
        sb.append(", accountType=").append(accountType);
        sb.append(", gender=").append(gender);
        sb.append(", type=").append(type);
        sb.append(", deviceType=").append(deviceType);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}