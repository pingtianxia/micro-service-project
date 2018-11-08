package com.microservice.eureka.eurekamicroserviceorder.config;

import feign.Logger;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @包 名: com.microservice.eureka.eurekamicroserviceorder.config
 * @类 名:
 * @描 述:
 * @作 者: hyp
 * @邮 箱: henanyunpingearl@163.com
 * @创建日期: 2018/11/2 11:13
 */
@Configuration
public class CommonConfig {

    /**
     * 方式一：硬编码方式
     * 方式二 ：从配置文件获取
     * 方式三 ： 使用Eureka必须添加上 @LoadBalanced 注解 ---负载均衡策略
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    /**
     * Feign添加日志输出
     * @return
     */
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
