package com.example.bit512.service.Interface;

import com.example.bit512.entity.User;

import java.util.List;

public interface UserService {
    User create(User entity);

    List<User> findAll();

    List<User> allUsersByCity(Long id);
}
