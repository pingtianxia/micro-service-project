package com.hyp.springbootmybatis.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * @包 名: com.hyp.springbootmybatis.entity
 * @类 名:
 * @描 述:
 * @作 者: hyp
 * @邮 箱: henanyunpingearl@163.com
 * @创建日期: 2018/11/1 20:20
 */
@Setter
@Getter
public class UserInfo {
    private String userCode;
    private String userName;
    private String mobile;
    private String level;
    private String userSex;

    @Override
    public String toString() {
        return "UserInfo{" +
                "userCode='" + userCode + '\'' +
                ", userName='" + userName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", level='" + level + '\'' +
                ", userSex='" + userSex + '\'' +
                '}';
    }
}
