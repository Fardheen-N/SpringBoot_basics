package com.example.demo.servicePack;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
public class NonVegPizza implements Pizza{

    @Override
    public String getPizza() {
        return "Non Veg pizza";
    }
}
