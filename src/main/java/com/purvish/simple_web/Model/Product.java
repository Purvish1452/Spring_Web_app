package com.purvish.simple_web.Model;

import lombok.Data;

@Data
public class Product {
    private String name;
    private int productId;
    private int price;

    public Product(String name, int productId, int price) {
        this.name = name;
        this.productId = productId;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getProductId() {
        return productId;
    }

    public int getPrice() {
        return price;
    }
}
