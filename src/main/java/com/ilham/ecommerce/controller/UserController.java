package com.ilham.ecommerce.controller;

import com.ilham.ecommerce.entity.User;
import com.ilham.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@PreAuthorize("isAuthenticated()")
public class UserController {

    @Autowired
    private UserService penggunaService;

    @GetMapping("/users")
    public List<User> findAll() {
        return penggunaService.findAll();
    }

    @GetMapping("/users/{id}")
    public User findById(@PathVariable("id") String id) {
        return penggunaService.findById(id);
    }

    @PostMapping("/penggunas")
    public User create(@RequestBody User user) {
        return penggunaService.create(user);
    }

}
