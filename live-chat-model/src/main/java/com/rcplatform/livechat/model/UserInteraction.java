package com.rcplatform.livechat.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_user_interaction")

public class UserInteraction implements Serializable {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 用户id ,关联用户表主键
     */
    @Column(name = "user_id")

    private Integer userId;

    /**
     * 用户获得的赞数
     */
    @Column(name = "praise_num")

    private Integer praiseNum;

    /**
     * 用户获得的kiss数量
     */
    @Column(name = "kiss_num")

    private Integer kissNum;

    /**
     *  用户获得的巴掌数量
     */
    @Column(name = "hand_num")

    private Integer handNum;

    /**
     * 更新时间
     */
    @Column(name = "update_time")

    private Date updateTime;

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
     * 获取用户id ,关联用户表主键
     *
     * @return user_id - 用户id ,关联用户表主键
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id ,关联用户表主键
     *
     * @param userId 用户id ,关联用户表主键
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取用户获得的赞数
     *
     * @return praise_num - 用户获得的赞数
     */
    public Integer getPraiseNum() {
        return praiseNum;
    }

    /**
     * 设置用户获得的赞数
     *
     * @param praiseNum 用户获得的赞数
     */
    public void setPraiseNum(Integer praiseNum) {
        this.praiseNum = praiseNum;
    }

    /**
     * 获取用户获得的kiss数量
     *
     * @return kiss_num - 用户获得的kiss数量
     */
    public Integer getKissNum() {
        return kissNum;
    }

    /**
     * 设置用户获得的kiss数量
     *
     * @param kissNum 用户获得的kiss数量
     */
    public void setKissNum(Integer kissNum) {
        this.kissNum = kissNum;
    }

    /**
     * 获取 用户获得的巴掌数量
     *
     * @return hand_num -  用户获得的巴掌数量
     */
    public Integer getHandNum() {
        return handNum;
    }

    /**
     * 设置 用户获得的巴掌数量
     *
     * @param handNum  用户获得的巴掌数量
     */
    public void setHandNum(Integer handNum) {
        this.handNum = handNum;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", praiseNum=").append(praiseNum);
        sb.append(", kissNum=").append(kissNum);
        sb.append(", handNum=").append(handNum);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}