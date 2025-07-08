package com.bce.demo.controllers.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bce.demo.controllers.User;
import com.bce.demo.dao.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> findAll() {
        return userRepository.findAll();
    }
    public User create(User user) {
        return userRepository.save(user);
    }
    // This service class can be used
}
