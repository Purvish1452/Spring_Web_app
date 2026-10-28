package com.purvish.simple_web.Service;

import com.purvish.simple_web.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(
            new Product("Product 1", 1, 100),
            new Product("Product 2", 2, 200),
            new Product("Product 3", 3, 300)
    );
    public List<Product> getProducts() {
        return products;
    }
}
