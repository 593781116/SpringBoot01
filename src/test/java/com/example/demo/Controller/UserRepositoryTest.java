package com.example.demo.Controller;

import com.example.demo.Dao.UserRepository;
import com.example.demo.domain.User;
import javafx.application.Application;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.DateFormat;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() throws Exception{
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
        String formattedDate = dateFormat.format(date);
        userRepository.save(new User("紫川秀","123456","aa@qq.com","秀川统领，阿秀",formattedDate));
        userRepository.save(new User("斯特林","111111","bb@qq.com","木头,紫川之虎",formattedDate));
        userRepository.save(new User("帝林","1234567","cc@qq.com","魔鬼",formattedDate));

        Assert.assertEquals(9, userRepository.findAll().size());
        Assert.assertEquals("斯特林",userRepository.findByNameOrEamil("斯特林","bb@qq.com").getNickName());
        userRepository.delete(userRepository.findByUserName("帝林"));
    }
}
