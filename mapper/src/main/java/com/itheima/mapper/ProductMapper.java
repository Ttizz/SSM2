package com.itheima.mapper;

import com.itheima.domain.Product;

import java.util.List;

public interface ProductMapper {
    public List<Product>findAll()throws Exception ;

    public Product findById(String id);
}
