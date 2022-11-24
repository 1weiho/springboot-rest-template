package com.example.resttemplate;

import com.example.resttemplate.model.UserEntity;
import com.example.resttemplate.model.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    UserRepo userRepo;

    @Autowired
    public Controller(UserRepo userRepo) {
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
}
