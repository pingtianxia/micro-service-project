package com.hyp.springbootmybatis.dao;

import com.hyp.springbootmybatis.entity.UserInfo;
import org.springframework.stereotype.Repository;


/**
 * @包 名: com.hyp.springbootmybatis.dao
 * @类 名:
 * @描 述:
 * @作 者: hyp
 * @邮 箱: henanyunpingearl@163.com
 * @创建日期: 2018/11/1 20:21
 */
@Repository
public interface UserMapper {
    public UserInfo getUserInfoByUserCode(String userCode);
}
