package com.microservice.eureka.eurekamicroserviceorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
//@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
public class MicroServiceOrderFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceOrderFeignApplication.class, args);
    }
}
