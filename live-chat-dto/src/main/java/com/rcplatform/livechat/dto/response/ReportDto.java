package com.rcplatform.livechat.dto.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.rcplatform.livechat.model.Report;

import java.sql.Date;

/**
 * Created by yang peng on 2016/9/13.
 */

public class ReportDto extends Report {


    private String reportedUserName;



    private String headImg;



    private String background;



    @JSONField(format = "yyyy-MM-dd")
    private Date birthday;



    private Integer gender;



    private String reportUserName;


    public String getReportedUserName() {
        return reportedUserName;
    }

    public void setReportedUserName(String reportedUserName) {
        this.reportedUserName = reportedUserName;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getReportUserName() {
        return reportUserName;
    }

    public void setReportUserName(String reportUserName) {
        this.reportUserName = reportUserName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ReportDto{");
        sb.append("reportedUserName='").append(reportedUserName).append('\'');
        sb.append(", headImg='").append(headImg).append('\'');
        sb.append(", background='").append(background).append('\'');
        sb.append(", birthday=").append(birthday);
        sb.append(", gender=").append(gender);
        sb.append(", reportUserName='").append(reportUserName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
