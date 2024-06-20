package com.example.springbootexercise.api.version2.repository;

import com.example.springbootexercise.api.version2.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    boolean existsById(Integer id);

    Optional<Product> findById(Integer id);

}
