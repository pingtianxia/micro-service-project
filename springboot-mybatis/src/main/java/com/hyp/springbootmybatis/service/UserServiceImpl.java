package com.hyp.springbootmybatis.service;

import com.hyp.springbootmybatis.dao.UserMapper;
import com.hyp.springbootmybatis.entity.UserInfo;
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
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserInfo getUserInfoByUserCode(String userCode) {
       UserInfo info = userMapper.getUserInfoByUserCode(userCode);
       return info;
    }
}
