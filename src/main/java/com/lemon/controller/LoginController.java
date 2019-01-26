package com.lemon.controller;

import com.lemon.entity.WeChatBean;
import com.lemon.utils.WeChatConfigUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/loginController")
public class LoginController {

    @Autowired
    private WeChatConfigUtil configUtil;

    @RequestMapping("/login")
    @ResponseBody
    public Map<String,Object> login(HttpServletRequest request, HttpServletResponse response, @RequestParam("code") String code){
        Map<String ,Object> map = new HashMap<String, Object>();
        try {
            WeChatBean weChatBean = new WeChatBean();
            weChatBean.setAppId(configUtil.getAppId());
            weChatBean.setAppSecret(configUtil.getAppSecret());
            weChatBean.setGrant_type(configUtil.getGrant_type());
            weChatBean.setUrl(configUtil.getUrl());
            weChatBean.setCode(code);
            map.put("openid",weChatBean.getOpenId());
            request.getSession().setAttribute("session_key",weChatBean.getSessionKey());
        }catch (Exception e){
            e.printStackTrace();
        }
        return map;
    }
}
