package com.leanmentors.account.aggregator.usermanagement.controller;

import com.leanmentors.account.aggregator.usermanagement.repository.UserRepository;
import com.leanmentors.account.aggregator.usermangement.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {


    @Autowired
    UserRepository userRepository;

    @GetMapping(path = "/users/{userName}")
    public User userDetails(@PathVariable String userName){
        return userRepository.findByUserName(userName).get(0);
    }

    @PostMapping(path = "/users/{user}")
    public void addUser(@RequestBody User user){
        userRepository.save(user);
    }

}
