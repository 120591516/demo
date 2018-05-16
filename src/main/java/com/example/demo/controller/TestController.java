package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Song on 2017/2/15.
 * 官方示例工程中的测试代码
 */
@Controller
@EnableAutoConfiguration
public class TestController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String testDemo(){
        return "测试";
    }
}
