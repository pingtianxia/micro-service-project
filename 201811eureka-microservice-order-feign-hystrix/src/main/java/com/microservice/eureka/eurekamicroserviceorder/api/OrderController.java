package com.microservice.eureka.eurekamicroserviceorder.api;

import com.microservice.eureka.eurekamicroserviceorder.entity.UserInfo;
import com.microservice.eureka.eurekamicroserviceorder.feign.UserMicroServiceFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @包 名: com.microservice.eureka.eurekamicroserviceorder.api
 * @类 名:
 * @描 述:
 * @作 者: hyp
 * @邮 箱: henanyunpingearl@163.com
 * @创建日期: 2018/11/2 11:07
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    private final Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private UserMicroServiceFeignClient userMicroServiceFeignClient;

    /**
     * 使用Feign调用用户微服务接口
     * @param userCode
     * @return
     */
    @RequestMapping("/getUserInfoByUserCode/{userCode}")
    public UserInfo getUserInfoByUserCode(@PathVariable String userCode){
        UserInfo userInfo = userMicroServiceFeignClient.getUserInfoByUserCode(userCode);
        return userInfo;
    }
}
