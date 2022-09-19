package com.springboot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author:Chen
 * @Date:2022/9/6
 * @Description:
 */

@Data
@NoArgsConstructor
@EqualsAndHashCode
public class User {
    private String name;
    private String age;

    private Pet pet;

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }
}
