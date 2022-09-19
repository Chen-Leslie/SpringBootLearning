package com.springboot.controller;

import com.springboot.bean.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author:Chen
 * @Date:2022/9/6
 * @Description:
 */
@Slf4j
@RestController
public class HelloController {
    @Autowired
    Car car;

    @RequestMapping("/car")
    public Car car(){
        return car;
    };


    @RequestMapping("/hello")
    public String handle01(){
        log.info("hello请求");
        return "Hello, SpringBoot2!";
    }
}
