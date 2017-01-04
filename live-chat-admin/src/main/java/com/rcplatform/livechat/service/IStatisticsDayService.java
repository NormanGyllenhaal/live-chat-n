package com.rcplatform.livechat.service;


import com.rcplatform.livechat.common.response.Page;
import com.rcplatform.livechat.dto.request.PayStatReqDto;
import com.rcplatform.livechat.dto.request.StatisticsReqDto;
import com.rcplatform.livechat.dto.response.PayStatDayDto;
import com.rcplatform.livechat.dto.response.UserPayDayResp;
import com.rcplatform.livechat.model.MatchNumDay;
import com.rcplatform.livechat.model.PayStatDay;
import com.rcplatform.livechat.model.StatisticsDay;
import com.rcplatform.livechat.model.UserKeep;

import java.util.Date;
import java.util.List;

/**
 * Created by yang peng on 2016/8/26.
 */
public interface IStatisticsDayService {


    /**
     * 视频统计
     *
     * @param statisticsReqDto
     * @return
     */
    List getVideoStatistics(StatisticsReqDto statisticsReqDto);

    /**
     * 获取朋友统计数据
     *
     * @param statisticsReqDto
     * @return
     */

    List getFriendStatistics(StatisticsReqDto statisticsReqDto);

    /**
     * 获取消费统计
     *
     * @param statisticsReqDto
     * @return
     */

    List getConsumeStatistics(StatisticsReqDto statisticsReqDto);


    List getMatchNum(StatisticsReqDto statisticsReqDto);


    /**
     * 获取每日汇总记录
     *
     * @param payStatReqDto
     * @return
     */
    PayStatDayDto getPayStatDay(PayStatReqDto payStatReqDto);


    /**
     * 分页获取用户购买金币记录
     *
     * @param payStatReqDto
     * @return
     */
    Page getUserPayRecord(PayStatReqDto payStatReqDto);


    StatisticsDay getVideoNow(Integer adminId);


    StatisticsDay getFriendNow(Integer adminId);


    StatisticsDay getConsumeNow(Integer adminId);


    PayStatDay getPayStatDayNow(Integer adminId);


    MatchNumDay getMatchDayNow(Integer adminId);


    List getUserKeepDay(StatisticsReqDto statisticsReqDto);


    UserKeep getUserKeepNow(Integer adminId);


    List getActiveUserHour(Integer adminId, Date date);


    List<UserPayDayResp> getUserPayGroupBy(Integer adminId,String date);
}
