package com.rcplatform.livechat.common.response;

import java.io.Serializable;
import java.util.List;

/**
 * 分页
 * Created by yang peng on 2016/8/4.
 */

public class Page<E> implements Serializable {

    /**
     * 总条数
     */

    private Integer count;

    /**
     * 当前页
     */

    private Integer pageNo;

    /**
     * 总页数
     */

    private Integer pages;


    /**
     * list 列表
     */
    private List<E> list;

    public Page() {
    }

    public Page(Integer count, Integer pageNo, Integer pages, List list) {
        this.count = count;
        this.pageNo = pageNo;
        this.pages = pages;
        this.list = list;
    }



    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Page{");
        sb.append("count=").append(count);
        sb.append(", pageNo=").append(pageNo);
        sb.append(", pages=").append(pages);
        sb.append(", list=").append(list);
        sb.append('}');
        return sb.toString();
    }
}
