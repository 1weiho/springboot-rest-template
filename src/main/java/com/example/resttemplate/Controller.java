package com.example.resttemplate;

import com.example.resttemplate.database.UserEntity;
import com.example.resttemplate.database.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    UserRepository userRepository;

    @Autowired
    public Controller(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users/{name}")
    public String getUserByName(@PathVariable(value="name") String name) {

        return userRepository.findByName(name).toString();

    }

    @GetMapping("/users/all")
    public String getAllUsers() {

        return userRepository.findAll().toString();

    }
}
