package com.rcplatform.livechat.service.impl;

import com.rcplatform.livechat.mapper.ReportSettingMapper;
import com.rcplatform.livechat.model.ReportSetting;
import com.rcplatform.livechat.service.IReportSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yang peng on 2016/11/15.
 */
@Service
public class ReportSettingServiceImpl implements IReportSettingService {


    @Autowired
    private ReportSettingMapper reportSettingMapper;

    @Override
    public List<ReportSetting> getReportSettingList() {
        return reportSettingMapper.selectAll();
    }


    @Override
    public List<ReportSetting> updateReportSetting(ReportSetting reportSetting) {
        reportSettingMapper.updateByPrimaryKeySelective(reportSetting);
        return reportSettingMapper.selectAll();
    }



    @Override
    public List<ReportSetting> addReportSetting(ReportSetting reportSetting) {
        reportSettingMapper.insert(reportSetting);
        return reportSettingMapper.selectAll();
    }
}
