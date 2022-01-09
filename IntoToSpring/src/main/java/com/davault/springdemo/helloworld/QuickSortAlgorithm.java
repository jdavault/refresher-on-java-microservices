package com.davault.springdemo.helloworld;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm{
    public int[] sort(int[] numbers) {

        //Logic for QuickSort
        return numbers;
    }
}
