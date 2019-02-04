package com.lemon.utils;

import com.lemon.entity.QueryResult;

import java.util.HashMap;
import java.util.Map;

public class ControllerUtil {

    public static QueryResult getSuccessfulResult(Object object){
        QueryResult queryResult = new QueryResult();
        queryResult.setResult(object);
        queryResult.setState(true);
        return queryResult;
    }

    public static QueryResult getFailResult(String message){
        QueryResult queryResult = new QueryResult();
        queryResult.setState(false);
        queryResult.setMessage(message);
        return queryResult;
    }
}
