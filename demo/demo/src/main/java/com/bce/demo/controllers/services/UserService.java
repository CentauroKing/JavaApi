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
    public User getUserById(Integer userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + userId));
    }
    public User updateUser(Integer userId, User user) {
        if(userRepository.existsById(userId)) {
            user.setId(userId);
            return userRepository.save(user);
        }
        return null;
    }
    
    public void deleteUser(Integer userId) {
        if (userRepository.existsById(userId)) {
            userRepository.deleteById(userId);
        }
    }
    // This service class can be used
}
