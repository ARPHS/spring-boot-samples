package com.zhengjian.sample.springboot.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author cxy35
 * @Date 2019-07-21 11:17
 */
@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(Model model, String name) {
        model.addAttribute("name", name);
        return "hello";
    }
}
