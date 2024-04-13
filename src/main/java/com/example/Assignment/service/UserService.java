package com.example.Assignment.service;

import com.example.Assignment.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(Long id);

    User saveOrUpdateUser(User user);

    void deleteUser(Long id);
}
