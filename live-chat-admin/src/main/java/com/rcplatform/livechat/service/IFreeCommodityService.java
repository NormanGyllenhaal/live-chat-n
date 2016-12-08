package com.rcplatform.livechat.service;

import com.rcplatform.livechat.model.FreeCommodity;

import java.util.List;

/**
 * Created by yang peng on 2016/11/15.
 */
public interface IFreeCommodityService {



    List<FreeCommodity> getFreeCommodityList();




    List<FreeCommodity> updateFreeCommodity(FreeCommodity freeCommodity);
}
