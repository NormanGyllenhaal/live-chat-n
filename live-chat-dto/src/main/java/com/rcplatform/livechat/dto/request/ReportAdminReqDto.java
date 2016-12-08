package com.rcplatform.livechat.dto.request;

import java.util.List;

/**
 * Created by yang peng on 2016/9/13.
 */

public class ReportAdminReqDto {



    private Integer adminId;



    private List<ReportStaticAdmin> list;



    public static class ReportStaticAdmin{

        public ReportStaticAdmin() {
        }

        public ReportStaticAdmin(Integer reportId, Integer result, String description, Integer handleWay) {
            this.reportId = reportId;
            this.result = result;
            this.description = description;
            this.handleWay = handleWay;
        }

        private Integer reportId;


        private Integer result;


        private String description;


        private Integer handleWay;


        public Integer getReportId() {
            return reportId;
        }

        public void setReportId(Integer reportId) {
            this.reportId = reportId;
        }

        public Integer getResult() {
            return result;
        }

        public void setResult(Integer result) {
            this.result = result;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Integer getHandleWay() {
            return handleWay;
        }

        public void setHandleWay(Integer handleWay) {
            this.handleWay = handleWay;
        }
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public List<ReportStaticAdmin> getList() {
        return list;
    }

    public void setList(List<ReportStaticAdmin> list) {
        this.list = list;
    }

}
