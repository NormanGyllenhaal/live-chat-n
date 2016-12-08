package com.rcplatform.livechat.common.response;


import java.io.Serializable;

/**
 * Created by yangpeng on 2016/7/13.
 */

public class Response<T> implements Serializable {

    public Response() {
    }

    public Response(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public Response(Integer status, String msg, T body) {
        this.body = body;
        this.status = status;
        this.msg = msg;
    }


    private T body;


    private Integer status;


    private String msg;

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Response{");
        sb.append("body=").append(body);
        sb.append(", status=").append(status);
        sb.append(", msg='").append(msg).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
