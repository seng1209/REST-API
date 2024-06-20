package com.example.springbootexercise.api.version2.mapper;

import com.example.springbootexercise.api.version2.dto.CreateProductDto;
import com.example.springbootexercise.api.version2.dto.ProductDto;
import com.example.springbootexercise.api.version2.dto.UpdateProductDto;
import com.example.springbootexercise.api.version2.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    // create
    Product fromProductDto(CreateProductDto createProductDto);

    // find by id
    ProductDto toProductDto(Product product);

    // find all
    List<ProductDto> toProductDtoList(List<Product> products);

    // update
    void fromUpdateProductDto(@MappingTarget Product product, UpdateProductDto updateProductDto);

}
