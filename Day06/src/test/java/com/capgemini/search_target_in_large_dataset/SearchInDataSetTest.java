package com.capgemini.search_target_in_large_dataset;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SearchInDataSetTest {

    // Test one
    @Test
    void searchInDataSetTestOne(){
        // Get essential data to test
        int[] arr1 = new int[1000];
        int[] arr2 = new int[10000];
        int[] arr3 = new int[1000000];

        AddRandomElements randomAdd = new AddRandomElements();
        SearchInDataSet searchMethod = new SearchInDataSet();

        randomAdd.addRandomElement(arr1);
        randomAdd.addRandomElement(arr2);
        randomAdd.addRandomElement(arr3);

        double timeTakenByBinarySearch1 = searchMethod.calculateBinarySearchTime(arr1,arr1[arr1.length / 2]);
        double timeTakenByBinarySearch2 = searchMethod.calculateBinarySearchTime(arr2,arr2[arr2.length / 2]);
        double timeTakenByBinarySearch3 = searchMethod.calculateBinarySearchTime(arr3,arr3[arr3.length / 2]);

        double timeTakenByLinearSearch1 = searchMethod.calculateLinearSearchTime(arr1,arr1[arr1.length / 2]);
        double timeTakenByLinearSearch2 = searchMethod.calculateLinearSearchTime(arr2,arr2[arr2.length / 2]);
        double timeTakenByLinearSearch3 = searchMethod.calculateLinearSearchTime(arr3,arr3[arr3.length / 2]);


        assertTrue(timeTakenByLinearSearch1 > timeTakenByBinarySearch1);
        assertTrue(timeTakenByLinearSearch2 > timeTakenByBinarySearch2);
        assertTrue(timeTakenByLinearSearch3 > timeTakenByBinarySearch3);
    }


}
