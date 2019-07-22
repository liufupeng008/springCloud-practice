package com.fupeng.springcloud.service;

import com.fupeng.springcloud.entities.Product;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by liufupeng on 2019/7/21.
 */
//org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'productController_Feign': Unsatisfied dependency expressed through field 'service'; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'com.fupeng.springcloud.service.ProductClientService': FactoryBean threw exception on object creation; nested exception is java.lang.IllegalStateException: No fallback instance of type class com.fupeng.springcloud.service.ProductClientServerFallBack found for feign client microservice-product

@Component
public class ProductClientServerFallBack implements  ProductClientService {
    @Override
    public boolean add(Product product) {
        return false;
    }

    @Override
    public Product get(Long id) {
        return new Product(id,"id="+id+"无数据--@feignclient&hystrix","无有效数据库");
    }

    @Override
    public List<Product> list() {
        return null;
    }
}
