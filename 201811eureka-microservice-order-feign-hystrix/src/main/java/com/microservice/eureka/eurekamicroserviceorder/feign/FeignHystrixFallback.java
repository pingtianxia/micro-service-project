package com.microservice.eureka.eurekamicroserviceorder.feign;

import com.microservice.eureka.eurekamicroserviceorder.api.OrderController;
import com.microservice.eureka.eurekamicroserviceorder.entity.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @包 名: com.microservice.eureka.eurekamicroserviceorder.feign
 * @类 名:
 * @描 述:
 * @作 者: hyp
 * @邮 箱: henanyunpingearl@163.com
 * @创建日期: 2018/11/7 15:45
 * 注解 @component
 * 把普通pojo实例化到spring容器中，相当于配置文件中的<bean id="" class=""/>  （定义Spring管理Bean）
 */
@Component
public class FeignHystrixFallback implements UserMicroServiceFeignClient {
    private final Logger logger = LoggerFactory.getLogger(FeignHystrixFallback.class);
    @Override
    public UserInfo getUserInfoByUserCode(String userCode) {
        logger.info("FeignHystrixFallback=====进入Fallback===>"+userCode);
        UserInfo userInfo = new  UserInfo();
        userInfo.setLevel("服务断路器开启");
        userInfo.setMobile("11111111111111111");
        userInfo.setUserCode(userCode);
        userInfo.setUserName("呼叫工程师来修复");
        userInfo.setUserSex("男的");
        return userInfo;
    }
}
