package com.example.resttemplate.model;

import jakarta.persistence.*;

@Entity
@Table(name = "product", schema = "rest-template")
public class ProductEntity {

    private Integer id;
    private String name;
    private Integer price;

    public ProductEntity() {
    }

    public ProductEntity(Integer id, String name, Integer price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
