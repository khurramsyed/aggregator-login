package com.leanmentors.account.aggregator.usermanagement.controller;

import com.leanmentors.account.aggregator.usermangement.domain.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping(path = "/users/{userId}")
    public User userDetails(@PathVariable String userId){
        return  new User(userId,"Password","Khurram","Mahmood");
    }
}
