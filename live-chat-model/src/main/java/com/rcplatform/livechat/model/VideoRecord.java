package com.rcplatform.livechat.model;



import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_video_record")

public class VideoRecord implements Serializable {

    public VideoRecord(Integer userId, Integer gender, Integer matchedGender, Integer matchedId, Integer isFriend, Long videoTime) {
        this.userId = userId;
        this.gender = gender;
        this.matchedGender = matchedGender;
        this.matchedId = matchedId;
        this.isFriend = isFriend;
        this.videoTime = videoTime;
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

    /**
     * 匹配用户的性别
     */
    @Column(name = "matched_gender")

    private Integer matchedGender;

    /**
     * 匹配的用户id
     */
    @Column(name = "matched_id")

    private Integer matchedId;

    /**
     * 双方是否为朋友关系 1 朋友关系 2 非朋友关系
     */
    @Column(name = "is_friend")

    private Integer isFriend;

    /**
     * 用户的 视频聊天时长
     */
    @Column(name = "video_time")

    private Long videoTime;

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
     * 获取匹配用户的性别
     *
     * @return matched_gender - 匹配用户的性别
     */
    public Integer getMatchedGender() {
        return matchedGender;
    }

    /**
     * 设置匹配用户的性别
     *
     * @param matchedGender 匹配用户的性别
     */
    public void setMatchedGender(Integer matchedGender) {
        this.matchedGender = matchedGender;
    }

    /**
     * 获取匹配的用户id
     *
     * @return matched_id - 匹配的用户id
     */
    public Integer getMatchedId() {
        return matchedId;
    }

    /**
     * 设置匹配的用户id
     *
     * @param matchedId 匹配的用户id
     */
    public void setMatchedId(Integer matchedId) {
        this.matchedId = matchedId;
    }

    /**
     * 获取双方是否为朋友关系 1 朋友关系 2 非朋友关系
     *
     * @return is_friend - 双方是否为朋友关系 1 朋友关系 2 非朋友关系
     */
    public Integer getIsFriend() {
        return isFriend;
    }

    /**
     * 设置双方是否为朋友关系 1 朋友关系 2 非朋友关系
     *
     * @param isFriend 双方是否为朋友关系 1 朋友关系 2 非朋友关系
     */
    public void setIsFriend(Integer isFriend) {
        this.isFriend = isFriend;
    }


    public Long getVideoTime() {
        return videoTime;
    }

    public void setVideoTime(Long videoTime) {
        this.videoTime = videoTime;
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
        sb.append(", matchedGender=").append(matchedGender);
        sb.append(", matchedId=").append(matchedId);
        sb.append(", isFriend=").append(isFriend);
        sb.append(", videoTime=").append(videoTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}