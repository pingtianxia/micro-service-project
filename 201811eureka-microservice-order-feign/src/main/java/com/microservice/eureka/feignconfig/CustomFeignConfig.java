package com.microservice.eureka.feignconfig;
import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @作者 霍云平
 * @包名 com.microservice.eureka.feignconfig
 * @日期 2018/11/3 23:52
 * @描述 11
 * 自定义Feign配置类覆写Feign的默认配置
 *
 * 默认使用SpringMvc的契约
 * 这个类替换SpringMvc的契约，使用Feign的契约
 *
 * Feign使用过自定义的配置类，那么会存在一个问题，
 * 这个配置类不能放在微服务主程序默认能够扫描包的地方，因为如果可以扫描到的话，
 * 会使所有的Feign客户端都使用这个配置了。但是如果非得放到包可以扫描的地方，也不是不可以，
 * 得做一些特殊的配置
 *
 * 情况一：配置类放在主程序不能扫描到的包中
 * 情况二：配置类放在主程序不能扫描到包中，同时feign自定义配置类和默认配置一起混合使用
 * 情况三：配置类放在主程序能够扫描到的包中，同时feign自定义配置类和默认配置一起混合使用
 */
@Configuration
public class CustomFeignConfig {
    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }
}
