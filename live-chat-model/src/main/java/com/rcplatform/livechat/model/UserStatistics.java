package com.rcplatform.livechat.model;

import com.alibaba.fastjson.annotation.JSONField;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_user_statistics")

public class UserStatistics implements Serializable {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 总用户数量
     */
    @Column(name = "user_total_num")
    private Integer userTotalNum;

    /**
     * facebook的用户数量
     */
    @Column(name = "facebook_num")
    private Integer facebookNum;

    /**
     * 男性总用户数量
     */
    @Column(name = "user_boy_num")
    private Integer userBoyNum;

    /**
     * 女性总用户数量
     */
    @Column(name = "user_girl_num")
    private Integer userGirlNum;

    /**
     * 邮箱用户女性数量
     */
    @Column(name = "email_girl_num")
    private Integer emailGirlNum;

    /**
     * 邮箱用户男性数量
     */
    @Column(name = "email_boy_num")
    private Integer emailBoyNum;

    /**
     * 累计facebook女性数量
     */
    @Column(name = "facebook_girl_num")
    private Integer facebookGirlNum;

    /**
     * 累计facebook男性数量
     */
    @Column(name = "facebook_boy_num")
    private Integer facebookBoyNum;

    /**
     * 新增用户数量
     */
    @Column(name = "new_user_num")
    private Integer newUserNum;

    /**
     * facebook新增人数
     */
    @Column(name = "new_facebook_num")

    private Integer newFacebookNum;

    /**
     * 新增女性用户数量
     */
    @Column(name = "new_user_girl_num")

    private Integer newUserGirlNum;

    /**
     * 新增男性用户数量
     */
    @Column(name = "new_user_boy_num")

    private Integer newUserBoyNum;

    /**
     * 新增邮箱女性用户数量
     */
    @Column(name = "new_email_girl_num")

    private Integer newEmailGirlNum;

    /**
     * 新增邮箱男性用户数量
     */
    @Column(name = "new_email_boy_num")

    private Integer newEmailBoyNum;

    /**
     * 新增facebook男性用户数量
     */
    @Column(name = "new_facebook_boy_num")

    private Integer newFacebookBoyNum;

    /**
     * 新增facebook女性用户数量
     */
    @Column(name = "new_facebook_girl_num")

    private Integer newFacebookGirlNum;

    /**
     * 累计安卓用户数量
     */
    @Column(name = "android_user")

    private Integer androidUser;

    /**
     * 累计ios用户数量
     */
    @Column(name = "ios_user")

    private Integer iosUser;

    /**
     * 新增android用户数量
     */
    @Column(name = "new_android_user")

    private Integer newAndroidUser;

    /**
     * 新增ios用户数量
     */
    @Column(name = "new_ios_user")

    private Integer newIosUser;

    /**
     * 创建的时间
     */
    @Column(name = "create_time")

    @JSONField(format = "yyyy-MM-dd")
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
     * 获取总用户数量
     *
     * @return user_total_num - 总用户数量
     */
    public Integer getUserTotalNum() {
        return userTotalNum;
    }

    /**
     * 设置总用户数量
     *
     * @param userTotalNum 总用户数量
     */
    public void setUserTotalNum(Integer userTotalNum) {
        this.userTotalNum = userTotalNum;
    }

    /**
     * 获取facebook的用户数量
     *
     * @return facebook_num - facebook的用户数量
     */
    public Integer getFacebookNum() {
        return facebookNum;
    }

    /**
     * 设置facebook的用户数量
     *
     * @param facebookNum facebook的用户数量
     */
    public void setFacebookNum(Integer facebookNum) {
        this.facebookNum = facebookNum;
    }

    /**
     * 获取男性总用户数量
     *
     * @return user_boy_num - 男性总用户数量
     */
    public Integer getUserBoyNum() {
        return userBoyNum;
    }

    /**
     * 设置男性总用户数量
     *
     * @param userBoyNum 男性总用户数量
     */
    public void setUserBoyNum(Integer userBoyNum) {
        this.userBoyNum = userBoyNum;
    }

    /**
     * 获取女性总用户数量
     *
     * @return user_girl_num - 女性总用户数量
     */
    public Integer getUserGirlNum() {
        return userGirlNum;
    }

    /**
     * 设置女性总用户数量
     *
     * @param userGirlNum 女性总用户数量
     */
    public void setUserGirlNum(Integer userGirlNum) {
        this.userGirlNum = userGirlNum;
    }

