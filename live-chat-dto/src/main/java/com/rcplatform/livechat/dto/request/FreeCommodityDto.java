package com.rcplatform.livechat.dto.request;

import com.rcplatform.livechat.model.FreeCommodity;

/**
 * Created by yang peng on 2016/11/15.
 */
public class FreeCommodityDto extends FreeCommodity {


    private Integer adminId;


    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }
}
