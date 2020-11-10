package com.sxexesx.model;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class Household {

    public int id;
    public Map<String, String[]> hhProperties;

    public Household(int id, Map<String, String[]> hhProperties) {
        this.id = id;
        this.hhProperties = hhProperties;
    }
}
