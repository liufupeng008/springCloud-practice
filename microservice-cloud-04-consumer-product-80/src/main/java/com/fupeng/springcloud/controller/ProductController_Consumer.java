package com.fupeng.springcloud.controller;

import com.fupeng.springcloud.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by liufupeng on 2019/7/1.
 */
@RestController
public class ProductController_Consumer {

    //private final static String REST_URL_REFIX = "http://localhost:8001";
    private final static String REST_URL_REFIX = "http://microservice-product";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/conssumer/product/add")
    public boolean add(Product product){
      return restTemplate.postForObject(REST_URL_REFIX+"/product/add",product,Boolean.class);
    }

    @RequestMapping(value = "/conssumer/product/get/{id}")
    public Product get(@PathVariable("id") Long id){
      return restTemplate.getForObject(REST_URL_REFIX+"/product/get/" + id,Product.class);
    }

    @RequestMapping(value = "/conssumer/product/list")
    public List list(){
        return restTemplate.getForObject(REST_URL_REFIX+"/product/list",List.class);
    }
}
