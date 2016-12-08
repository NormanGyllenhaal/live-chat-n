package com.rcplatform.livechat.model;



import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_consume_record")
public class ConsumeRecord implements Serializable {

    public ConsumeRecord(Integer userId, Integer consumeId) {
        this.userId = userId;
        this.consumeId = consumeId;
    }

    public ConsumeRecord() {
    }

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
     * 用户消费的id
     */
    @Column(name = "consume_id")

    private Integer consumeId;

    /**
     * 消费记录创建时间
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
     * 获取用户消费的id
     *
     * @return consume_id - 用户消费的id
     */
    public Integer getConsumeId() {
        return consumeId;
    }

    /**
     * 设置用户消费的id
     *
     * @param consumeId 用户消费的id
     */
    public void setConsumeId(Integer consumeId) {
        this.consumeId = consumeId;
    }

    /**
     * 获取消费记录创建时间
     *
     * @return create_time - 消费记录创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置消费记录创建时间
     *
     * @param createTime 消费记录创建时间
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
        sb.append(", consumeId=").append(consumeId);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}