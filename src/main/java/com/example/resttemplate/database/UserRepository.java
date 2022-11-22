package com.example.resttemplate.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    UserEntity findByName(String name);

    List<UserEntity> findAll();

}
