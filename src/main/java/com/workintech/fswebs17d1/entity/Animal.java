package com.workintech.fswebs17d1.entity;

import org.springframework.stereotype.Component;

@Component
public class Animal {
    private String name;
    private Integer id;
    public Animal(Integer id, String name){
        this.name = name;
        this.id = id;
    }
    public Animal(){
    }

    public String getName(){
        return name;
    }
    public Integer getId(){
        return id;
    }
}
