//package com.microservice.eureka.ribbonconfig;
//
//import com.netflix.loadbalancer.IRule;
//import com.netflix.loadbalancer.RandomRule;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @包 名: com.microservice.eureka.ribbonconfig
// * @类 名:
// * @描 述:自定义的Ribbon配置类
// * @作 者: hyp
// * @邮 箱: henanyunpingearl@163.com
// * @创建日期: 2018/11/3 15:29
// * 如果要自定义Ribbon配置，
// * 则需要把这个配置类放在@SpringBootApplication扫不到的包中（@ComponentScan），
// * 因为如果可以扫到自定义的Ribbon配置类的话，那么会对所有的Riboon都生效
// */
//@Configuration
//public class UserMicroServiceRibbonConfig {
//    @Bean
//    public IRule ribbonRule(){
//        return new RandomRule();
//    }
//}
