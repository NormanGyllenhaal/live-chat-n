package com.rcplatform.livechat.dto.response;

import com.rcplatform.livechat.model.Admin;
import com.rcplatform.livechat.model.AdminFunction;

import java.util.List;

/**
 * Created by admin on 2016/12/19.
 */
public class AdminFunctionDto extends Admin {

    private List<AdminFunction> list;


    public List<AdminFunction> getList() {
        return list;
    }

    public void setList(List<AdminFunction> list) {
        this.list = list;
    }
}
