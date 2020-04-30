package com.avijit.client.client.controller;

import com.avijit.client.client.dto.User;
import com.avijit.client.client.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping(value = "/getall")
    public List<User> getAllUsers() {
        return userService.getAllUser();
    }

    @PostMapping(value = "/create")
    public User addNewUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping(value = "/{userId}")
    public User getUserBId(@PathVariable("userId") Long userId) {
        return userService.getUserById(userId);

    }
}
