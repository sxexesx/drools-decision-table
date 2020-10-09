package com.sxexesx.models;

import lombok.Data;

@Data
public class Store {

    public Boolean isActive;

    public Store(Boolean isActive) {
        this.isActive = isActive;
    }
}
