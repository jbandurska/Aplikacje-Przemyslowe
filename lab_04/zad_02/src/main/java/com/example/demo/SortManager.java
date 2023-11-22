package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SortManager {
    private final SortAlgorithm sortAlgorithm;

    public SortManager(@Qualifier("quickSort") SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int[] sortArray(int[] arr) {
        return sortAlgorithm.sort(arr);
    }
}
