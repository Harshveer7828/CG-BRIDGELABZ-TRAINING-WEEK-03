package com.capgemini.sorting_algorithm_comparison;

public class QuickSort {

    public static double quickSort(int[] arr) {
        double timeBefore = System.nanoTime();
        quickSortHelper(arr, 0, arr.length - 1);
        return (System.nanoTime() - timeBefore) / 1e6;
    }

    // Recursive QuickSort method (No timing here)
    private static void quickSortHelper(int[] arr, int start, int end) {
        if (start < end) {
            int pi = partition(arr, start, end);
            quickSortHelper(arr, start, pi - 1);
            quickSortHelper(arr, pi + 1, end);
        }
    }

    // Partition logic
    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, end);
        return i + 1;
    }

    // Swap method for cleaner code
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
