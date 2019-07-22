package com.fupeng.springcloud.controller;

import com.fupeng.springcloud.entities.Product;
import com.fupeng.springcloud.service.ProductService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by liufupeng on 2019/7/1.
 */
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;
    @RequestMapping(value = "/product/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Product product) {
        return productService.add(product);
    }

    //fallbackMethod 指定当get方法出现异常时，将要调用的处理方法
    @HystrixCommand(fallbackMethod = "getFallback")
    @RequestMapping(value = "/product/get/{id}", method = RequestMethod.GET)
    public Product get(@PathVariable("id") Long id) {
        Product product = productService.get(id);

        if (product == null){
            throw  new RuntimeException("id=" + id + "无效");
        }
        return product;
    }

    @RequestMapping(value = "/product/list", method = RequestMethod.GET)
    public List<Product> list() {
        return productService.list();
    }

    //当get方法出现异常时，则会调用此方法. 注意此方法的返回值，参数列表与原方法一致
    public Product getFallback(@PathVariable("id") Long id){
        return new Product(id,"id="+id+"无效hystrix","无法找到数据库");
    }
}
