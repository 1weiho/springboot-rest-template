package com.example.resttemplate.repo;

import com.example.resttemplate.model.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<ProductEntity, Integer> {
}
