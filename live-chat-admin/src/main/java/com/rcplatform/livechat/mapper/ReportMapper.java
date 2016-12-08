package com.rcplatform.livechat.mapper;


import com.rcplatform.livechat.common.mybatis.mapper.CommonMapper;
import com.rcplatform.livechat.dto.response.ReportDto;
import com.rcplatform.livechat.model.Report;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReportMapper extends CommonMapper<Report> {


    /**
     * 联合user查询用户信息
     * @param handle
     * @param reportPage
     * @return
     */
    List<ReportDto> selectJoinUser(@Param("isHandle") Integer handle, @Param("reportPage") Integer reportPage);
}