package com.microservice.eureka.eurekamicroserviceorder.feign;

import com.microservice.eureka.feignconfig.CustomFeignConfig;
import feign.Param;
import feign.RequestLine;
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
//@FeignClient(name = "microservice-eureka-user",url = "http://localhost:9960/") Feign指定特定URL 只会访问 http://localhost:9960/
//@FeignClient(name = "microservice-eureka-user",url = "http://localhost:9960/")
// 使用自己自定义的Feign配置
@FeignClient(name = "microservice-eureka-user",url = "http://localhost:9960/",configuration = CustomFeignConfig.class)
public interface UserMicroServiceFeignClient {

//    @RequestMapping(value = "/user/getUserInfoByUserCode/{userCode}",method = RequestMethod.GET)
//    public Object getUserInfoByUserCode(@PathVariable("userCode") String userCode);
    // 使用自己自定义的Feign配置 使用Feign的契约
    @RequestLine("GET /user/getUserInfoByUserCode/{userCode}")
    public Object getUserInfoByUserCode(@Param("userCode") String userCode);



}
