package com.fupeng.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by liufupeng on 2019/7/25.
 */

@EnableZuulProxy //http://localhost:7001/product/get/1
@SpringBootApplication
public class ZuulGateway_7001 {
    public static void main(String[] args){
        SpringApplication.run(ZuulGateway_7001.class,args);
    }
}
