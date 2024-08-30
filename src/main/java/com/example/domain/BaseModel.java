package com.example.domain;

import lombok.Builder;
import lombok.Setter;

@Builder
@Setter
public  class BaseModel {
    public String name;
    public double amount;

    public void  setName(String name){
        this.name = name;
    }
}
