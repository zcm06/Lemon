package com.lemon.service.impl;

import com.lemon.dao.UserRepository;
import com.lemon.entity.User;
import com.lemon.service.UserService;
import com.lemon.utils.Func;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
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

    @Override
    public User findUserByOpenId(String openId) throws Exception {
        if (Func.checkNullOrEmpty(openId)) {
            throw new Exception("参数为空！");
        }
        return  userRepository.findUserByOpenId(openId);
    }

    @Override
    public User updateUser(User user) throws Exception {
        return userRepository.saveAndFlush(user);
    }
}
