package com.sxexesx.model;

import lombok.Data;

import java.util.Map;

@Data
public class Car {

    public int number;
    public String brand;
    public String model;
    public int year;
    public Map<String, String> properties;

    public Car(int number, String brand, String model, int year, Map<String, String> properties) {
        this.number = number;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.properties = properties;
    }
}
