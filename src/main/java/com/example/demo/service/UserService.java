package com.example.demo.service;

import com.example.demo.pojo.User;
import com.example.demo.repositoty.UserRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 2018/5/15.
 */
@Service
public class UserService {
    @Autowired
    private UserRepositoty userRepositoty;

    public User findUserByName(String name){
        User user = userRepositoty.findByUserName(name);
        return  user;
    }
}
