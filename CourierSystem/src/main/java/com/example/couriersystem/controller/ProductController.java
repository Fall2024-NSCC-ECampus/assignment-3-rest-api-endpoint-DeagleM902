package com.example.couriersystem.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public void getAllProducts() {}

    @GetMapping("/{id}")
    public void getProductById(@PathVariable Long id) {}

    @PostMapping
    public void createProduct() {}

    @PutMapping("/{id}")
    public void updateProduct(@PathVariable Long id) {}

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {}
}
