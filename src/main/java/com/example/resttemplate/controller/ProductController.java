package com.example.resttemplate.controller;

import com.example.resttemplate.model.ProductEntity;
import com.example.resttemplate.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/products")
public class ProductController {

    final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductEntity> get(@PathVariable Integer id) {
        try {
            ProductEntity product = productService.getProduct(id);
            return new ResponseEntity<>(product, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public ResponseEntity<ProductEntity> add(@RequestBody ProductEntity newProduct) {
        try {
            ProductEntity product = productService.saveProduct(newProduct);
            return new ResponseEntity<>(product, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
