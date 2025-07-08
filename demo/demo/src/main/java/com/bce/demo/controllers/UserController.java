package com.bce.demo.controllers;

import java.nio.file.Path;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bce.demo.controllers.services.UserService;
@RestController
@RequestMapping("/api/users")

@CrossOrigin("*") // Allow all origins for simplicity; adjust as needed

public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("")
    public List<User> getAllUser(int UserId) {
        return userService.findAll();        
    }

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable("userId") Integer userid) {
        return userService.getUserById(userid);        
    }

    @PostMapping("/add")
    public User createUser(@RequestBody User user) {
        return userService.create(user);
    }

    @PutMapping("/{userId}")
    public User updateUser(@PathVariable("userId") Integer userId, @RequestBody User user) {
        return userService.updateUser(userId, user);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId") Integer userId) {
        userService.deleteUser(userId);
    }
}
