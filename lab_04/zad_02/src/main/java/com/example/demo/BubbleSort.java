package com.example.demo;

import org.springframework.stereotype.Component;

@Component("bubbleSort")
public class BubbleSort implements SortAlgorithm {
    @Override
    public int[] sort(int[] arr) {
        int n = arr.length;

        int i, j;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped
            // by inner loop, then break
            if (swapped == false)
                break;
        }

        return arr;
    }
}
