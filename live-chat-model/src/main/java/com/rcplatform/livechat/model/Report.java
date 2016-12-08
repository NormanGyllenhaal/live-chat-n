package com.rcplatform.livechat.model;

import com.alibaba.fastjson.annotation.JSONField;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_report")

public class Report implements Serializable {

    public Report() {
    }

    public Report(Integer isHandle) {
        this.isHandle = isHandle;
    }

    public Report(Integer reportPage, Integer isHandle) {
        this.reportPage = reportPage;
        this.isHandle = isHandle;
    }

    public Report(Integer id,Integer isHandle, Integer result, String description, Date handleTime) {
        this.id = id;
        this.isHandle = isHandle;
        this.result = result;
        this.description = description;
        this.handleTime = handleTime;
    }

    /**
     * 主键
     */
    @Id
    private Integer id;

    @Column(name = "app_id")

    private Integer appId;

    /**
     * 举报人的id
     */
    @Column(name = "report_user_id")

    private Integer reportUserId;

    /**
     * 被举报人的id
     */
    @Column(name = "reported_user_id")

    private Integer reportedUserId;

    /**
     * 举报的截图
     */
    @Column(name = "report_img")

    private String reportImg;

    /**
     * 举报信息时间
     */
    @Column(name = "create_time")

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 是否已处理 1 未处理 2 已处理
     */
    @Column(name = "is_handle")

    private Integer isHandle;

    /**
     * 处理结果 1 接受举报，2.不接受举报
     */

    private Integer result;

    /**
     * 处理结果的描述
     */

    private String description;

    /**
     * 被举报的页面 1 视频聊天 2 个人主页
     */
    @Column(name = "report_page")

    private Integer reportPage;

    /**
     * 处理的时间
     */
    @Column(name = "handle_time")

    private Date handleTime;


    /**
     * 处理方式
     */
    @Column(name="handle_way")

    private Integer handleWay;


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
     * @return app_id
     */
    public Integer getAppId() {
        return appId;
    }

    /**
     * @param appId
     */
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    /**
     * 获取举报人的id
     *
     * @return report_user_id - 举报人的id
     */
    public Integer getReportUserId() {
        return reportUserId;
    }

    /**
     * 设置举报人的id
     *
     * @param reportUserId 举报人的id
     */
    public void setReportUserId(Integer reportUserId) {
        this.reportUserId = reportUserId;
    }

    /**
     * 获取被举报人的id
     *
     * @return reported_user_id - 被举报人的id
     */
    public Integer getReportedUserId() {
        return reportedUserId;
    }

    /**
     * 设置被举报人的id
     *
     * @param reportedUserId 被举报人的id
     */
    public void setReportedUserId(Integer reportedUserId) {
        this.reportedUserId = reportedUserId;
    }

    /**
     * 获取举报的截图
     *
     * @return report_img - 举报的截图
     */
    public String getReportImg() {
        return reportImg;
    }

    /**
     * 设置举报的截图
     *
     * @param reportImg 举报的截图
     */
    public void setReportImg(String reportImg) {
        this.reportImg = reportImg;
    }

    /**
     * 获取举报信息时间
     *
     * @return create_time - 举报信息时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置举报信息时间
     *
     * @param createTime 举报信息时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取是否已处理 1 未处理 2 已处理
     *
     * @return is_handle - 是否已处理 1 未处理 2 已处理
     */
    public Integer getIsHandle() {
        return isHandle;
    }

    /**
     * 设置是否已处理 1 未处理 2 已处理
     *
     * @param isHandle 是否已处理 1 未处理 2 已处理
     */
    public void setIsHandle(Integer isHandle) {
        this.isHandle = isHandle;
    }

    /**
     * 获取处理结果 1 接受举报，2.不接受举报
     *
     * @return result - 处理结果 1 接受举报，2.不接受举报
     */
    public Integer getResult() {
        return result;
    }

    /**
     * 设置处理结果 1 接受举报，2.不接受举报
     *
     * @param result 处理结果 1 接受举报，2.不接受举报
     */
    public void setResult(Integer result) {
        this.result = result;
    }

    /**
     * 获取处理结果的描述
     *
     * @return description - 处理结果的描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置处理结果的描述
     *
     * @param description 处理结果的描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取被举报的页面 1 视频聊天 2 个人主页
     *
     * @return report_page - 被举报的页面 1 视频聊天 2 个人主页
     */
    public Integer getReportPage() {
        return reportPage;
    }

    /**
     * 设置被举报的页面 1 视频聊天 2 个人主页
     *
     * @param reportPage 被举报的页面 1 视频聊天 2 个人主页
     */
    public void setReportPage(Integer reportPage) {
        this.reportPage = reportPage;
    }

    /**
     * 获取处理的时间
     *
     * @return handle_time - 处理的时间
     */
    public Date getHandleTime() {
        return handleTime;
    }

    /**
     * 设置处理的时间
     *
     * @param handleTime 处理的时间
     */
    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
    }


    public Integer getHandleWay() {
        return handleWay;
    }

    public void setHandleWay(Integer handleWay) {
        this.handleWay = handleWay;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Report{");
        sb.append("id=").append(id);
        sb.append(", appId=").append(appId);
        sb.append(", reportUserId=").append(reportUserId);
        sb.append(", reportedUserId=").append(reportedUserId);
        sb.append(", reportImg='").append(reportImg).append('\'');
        sb.append(", createTime=").append(createTime);
        sb.append(", isHandle=").append(isHandle);
        sb.append(", result=").append(result);
        sb.append(", description='").append(description).append('\'');
        sb.append(", reportPage=").append(reportPage);
        sb.append(", handleTime=").append(handleTime);
        sb.append(", handleWay=").append(handleWay);
        sb.append('}');
        return sb.toString();
    }
}