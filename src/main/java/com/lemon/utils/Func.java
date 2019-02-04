package com.lemon.utils;

import java.util.List;

public class Func {

    public static boolean checkNullOrEmpty(List list){
        if (list == null){
            return true;
        }
        if (list.isEmpty()){
            return true;
        }
        return false;
    }

    public static boolean checkNullOrEmpty(String str){
        if (str == null || str.equals("")){
            return true;
        }
        return false;
    }

    public static boolean checkNullOrEmpty(Object object){
        if (object == null){
            return true;
        }
        return false;
    }
}
