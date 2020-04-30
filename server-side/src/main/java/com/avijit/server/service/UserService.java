package com.avijit.server.service;

import com.avijit.server.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User addUser(User user);

    List<User> getAllUsers();

    User getUserById(Long userId);
}
