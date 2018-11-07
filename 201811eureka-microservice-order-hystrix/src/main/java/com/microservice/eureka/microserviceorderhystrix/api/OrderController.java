package com.microservice.eureka.microserviceorderhystrix.api;
import com.microservice.eureka.microserviceorderhystrix.entity.UserInfo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @作者 霍云平
 * @包名 com.microservice.eureka.microserviceorderhystrix.api
 * @日期 2018/11/6 21:41
 * @描述 11
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    private final Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/getUserInfoByUserCode/{userCode}")
    @HystrixCommand(fallbackMethod = "getUserInfoByUserCodeFallback")
    public UserInfo getUserInfoByUserCode(@PathVariable String userCode){
        String url = "http://microservice-eureka-user/user/getUserInfoByUserCode/"+userCode;
        UserInfo userInfo = restTemplate.getForObject(url,UserInfo.class);
        logger.info("查询结果======>"+userInfo);
        return userInfo;
    }

    /**
     * 回退方法
     * @param userCode
     * @return
     */
    public UserInfo getUserInfoByUserCodeFallback(String userCode){
        logger.info("服务出现短路走Fallback方法=====getUserInfoByUserCodeFallback====userCode==>"+userCode);
        UserInfo userInfo = new  UserInfo();
        userInfo.setLevel("服务断路器开启");
        userInfo.setMobile("11111111111111111");
        userInfo.setUserCode(userCode);
        userInfo.setUserName("呼叫工程师来修复");
        userInfo.setUserSex("男的");
        return userInfo;
    }
}
