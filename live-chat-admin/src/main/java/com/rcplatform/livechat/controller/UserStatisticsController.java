package com.rcplatform.livechat.controller;


import com.rcplatform.livechat.dto.request.StatisticsReqDto;
import com.rcplatform.livechat.model.UserStatistics;
import com.rcplatform.livechat.service.IUserStatisticsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yang peng on 2016/8/26.
 */
@RestController
@RequestMapping("statistics")
public class UserStatisticsController {

    @Resource
    private IUserStatisticsService userStatisticsService;

    /**
     * 返回用户统计数据
     * @param statisticsReqDto
     * @return
     */
    @RequestMapping(value = "getUserStatistics",method = RequestMethod.GET)
    @ResponseBody
    public List getUserStatistics(StatisticsReqDto statisticsReqDto){
        return userStatisticsService.getUserStatistics(statisticsReqDto);
    }



    @RequestMapping(value="findUserNow",method = RequestMethod.GET)
    @ResponseBody
    UserStatistics findUserNow(Integer adminId){
        return userStatisticsService.findUserNow(adminId);
    }

}
