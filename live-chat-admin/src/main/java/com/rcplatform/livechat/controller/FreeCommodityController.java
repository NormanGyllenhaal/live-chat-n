package com.rcplatform.livechat.controller;

import com.rcplatform.livechat.model.FreeCommodity;
import com.rcplatform.livechat.service.IFreeCommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by yang peng on 2016/11/15.
 */
@Controller
public class FreeCommodityController {


    @Autowired
    private IFreeCommodityService freeCommodityService;


    @RequestMapping(value = "freeCommodity", method = RequestMethod.GET)
    @ResponseBody
    public List<FreeCommodity> getFreeCommodity() {
        return freeCommodityService.getFreeCommodityList();
    }


    @RequestMapping(value = "freeCommodity", method = RequestMethod.POST)
    @ResponseBody
    public List<FreeCommodity> updateFreeCommodity(@RequestBody  FreeCommodity freeCommodity) {
        return freeCommodityService.updateFreeCommodity(freeCommodity);
    }
}
