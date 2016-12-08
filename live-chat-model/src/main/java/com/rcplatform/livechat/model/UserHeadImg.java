package com.rcplatform.livechat.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "rc_user_head_img")
public class UserHeadImg implements Serializable {

    public UserHeadImg() {
    }

    public UserHeadImg(Integer handle) {
        this.handle = handle;
    }


    public UserHeadImg(Integer gender, Integer type, Integer handle) {
        this.gender = gender;
        this.type = type;
        this.handle = handle;
    }

    public UserHeadImg(Integer userId, String userName, Integer gender, Date birthday, String headImg, Integer handle, Integer type) {
        this.userId = userId;
        this.userName = userName;
        this.gender = gender;
        this.birthday = birthday;
        this.headImg = headImg;
        this.handle = handle;
        this.type = type;
    }

    public UserHeadImg(String userName, Integer gender, Date birthday, String headImg,  Integer handle, Integer type) {
        this.userName = userName;
        this.gender = gender;
        this.birthday = birthday;
        this.headImg = headImg;
        this.handle = handle;
        this.type = type;
    }

    public UserHeadImg(Integer id, Date handleTime, Integer handle, Integer checked) {
        this.id = id;
        this.handleTime = handleTime;
        this.handle = handle;
        this.checked = checked;
    }

    public UserHeadImg(Integer checked, Integer handle, Date handleTime) {
        this.checked = checked;
        this.handle = handle;
        this.handleTime = handleTime;
    }

    @Id
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 用户昵称
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 用户性别
     */
    private Integer gender;

    /**
     * 用户生日
     */

    @JSONField(format = "yyyy-MM-dd")
    private Date birthday;

    /**
     * 用户的头像
     */
    @Column(name = "head_img")
    private String headImg;

    /**
     * 是否通过了审核 1 通过 2 未通过
     */
    private Integer checked;

    /**
     * 是否提示处理过 1.已处理 2，未处理
     */
    private Integer handle;

    /**
     * 审核处理时间
     */
    @Column(name = "handle_time")
    private Date handleTime;

    /**
     * 审核创建时间
     */
    @Column(name = "create_time")

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 1,头像 2 背景图片
     */
    private Integer type;

    private Integer version;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
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
     * 获取用户昵称
     *
     * @return user_name - 用户昵称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户昵称
     *
     * @param userName 用户昵称
     */
    public void setUserName(String userName) {
        this.userName = userName;
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
     * 获取用户生日
     *
     * @return birthday - 用户生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置用户生日
     *
     * @param birthday 用户生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取用户的头像
     *
     * @return head_img - 用户的头像
     */
    public String getHeadImg() {
        return headImg;
    }

    /**
     * 设置用户的头像
     *
     * @param headImg 用户的头像
     */
    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    /**
     * 获取是否通过了审核 1 通过 2 未通过
     *
     * @return checked - 是否通过了审核 1 通过 2 未通过
     */
    public Integer getChecked() {
        return checked;
    }

    /**
     * 设置是否通过了审核 1 通过 2 未通过
     *
     * @param checked 是否通过了审核 1 通过 2 未通过
     */
    public void setChecked(Integer checked) {
        this.checked = checked;
    }

    /**
     * 获取是否提示处理过 1.已处理 2，未处理
     *
     * @return handle - 是否提示处理过 1.已处理 2，未处理
     */
    public Integer getHandle() {
        return handle;
    }

    /**
     * 设置是否提示处理过 1.已处理 2，未处理
     *
     * @param handle 是否提示处理过 1.已处理 2，未处理
     */
    public void setHandle(Integer handle) {
        this.handle = handle;
    }

    /**
     * 获取审核处理时间
     *
     * @return handle_time - 审核处理时间
     */
    public Date getHandleTime() {
        return handleTime;
    }

    /**
     * 设置审核处理时间
     *
     * @param handleTime 审核处理时间
     */
    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
    }

    /**
     * 获取审核创建时间
     *
     * @return create_time - 审核创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置审核创建时间
     *
     * @param createTime 审核创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取1,头像 2 背景图片
     *
     * @return type - 1,头像 2 背景图片
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置1,头像 2 背景图片
     *
     * @param type 1,头像 2 背景图片
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * @param version
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", gender=").append(gender);
        sb.append(", birthday=").append(birthday);
        sb.append(", headImg=").append(headImg);
        sb.append(", checked=").append(checked);
        sb.append(", handle=").append(handle);
        sb.append(", handleTime=").append(handleTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", type=").append(type);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}