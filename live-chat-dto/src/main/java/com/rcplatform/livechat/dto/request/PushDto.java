package com.rcplatform.livechat.dto.request;


import com.rcplatform.livechat.model.Push;
import com.rcplatform.livechat.model.PushLanguage;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by yang peng on 2016/9/12.
 */

public class PushDto extends Push {

    @NotNull
    private Integer adminId;


    private List<PushLanguage> pushLanguages;



    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }


    public List<PushLanguage> getPushLanguages() {
        return pushLanguages;
    }

    public void setPushLanguages(List<PushLanguage> pushLanguages) {
        this.pushLanguages = pushLanguages;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PushDto{");
        sb.append("adminId=").append(adminId);
        sb.append(", pushLanguages=").append(pushLanguages);
        sb.append('}');
        return sb.toString();
    }
}
