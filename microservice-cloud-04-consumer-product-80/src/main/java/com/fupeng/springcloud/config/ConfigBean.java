package com.fupeng.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by liufupeng on 2019/7/1.
 */
@Configuration
public class ConfigBean {

    @LoadBalanced
    @Bean
    public RestTemplate getTemplate(){
        return new RestTemplate();
    }
}
