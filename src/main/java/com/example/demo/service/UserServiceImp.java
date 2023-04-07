package com.example.demo.service;

import com.example.demo.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImp implements UserService{
    private static ArrayList<User> users = new ArrayList<User>();

    static {
        users.add(new User(1, "TranAnhQuan", "trananhquan335@gmail.com", "123", "avatar.jmg"));
        users.add(new User(2, "TranQuan", "trananhquan5@gmail.com", "123", "avatr.jmg"));
    }


    @Override
    public List<User> getListUser() {
        return users;
    }

    @Override
    public User getUser(String username) {
        for (User user : users) {
            if(username.equals(user.getUsername())) {
               return user;
            }
        }
        return null;
    }

}
