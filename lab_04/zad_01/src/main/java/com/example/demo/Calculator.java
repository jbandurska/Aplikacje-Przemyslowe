package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    public Double add(Double a, Double b) {
        return a + b;
    }

    public Double subtract(Double a, Double b) {
        return a - b;
    }
}