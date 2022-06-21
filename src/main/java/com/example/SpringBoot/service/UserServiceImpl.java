package com.example.SpringBoot.service;

import com.example.SpringBoot.model.User;
import com.example.SpringBoot.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
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