    /**
     * 获取邮箱用户女性数量
     *
     * @return email_girl_num - 邮箱用户女性数量
     */
    public Integer getEmailGirlNum() {
        return emailGirlNum;
    }

    /**
     * 设置邮箱用户女性数量
     *
     * @param emailGirlNum 邮箱用户女性数量
     */
    public void setEmailGirlNum(Integer emailGirlNum) {
        this.emailGirlNum = emailGirlNum;
    }

    /**
     * 获取邮箱用户男性数量
     *
     * @return email_boy_num - 邮箱用户男性数量
     */
    public Integer getEmailBoyNum() {
        return emailBoyNum;
    }

    /**
     * 设置邮箱用户男性数量
     *
     * @param emailBoyNum 邮箱用户男性数量
     */
    public void setEmailBoyNum(Integer emailBoyNum) {
        this.emailBoyNum = emailBoyNum;
    }

    /**
     * 获取累计facebook女性数量
     *
     * @return facebook_girl_num - 累计facebook女性数量
     */
    public Integer getFacebookGirlNum() {
        return facebookGirlNum;
    }

    /**
     * 设置累计facebook女性数量
     *
     * @param facebookGirlNum 累计facebook女性数量
     */
    public void setFacebookGirlNum(Integer facebookGirlNum) {
        this.facebookGirlNum = facebookGirlNum;
    }

    /**
     * 获取累计facebook男性数量
     *
     * @return facebook_boy_num - 累计facebook男性数量
     */
    public Integer getFacebookBoyNum() {
        return facebookBoyNum;
    }

    /**
     * 设置累计facebook男性数量
     *
     * @param facebookBoyNum 累计facebook男性数量
     */
    public void setFacebookBoyNum(Integer facebookBoyNum) {
        this.facebookBoyNum = facebookBoyNum;
    }

    /**
     * 获取新增用户数量
     *
     * @return new_user_num - 新增用户数量
     */
    public Integer getNewUserNum() {
        return newUserNum;
    }

    /**
     * 设置新增用户数量
     *
     * @param newUserNum 新增用户数量
     */
    public void setNewUserNum(Integer newUserNum) {
        this.newUserNum = newUserNum;
    }

    /**
     * 获取facebook新增人数
     *
     * @return new_facebook_num - facebook新增人数
     */
    public Integer getNewFacebookNum() {
        return newFacebookNum;
    }

    /**
     * 设置facebook新增人数
     *
     * @param newFacebookNum facebook新增人数
     */
    public void setNewFacebookNum(Integer newFacebookNum) {
        this.newFacebookNum = newFacebookNum;
    }

    /**
     * 获取新增女性用户数量
     *
     * @return new_user_girl_num - 新增女性用户数量
     */
    public Integer getNewUserGirlNum() {
        return newUserGirlNum;
    }

    /**
     * 设置新增女性用户数量
     *
     * @param newUserGirlNum 新增女性用户数量
     */
    public void setNewUserGirlNum(Integer newUserGirlNum) {
        this.newUserGirlNum = newUserGirlNum;
    }

    /**
     * 获取新增男性用户数量
     *
     * @return new_user_boy_num - 新增男性用户数量
     */
    public Integer getNewUserBoyNum() {
        return newUserBoyNum;
    }

    /**
     * 设置新增男性用户数量
     *
     * @param newUserBoyNum 新增男性用户数量
     */
    public void setNewUserBoyNum(Integer newUserBoyNum) {
        this.newUserBoyNum = newUserBoyNum;
    }

    /**
     * 获取新增邮箱女性用户数量
     *
     * @return new_email_girl_num - 新增邮箱女性用户数量
     */
    public Integer getNewEmailGirlNum() {
        return newEmailGirlNum;
    }

    /**
     * 设置新增邮箱女性用户数量
     *
     * @param newEmailGirlNum 新增邮箱女性用户数量
     */
    public void setNewEmailGirlNum(Integer newEmailGirlNum) {
        this.newEmailGirlNum = newEmailGirlNum;
    }

    /**
     * 获取新增邮箱男性用户数量
     *
     * @return new_email_boy_num - 新增邮箱男性用户数量
     */
    public Integer getNewEmailBoyNum() {
        return newEmailBoyNum;
    }

