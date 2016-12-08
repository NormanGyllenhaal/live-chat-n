package com.rcplatform.livechat.dto.response;


import com.rcplatform.livechat.common.response.Page;

import java.util.List;

/**
 * Created by yang peng on 2016/9/27.
 */

public class PayStatDayDto {


    private List list;


    private Page page;


    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PayStatDayDto{");
        sb.append("list=").append(list);
        sb.append(", page=").append(page);
        sb.append('}');
        return sb.toString();
    }
}
