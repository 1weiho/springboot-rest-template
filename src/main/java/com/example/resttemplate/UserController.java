package com.example.resttemplate;

import com.example.resttemplate.model.UserEntity;
import com.example.resttemplate.model.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    UserRepo userRepo;

    @Autowired
    public UserController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping("/users/{userID}")
    public UserEntity getUserByUserID(@PathVariable(value = "userID") Integer userID) {

        return userRepo.findByUserID(userID);

    }

    @GetMapping("/users/all")
    public List<UserEntity> getAllUsers() {

        return userRepo.findAll();

    }

    @PostMapping("/users/add")
    public String addUser(@RequestBody UserEntity userEntity) {

        userRepo.save(userEntity);

        return "User: " + userEntity.getName() + " added successfully";

    }
}