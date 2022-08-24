package com.homeloan.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.homeloan.app.entity.User;
import com.homeloan.app.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/add-user")
	public User addUser(@RequestBody User user)
	{
		return userService.userAdd(user);		
	}

}
