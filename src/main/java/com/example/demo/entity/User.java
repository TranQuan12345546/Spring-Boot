package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
public class User {
    private int id;
    private String username;
    private String email;
    private String password;
    private String avatar;
}
