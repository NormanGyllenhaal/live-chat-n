package com.rcplatform.livechat.model;



import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_user_matched")

public class UserMatched implements Serializable {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 用户id，关联用户表id
     */
    @Column(name = "user_id")

    private Integer userId;

    /**
     * 匹配后的用户id
     */
    @Column(name = "matched_user_id")

    private Integer matchedUserId;

    /**
     * 记录的状态 1 正常  2 已删除
     */

    private Integer status;

    /**
     * 是否是好友关系 1. 非好友，2 好友
     */

    private Integer relation;

    /**
     * 记录创建时间
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
     * 获取用户id，关联用户表id
     *
     * @return user_id - 用户id，关联用户表id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id，关联用户表id
     *
     * @param userId 用户id，关联用户表id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取匹配后的用户id
     *
     * @return matched_user_id - 匹配后的用户id
     */
    public Integer getMatchedUserId() {
        return matchedUserId;
    }

    /**
     * 设置匹配后的用户id
     *
     * @param matchedUserId 匹配后的用户id
     */
    public void setMatchedUserId(Integer matchedUserId) {
        this.matchedUserId = matchedUserId;
    }

    /**
     * 获取记录的状态 1 正常  2 已删除
     *
     * @return status - 记录的状态 1 正常  2 已删除
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置记录的状态 1 正常  2 已删除
     *
     * @param status 记录的状态 1 正常  2 已删除
     */
    public void setStatus(Integer status) {
        this.status = status;
    }


    public Integer getRelation() {
        return relation;
    }

    public void setRelation(Integer relation) {
        this.relation = relation;
    }

    /**
     * 获取记录创建时间
     *
     * @return create_time - 记录创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置记录创建时间
     *
     * @param createTime 记录创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserMatched{");
        sb.append("id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", matchedUserId=").append(matchedUserId);
        sb.append(", status=").append(status);
        sb.append(", relation=").append(relation);
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }
}