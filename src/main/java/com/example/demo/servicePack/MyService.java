package com.example.demo.servicePack;

import org.springframework.stereotype.Service;

@Service
public class MyService {
    public String hello(){
        return "Hello service";
    }
}
