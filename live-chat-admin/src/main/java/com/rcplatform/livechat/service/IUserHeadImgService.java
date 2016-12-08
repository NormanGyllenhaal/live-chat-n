package com.rcplatform.livechat.service;


import com.rcplatform.livechat.common.response.Page;
import com.rcplatform.livechat.dto.request.ImgAdminReqDto;
import com.rcplatform.livechat.dto.request.UserHeadImgReqDto;

/**
 * 用户图片
 * Created by Administrator on 2016/9/11.
 */
public interface IUserHeadImgService {


    /**
     * 分页获取图片
     * @return
     */
    Page getImg(ImgAdminReqDto imgAdminReqDto);


    /**
     * 处理图片
     * @return
     */
   Page handleImg(UserHeadImgReqDto userHeadImgReqDto);




    Page forbidUser(ImgAdminReqDto imgAdminReqDto);
}
