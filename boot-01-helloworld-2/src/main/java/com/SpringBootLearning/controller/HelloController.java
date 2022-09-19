package com.SpringBootLearning.controller;


import com.SpringBootLearning.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cbr
 * @version 1.0
 * @date 2022-09-19
 */
@RestController
public class HelloController {
    @Autowired
    Person person;

    @RequestMapping("/person")
    public Person person(){
        return person;
    }
}
