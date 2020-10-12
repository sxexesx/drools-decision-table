package com.sxexesx.model;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Respondent {

    public String isActive;
    public Map<String, String> result = new HashMap<>();

    public Respondent(String isActive) {
        this.isActive = isActive;
    }

    public void addResult(String key, String value) {
        result.put(key, value);
    }



}
