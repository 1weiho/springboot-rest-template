package com.example.resttemplate.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, Integer> {

    UserEntity findByName(String name);

    List<UserEntity> findAll();

}
