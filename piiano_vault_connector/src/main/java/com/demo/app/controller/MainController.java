package com.demo.app.controller;

import com.demo.app.dal.User;
import com.demo.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path="/demo")
public class MainController {

    @Autowired
    private UserService userService;

    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody String addNewUser(
            @RequestParam(value = "first_name") String firstName,
            @RequestParam(value = "last_name") String lastName,
            @RequestParam String username,
            @RequestParam String password,
            @RequestParam String email,
            @RequestParam String country) {


        User user = User.builder()
                .firstName(firstName).lastName(lastName)
                .username(username).password(password)
                .email(email).country(country)
                .build();
        userService.addNewUser(user);
        return "Saved";
    }

    @GetMapping(path="/add-user")
    public @ResponseBody String addNewUserGet(
            @RequestParam(value = "first_name") String firstName,
            @RequestParam(value = "last_name") String lastName,
            @RequestParam String username,
            @RequestParam String password,
            @RequestParam String email,
            @RequestParam String country) {

        User user = User.builder()
                .firstName(firstName).lastName(lastName)
                .username(username).password(password)
                .email(email).country(country)
                .build();
        userService.addNewUser(user);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(path="/findUserByEmail")
    public @ResponseBody List<User> findUserByEmail(@RequestParam String email) {
        return userService.findUserByEmail(email);
    }
}
