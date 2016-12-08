package com.rcplatform.livechat.dto.request;

import java.util.List;

/**
 * Created by yang peng on 2016/9/13.
 */

public class UserHeadImgReqDto extends ImgAdminReqDto {



    private List<HeadImgChecked> list;




    public static class HeadImgChecked{


        private Integer imgId;


        private Integer checked;


        private Integer version;


        public Integer getImgId() {
            return imgId;
        }

        public void setImgId(Integer imgId) {
            this.imgId = imgId;
        }

        public Integer getChecked() {
            return checked;
        }

        public void setChecked(Integer checked) {
            this.checked = checked;
        }

        public Integer getVersion() {
            return version;
        }

        public void setVersion(Integer version) {
            this.version = version;
        }
    }


    public List<HeadImgChecked> getList() {
        return list;
    }

    public void setList(List<HeadImgChecked> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserHeadImgReqDto{");
        sb.append(", list=").append(list);
        sb.append('}');
        return sb.toString();
    }
}
