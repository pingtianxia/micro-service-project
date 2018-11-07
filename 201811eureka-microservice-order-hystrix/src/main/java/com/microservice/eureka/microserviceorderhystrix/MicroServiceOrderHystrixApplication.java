package com.microservice.eureka.microserviceorderhystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Hystrix 插件监控状态的路径
 * http://192.168.1.138:9973/health
 *
 * Hystrix Metrics Stream:
 *
 * To enable the Hystrix metrics stream include a dependency on spring-boot-starter-actuator.
 * This will expose the /hystrix.stream as a management endpoint.
 * <dependency>
 *    <groupId>org.springframework.boot</groupId>
 *    <artifactId>spring-boot-starter-actuator</artifactId>
 * </dependency>
 * http://192.168.1.138:9973/hystrix.stream
 *
 * Hystrix Dashboard:
 * To include the Hystrix Dashboard in your project use the starter with group org.springframework.cloud and artifact id spring-cloud-starter-netflix-hystrix-dashboard
 * http://192.168.1.138:9973/hystrix
 */



@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
@EnableHystrixDashboard
public class MicroServiceOrderHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceOrderHystrixApplication.class, args);
    }
}
