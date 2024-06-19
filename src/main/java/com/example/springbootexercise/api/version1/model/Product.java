package com.example.springbootexercise.api.version1.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Product {

    private Integer id;
    private String name;
    private Double price;
    private Boolean active_for_sell;

    public Product(Integer id, String name, Double price, Boolean active_for_sell){
        this.id = id;
        this.name = name;
        this.price = price;
        this.active_for_sell = active_for_sell;
    }
}
