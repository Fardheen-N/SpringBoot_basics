package com.example.demo.controller;

import com.example.demo.servicePack.Pizza;
import com.example.demo.servicePack.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Controller {

    private Pizza pizza;

    @Autowired
    public Controller( Pizza pizza){
        this.pizza=pizza;
    }
    public String getControl(){
        return pizza.getPizza();
    }
}
