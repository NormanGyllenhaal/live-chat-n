package com.rcplatform.livechat.service.impl;

import com.rcplatform.livechat.mapper.FreeCommodityMapper;
import com.rcplatform.livechat.model.FreeCommodity;
import com.rcplatform.livechat.service.IFreeCommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yang peng on 2016/11/15.
 */
@Service
public class FreeCommodityServiceImpl implements IFreeCommodityService{


    @Autowired
    private FreeCommodityMapper freeCommodityMapper;



    public List<FreeCommodity> getFreeCommodityList(){
           return freeCommodityMapper.selectAll();
    }



    public List<FreeCommodity> updateFreeCommodity(FreeCommodity freeCommodity){
        freeCommodityMapper.updateByPrimaryKeySelective(freeCommodity);
        return freeCommodityMapper.selectAll();
    }
}
