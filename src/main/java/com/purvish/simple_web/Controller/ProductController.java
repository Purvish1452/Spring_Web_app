package com.purvish.simple_web.Controller;

import com.purvish.simple_web.Model.Product;
import com.purvish.simple_web.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @RequestMapping("/p")
    public String getProduct() {
        return "This is a product controller.";
    }


    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }


    @GetMapping("/products/{productId}")
    public Product getProductById(@PathVariable int productId) {
        return service.getProductById(productId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product product) {
        service.addProduct(product);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product)
    {
        service.updateproduct(product);
    }

    @DeleteMapping("/products/{productId}")
    public void deleteProduct(@PathVariable  int productId)
    {
          // Implement delete functionality here
          service.deleteProduct(productId);
    }

}
