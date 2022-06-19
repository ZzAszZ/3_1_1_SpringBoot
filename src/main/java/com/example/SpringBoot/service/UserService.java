package com.example.SpringBoot.service;

import com.example.SpringBoot.model.User;
import com.example.SpringBoot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User userByid(long id){
        return userRepository.findById(id).orElse(null);
    }

    public List<User> usersAll(){
        return userRepository.findAll();
    }

    public User userAdd(User user){
        return userRepository.save(user);
    }

    public void userDelete(long id){userRepository.deleteById(id);}

}

