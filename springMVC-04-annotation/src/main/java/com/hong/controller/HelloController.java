package com.hong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public  String hello(Model model){
        model.addAttribute("msg","Hello,SpringMVC");
        return "hello";//被试图解析器处理
    }
}
