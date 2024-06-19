package com.example.springbootexercise.api.version1.controller;


import com.example.springbootexercise.api.version1.model.Product;
import com.example.springbootexercise.api.version1.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    ProductService productService = new ProductService();

    @PostMapping
    public void createProduct(@RequestBody Product product){
        productService.createProduct(product);
    }
    @GetMapping("/{id}")
    public Product findProductById(@PathVariable Integer id){
        return productService.findProductById(id);
    }


    @GetMapping
    public List<Product> findAllProducts(){
        return productService.getProducts();
    }


    @PutMapping("/{id}")
    public void updateProductById(@PathVariable Integer id,@RequestBody Product product){
        productService.updateProductById(id, product);
    }

}

