package com.example.springbootdockercomposedemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootdockercomposedemo.models.Product;
import com.example.springbootdockercomposedemo.repositories.ProductRepository;

@RestController
@RequestMapping("/api/products")
public class ProductController {

  @Autowired
  ProductRepository productRepository;

  @GetMapping
  public List<Product> getAll() {
    return productRepository.findAll();
  }

  
}
