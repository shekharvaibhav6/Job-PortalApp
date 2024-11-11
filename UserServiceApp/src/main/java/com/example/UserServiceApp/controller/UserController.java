package com.example.UserServiceApp.controller;



import com.example.UserServiceApp.entity.UserAll;
import com.example.UserServiceApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public UserAll registerUser(@RequestBody UserAll user) {
        return userService.registerUser(user);
    }

    @GetMapping("/{username}")
    public UserAll getUserByUsername(@PathVariable String username) {
        return userService.getUserByUsername(username);
    }
    @GetMapping
    public List<UserAll> getAllUsers() {
        return userService.getAllUsers();
    }
}
