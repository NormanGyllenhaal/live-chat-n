package com.rcplatform.livechat.controller;


import com.rcplatform.livechat.common.response.Page;
import com.rcplatform.livechat.dto.request.ImgAdminReqDto;
import com.rcplatform.livechat.dto.request.UserHeadImgReqDto;
import com.rcplatform.livechat.service.IUserHeadImgService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/9/10.
 */
@RequestMapping("img")
@RestController
public class UserHeadImgController {


    @Resource
    private IUserHeadImgService userHeadImgService;

    /**
     * 分页获取图片列表
     * @return
     */
    @RequestMapping("getImg")
    @ResponseBody
    public Page getImg(@RequestBody ImgAdminReqDto imgAdminReqDto){
        int num = imgAdminReqDto.getPageNo() == null ? 1 : imgAdminReqDto.getPageNo();
        int size = imgAdminReqDto.getPageSize() == null ? 10 :  imgAdminReqDto.getPageSize();
        imgAdminReqDto.setPageNo(num);
        imgAdminReqDto.setPageSize(size);
        return userHeadImgService.getImg(imgAdminReqDto);
    }


    /**
     * 处理图片
     * @return
     */
    @RequestMapping("checkImg")
    @ResponseBody
    public Page handleImg(@RequestBody UserHeadImgReqDto userHeadImgReqDto){
        return userHeadImgService.handleImg(userHeadImgReqDto);
    }


    /**
     * 删除图片
     * @return
     */
    @RequestMapping(value="image/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public Page deleteImg(@PathVariable("id") Integer id,Integer pageNo,Integer pageSize){
        return null;
    }





    /**
     * 将一个用户封号
     * @return
     */
    @RequestMapping(value="forbid")
    @ResponseBody
    public Page forbidUser(@RequestBody  ImgAdminReqDto imgAdminReqDto){
        return userHeadImgService.forbidUser(imgAdminReqDto);
    }

}
