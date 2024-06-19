package com.example.springbootexercise.api.version1.service;

import com.example.springbootexercise.api.version1.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    List<Product> products = new ArrayList<>();

    public ProductService() {
        products.add(new Product(1, "Coke", 2.00D, true));
        products.add(new Product(2, "Pepis", 2.00D, true));
        products.add(new Product(3, "Kizz", 1.50D, true));
        products.add(new Product(4, "Redbull", 2.00D, false));
    }

    public List<Product> getProducts(){
        return products;
    }

    public Product findProductById(Integer id){
        for (Product p : products)
            if (p.getId().equals(id))
                return p;
        return null;
    }

    public void createProduct(Product product){
        products.add(product);
    }

    public void updateProductById(Integer id, Product product){
        for (Product p : products)
            if (p.getId().equals(id)){
                p.setName(product.getName());
                p.setPrice(product.getPrice());
                p.setActive_for_sell(product.getActive_for_sell());
            }
    }

}
