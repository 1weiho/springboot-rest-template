package com.example.resttemplate.service;

import com.example.resttemplate.model.User;
import com.example.resttemplate.repo.UserRepo;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {

    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User getUser(Integer id) {
        return userRepo.findById(id).get();
    }

    public void saveUser(User user) {
        userRepo.save(user);
    }

    public List<User> listAllUser() {
        return userRepo.findAll();
    }

    public void deleteUser(Integer id) {
        userRepo.deleteById(id);
    }

}
