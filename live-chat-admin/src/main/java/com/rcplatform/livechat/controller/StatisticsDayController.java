package com.rcplatform.livechat.controller;


import com.rcplatform.livechat.common.response.Page;
import com.rcplatform.livechat.dto.request.PayStatReqDto;
import com.rcplatform.livechat.dto.request.StatisticsReqDto;
import com.rcplatform.livechat.dto.response.PayStatDayDto;
import com.rcplatform.livechat.dto.response.UserPayDayResp;
import com.rcplatform.livechat.model.MatchNumDay;
import com.rcplatform.livechat.model.PayStatDay;
import com.rcplatform.livechat.model.StatisticsDay;
import com.rcplatform.livechat.model.UserKeep;
import com.rcplatform.livechat.service.IStatisticsDayService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.sql.Date;
import java.util.List;

/**
 * Created by yang peng on 2016/8/26.
 */
@RestController
@RequestMapping("statistics")
public class StatisticsDayController {


    @Resource
    private IStatisticsDayService statisticsDayService;

    /**
     * 获取视频统计数据
     * @param statisticsReqDto
     * @return
     */
    @RequestMapping(value = "getVideoStatistics",method = RequestMethod.GET)
    @ResponseBody
    public List getVideoStatistics(StatisticsReqDto statisticsReqDto){
        return statisticsDayService.getVideoStatistics(statisticsReqDto);
    }


    /**
     * 获取朋友统计数据
     * @param statisticsReqDto
     * @return
     */
    @RequestMapping(value="getFriendStatistics",method = RequestMethod.GET)
    @ResponseBody
    public List getFriendStatistics(StatisticsReqDto statisticsReqDto){
        return statisticsDayService.getFriendStatistics(statisticsReqDto);
    }


    /**
     * 获取消费统计数据
     * @param statisticsReqDto
     * @return
     */
    @RequestMapping(value="getConsumeStatistics",method = RequestMethod.GET)
    @ResponseBody
    public List getConsumeStatistics(StatisticsReqDto statisticsReqDto){
        return statisticsDayService.getConsumeStatistics(statisticsReqDto);
    }


    /**
     * 获取匹配统计
     * @param statisticsReqDto
     * @return
     */
    @RequestMapping(value="getMatchNum",method = RequestMethod.GET)
    @ResponseBody
    public List getMatchNum(StatisticsReqDto statisticsReqDto){
        return statisticsDayService.getMatchNum(statisticsReqDto);
    }


    /**
     * 获取购买记录
     * @param payStatReqDto
     * @return
     */
    @RequestMapping(value="getPayStat",method = RequestMethod.GET)
    @ResponseBody
    public PayStatDayDto getPayStat(PayStatReqDto payStatReqDto){
        return statisticsDayService.getPayStatDay(payStatReqDto);
    }


    /**
     * 获取购买明细
     * @param payStatReqDto
     * @return
     */
    @RequestMapping(value="getUserPayRecord",method = RequestMethod.GET)
    @ResponseBody
    public Page getUserPayRecord(PayStatReqDto payStatReqDto){
        return statisticsDayService.getUserPayRecord(payStatReqDto);
    }




    @RequestMapping(value="getVideoNow",method = RequestMethod.GET)
    @ResponseBody
    StatisticsDay getVideoNow(Integer adminId){
        return statisticsDayService.getVideoNow(adminId);
    }


    @RequestMapping(value="getFriendNow",method = RequestMethod.GET)
    @ResponseBody
    StatisticsDay getFriendNow(Integer adminId){
        return statisticsDayService.getFriendNow(adminId);
    }


    @RequestMapping(value="getConsumeNow",method = RequestMethod.GET)
    @ResponseBody
    StatisticsDay getConsumeNow(Integer adminId){
        return statisticsDayService.getConsumeNow(adminId);
    }


    @RequestMapping(value="getPayStatDayNow",method = RequestMethod.GET)
    @ResponseBody
    PayStatDay getPayStatDayNow(Integer adminId){
        return statisticsDayService.getPayStatDayNow(adminId);
    }



    @RequestMapping(value="getMatchDayNow",method = RequestMethod.GET)
    @ResponseBody
    MatchNumDay getMatchDayNow(Integer adminId){
        return statisticsDayService.getMatchDayNow(adminId);
    }



    @RequestMapping(value="getUserKeepDay",method = RequestMethod.GET)
    @ResponseBody
    List getUserKeepDay(StatisticsReqDto statisticsReqDto){
        return statisticsDayService.getUserKeepDay(statisticsReqDto);
    }

    /**
     * 获取用户活跃当前
     * @param adminId
     * @return
     */
    @RequestMapping(value="getUserKeepNow",method = RequestMethod.GET)
    @ResponseBody
    UserKeep getUserKeepNow(Integer adminId){
        return statisticsDayService.getUserKeepNow(adminId);
    }



    @RequestMapping(value="getActiveUserHour",method = RequestMethod.GET)
    @ResponseBody
    List getActiveUserHour(Integer adminId,Date date){
        return statisticsDayService.getActiveUserHour(adminId,date);
    }





    @RequestMapping(value="getPayDayGroup",method = RequestMethod.GET)
    @ResponseBody
    List<UserPayDayResp> getPayDayGroup(Integer adminId, String date){
         return statisticsDayService.getUserPayGroupBy(adminId,date);
    }

}
