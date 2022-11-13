package com.mongodb.service;

import com.mongodb.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.List;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    public void add() {
        User user = User.builder().id("22").name("zhang");
        mongoTemplate.save(user);
    }

    @Test
    public void query() {
        List<User> users = mongoTemplate.findAll(User.class);
        users.forEach(System.out::println);
    }

}
