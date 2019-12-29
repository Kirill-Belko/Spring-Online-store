package com.onlinestore.app.controllers;

import com.onlinestore.app.entities.Category;
import com.onlinestore.app.entities.Producer;
import com.onlinestore.app.entities.Product;
import com.onlinestore.app.repositories.CategoryRepository;
import com.onlinestore.app.repositories.ProducerRepository;
import com.onlinestore.app.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/test")
public class TestController {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ProducerRepository producerRepository;

    @GetMapping("/main")
    public String getMainpage(){

        Category category = new Category();
        //category.setId(1);
        Producer producer = new Producer();
        //producer.setId(1);

        Product product = new Product();
        //product.setId(1);
        product.setCategory(category);
        product.setProducer(producer);
        categoryRepository.save(category);
        producerRepository.save(producer);
        product.setCategory(category);
        product.setProducer(producer);
        productRepository.save(product);

        return "/test/main";
    }

    @GetMapping("/phones")
    public String getPhonespage(){
        return "/test/phones";
    }
}
