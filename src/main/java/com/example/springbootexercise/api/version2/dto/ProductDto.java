package com.example.springbootexercise.api.version2.dto;

import java.math.BigDecimal;

public record ProductDto(
        Integer id,
        String name,
        BigDecimal price,
        Boolean activeForSell) {
}
