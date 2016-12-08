package com.rcplatform.livechat.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_push_language")
public class PushLanguage implements Serializable {
    /**
     * 主键
     *
     */
    @Id
    private Integer id;

    /**
     * 推送id
     */
    @Column(name = "push_id")
    private Integer pushId;

    /**
     * 语言id
     */
    @Column(name = "language_id")
    private Integer languageId;

    /**
     * 语言的内容
     */
    private String context;

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
     * 获取推送id
     *
     * @return push_id - 推送id
     */
    public Integer getPushId() {
        return pushId;
    }

    /**
     * 设置推送id
     *
     * @param pushId 推送id
     */
    public void setPushId(Integer pushId) {
        this.pushId = pushId;
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
     * 获取语言的内容
     *
     * @return context - 语言的内容
     */
    public String getContext() {
        return context;
    }

    /**
     * 设置语言的内容
     *
     * @param context 语言的内容
     */
    public void setContext(String context) {
        this.context = context;
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
        sb.append(", pushId=").append(pushId);
        sb.append(", languageId=").append(languageId);
        sb.append(", context=").append(context);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}