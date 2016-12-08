package com.rcplatform.livechat.service;


import com.rcplatform.livechat.common.response.Page;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yang peng on 2016/8/11.
 */
@Component
public class AbstractService {


    protected Log log = LogFactory.getLog(this.getClass());





    /**
     * 获取到page对象
     * @param list
     * @return
     */
    public Page getPage(List list){
        com.github.pagehelper.Page page = (com.github.pagehelper.Page) list;
        return new Page((int)page.getTotal(),page.getPageNum(),page.getPages(),new ArrayList(page.getResult()));
    }







}
