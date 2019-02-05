package com.lemon.service;

import com.lemon.entity.Weight;
import org.springframework.stereotype.Service;

@Service
public interface WeightService {

    /** 
    * @Description: 查询体重 
    * @Param: [weight] 
    * @return: com.lemon.entity.Weight 
    * @Author: ZHANG CANMING
    * @Date: 2019/2/5 
    */ 
    public Weight findOne(Weight weight)throws Exception;

    /** 
    * @Description: 保持体重
    * @Param: [weight] 
    * @return: com.lemon.entity.Weight 
    * @Author: ZHANG CANMING
    * @Date: 2019/2/5 
    */ 
    public Weight saveWeight(Weight weight)throws Exception;
}
