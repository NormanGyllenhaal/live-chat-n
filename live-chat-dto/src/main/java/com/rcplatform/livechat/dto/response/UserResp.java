package com.rcplatform.livechat.dto.response;

import com.rcplatform.livechat.model.User;

/**
 * Created by admin on 2016/12/7.
 */
public class UserResp extends User {


    /**
     * 被举报次数
     */
    private Integer reportCount;


    public Integer getReportCount() {
        return reportCount;
    }

    public void setReportCount(Integer reportCount) {
        this.reportCount = reportCount;
    }



}
