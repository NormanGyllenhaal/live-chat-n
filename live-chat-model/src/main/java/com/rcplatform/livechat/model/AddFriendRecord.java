package com.rcplatform.livechat.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_add_friend_record")

public class AddFriendRecord implements Serializable {


    public AddFriendRecord() {
    }

    public AddFriendRecord(Integer userId, Integer friendId, Integer addFriendWhen) {
        this.userId = userId;
        this.friendId = friendId;
        this.addFriendWhen = addFriendWhen;
    }


    public AddFriendRecord(Integer userId, Integer gender, Integer friendGender, Integer addFriendWhen, Integer friendId, Date createTime) {
        this.userId = userId;
        this.gender = gender;
        this.friendGender = friendGender;
        this.addFriendWhen = addFriendWhen;
        this.friendId = friendId;
        this.createTime = createTime;
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
     * 用户的性别 1 男性 2 女性
     */

    private Integer gender;

    @Column(name = "friend_gender")

    private Integer friendGender;

    /**
     * 在何处添加朋友 1 在视频的时候添加 2 在视频结束后添加 3 在匹配历史纪录浏览时添加
     */
    @Column(name = "add_friend_when")

    private Integer addFriendWhen;

    /**
     * 用户的 朋友id
     */
    @Column(name = "friend_id")

    private Integer friendId;

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
     * @return friend_gender
     */
    public Integer getFriendGender() {
        return friendGender;
    }

    /**
     * @param friendGender
     */
    public void setFriendGender(Integer friendGender) {
        this.friendGender = friendGender;
    }

    /**
     * 获取在何处添加朋友 1 在视频的时候添加 2 在视频结束后添加 3 在匹配历史纪录浏览时添加
     *
     * @return add_friend_when - 在何处添加朋友 1 在视频的时候添加 2 在视频结束后添加 3 在匹配历史纪录浏览时添加
     */
    public Integer getAddFriendWhen() {
        return addFriendWhen;
    }

    /**
     * 设置在何处添加朋友 1 在视频的时候添加 2 在视频结束后添加 3 在匹配历史纪录浏览时添加
     *
     * @param addFriendWhen 在何处添加朋友 1 在视频的时候添加 2 在视频结束后添加 3 在匹配历史纪录浏览时添加
     */
    public void setAddFriendWhen(Integer addFriendWhen) {
        this.addFriendWhen = addFriendWhen;
    }

    /**
     * 获取用户的 视频聊天时长
     *
     * @return friend_id - 用户的 视频聊天时长
     */
    public Integer getFriendId() {
        return friendId;
    }

    /**
     * 设置用户的 视频聊天时长
     *
     * @param friendId 用户的 视频聊天时长
     */
    public void setFriendId(Integer friendId) {
        this.friendId = friendId;
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
        sb.append(", gender=").append(gender);
        sb.append(", friendGender=").append(friendGender);
        sb.append(", addFriendWhen=").append(addFriendWhen);
        sb.append(", friendId=").append(friendId);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}