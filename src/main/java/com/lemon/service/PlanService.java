package com.lemon.service;

import com.lemon.entity.Plan;

public interface PlanService {

    /** 
    * @Description: 查询体重 
    * @Param: [weight] 
    * @return: com.lemon.entity.Plan
    * @Author: ZHANG CANMING
    * @Date: 2019/2/5 
    */ 
    public Plan findOne(Plan weight)throws Exception;

    /** 
    * @Description: 保持体重
    * @Param: [weight] 
    * @return: com.lemon.entity.Plan
    * @Author: ZHANG CANMING
    * @Date: 2019/2/5 
    */ 
    public Plan saveWeight(Plan weight)throws Exception;
}
