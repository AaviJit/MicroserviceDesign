package com.avijit.server.service.serviceImpl;

import com.avijit.server.entity.User;
import com.avijit.server.repository.UserRepository;
import com.avijit.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        System.out.println("Inside server side");
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long userId) {
        return userRepository.getById(userId);
    }
}
