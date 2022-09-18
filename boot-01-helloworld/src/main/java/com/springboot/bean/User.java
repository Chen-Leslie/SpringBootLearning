package com.springboot.bean;

/**
 * @author:Chen
 * @Date:2022/9/6
 * @Description:
 */
public class User {
    private String name;
    private String age;

    private Pet pet;

    public User() {
    }

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public User(String name, String age, Pet pet) {
        this.name = name;
        this.age = age;
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", pet=" + pet +
                '}';
    }
}
