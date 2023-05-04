package com.example.makedecisions.controller;

import com.example.makedecisions.entities.Options;
import com.example.makedecisions.entities.User;
import com.example.makedecisions.repositories.OptionsRepository;
import com.example.makedecisions.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private OptionsRepository optionsRepo;

    @GetMapping
    public List<User> GetAllUsers() {
        return userRepo.findAll();
    }
    @GetMapping("/{id}")
    public Optional<User> GetUniqueUser(@PathVariable String id) {
        if(!userRepo.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return userRepo.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public User CreateUser(@RequestBody User user) {
        return userRepo.save(user);
    }

