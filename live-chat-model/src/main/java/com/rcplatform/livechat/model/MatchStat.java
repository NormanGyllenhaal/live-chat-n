package com.rcplatform.livechat.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_match_stat")
public class MatchStat implements Serializable {
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
     * 是否成功 1 成功 2 失败
     */
    private Integer result;

    /**
     * 用户匹配是否付费了
     */
    @Column(name = "is_pay")
    private Integer isPay;

    /**
     * 匹配到的用户
     */
    @Column(name = "match_user_id")
    private Integer matchUserId;

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
     * 获取是否成功 1 成功 2 失败
     *
     * @return result - 是否成功 1 成功 2 失败
     */
    public Integer getResult() {
        return result;
    }

    /**
     * 设置是否成功 1 成功 2 失败
     *
     * @param result 是否成功 1 成功 2 失败
     */
    public void setResult(Integer result) {
        this.result = result;
    }

    /**
     * 获取用户匹配是否付费了
     *
     * @return is_pay - 用户匹配是否付费了
     */
    public Integer getIsPay() {
        return isPay;
    }

    /**
     * 设置用户匹配是否付费了
     *
     * @param isPay 用户匹配是否付费了
     */
    public void setIsPay(Integer isPay) {
        this.isPay = isPay;
    }

    /**
     * 获取匹配到的用户
     *
     * @return match_user_id - 匹配到的用户
     */
    public Integer getMatchUserId() {
        return matchUserId;
    }

    /**
     * 设置匹配到的用户
     *
     * @param matchUserId 匹配到的用户
     */
    public void setMatchUserId(Integer matchUserId) {
        this.matchUserId = matchUserId;
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
        sb.append(", result=").append(result);
        sb.append(", isPay=").append(isPay);
        sb.append(", matchUserId=").append(matchUserId);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}