package com.fupeng.springcloud.mapper;

import com.fupeng.springcloud.entities.Product;

import java.util.List;

/**
 * Created by liufupeng on 2019/6/30.
 */
//@Mapper //或者在启动类上标识@MapperScan
public interface ProductMapper {

    Product findById(Long pid);

    List<Product> findAll();

    boolean addProduct(Product product);
}
