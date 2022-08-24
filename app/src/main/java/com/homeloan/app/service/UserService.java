package com.homeloan.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeloan.app.entity.User;
import com.homeloan.app.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User userAdd(User user)
	{
		return userRepository.save(user);
	}
	
	
}
