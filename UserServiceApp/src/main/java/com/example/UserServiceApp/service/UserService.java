package com.example.UserServiceApp.service;



import com.example.UserServiceApp.entity.UserAll;
import com.example.UserServiceApp.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public UserAll registerUser(UserAll user) {
        return userRepository.save(user);
    }

    public UserAll getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
    public List<UserAll> getAllUsers() {
        return userRepository.findAll();
    }
}

