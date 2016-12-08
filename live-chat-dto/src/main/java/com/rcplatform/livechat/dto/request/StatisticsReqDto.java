package com.rcplatform.livechat.dto.request;

import java.sql.Date;

/**
 * Created by yang peng on 2016/8/26.
 */

public class StatisticsReqDto {


    public StatisticsReqDto() {
    }

    public StatisticsReqDto(Date beginDate, Date endDate) {
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    /**
     * 管理员id
     */

    private Integer adminId;

    /**
     * 创建时间
     */

    private Date beginDate;

    /**
     * 更新时间
     */

    private Date endDate;


    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StatisticsReqDto{");
        sb.append("adminId=").append(adminId);
        sb.append(", beginDate=").append(beginDate);
        sb.append(", endDate=").append(endDate);
        sb.append('}');
        return sb.toString();
    }
}
