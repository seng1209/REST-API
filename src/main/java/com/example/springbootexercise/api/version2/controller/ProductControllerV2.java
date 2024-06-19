package com.example.springbootexercise.api.version2.controller;

import com.example.springbootexercise.api.version2.dto.CreateProductDto;
import com.example.springbootexercise.api.version2.dto.ProductDto;
import com.example.springbootexercise.api.version2.dto.UpdateProductDto;
import com.example.springbootexercise.api.version2.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2/products")
@AllArgsConstructor
public class ProductControllerV2 {

    private final ProductService productService;

    @PostMapping
    public ProductDto createProduct(@RequestBody CreateProductDto createProductDto){
        return productService.createProduct(createProductDto);
    }

    @GetMapping("/{id}")
    public ProductDto findProductById(@PathVariable Integer id){
        return productService.findProductById(id);
    }

    @GetMapping
    public List<ProductDto> findAllProduct(){
        return productService.findAllProduct();
    }

    @PutMapping("/{id}")
    public ProductDto updateProductById(@PathVariable Integer id, @RequestBody UpdateProductDto updateProductDto){
        return productService.updateProductById(id, updateProductDto);
    }

}
