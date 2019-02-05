package com.lemon.service;

import com.lemon.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    public User findOne(User user)throws Exception;

    public User saveUser(User user)throws Exception;
}
