package com.lob.ndeeddelivery.service;

import com.lob.ndeeddelivery.model.User;

import java.util.Optional;

public interface UserService {
    User saveUser(User user);
    Optional<User> findByUsername(String username);
    void makeAdmin(String username);
}
