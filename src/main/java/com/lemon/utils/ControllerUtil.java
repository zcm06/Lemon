package com.lemon.utils;

import com.lemon.entity.QueryResult;

import java.util.HashMap;
import java.util.Map;

public class ControllerUtil {

    /** 
    * @Description: 成功返回值 
    * @Param: [object] 
    * @return: com.lemon.entity.QueryResult 
    * @Author: ZHANG CANMING
    * @Date: 2019/2/5 
    */ 
    public static QueryResult getSuccessfulResult(Object object){
        QueryResult queryResult = new QueryResult();
        queryResult.setResult(object);
        queryResult.setState(true);
        return queryResult;
    }

    /** 
    * @Description: 失败返回值 
    * @Param: [message] 
    * @return: com.lemon.entity.QueryResult 
    * @Author: ZHANG CANMING
    * @Date: 2019/2/5 
    */ 
    public static QueryResult getFailResult(String message){
        QueryResult queryResult = new QueryResult();
        queryResult.setState(false);
        queryResult.setMessage(message);
        return queryResult;
    }
}
