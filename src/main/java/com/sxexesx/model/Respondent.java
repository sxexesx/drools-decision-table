package com.sxexesx.model;

import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class Respondent {

    public int id;
    public String gender;
    public Boolean isActive;
    public Integer age;
    public List<String> pets;
    public String city;
    public List<String> devices;
    public Map<String, String> properties;
    public Car car;
    public MobileBrand mobileBrand;
    public Household household;

    public Map<String, String> result = new HashMap<>();

    public void addResult(String key, String value) {
        result.put(key, value);
    }

    public Respondent(int id, Boolean isActive, Integer age) {
        this.id = id;
        this.isActive = isActive;
        this.age = age;
    }

    public Respondent(int id, String gender) {
        this.id = id;
        this.gender = gender;
    }

    public Respondent(int id, String gender, Boolean isActive) {
        this.id = id;
        this.gender = gender;
        this.isActive = isActive;
    }

    public Respondent(int id, String gender, Boolean isActive, Integer age) {
        this.id = id;
        this.gender = gender;
        this.isActive = isActive;
        this.age = age;
    }

    public Respondent(int id, String gender, Integer age, List<String> pets) {
        this.id = id;
        this.gender = gender;
        this.age = age;
        this.pets = pets;
    }

    public Respondent(int id, Integer age, String city) {
        this.id = id;
        this.age = age;
        this.city = city;
    }

    public Respondent(int id, List<String> devices) {
        this.id = id;
        this.devices = devices;
    }

    public Respondent(int id, Map<String, String> properties) {
        this.id = id;
        this.properties = properties;
    }

    public Respondent(int id, Car car) {
        this.id = id;
        this.car = car;
    }

    public Respondent(int id, MobileBrand mobileBrands) {
        this.id = id;
        this.mobileBrand = mobileBrands;
    }

    public Respondent(int id, Household household) {
        this.id = id;
        this.household = household;
    }
}
