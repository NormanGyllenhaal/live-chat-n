package com.rcplatform.livechat.common.push;

/**
 * Created by yang peng on 2016/11/11.
 */
public class PushResult {

    public PushResult(Integer success, Integer fail) {
        this.success = success;
        this.fail = fail;
    }

    private Integer success;


    private Integer fail;


    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    public Integer getFail() {
        return fail;
    }

    public void setFail(Integer fail) {
        this.fail = fail;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Result{");
        sb.append("success=").append(success);
        sb.append(", fail=").append(fail);
        sb.append('}');
        return sb.toString();
    }
}
