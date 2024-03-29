package com.itheima.service.impl;

import com.itheima.domain.Product;
import com.itheima.mapper.ProductMapper;
import com.itheima.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;
    @Override
    public List<Product> findAll() throws Exception {
        return productMapper.findAll();
    }

    @Override
    public Product findById(String id) {
        return productMapper.findById(id);
    }
}
