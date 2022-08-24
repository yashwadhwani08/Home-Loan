package com.barclays.homeLoanApplication.controller;

import com.barclays.homeLoanApplication.entity.User;
import com.barclays.homeLoanApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add-user")
    public User addUser(@RequestBody User user) {
        return userService.userAdd(user);
    }
}
