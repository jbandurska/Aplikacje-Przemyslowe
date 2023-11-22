package com.example.demo;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        var sortManager = ctx.getBean(SortManager.class);

        int[] arr = { 11, 43, 22, 16, 37 };
        sortManager.sortArray(arr);
        System.out.println(Arrays.toString(arr));

        ctx.close();
    }
}
