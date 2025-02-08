package com.capgemini.sorting_algorithm_comparison;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SortingComparisonTest {
    // Perform test
    @Test
    void sortingAlgorithmComparison(){
        AddRandomElements addRandomElements = new AddRandomElements();
        int[] arr1 = new int[1000];
        int[] arr2 = new int[10000];
        int[] arr3 = new int[1000000];

        // Add random values to the array
        addRandomElements.addRandomElement(arr1);
        addRandomElements.addRandomElement(arr2);
        addRandomElements.addRandomElement(arr3);


        double timeTakenByBubbleSort1 = BubbleSort.bubbleSort(arr1);
        double timeTakenByMergeSort1 = QuickSort.quickSort(arr1);
        double timeTakenByQuickSort1 = MergeSort.mergeSort(arr1);

        double timeTakenByBubbleSort2 = BubbleSort.bubbleSort(arr2);
        double timeTakenByMergeSort2 = QuickSort.quickSort(arr2);
        double timeTakenByQuickSort2 = MergeSort.mergeSort(arr2);

        double timeTakenByMergeSort3 = QuickSort.quickSort(arr3);
        double timeTakenByQuickSort3 = MergeSort.mergeSort(arr3);


        assertTrue(timeTakenByQuickSort1 < timeTakenByMergeSort1 && timeTakenByQuickSort1 < timeTakenByBubbleSort1);
        assertTrue(timeTakenByQuickSort2 < timeTakenByMergeSort2 && timeTakenByQuickSort2 < timeTakenByBubbleSort2);

        // Bubble sort takes so much time it is not compared
        assertTrue(timeTakenByQuickSort3 < timeTakenByMergeSort3);

    }
}
