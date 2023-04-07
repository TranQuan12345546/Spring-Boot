package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping()
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/login")
    public ResponseEntity<?> login(@RequestParam String username, String password)  {
        List<User> users = userService.getUser(username);
        List<User> result = new ArrayList<>();
        for (User user : users) {
            if(password.equals(user.getPassword()) ) {
                result.add(user);
            }
        }
        return ResponseEntity.ok(result);
    }
}
