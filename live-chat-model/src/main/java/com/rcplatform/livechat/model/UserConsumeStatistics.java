package com.rcplatform.livechat.model;



import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_user_consume_statistics")

public class UserConsumeStatistics implements Serializable {
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
     * 用户账号
     */
    @Column(name = "user_account")

    private String userAccount;

    /**
     * 用户性别
     */

    private Integer gender;

    /**
     * 用户名称
     */
    @Column(name = "user_name")

    private String userName;

    /**
     * 用户账号类型
     */

    private Integer type;

    /**
     * 用户支付次数
     */
    @Column(name = "consume_num")

    private Integer consumeNum;

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
     * 获取用户账号
     *
     * @return user_account - 用户账号
     */
    public String getUserAccount() {
        return userAccount;
    }

    /**
     * 设置用户账号
     *
     * @param userAccount 用户账号
     */
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    /**
     * 获取用户性别
     *
     * @return gender - 用户性别
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置用户性别
     *
     * @param gender 用户性别
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 获取用户名称
     *
     * @return user_name - 用户名称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名称
     *
     * @param userName 用户名称
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取用户账号类型
     *
     * @return type - 用户账号类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置用户账号类型
     *
     * @param type 用户账号类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取用户支付次数
     *
     * @return consume_num - 用户支付次数
     */
    public Integer getConsumeNum() {
        return consumeNum;
    }

    /**
     * 设置用户支付次数
     *
     * @param consumeNum 用户支付次数
     */
    public void setConsumeNum(Integer consumeNum) {
        this.consumeNum = consumeNum;
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
        sb.append(", userAccount=").append(userAccount);
        sb.append(", gender=").append(gender);
        sb.append(", userName=").append(userName);
        sb.append(", type=").append(type);
        sb.append(", consumeNum=").append(consumeNum);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}