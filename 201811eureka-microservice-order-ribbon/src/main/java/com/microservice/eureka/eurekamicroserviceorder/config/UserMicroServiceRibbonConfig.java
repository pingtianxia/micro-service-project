package com.microservice.eureka.eurekamicroserviceorder.config;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @包 名: com.microservice.eureka.eurekamicroserviceorder.config
 * @类 名:
 * @描 述:自定义的Ribbon配置类
 * @作 者: hyp
 * @邮 箱: henanyunpingearl@163.com
 * @创建日期: 2018/11/3 15:29
 *
 *  如果要自定义Ribbon配置，
 *  则需要把这个配置类放在@SpringBootApplication扫不到的包中（@ComponentScan），
 *  因为如果可以扫到自定义的Ribbon配置类的话，那么会对所有的Riboon都生效
 *
 *  如果非要放在@SpringBootApplication扫到的包中也是可以的
 *  新建 public @interface ExcludeRibbonConfig {} 注解类（这个类没有实在的意义就是为了一个标识）
 *  在这个类上添加新创建的注解类 的注解
 *  在springboot启动类中添加
 *  @ComponentScan(excludeFilters = {@Filter(type=FilterType.ANNOTATION,value = ExcludeRibbonConfig.class)})
 *  意识是： 在包扫描的时候剔除掉带有 @ExcludeRibbonConfig 注解的类 不让他扫描进来
 */
@Configuration
@ExcludeRibbonConfig
public class UserMicroServiceRibbonConfig {
    /**
     * 负载均衡策略：随机
     * @return
     */
    @Bean
    public IRule ribbonRule(){
        return new RandomRule();
    }
}
