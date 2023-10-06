package com.hong.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hong.pojo.user;
import com.hong.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class userController {
    @RequestMapping("/j1")
    @ResponseBody//不走试图解析器，直接返回一个字符串
    public String json1() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        user user = new user("莫展鸿",18);
        String value = mapper.writeValueAsString(user);
        return value;
    }
    @RequestMapping("/j2")
    @ResponseBody//不走试图解析器，直接返回一个字符串
    public String json2() throws JsonProcessingException {
        List<user> userlist=new ArrayList<user>();
        user user1 = new user("莫展鸿2",19);
        user user2 = new user("莫展鸿3",19);
        user user3 = new user("莫展鸿4",19);
        user user4 = new user("莫展鸿5",19);
        userlist.add(user1);
        userlist.add(user2);
        userlist.add(user3);
        userlist.add(user4);
        return JsonUtils.getjson(userlist);
    }
    @RequestMapping("/j3")
    @ResponseBody//不走试图解析器，直接返回一个字符串
    public String json3() throws JsonProcessingException {
        Date date = new Date();
        return JsonUtils.getjson(date);
    }
    @RequestMapping("/j4")
    @ResponseBody//不走试图解析器，直接返回一个字符串
    public String json4() throws JsonProcessingException {
        List<user> userlist=new ArrayList<user>();
        user user1 = new user("莫展鸿2",19);
        user user2 = new user("莫展鸿3",19);
        user user3 = new user("莫展鸿4",19);
        user user4 = new user("莫展鸿5",19);
        userlist.add(user1);
        userlist.add(user2);
        userlist.add(user3);
        userlist.add(user4);
        String string= JSON.toJSONString(userlist);
        return string;
    }
}
