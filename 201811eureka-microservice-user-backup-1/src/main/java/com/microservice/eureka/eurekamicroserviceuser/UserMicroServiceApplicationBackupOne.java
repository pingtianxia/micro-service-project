package com.microservice.eureka.eurekamicroserviceuser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.microservice.eureka.eurekamicroserviceuser.dao")
//@EnableEurekaClient
@EnableDiscoveryClient
public class UserMicroServiceApplicationBackupOne {

    public static void main(String[] args) {
        SpringApplication.run(UserMicroServiceApplicationBackupOne.class, args);
    }
}
