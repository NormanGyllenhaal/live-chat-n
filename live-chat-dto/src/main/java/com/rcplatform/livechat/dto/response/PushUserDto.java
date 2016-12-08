package com.rcplatform.livechat.dto.response;

/**
 * Created by yang peng on 2016/11/8.
 */
public class PushUserDto {


    private Integer userId;


    private String pushToken;


    private String languageId;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPushToken() {
        return pushToken;
    }

    public void setPushToken(String pushToken) {
        this.pushToken = pushToken;
    }

    public String getLanguageId() {
        return languageId;
    }

    public void setLanguageId(String languageId) {
        this.languageId = languageId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PushUserDto{");
        sb.append("userId=").append(userId);
        sb.append(", pushToken='").append(pushToken).append('\'');
        sb.append(", languageId='").append(languageId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
