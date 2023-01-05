package com.example.bit512.controller;

import com.example.bit512.entity.User;
import com.example.bit512.service.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bit512/users")
public class UserController {

    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    /*
     * create user entity
     */

    @PostMapping(path = "/new")
    public User create(@RequestBody final User entity) {
        return userService.create(entity);
    }

    /*
     * query all users
     */

    @GetMapping("/users")
    public List<User> listUsers() {
        return userService.findAll();
    }

    /*
     * query all users by city
     */
    @GetMapping(path = "/list/{id}")
    public List<User> findByUser(@PathVariable final Long id) {
        return userService.allUsersByCity(id);
    }
}
