package com.capgemini.sorting_large_data_efficiently;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortingLargeDataEfficientlyTest {

    @Test
    void sortingLargeDataTest1(){
        int[] arr1 = new int[1000];
        int[] arr2 = new int[10000];
        int[] arr3 = new int[100000];

        RandomArrayElementGeneration rand = new RandomArrayElementGeneration();
        rand.generateRandomElement(arr1,1000);
        rand.generateRandomElement(arr2,10000);
        rand.generateRandomElement(arr3,1000000);

        long quickStart1 = System.nanoTime();
        QuickSort.quickSort(arr1, 0, arr1.length - 1);
        long quickEnd1 = System.nanoTime();
        long meanQuickTime1 = quickEnd1 - quickStart1;

        long mergeStart1 = System.nanoTime();
        MergeSort.mergeSort(arr1, 0, arr1.length - 1);
        long mergeEnd1 = System.nanoTime();
        long meanMergeTime1 = mergeEnd1 - mergeStart1;

        long bubbleStart1 = System.nanoTime();
        BubbleSort.bubbleSort(arr1);
        long bubbleEnd1 = System.nanoTime();
        long meanBubbleTime1 = bubbleEnd1 - bubbleStart1;

        long quickStart2 = System.nanoTime();
        QuickSort.quickSort(arr2, 0, arr1.length - 1);
        long quickEnd2 = System.nanoTime();
        long meanQuickTime2 = quickEnd2 - quickStart2;

        long mergeStart2 = System.nanoTime();
        MergeSort.mergeSort(arr2, 0, arr1.length - 1);
        long mergeEnd2 = System.nanoTime();
        long meanMergeTime2 = mergeEnd2 - mergeStart2;

        long bubbleStart2 = System.nanoTime();
        BubbleSort.bubbleSort(arr2);
        long bubbleEnd2 = System.nanoTime();
        long meanBubbleTime2 = bubbleEnd2 - bubbleStart2;

        long quickStart3 = System.nanoTime();
        QuickSort.quickSort(arr3, 0, arr1.length - 1);
        long quickEnd3 = System.nanoTime();
        long meanQuickTime3 = quickEnd3 - quickStart3;

        long mergeStart3 = System.nanoTime();
        MergeSort.mergeSort(arr3, 0, arr1.length - 1);
        long mergeEnd3 = System.nanoTime();
        long meanMergeTime3 = mergeEnd3 - mergeStart3;

        long bubbleStart3 = System.nanoTime();
        BubbleSort.bubbleSort(arr3);
        long bubbleEnd3 = System.nanoTime();
        long meanBubbleTime3 = bubbleEnd3 - bubbleStart3;


        assertTrue(meanQuickTime1 <= meanMergeTime1 && meanQuickTime1 < meanBubbleTime1);
        assertTrue(meanQuickTime2 <= meanMergeTime2 && meanQuickTime2 < meanBubbleTime2);
        assertTrue(meanQuickTime3 <= meanMergeTime3 && meanQuickTime3 < meanBubbleTime3);
    }
}
