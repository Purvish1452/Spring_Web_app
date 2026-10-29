package com.purvish.simple_web.Service;

import com.purvish.simple_web.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product("Product 1", 1, 100),
            new Product("Product 2", 2, 200),
            new Product("Product 3", 3, 300)
    ));
    public List<Product> getProducts() {
        return products;
    }


    public  Product getProductById(int productId) {
        return products.stream()
                .filter(p->p.getProductId()==productId)
                .findFirst().get();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateproduct(Product product) {
        for(int i=0;i<products.size();i++){
            Product p=products.get(i);
            if(p.getProductId()==product.getProductId())
            {
                products.set(i,product);
            }
        }
    }

    public void deleteProduct(int productId) {
//        products.removeIf(p->p.getProductId()==productId);
        int index=0;
        for(int i=0;i<products.size();i++){
            if(products.get(i).getProductId()==productId) {
                index = i;
                break;
            }
        }
        if(index!=0) {
            products.remove(index);
        }
    }
}
