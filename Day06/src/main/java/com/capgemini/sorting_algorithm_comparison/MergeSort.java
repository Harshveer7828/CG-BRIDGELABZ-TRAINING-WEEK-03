package com.capgemini.sorting_algorithm_comparison;

public class MergeSort {
    // Method to divide the array

    static void divide(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        divide(arr, start, mid);
        divide(arr, mid + 1, end);
        merge(arr, start, end, mid);
    }

    // Corrected merge function
    private static void merge(int[] arr, int start, int end, int mid) {
        int[] temp = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;

        // Merge left and right subarrays
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements from left subarray
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from right subarray
        System.arraycopy(temp,0,arr,start,temp.length);

    }

    // Public method to call mergeSort
    public static double mergeSort(int[] arr) {
        double timeBefore = System.nanoTime();
        divide(arr, 0, arr.length - 1);
        return (System.nanoTime() - timeBefore) / 1e6;
    }

}
