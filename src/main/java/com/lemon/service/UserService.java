package com.lemon.service;

import com.lemon.entity.User;
import org.springframework.stereotype.Service;


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

    /** 
    * @Description: 通过openId查询用户信息
    * @Param: [openId] 
    * @return: com.lemon.entity.User 
    * @Author: ZHANG CANMING
    * @Date: 2019/2/11 
    */ 
    public User findUserByOpenId(String openId) throws Exception;

    /** 
    * @Description: 更新用户信息 
    * @Param: [user] 
    * @return: com.lemon.entity.User 
    * @Author: ZHANG CANMING
    * @Date: 2019/2/11 
    */ 
    public User updateUser(User user)throws Exception;
}
