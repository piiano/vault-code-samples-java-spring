package com.demo.app.service;

import com.demo.app.dal.User;
import com.demo.app.dal.UserRepository;
import com.piiano.connector.PiianoVaultConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void addNewUser(User user) {
        UUID id = PiianoVaultConnector.createObject(user.getEmail());
        user.setEmail(PiianoVaultConnector.tokenize(id));
        userRepository.save(user);
    }

    public Iterable<User> getAllUsers() {
        Iterable<User> all = userRepository.findAll();
        all.forEach(u -> {
            u.setEmail(PiianoVaultConnector.detokenize(u.getEmail()));
        });
        return all;
    }

    public List<User> findUserByEmail(String email) {
        List<UUID> objectIds = PiianoVaultConnector.findObject(email);
        List<String> tokenIds = objectIds.stream()
                .map(PiianoVaultConnector::tokenize)
                .collect(Collectors.toList());
        String token = tokenIds.get(0);

        return userRepository.findUserByEmail(token);
    }
}
