package com.sxexesx.model;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Store {

    public String isActive;

    public Store(String isActive) {
        this.isActive = isActive;
    }

}
