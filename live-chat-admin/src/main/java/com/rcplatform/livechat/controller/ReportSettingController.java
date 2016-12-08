package com.rcplatform.livechat.controller;

import com.rcplatform.livechat.model.ReportSetting;
import com.rcplatform.livechat.service.IReportSettingService;
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
public class ReportSettingController {


    @Autowired
    private IReportSettingService reportSettingService;


    @RequestMapping(value= "reportSetting",method = RequestMethod.GET)
    @ResponseBody
    public List<ReportSetting> getReportSetting(){
         return reportSettingService.getReportSettingList();
    }


    @RequestMapping(value="reportSetting",method = RequestMethod.PUT)
    @ResponseBody
    public List<ReportSetting> updateReportSetting(@RequestBody  ReportSetting reportSetting){
        return reportSettingService.updateReportSetting(reportSetting);
    }

    @RequestMapping(value="reportSetting",method = RequestMethod.POST)
    @ResponseBody
    public List<ReportSetting> addReportSetting(@RequestBody ReportSetting reportSetting){
        return reportSettingService.addReportSetting(reportSetting);
    }
}
