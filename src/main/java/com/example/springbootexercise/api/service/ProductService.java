package com.example.springbootexercise.api.version2.service;

import com.example.springbootexercise.api.version2.dto.CreateProductDto;
import com.example.springbootexercise.api.version2.dto.ProductDto;
import com.example.springbootexercise.api.version2.dto.UpdateProductDto;

import java.util.List;

public interface ProductService {

    // create product
    ProductDto createProduct(CreateProductDto createProductDto);

    // find product by id
    ProductDto findProductById(Integer id);

    // get all products
    List<ProductDto> findAllProduct();

    // update product by id
    ProductDto updateProductById(Integer id, UpdateProductDto updateProductDto);

}
