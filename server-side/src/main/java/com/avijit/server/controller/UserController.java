package com.avijit.server.controller;

import com.avijit.server.entity.User;
import com.avijit.server.service.UserService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/add")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping(value = "/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    @GetMapping(value = "/id")
    public User getUserById(@RequestParam Long userId) {
        return userService.getUserById(userId);
    }
}
