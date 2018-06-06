package com.example.demo.controller;

import com.example.demo.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

    @RequestMapping("/hello")
    public String index(){
        return "Spring Boot Demo01";
    }

    @RequestMapping("/getUser")
    public User getUser(){
        User user=new User("山雨欲来","风满楼");
        return  user;
    }
}
