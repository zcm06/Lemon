package com.lemon.service.impl;

import com.lemon.dao.UserRepository;
import com.lemon.entity.User;
import com.lemon.service.UserService;
import com.lemon.utils.Func;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;

import java.util.Optional;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findOne(User user) throws Exception {
        if (Func.checkNullOrEmpty(user)) {
            throw new Exception("参数为空！");
        }
        Example<User> example = Example.of(user);
        Optional<User> optional = userRepository.findOne(example);
        return optional.get();
    }

    @Override
    public User saveUser(User user) throws Exception {
        if (Func.checkNullOrEmpty(user)) {
            throw new Exception("参数为空！");
        }
        return userRepository.save(user);
    }
}
