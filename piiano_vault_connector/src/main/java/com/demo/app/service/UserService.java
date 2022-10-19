package com.demo.app.service;

import com.demo.app.dal.User;
import com.demo.app.dal.UserRepository;
import com.piiano.connector.PiianoVaultConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void addNewUser(User user) {
        PiianoVaultConnector.createObjectAndTokenize(user);
        userRepository.save(user);
    }

    public Iterable<User> getAllUsers() {
        Iterable<User> all = userRepository.findAll();

        PiianoVaultConnector.detokenize(all);
        return all;
    }

    public List<User> findUserByEmail(String email) {
        String token = PiianoVaultConnector.findObjectAndGetToken(email);
        List<User> users = userRepository.findUserByEmail(token);

        PiianoVaultConnector.detokenize(users);
        return users;
    }
}
