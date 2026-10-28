package com.purvish.simple_web.Controller;

import com.purvish.simple_web.Model.Product;
import com.purvish.simple_web.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @RequestMapping("/p")
    public String getProduct() {
        return "This is a product controller.";
    }


    @RequestMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }

}
