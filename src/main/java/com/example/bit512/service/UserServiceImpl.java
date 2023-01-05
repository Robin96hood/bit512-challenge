package com.example.bit512.service;

import com.example.bit512.entity.User;
import com.example.bit512.repository.UserRepository;
import com.example.bit512.service.Interface.UserService;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /*
     * create user entity
     */

    @Override
    public User create(User entity) {
        return userRepository.save(entity);
    }

    /*
     * query all users
     */

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    /*
     * query all users by city
     */

    @Override
    public List<User> allUsersByCity(Long id) {
        return userRepository.allUsersByCity(id);
    }
}
