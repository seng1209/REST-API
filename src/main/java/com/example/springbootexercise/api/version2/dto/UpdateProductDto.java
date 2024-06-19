package com.example.springbootexercise.api.version2.dto;

import java.math.BigDecimal;

public record UpdateProductDto(
        String name,
        BigDecimal price,
        Boolean activeForSell
) {
}
