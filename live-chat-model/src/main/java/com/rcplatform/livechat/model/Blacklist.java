package com.rcplatform.livechat.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_blacklist")

public class Blacklist implements Serializable {

    public Blacklist() {
    }

    public Blacklist(Integer userId, Integer blacklistUserId) {
        this.userId = userId;
        this.blacklistUserId = blacklistUserId;
    }

    public Blacklist(Integer userId, Integer blacklistUserId, Integer friendStatus) {
        this.userId = userId;
        this.blacklistUserId = blacklistUserId;
        this.friendStatus = friendStatus;
    }

    /**
     * id主键
     */
    @Id
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "user_id")

    private Integer userId;

    /**
     * 黑名单用户id
     */
    @Column(name = "blacklist_user_id")

    private Integer blacklistUserId;

    /**
     * 用户和黑名单对象是否是朋友关系 1 是朋友关系 2 非朋友关系
     */
    @Column(name = "friend_status")

    private Integer friendStatus;

    /**
     * 创建时间
     */
    @Column(name = "create_time")

    private Date createTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取id主键
     *
     * @return id - id主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id主键
     *
     * @param id id主键
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
     * 获取黑名单用户id
     *
     * @return blacklist_user_id - 黑名单用户id
     */
    public Integer getBlacklistUserId() {
        return blacklistUserId;
    }

    /**
     * 设置黑名单用户id
     *
     * @param blacklistUserId 黑名单用户id
     */
    public void setBlacklistUserId(Integer blacklistUserId) {
        this.blacklistUserId = blacklistUserId;
    }

    /**
     * 获取用户和黑名单对象是否是朋友关系 1 是朋友关系 2 非朋友关系
     *
     * @return friend_status - 用户和黑名单对象是否是朋友关系 1 是朋友关系 2 非朋友关系
     */
    public Integer getFriendStatus() {
        return friendStatus;
    }

    /**
     * 设置用户和黑名单对象是否是朋友关系 1 是朋友关系 2 非朋友关系
     *
     * @param friendStatus 用户和黑名单对象是否是朋友关系 1 是朋友关系 2 非朋友关系
     */
    public void setFriendStatus(Integer friendStatus) {
        this.friendStatus = friendStatus;
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
        sb.append(", blacklistUserId=").append(blacklistUserId);
        sb.append(", friendStatus=").append(friendStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}