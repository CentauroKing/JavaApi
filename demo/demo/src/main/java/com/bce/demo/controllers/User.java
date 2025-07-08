package com.bce.demo.controllers;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuario")

public class User {
    @Id
    private int id;
    private String name;
    private String addres;
    private String phone;

    // Additional fields, getters, setters, and methods can be added as needed
}
