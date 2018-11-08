package com.microservice.eureka.eurekamicroserviceorder.feign;

import com.microservice.eureka.eurekamicroserviceorder.entity.UserInfo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @包 名: com.microservice.eureka.eurekamicroserviceorder.feign
 * @类 名:
 * @描 述:用户微服务FeignClient
 * @作 者: hyp
 * @邮 箱: henanyunpingearl@163.com
 * @创建日期: 2018/11/3 16:16
 */
@FeignClient(name = "microservice-eureka-user",fallback = FeignHystrixFallback.class)
public interface UserMicroServiceFeignClient {

    @RequestMapping(value = "/user/getUserInfoByUserCode/{userCode}",method = RequestMethod.GET)
    public UserInfo getUserInfoByUserCode(@PathVariable("userCode") String userCode);

}
