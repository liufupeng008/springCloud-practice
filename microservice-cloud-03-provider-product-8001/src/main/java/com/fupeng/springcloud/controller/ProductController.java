package com.fupeng.springcloud.controller;

import com.fupeng.springcloud.entities.Product;
import com.fupeng.springcloud.service.ProductService;
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
    public boolean add(Product product) {
        return productService.add(product);
    }
    @RequestMapping(value = "/product/get/{id}", method = RequestMethod.GET)
    public Product get(@PathVariable("id") Long id) {
        return productService.get(id);
    }
    @RequestMapping(value = "/product/list", method = RequestMethod.GET)
    public List<Product> list() {
        return productService.list();
    }

}
