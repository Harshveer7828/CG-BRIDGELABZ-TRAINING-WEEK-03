package com.capgemini.sorting_algorithm_comparison;

public class BubbleSort {
    static double bubbleSort(int[] studentMark) {
        int n = studentMark.length;
        double timeBefore = System.nanoTime();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n ; j++) {
                if (studentMark[i] > studentMark[j]){
                    int temp = studentMark[i];
                    studentMark[i] = studentMark[j];
                    studentMark[j] = temp;
                }
            }
        }
        return (System.nanoTime() - timeBefore) / 1e6;
    }
}
