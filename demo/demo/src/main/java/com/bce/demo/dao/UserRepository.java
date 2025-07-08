package com.bce.demo.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.bce.demo.controllers.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    // JpaRepository provides basic CRUD operations
    // You can define custom query methods here if needed
    // For example:
    // List<User> findByName(String name);
}
