package com.itheima.controller;

import com.itheima.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.itheima.service.ProductService;

import java.util.List;
@Controller
@RequestMapping("/Product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @RequestMapping("/findAll")
    public ModelAndView findAll() throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        List<Product> productList = productService.findAll();
        modelAndView.addObject("productList",productList);
        return modelAndView;
    }
}
