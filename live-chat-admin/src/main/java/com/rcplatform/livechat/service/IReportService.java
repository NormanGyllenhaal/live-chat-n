package com.rcplatform.livechat.service;


import com.rcplatform.livechat.common.response.Page;
import com.rcplatform.livechat.dto.request.ReportAdminReqDto;
import com.rcplatform.livechat.dto.request.ReportPutDto;
import com.rcplatform.livechat.dto.response.UserReportResp;
import com.rcplatform.livechat.model.ReportRecord;

import java.util.List;

/**
 * Created by Administrator on 2016/9/11.
 */
public interface IReportService {


    Page getReport(Integer adminId, Integer pageNo, Integer pageSize);


    Page handleReport(ReportAdminReqDto reportAdminReqDto);


    /**
     * 查看封号历史
     * @return
     */
    Page<ReportRecord> getReportRecord(Integer pageNo, Integer pageSize);


    /**
     * 查看当前被封号的用户
     * @return
     */
    List<UserReportResp> getOffUser();


    /**
     * 删除封号者图片
     * @param reportPutDto
     * @return
     */
    List<UserReportResp> deleteReportImage(ReportPutDto reportPutDto);


    /**
     * 更新封号时间
     * @param userId
     * @param time
     */
    void updateForbidTime(Integer userId,Integer time);


}
