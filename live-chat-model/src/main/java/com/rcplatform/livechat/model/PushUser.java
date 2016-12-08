package com.rcplatform.livechat.model;


import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "rc_push_user")

public class PushUser implements Serializable {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 推送的id信息
     */
    @Column(name = "push_id")

    private Integer pushId;

    /**
     * 用户的id
     */
    @Column(name = "user_id")

    private Integer userId;

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
     * 获取推送的id信息
     *
     * @return push_id - 推送的id信息
     */
    public Integer getPushId() {
        return pushId;
    }

    /**
     * 设置推送的id信息
     *
     * @param pushId 推送的id信息
     */
    public void setPushId(Integer pushId) {
        this.pushId = pushId;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pushId=").append(pushId);
        sb.append(", userId=").append(userId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}