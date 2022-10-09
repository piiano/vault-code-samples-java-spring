package com.demo.app.service;

import com.demo.app.dal.User;
import com.demo.app.dal.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void addNewUser(User user) {
        userRepository.save(user);
    }

    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    public List<User> findUserByEmail(String email) {
        List<User> userByEmail = userRepository.findUserByEmail(email);
        return userByEmail;
    }
}
