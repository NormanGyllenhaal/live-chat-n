package com.rcplatform.livechat.model;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "rc_report_setting")
public class ReportSetting implements Serializable {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 禁用账号时长
     */
    private Integer time;

    /**
     * 举报次数
     */
    private Integer count;

    /**
     * 举报位置 0 全部 1 视频 2 主页
     */
    private Integer location;

    /**
     * 举报性别 0 全部 1 男性 2 女性
     */
    private Integer gender;

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
     * 获取禁用账号时长
     *
     * @return time - 禁用账号时长
     */
    public Integer getTime() {
        return time;
    }

    /**
     * 设置禁用账号时长
     *
     * @param time 禁用账号时长
     */
    public void setTime(Integer time) {
        this.time = time;
    }

    /**
     * 获取举报次数
     *
     * @return count - 举报次数
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 设置举报次数
     *
     * @param count 举报次数
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * 获取举报位置 0 全部 1 视频 2 主页
     *
     * @return location - 举报位置 0 全部 1 视频 2 主页
     */
    public Integer getLocation() {
        return location;
    }

    /**
     * 设置举报位置 0 全部 1 视频 2 主页
     *
     * @param location 举报位置 0 全部 1 视频 2 主页
     */
    public void setLocation(Integer location) {
        this.location = location;
    }

    /**
     * 获取举报性别 0 全部 1 男性 2 女性
     *
     * @return gender - 举报性别 0 全部 1 男性 2 女性
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置举报性别 0 全部 1 男性 2 女性
     *
     * @param gender 举报性别 0 全部 1 男性 2 女性
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", time=").append(time);
        sb.append(", count=").append(count);
        sb.append(", location=").append(location);
        sb.append(", gender=").append(gender);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}