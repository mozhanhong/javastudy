package com.hong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerTest3 {
    @RequestMapping("/c1")
    public String test3(Model model){
        model.addAttribute("msg","Test c3");
        return "test";
    }
}
