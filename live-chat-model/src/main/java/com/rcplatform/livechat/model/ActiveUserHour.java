package com.rcplatform.livechat.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_active_user_hour")
public class ActiveUserHour implements Serializable {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 总活跃数量
     */
    @Column(name = "total_active_count")

    private Integer totalActiveCount;

    /**
     * 男性活跃数量
     */
    @Column(name = "boy_active_count")

    private Integer boyActiveCount;

    /**
     * 女性活跃数量
     */
    @Column(name = "girl_active_count")

    private Integer girlActiveCount;

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
     * 获取总活跃数量
     *
     * @return total_active_count - 总活跃数量
     */
    public Integer getTotalActiveCount() {
        return totalActiveCount;
    }

    /**
     * 设置总活跃数量
     *
     * @param totalActiveCount 总活跃数量
     */
    public void setTotalActiveCount(Integer totalActiveCount) {
        this.totalActiveCount = totalActiveCount;
    }

    /**
     * 获取男性活跃数量
     *
     * @return boy_active_count - 男性活跃数量
     */
    public Integer getBoyActiveCount() {
        return boyActiveCount;
    }

    /**
     * 设置男性活跃数量
     *
     * @param boyActiveCount 男性活跃数量
     */
    public void setBoyActiveCount(Integer boyActiveCount) {
        this.boyActiveCount = boyActiveCount;
    }

    /**
     * 获取女性活跃数量
     *
     * @return girl_active_count - 女性活跃数量
     */
    public Integer getGirlActiveCount() {
        return girlActiveCount;
    }

    /**
     * 设置女性活跃数量
     *
     * @param girlActiveCount 女性活跃数量
     */
    public void setGirlActiveCount(Integer girlActiveCount) {
        this.girlActiveCount = girlActiveCount;
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
        sb.append(", totalActiveCount=").append(totalActiveCount);
        sb.append(", boyActiveCount=").append(boyActiveCount);
        sb.append(", girlActiveCount=").append(girlActiveCount);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}