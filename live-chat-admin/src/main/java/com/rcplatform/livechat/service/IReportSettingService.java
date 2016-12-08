package com.rcplatform.livechat.service;

import com.rcplatform.livechat.model.ReportSetting;

import java.util.List;

/**
 * Created by yang peng on 2016/11/15.
 */
public interface IReportSettingService {


    List<ReportSetting> getReportSettingList();



    List<ReportSetting> updateReportSetting(ReportSetting reportSetting);



    List<ReportSetting> addReportSetting(ReportSetting reportSetting);



}
