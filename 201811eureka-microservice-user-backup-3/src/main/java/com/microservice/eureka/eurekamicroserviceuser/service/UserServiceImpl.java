package com.microservice.eureka.eurekamicroserviceuser.service;

import com.microservice.eureka.eurekamicroserviceuser.dao.UserMapper;
import com.microservice.eureka.eurekamicroserviceuser.entity.UserInfo;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @包 名: com.microservice.eureka.eurekamicroserviceuser.service
 * @类 名:
 * @描 述:
 * @作 者: hyp
 * @邮 箱: henanyunpingearl@163.com
 * @创建日期: 2018/11/1 20:22
 */
@Service
public class UserServiceImpl implements UserService {
    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserMapper userMapper;
    @Override
    public UserInfo getUserInfoByUserCode(String userCode) {
        logger.info("backup-3 ====>"+userCode);
       UserInfo info = userMapper.getUserInfoByUserCode(userCode);
       return info;
    }
}
