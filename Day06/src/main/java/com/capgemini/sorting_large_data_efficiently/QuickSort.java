package com.capgemini.sorting_large_data_efficiently;

import java.util.Random;

public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int j = partition(arr, low, high);
            quickSort(arr, low, j - 1);
            quickSort(arr, j + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        // Random pivot selection
        int pivotIndex = new Random().nextInt(high - low + 1) + low;
        int pivot = arr[pivotIndex];

        // Swap pivot with the first element
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[low];
        arr[low] = temp;

        int i = low + 1, j = high;

        while (i <= j) {
            while (i <= j && arr[i] <= pivot) i++;
            while (i <= j && arr[j] > pivot) j--;

            if (i < j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Place pivot in correct position
        arr[low] = arr[j];
        arr[j] = pivot;
        return j;
    }
}