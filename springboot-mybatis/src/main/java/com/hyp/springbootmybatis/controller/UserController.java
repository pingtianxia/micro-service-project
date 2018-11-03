package com.hyp.springbootmybatis.controller;

import com.hyp.springbootmybatis.entity.UserInfo;
import com.hyp.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @包 名: com.microservice.eureka.eurekamicroserviceuser.api
 * @类 名:
 * @描 述:
 * @作 者: hyp
 * @邮 箱: henanyunpingearl@163.com
 * @创建日期: 2018/11/1 20:27
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getUserInfoByUserCode/{userCode}")
    @ResponseBody
    public UserInfo getUserInfoByUserCode(@PathVariable String userCode){
        return userService.getUserInfoByUserCode(userCode);
    }
}
