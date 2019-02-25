package com.lemon.dao;

import com.lemon.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
    /** 
    * @Description: 通过openId查询用户信息
     * @Param: [openId] 
    * @return: com.lemon.entity.User 
    * @Author: ZHANG CANMING
    * @Date: 2019/2/11 
    */ 
    public User findUserByOpenId(String openId) throws Exception;
}
