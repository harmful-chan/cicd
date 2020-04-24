package com.example.cicd.services;

import org.springframework.stereotype.Component;

@Component
public class MyService {
    public int Add(int a, int b){
        return a+b;
    }
}