package com.example.springbootexercise.api.version2.service;

import com.example.springbootexercise.api.version2.dto.CreateProductDto;
import com.example.springbootexercise.api.version2.dto.ProductDto;
import com.example.springbootexercise.api.version2.dto.UpdateProductDto;
import com.example.springbootexercise.api.version2.entities.Product;
import com.example.springbootexercise.api.version2.mapper.ProductMapper;
import com.example.springbootexercise.api.version2.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImplement implements ProductService{

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Override
    public ProductDto createProduct(CreateProductDto createProductDto) {
        Product product = productMapper.fromProductDto(createProductDto);
        productRepository.save(product);
        return productMapper.toProductDto(product);
    }

    @Override
    public ProductDto findProductById(Integer id) {
        Product product = productRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        String.format("Product at ID : %s not found!", id))
        );
        return productMapper.toProductDto(product);
    }

    @Override
    public List<ProductDto> findAllProduct() {
        List<Product> products = productRepository.findAll();
        return productMapper.toProductDtoList(products);
    }

    @Override
    public ProductDto updateProductById(Integer id, UpdateProductDto updateProductDto) {
        if (productRepository.existsById(id)){
            Product product = productRepository.findById(id).orElseThrow();
            productMapper.fromUpdateProductDto(product, updateProductDto);
            productRepository.save(product);
            return productMapper.toProductDto(product);
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                String.format("Product at ID : %s not found!", id));
    }
}
