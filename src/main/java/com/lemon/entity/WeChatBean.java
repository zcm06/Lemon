package com.lemon.entity;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * 微信bean
 */
public class WeChatBean {

    private String url;

    private String openId;

    private String sessionKey;

    private String unionId;

    private String appId;

    private String appSecret;

    private String grant_type;

    public String getOpenId() {
        return openId;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public String getUnionId() {
        return unionId;
    }

    public WeChatBean(){

    }

    public void setCode(String code)throws Exception{
        url = url + "?code=" + code + "&appid=" + appId + "&secret" + appSecret + "&grant_type" + grant_type;
        RestTemplate restTemplate = new RestTemplate();
        //进行网络请求,访问url接口
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, null, String.class);
        String data = responseEntity.getBody();
        System.out.println(data);
        JSONObject jsonObject = JSON.parseObject(data.toString());
        this.openId = (String) jsonObject.get("openid");
        this.sessionKey = (String) jsonObject.get("session_key");
        this.unionId = (String) jsonObject.get("unionid");
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public String getGrant_type() {
        return grant_type;
    }

    public void setGrant_type(String grant_type) {
        this.grant_type = grant_type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
