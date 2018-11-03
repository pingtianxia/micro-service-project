package com.microservice.eureka.eurekamicroserviceorder;


import com.microservice.eureka.eurekamicroserviceorder.config.ExcludeRibbonConfig;
import com.microservice.eureka.eurekamicroserviceorder.config.UserMicroServiceRibbonConfig;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
//@EnableEurekaClient
@EnableDiscoveryClient
@RibbonClient(name = "microservice-eureka-user",configuration = UserMicroServiceRibbonConfig.class)
/**
 * 在包扫描的时候剔除掉带有 @ExcludeRibbonConfig 注解的类 不让他扫描进来
 */
@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = ExcludeRibbonConfig.class)})
public class MicroServiceOrderRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceOrderRibbonApplication.class, args);
    }
}
