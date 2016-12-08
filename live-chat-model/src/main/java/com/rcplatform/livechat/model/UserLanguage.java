package com.rcplatform.livechat.model;



import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "rc_user_language")

public class UserLanguage implements Serializable {

    public UserLanguage(Integer userId, Integer languageId, String languageName) {
        this.userId = userId;
        this.languageId = languageId;
        this.languageName = languageName;
    }

    public UserLanguage() {
    }

    public UserLanguage(Integer userId) {
        this.userId = userId;
    }

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
     * 语言id
     */
    @Column(name = "language_id")

    private Integer languageId;

    /**
     * 语言名称
     */
    @Column(name = "language_name")

    private String languageName;

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
     * 获取语言id
     *
     * @return language_id - 语言id
     */
    public Integer getLanguageId() {
        return languageId;
    }

    /**
     * 设置语言id
     *
     * @param languageId 语言id
     */
    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    /**
     * 获取语言名称
     *
     * @return language_name - 语言名称
     */
    public String getLanguageName() {
        return languageName;
    }

    /**
     * 设置语言名称
     *
     * @param languageName 语言名称
     */
    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", languageId=").append(languageId);
        sb.append(", languageName=").append(languageName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}