package com.cxy35.sample.springboot.controlleradvice.controller;

import com.cxy35.sample.springboot.controlleradvice.pojo.Author;
import com.cxy35.sample.springboot.controlleradvice.pojo.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;
import java.util.Set;

@Controller
public class TestController {

    @ResponseBody
    @GetMapping("/globalException")
    public String globalException(Model model){
        String[] arr = {"a","b"};
        System.out.println(arr[2]);
        return "success";
    }

    @ResponseBody
    @GetMapping("/globalData")
    public String globalData(Model model) {
        String globalData = "";
        Map<String, Object> map = model.asMap();
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            globalData += ("【"+key + ":" + map.get(key)+"】");
        }
        return globalData;
    }

    @PostMapping("/initPreParam")
    public void initPreParam(@ModelAttribute("b") Book book, @ModelAttribute("a") Author author) {
        System.out.println(book);
        System.out.println(author);
    }
}
