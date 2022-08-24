package com.barclays.homeLoanApplication.serviceImpl;

import com.barclays.homeLoanApplication.entity.User;
import com.barclays.homeLoanApplication.repository.UserRepository;
import com.barclays.homeLoanApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User userAdd(User user) {
        return userRepository.save(user);
    }
}
