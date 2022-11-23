package com.example.resttemplate;

import com.example.resttemplate.model.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    UserRepo userRepo;

    @Autowired
    public Controller(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping("/users/{name}")
    public String getUserByName(@PathVariable(value = "name") String name) {

        return userRepo.findByName(name).toString();

    }

    @GetMapping("/users/all")
    public String getAllUsers() {

        return userRepo.findAll().toString();

    }
}
