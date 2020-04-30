package com.avijit.client.client.service;

import com.avijit.client.client.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl {

    @Autowired
    RestTemplate restTemplate;

    public List<User> getAllUser() {
        User[] users = restTemplate.getForObject("http://server-app/user/all", User[].class);
        System.out.println("Inside client side");
        return Arrays.asList(users);
    }

    public User addUser(User user) {
        User entity = restTemplate.postForObject("http://server-app/user/add", user, User.class);
        return entity;
    }

    public User getUserById(Long userId) {
        User entity = restTemplate.getForObject("http://server-app/user/id?userId=" + userId, User.class);
        return entity;

    }
}
