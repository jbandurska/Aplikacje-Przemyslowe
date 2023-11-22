package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class MathApplication {
    private final Calculator calculator;

    public MathApplication(Calculator clc) {
        this.calculator = clc;
    }

    public void doMath() {
        System.out.println("\nI'm a MathApplication doing math.");
        System.out.println("2.5 + 5.0 = " + calculator.add(2.5, 5.0));
        System.out.println("2.5 - 5.0 = " + calculator.subtract(2.5, 5.0) + "\n");
    }
}