    /**
     * 设置新增邮箱男性用户数量
     *
     * @param newEmailBoyNum 新增邮箱男性用户数量
     */
    public void setNewEmailBoyNum(Integer newEmailBoyNum) {
        this.newEmailBoyNum = newEmailBoyNum;
    }

    /**
     * 获取新增facebook男性用户数量
     *
     * @return new_facebook_boy_num - 新增facebook男性用户数量
     */
    public Integer getNewFacebookBoyNum() {
        return newFacebookBoyNum;
    }

    /**
     * 设置新增facebook男性用户数量
     *
     * @param newFacebookBoyNum 新增facebook男性用户数量
     */
    public void setNewFacebookBoyNum(Integer newFacebookBoyNum) {
        this.newFacebookBoyNum = newFacebookBoyNum;
    }

    /**
     * 获取新增facebook女性用户数量
     *
     * @return new_facebook_girl_num - 新增facebook女性用户数量
     */
    public Integer getNewFacebookGirlNum() {
        return newFacebookGirlNum;
    }

    /**
     * 设置新增facebook女性用户数量
     *
     * @param newFacebookGirlNum 新增facebook女性用户数量
     */
    public void setNewFacebookGirlNum(Integer newFacebookGirlNum) {
        this.newFacebookGirlNum = newFacebookGirlNum;
    }

    /**
     * 获取累计安卓用户数量
     *
     * @return android_user - 累计安卓用户数量
     */
    public Integer getAndroidUser() {
        return androidUser;
    }

    /**
     * 设置累计安卓用户数量
     *
     * @param androidUser 累计安卓用户数量
     */
    public void setAndroidUser(Integer androidUser) {
        this.androidUser = androidUser;
    }

    /**
     * 获取累计ios用户数量
     *
     * @return ios_user - 累计ios用户数量
     */
    public Integer getIosUser() {
        return iosUser;
    }

    /**
     * 设置累计ios用户数量
     *
     * @param iosUser 累计ios用户数量
     */
    public void setIosUser(Integer iosUser) {
        this.iosUser = iosUser;
    }

    /**
     * 获取新增android用户数量
     *
     * @return new_android_user - 新增android用户数量
     */
    public Integer getNewAndroidUser() {
        return newAndroidUser;
    }

    /**
     * 设置新增android用户数量
     *
     * @param newAndroidUser 新增android用户数量
     */
    public void setNewAndroidUser(Integer newAndroidUser) {
        this.newAndroidUser = newAndroidUser;
    }

    /**
     * 获取新增ios用户数量
     *
     * @return new_ios_user - 新增ios用户数量
     */
    public Integer getNewIosUser() {
        return newIosUser;
    }

    /**
     * 设置新增ios用户数量
     *
     * @param newIosUser 新增ios用户数量
     */
    public void setNewIosUser(Integer newIosUser) {
        this.newIosUser = newIosUser;
    }

    /**
     * 获取创建的时间
     *
     * @return create_time - 创建的时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建的时间
     *
     * @param createTime 创建的时间
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
        sb.append(", userTotalNum=").append(userTotalNum);
        sb.append(", facebookNum=").append(facebookNum);
        sb.append(", userBoyNum=").append(userBoyNum);
        sb.append(", userGirlNum=").append(userGirlNum);
        sb.append(", emailGirlNum=").append(emailGirlNum);
        sb.append(", emailBoyNum=").append(emailBoyNum);
        sb.append(", facebookGirlNum=").append(facebookGirlNum);
        sb.append(", facebookBoyNum=").append(facebookBoyNum);
        sb.append(", newUserNum=").append(newUserNum);
        sb.append(", newFacebookNum=").append(newFacebookNum);
        sb.append(", newUserGirlNum=").append(newUserGirlNum);
        sb.append(", newUserBoyNum=").append(newUserBoyNum);
        sb.append(", newEmailGirlNum=").append(newEmailGirlNum);
        sb.append(", newEmailBoyNum=").append(newEmailBoyNum);
        sb.append(", newFacebookBoyNum=").append(newFacebookBoyNum);
        sb.append(", newFacebookGirlNum=").append(newFacebookGirlNum);
        sb.append(", androidUser=").append(androidUser);
        sb.append(", iosUser=").append(iosUser);
        sb.append(", newAndroidUser=").append(newAndroidUser);
        sb.append(", newIosUser=").append(newIosUser);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}