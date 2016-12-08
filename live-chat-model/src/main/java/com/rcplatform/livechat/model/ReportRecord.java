package com.rcplatform.livechat.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_report_record")
public class ReportRecord implements Serializable {

    public ReportRecord() {
    }

    public ReportRecord(Integer useId, Date offTime, Integer offDuration) {
        this.useId = useId;
        this.offTime = offTime;
        this.offDuration = offDuration;
    }


    public ReportRecord(Integer useId) {
        this.useId = useId;
    }

    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "use_id")
    private Integer useId;

    /**
     * 禁用的时间
     */
    @Column(name = "off_time")
    private Date offTime;

    /**
     * 禁用的时间长度 ，小时
     */
    @Column(name = "off_duration")
    private Integer offDuration;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 记录创建时间
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
     * @return use_id - 用户id
     */
    public Integer getUseId() {
        return useId;
    }

    /**
     * 设置用户id
     *
     * @param useId 用户id
     */
    public void setUseId(Integer useId) {
        this.useId = useId;
    }

    /**
     * 获取禁用的时间
     *
     * @return off_time - 禁用的时间
     */
    public Date getOffTime() {
        return offTime;
    }

    /**
     * 设置禁用的时间
     *
     * @param offTime 禁用的时间
     */
    public void setOffTime(Date offTime) {
        this.offTime = offTime;
    }

    /**
     * 获取禁用的时间长度 ，小时
     *
     * @return off_duration - 禁用的时间长度 ，小时
     */
    public Integer getOffDuration() {
        return offDuration;
    }

    /**
     * 设置禁用的时间长度 ，小时
     *
     * @param offDuration 禁用的时间长度 ，小时
     */
    public void setOffDuration(Integer offDuration) {
        this.offDuration = offDuration;
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
     * 获取记录创建时间
     *
     * @return create_time - 记录创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置记录创建时间
     *
     * @param createTime 记录创建时间
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
        sb.append(", useId=").append(useId);
        sb.append(", offTime=").append(offTime);
        sb.append(", offDuration=").append(offDuration);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}