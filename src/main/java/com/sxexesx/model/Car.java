package com.sxexesx.model;

import lombok.Data;

@Data
public class Car {

    public int number;
    public String brand;
    public String model;
    public int year;

    public Car(int number, String brand, String model, int year) {
        this.number = number;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
}
