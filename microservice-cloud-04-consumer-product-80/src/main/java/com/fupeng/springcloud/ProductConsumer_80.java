package com.fupeng.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by liufupeng on 2019/7/1.
 */
@EnableEurekaClient
@SpringBootApplication
public class ProductConsumer_80 {
    public static  void  main(String[] args){
        SpringApplication.run(ProductConsumer_80.class,args);
    }
}
