package com.fupeng.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * Created by liufupeng on 2019/7/1.
 */

@EnableHystrix//开启Hystrix熔断机制
@EnableEurekaClient
@MapperScan("com.fupeng.springcloud.mapper")
@SpringBootApplication
public class ProductProvider_8001_Hystrix {
    public static  void  main(String[] args){
        SpringApplication.run(ProductProvider_8001_Hystrix.class,args);
    }
}
