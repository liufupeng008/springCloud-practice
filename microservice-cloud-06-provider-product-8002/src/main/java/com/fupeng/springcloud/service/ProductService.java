package com.fupeng.springcloud.service;

import com.fupeng.springcloud.entities.Product;

import java.util.List;

/**
 * Created by liufupeng on 2019/7/1.
 */
public interface ProductService {

    boolean add(Product product);

    Product get(Long id);

    List<Product> list();


}
