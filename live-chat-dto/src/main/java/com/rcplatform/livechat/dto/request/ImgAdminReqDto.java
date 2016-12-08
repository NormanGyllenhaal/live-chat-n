package com.rcplatform.livechat.dto.request;

import java.util.Date;

/**
 * Created by yang peng on 2016/9/20.
 */

public class ImgAdminReqDto {


    private Integer userId;


    private Integer imageId;


    private Integer adminId;


    private Integer pageSize;



    private Integer pageNo;



    private Integer gender;



    private Integer type;



    private Date beginDate;


    private Date endDate;


    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ImgAdminReqDto{");
        sb.append("userId=").append(userId);
        sb.append(", imageId=").append(imageId);
        sb.append(", adminId=").append(adminId);
        sb.append(", pageSize=").append(pageSize);
        sb.append(", pageNo=").append(pageNo);
        sb.append(", gender=").append(gender);
        sb.append(", type=").append(type);
        sb.append(", beginDate=").append(beginDate);
        sb.append(", endDate=").append(endDate);
        sb.append('}');
        return sb.toString();
    }
}


