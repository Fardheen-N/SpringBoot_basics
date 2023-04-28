package com.example.demo.config;

import com.example.demo.controller.Controller;
import com.example.demo.servicePack.NonVegPizza;
import com.example.demo.servicePack.Pizza;
import com.example.demo.servicePack.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Pizza vegPizza(){
        return new VegPizza();
    }
    @Bean
    public Pizza nonVegPizza(){
        return  new NonVegPizza();
    }
    @Bean
    public Controller controller(){
        return new Controller(vegPizza());
    }
}
