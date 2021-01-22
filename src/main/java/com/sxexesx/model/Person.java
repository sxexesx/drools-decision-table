package com.sxexesx.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {

    private String name;
    private String surname;
    private String gender;
    public Integer age;

    public Boolean calcAge(Integer personAge, Integer value) {
        System.out.println("this rule has personAge: " + personAge + " and value: " + value);
        return personAge >= value;
    }

    public Integer addAge(Integer value) {
        age = age + value;
        System.out.println("--> " + age);
        return age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


