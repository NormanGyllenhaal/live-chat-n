package com.rcplatform.livechat.mapper;


import com.rcplatform.livechat.common.mybatis.mapper.CommonMapper;
import com.rcplatform.livechat.model.StatisticsDay;
import org.apache.ibatis.annotations.Param;


import java.util.Date;
import java.util.List;

public interface StatisticsDayMapper extends CommonMapper<StatisticsDay> {

    /**
     * 统计视频数据
     * @return
     */
    StatisticsDay selectFromVideoRecord(@Param("beginTime") Date beginTime, @Param("endTime") Date endTime);


    /**
     * 统计朋友添加数据汇总
     * @return
     */
    Integer selectFromAddFriendRecord(@Param("beginTime") Date beginTime, @Param("endTime") Date endTime);


    /**
     * 统计消费数据
     * @return
     */
    StatisticsDay selectFromConsumeRecord(@Param("beginTime") Date beginTime, @Param("endTime") Date endTime);


    /**
     * 统计朋友数据
     * @return
     */
    StatisticsDay selectUserFriend(@Param("beginTime") Date beginTime, @Param("endTime") Date endTime);


    /**
     * 查询视频统计数据
     * @param beginDate
     * @param endDate
     * @return
     */
    List<StatisticsDay> selectVideo(@Param("beginDate") Date beginDate, @Param("endDate") Date endDate);


    /**
     * 查询朋友统计数据
     * @param beginDate
     * @param endDate
     * @return
     */
    List<StatisticsDay> selectFriend(@Param("beginDate") Date beginDate, @Param("endDate") Date endDate);


    /**
     * 查询消费统计数据
     * @param beginDate
     * @param endDate
     * @return
     */
    List<StatisticsDay> selectConsume(@Param("beginDate") Date beginDate, @Param("endDate") Date endDate);



}