package com.example.SpringBoot.service;

import com.example.SpringBoot.model.User;

import java.util.List;

public interface UserService {
    User userByid(long id);
    List<User> usersAll();
    User userAdd(User user);
    void userDelete(long id);
}
