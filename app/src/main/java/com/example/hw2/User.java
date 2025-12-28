package com.example.hw2;

import java.io.Serializable;

public class User implements Serializable {
    private String name;

    private int age;

    private String gender;
    public User(String name, String age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}
