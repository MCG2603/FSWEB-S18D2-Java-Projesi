package com.example.demo.entity;

import lombok.Data;

@Data
public class Vegetable extends Food {

    private Boolean isGrownTree;
    public Vegetable(Boolean isGrownTree){
        super();
        this.isGrownTree=isGrownTree;
    }

}
