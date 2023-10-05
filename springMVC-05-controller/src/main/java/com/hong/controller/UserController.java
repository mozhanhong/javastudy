package com.hong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/t1")
    public String test1(String name, Model model){
        System.out.println("接收到前端的参数为"+name);
        model.addAttribute("msg",name);
        return "test";
    }
}
