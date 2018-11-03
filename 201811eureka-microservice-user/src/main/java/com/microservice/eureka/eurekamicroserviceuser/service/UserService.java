package com.microservice.eureka.eurekamicroserviceuser.service;

import com.microservice.eureka.eurekamicroserviceuser.entity.UserInfo;

/**
 * @包 名: com.microservice.eureka.eurekamicroserviceuser.service
 * @类 名:
 * @描 述:
 * @作 者: hyp
 * @邮 箱: henanyunpingearl@163.com
 * @创建日期: 2018/11/1 20:22
 */
public interface UserService {
    public UserInfo getUserInfoByUserCode(String userCode);
}
