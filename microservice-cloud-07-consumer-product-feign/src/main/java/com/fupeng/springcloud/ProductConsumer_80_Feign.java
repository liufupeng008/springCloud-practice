package com.fupeng.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by liufupeng on 2019/7/1.
 */

@EnableFeignClients(basePackages = {"com.fupeng.springcloud.service"})
@EnableEurekaClient
@SpringBootApplication
public class ProductConsumer_80_Feign {
    public static  void  main(String[] args){
        SpringApplication.run(ProductConsumer_80_Feign.class,args);
    }
}
