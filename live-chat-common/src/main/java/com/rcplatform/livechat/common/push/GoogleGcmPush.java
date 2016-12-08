package com.rcplatform.livechat.common.push;


import com.alibaba.fastjson.JSON;
import com.google.android.gcm.server.*;

import java.io.IOException;
import java.util.List;

public class GoogleGcmPush {

    private static final String apiKey = "AIzaSyB_E74nTl3RSoVNfqjud7c5b4vZecrR_gg";

    private static String deviceRegId = "ce5jXWtYrxA:APA91bHmGIDMEAHKVBMeaSgmml24tWf3lgHXsHQbl-UtIu8KW3cA9iFY7U47U0DTFmq9N_zznxa_8uMvSMCpKjPVhSuxLLkH66igtfjN8-cp3DulOmS5l1Qc_eBhwZ1aOZLeaPS6iP72";



    /**
     * @param args
     */
    public static void main(String[] args) {
        Sender sender = new Sender(apiKey);
        PushMessage pushMessage = new PushMessage();
        pushMessage.setContent("测试");
        pushMessage.setType(0);
        Message message = new Message.Builder().addData("message", JSON.toJSONString(pushMessage)).build();
        Result result = null;
        System.out.println(message);
        try {
            result = sender.send(message, deviceRegId, 5);
            System.out.println(result);
            System.out.println("id:"+result.getMessageId());
            System.out.println("result:"+result.getCanonicalRegistrationId());
            System.out.println("error:"+result.getErrorCodeName());
        } catch (IOException e) {
            e.printStackTrace();
        }
        //为空，则消息未发送给任何设备
        if (result.getMessageId() != null) {
            String canonicalRegId = result.getCanonicalRegistrationId();
            System.out.println("id:"+canonicalRegId);
            //用户注册了新的注册id，或者谷歌服务器刷新了注册id。
            //用户注册了新id，旧的id会被保存一段时间。此时使用旧id发送消息，设备即使已使用新id，依然可以收到
            if (canonicalRegId != null) {
                // same device has more than on registration ID: update database
            }
        } else {
            String error = result.getErrorCodeName();
            if (error.equals(Constants.ERROR_NOT_REGISTERED)) {
                // application has been removed from device - unregister database
            }
        }
    }
    


    public static MulticastResult push(PushMessage pushMessage, List<String> deviceRedIdList){
        Sender sender = new Sender(apiKey);
        Message message = new Message.Builder().addData("message", JSON.toJSONString(pushMessage)).build();
        MulticastResult result = null;
        try {
            result = sender.send(message, deviceRedIdList, 5);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }



    public static class PushMessage{

        public PushMessage() {
        }

        public PushMessage(Integer type, String content) {
            this.type = type;
            this.content = content;
        }

        private Integer type;

        private String content;


        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("PushMessage{");
            sb.append("type=").append(type);
            sb.append(", content='").append(content).append('\'');
            sb.append('}');
            return sb.toString();
        }
    }


}
