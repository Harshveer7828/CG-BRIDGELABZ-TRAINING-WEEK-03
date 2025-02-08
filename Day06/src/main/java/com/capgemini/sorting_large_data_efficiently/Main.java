package com.capgemini.sorting_large_data_efficiently;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        RandomArrayElementGeneration addRandomElements = new RandomArrayElementGeneration();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size for first Array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.print("Enter size for Second Array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.print("Enter size for Third Array: ");
        int n3 = sc.nextInt();
        int[] arr3 = new int[n3];

        // Add random values to the array
        addRandomElements.generateRandomElement(arr1, n1);
        addRandomElements.generateRandomElement(arr2, n2);
        addRandomElements.generateRandomElement(arr3, n3);

        System.out.println();
        System.out.println("Time taken by algorithms for dataset size 1000");
        System.out.println("----------------------------");

        long quickStart1 = System.nanoTime();
        QuickSort.quickSort(arr1, 0, arr1.length - 1);
        long quickEnd1 = System.nanoTime();
        System.out.println("Time taken by Quick Sort  : " + (TimeUnit.NANOSECONDS.toMillis(quickEnd1 - quickStart1)) + " ms");

        long mergeStart1 = System.nanoTime();
        MergeSort.mergeSort(arr1, 0, arr1.length - 1);
        long mergeEnd1 = System.nanoTime();
        System.out.println("Time taken by Merge Sort  : " + (TimeUnit.NANOSECONDS.toMillis(mergeEnd1 - mergeStart1)) + " ms");

        long bubbleStart1 = System.nanoTime();
        BubbleSort.bubbleSort(arr1);
        long bubbleEnd1 = System.nanoTime();
        System.out.println("Time taken by Bubble Sort : " + (TimeUnit.NANOSECONDS.toMillis(bubbleEnd1 - bubbleStart1)) + " ms");


        System.out.println();
        System.out.println("Time taken by algorithms for dataset size 10000");
        System.out.println("----------------------------");

        long quickStart2 = System.nanoTime();
        QuickSort.quickSort(arr2, 0, arr1.length - 1);
        long quickEnd2 = System.nanoTime();
        System.out.println("Time taken by Quick Sort  : " + (TimeUnit.NANOSECONDS.toMillis(quickEnd2 - quickStart2)) + " ms");

        long mergeStart2 = System.nanoTime();
        MergeSort.mergeSort(arr2, 0, arr1.length - 1);
        long mergeEnd2 = System.nanoTime();
        System.out.println("Time taken by Merge Sort  : " + (TimeUnit.NANOSECONDS.toMillis(mergeEnd2 - mergeStart2)) + " ms");

        long bubbleStart2 = System.nanoTime();
        BubbleSort.bubbleSort(arr2);
        long bubbleEnd2 = System.nanoTime();
        System.out.println("Time taken by Bubble Sort : " + (TimeUnit.NANOSECONDS.toMillis(bubbleEnd2 - bubbleStart2)) + " ms");

        System.out.println();
        System.out.println("Time taken by algorithms for dataset size 10000000");
        System.out.println("----------------------------");

        long quickStart3 = System.nanoTime();
        QuickSort.quickSort(arr3, 0, arr1.length - 1);
        long quickEnd3 = System.nanoTime();
        System.out.println("Time taken by Quick Sort  : " + (TimeUnit.NANOSECONDS.toMillis(quickEnd3 - quickStart3)) + " ms");

        long mergeStart3 = System.nanoTime();
        MergeSort.mergeSort(arr3, 0, arr1.length - 1);
        long mergeEnd3 = System.nanoTime();
        System.out.println("Time taken by Merge Sort  : " + (TimeUnit.NANOSECONDS.toMillis(mergeEnd3 - mergeStart3)) + " ms");

        long bubbleStart3 = System.nanoTime();
        BubbleSort.bubbleSort(arr3);
        long bubbleEnd3 = System.nanoTime();
        System.out.println("Time taken by Bubble Sort : " + (TimeUnit.NANOSECONDS.toMillis(bubbleEnd3 - bubbleStart3)) + " ms");
    }
}
