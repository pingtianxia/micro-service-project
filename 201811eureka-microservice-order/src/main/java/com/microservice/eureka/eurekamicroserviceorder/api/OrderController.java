package com.microservice.eureka.eurekamicroserviceorder.api;

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
    private RestTemplate restTemplate;

    /**
     * 方式二 ：从配置文件获取
     */
    @Value("${user.getUserInfoByUserCodeMethod2}")
    String getUserByIdURL;


    /**
     * 方式一：硬编码方式
     * @param userCode
     * @return
     */
    @RequestMapping("/method1/{userCode}")
    public Object getUserInfoByUserCode(@PathVariable String userCode){
        String url = "http://localhost:9991/user/getUserInfoByUserCode/"+userCode;
        logger.info("method1===>"+url);
        Object o = restTemplate.getForObject(url,Object.class);
        return o;
    }

    @RequestMapping("/method2/{userCode}")
    public Object getUserInfoByUserCode2(@PathVariable String userCode){
        String url = getUserByIdURL+userCode;
        logger.info("method2===>"+url);
        Object o = restTemplate.getForObject(url,Object.class);
        return o;
    }

    @RequestMapping("/method3/{userCode}")
    public Object getUserInfoByUserCode3(@PathVariable String userCode){
        String url = "http://microservice-eureka-user/user/getUserInfoByUserCode/"+userCode;
        logger.info("method3===>"+url);
        Object o = restTemplate.getForObject(url,Object.class);
        return o;
    }
}
