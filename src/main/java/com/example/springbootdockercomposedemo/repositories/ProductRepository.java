package com.example.springbootdockercomposedemo.repositories;

import org.springframework.data.repository.ListCrudRepository;

import com.example.springbootdockercomposedemo.models.Product;

public interface ProductRepository extends ListCrudRepository<Product, Long> {
  
}
