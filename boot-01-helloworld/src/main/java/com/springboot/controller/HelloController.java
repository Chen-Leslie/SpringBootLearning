package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author:Chen
 * @Date:2022/9/6
 * @Description:
 */
@ResponseBody
@Controller
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String handle01(){
        return "Hello, SpringBoot2!";
    }
}
