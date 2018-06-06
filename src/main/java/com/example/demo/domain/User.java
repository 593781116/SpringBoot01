package com.example.demo.domain;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.io.Serializable;

@Entity
public class User implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long id;//唯一标识

    private String userName; //登入名

    private String passWord; //密码

    private String email;//邮件

    private String nickName;//外号

    private String regTime;// 注册时间

    public User(){};
    public User(String name,String pass){
        this.userName=name;
        this.passWord=pass;
    }

    public User(String name,String pass,String email,String nName,String time){
        this.userName=name;
        this.passWord=pass;
        this.email=email;
        this.nickName=nName;
        this.regTime=time;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getRegTime() {
        return regTime;
    }

    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }

}

