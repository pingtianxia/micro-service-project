package com.microservice.eureka.eurekamicroserviceuser.api;

import com.microservice.eureka.eurekamicroserviceuser.entity.UserInfo;
import com.microservice.eureka.eurekamicroserviceuser.service.UserService;
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
    public UserInfo getUserInfoByUserCode(@PathVariable String userCode){
        return userService.getUserInfoByUserCode(userCode);
    }
}
