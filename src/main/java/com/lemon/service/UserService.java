package com.lemon.service;

import com.lemon.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    /** 
    * @Description: 查询用户 
    * @Param: [user] 
    * @return: com.lemon.entity.User 
    * @Author: ZHANG CANMING
    * @Date: 2019/2/5 
    */ 
    public User findOne(User user)throws Exception;

    /** 
    * @Description: 保存用户
    * @Param: [user] 
    * @return: com.lemon.entity.User 
    * @Author: ZHANG CANMING
    * @Date: 2019/2/5 
    */ 
    public User saveUser(User user)throws Exception;
}
