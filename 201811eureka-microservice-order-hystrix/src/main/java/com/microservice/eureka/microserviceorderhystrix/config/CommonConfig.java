package com.microservice.eureka.microserviceorderhystrix.config;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @作者 霍云平
 * @包名 com.microservice.eureka.microserviceorderhystrix.config
 * @日期 2018/11/6 21:42
 * @描述 11
 */
@Configuration
public class CommonConfig {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
