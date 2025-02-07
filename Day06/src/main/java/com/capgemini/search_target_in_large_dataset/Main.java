package com.capgemini.search_target_in_large_dataset;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SearchInDataSet searchTime = new SearchInDataSet();
        AddRandomElements addRandomElements = new AddRandomElements();
        int[] arr1 = new int[1000];
        int[] arr2 = new int[10000];
        int[] arr3 = new int[1000000];

        // Add random values to the array
        addRandomElements.addRandomElement(arr1);
        addRandomElements.addRandomElement(arr2);
        addRandomElements.addRandomElement(arr3);

        System.out.println("Time Taken By The Different Search Algorithms");
        System.out.println("---------------------------------------------");
        // Invoke the method for the middle element
        searchTime.displayTime(arr1,arr1[arr1.length / 2]);
        System.out.println("--------------------------------------------");
        searchTime.displayTime(arr2,arr2[arr2.length / 2]);
        System.out.println("--------------------------------------------");
        searchTime.displayTime(arr3,arr3[arr3.length / 2]);



    }
}
