package com.sxexesx.model;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class ResultStorage {

    public Map<String, String> result = new HashMap<>();

    public void addResult(String key, String value) {
        result.put(key, value);
    }

}
