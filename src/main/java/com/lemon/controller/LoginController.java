package com.lemon.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lemon.entity.QueryResult;
import com.lemon.entity.User;
import com.lemon.entity.WeChatBean;
import com.lemon.service.UserService;
import com.lemon.utils.ControllerUtil;
import com.lemon.utils.EnumUtil;
import com.lemon.utils.Func;
import com.lemon.utils.WeChatConfigUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * 登陆controller
 */
@Controller
@RequestMapping("/loginController")
public class LoginController {

    @Autowired
    private WeChatConfigUtil configUtil;
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public QueryResult login(HttpServletRequest request, HttpServletResponse response, @RequestParam("code") String code,@RequestParam("info") String info) {
        try {
            WeChatBean weChatBean = new WeChatBean();
            weChatBean.setAppId(configUtil.getAppId());
            weChatBean.setAppSecret(configUtil.getAppSecret());
            weChatBean.setGrant_type(configUtil.getGrant_type());
            weChatBean.setUrl(configUtil.getUrl());
            weChatBean.setCode(code);
            String openId = weChatBean.getOpenId();
            if (Func.checkNullOrEmpty(openId)) {
                return ControllerUtil.getFailResult("获取用户信息异常");
            }
            User user = userService.findUserByOpenId(openId);
            JSONObject obj = JSON.parseObject(info);
            if (Func.checkNullOrEmpty(user)){
                user = new User();
                user.setOpenId(openId);
                user.setCreateTime(new Date());
                user.setGender(EnumUtil.Gender.getName(obj.getIntValue("gender")));
                user.setBirthday(new Date());
                user.setAvatarUrl(obj.getString("avatarUrl"));
                userService.saveUser(user);
            }else {
                user.setAvatarUrl(obj.getString("avatarUrl"));
                userService.updateUser(user);
            }
            return ControllerUtil.getSuccessfulResult(user);
        } catch (Exception e) {
            e.printStackTrace();
            return ControllerUtil.getFailResult("获取用户信息异常!" + e.getMessage());
        }
    }
}
