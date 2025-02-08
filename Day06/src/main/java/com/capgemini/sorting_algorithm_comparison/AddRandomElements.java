package com.capgemini.sorting_algorithm_comparison;

import java.util.Random;

public class AddRandomElements {
    AddRandomElements(){}
    private final Random rand = new Random();
    // Method to add random elements in your array
    public void addRandomElement(int[] arr) {
        // Method to get random values
        for (int i = 0; i < arr.length; i++) {
            arr[i] = this.rand.nextInt(100);
        }
    }
}
