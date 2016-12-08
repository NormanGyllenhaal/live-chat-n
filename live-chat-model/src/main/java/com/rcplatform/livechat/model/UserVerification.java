package com.rcplatform.livechat.model;



import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_user_verification")

public class UserVerification implements Serializable {

    public UserVerification() {
    }

    public UserVerification(Integer userId) {
        this.userId = userId;
    }

    public UserVerification(Integer userId, String loginToken) {
        this.userId = userId;
        this.loginToken = loginToken;
    }


    public UserVerification(Integer id, String loginToken, Date updateTime) {
        this.id = id;
        this.loginToken = loginToken;
        this.updateTime = updateTime;
    }

    /**

     * 主键
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;


    @Column(name = "user_id")

    private Integer userId;



    /**
     * 登录token
     */
    @Column(name = "login_token")

    private String loginToken;

    /**
     * 邮箱验证token
     */
    @Column(name = "email_token")

    private String emailToken;


    /**
     * 创建时间
     */
    @Column(name = "create_time")

    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")

    private Date updateTime;

    /**
     * 登录token的过期时间
     */
    @Column(name = "login_token_expiration")

    private Date loginTokenExpiration;

    /**
     *  邮箱验证的过期时间
     */
    @Column(name = "email_token_expiration")

    private Date emailTokenExpiration;

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
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取金币数量
     *
     * @return login_token - 金币数量
     */
    public String getLoginToken() {
        return loginToken;
    }

    /**
     * 设置金币数量
     *
     * @param loginToken 金币数量
     */
    public void setLoginToken(String loginToken) {
        this.loginToken = loginToken;
    }

    /**
     * 获取邮箱验证token
     *
     * @return email_token - 邮箱验证token
     */
    public String getEmailToken() {
        return emailToken;
    }

    /**
     * 设置邮箱验证token
     *
     * @param emailToken 邮箱验证token
     */
    public void setEmailToken(String emailToken) {
        this.emailToken = emailToken;
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

    /**
     * 获取登录token的过期时间
     *
     * @return login_token_expiration - 登录token的过期时间
     */
    public Date getLoginTokenExpiration() {
        return loginTokenExpiration;
    }

    /**
     * 设置登录token的过期时间
     *
     * @param loginTokenExpiration 登录token的过期时间
     */
    public void setLoginTokenExpiration(Date loginTokenExpiration) {
        this.loginTokenExpiration = loginTokenExpiration;
    }

    public Date getEmailTokenExpiration() {
        return emailTokenExpiration;
    }

    public void setEmailTokenExpiration(Date emailTokenExpiration) {
        this.emailTokenExpiration = emailTokenExpiration;
    }




    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserVerification{");
        sb.append("id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", loginToken='").append(loginToken).append('\'');
        sb.append(", emailToken='").append(emailToken).append('\'');
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", loginTokenExpiration=").append(loginTokenExpiration);
        sb.append(", emailTokenExpiration=").append(emailTokenExpiration);
        sb.append('}');
        return sb.toString();
    }
}