package com.example.resttemplate.service;

import com.example.resttemplate.model.ProductEntity;
import com.example.resttemplate.repo.ProductRepo;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductService {

    private final ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public ProductEntity getProduct(Integer id) {
        return productRepo.findById(id).get();
    }

    public ProductEntity saveProduct(ProductEntity product) {
        return productRepo.save(product);
    }

}
