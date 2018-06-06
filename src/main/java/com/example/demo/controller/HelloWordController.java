package com.example.demo.controller;

import com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

    @Value("${com.neo.title}")
    private String title;

    @Value("${com.neo.next}")
    private String next;

    @RequestMapping("/hello")
    public String index(){
        return "Spring Boot Demo01";
    }

    @RequestMapping("/getUser")
    public User getUser(){
        User user=new User("山雨欲来","风满楼");
        return  user;
    }

    @RequestMapping("/getPoetry")
    public String getPoetry(){
        return " 丑奴儿*书博山道中壁</br>上阙："+title+"</br> 下阙："+next;
    }
}
