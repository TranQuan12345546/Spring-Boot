package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping()
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/login")
    public ResponseEntity<?> login(@RequestParam String username, String password)  {
        User user = userService.getUser(username);
        if (user == null) {
            return new ResponseEntity<>("username hoặc password chưa chính xác", HttpStatus.OK);
        }
        if(password.equals(user.getPassword()) ) {
            return ResponseEntity.ok(user);
        } else {return new ResponseEntity<>("username hoặc password chưa chính xác", HttpStatus.OK);}
    }
}
