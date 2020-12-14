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

    public Respondent(int id,
                      Boolean isActive,
                      String gender,
                      Integer age,
                      List<String> pets,
                      String city,
                      List<String> devices,
                      Map<String, String> properties,
                      Car car,
                      MobileBrand mobileBrand,
                      Household household) {
        this.id = id;
        this.isActive = isActive;
        this.gender = gender;
        this.age = age;
        this.pets = pets;
        this.city = city;
        this.devices = devices;
        this.properties = properties;
        this.car = car;
        this.mobileBrand = mobileBrand;
        this.household = household;
    }

}
