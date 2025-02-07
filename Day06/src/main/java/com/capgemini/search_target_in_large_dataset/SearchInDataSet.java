package com.capgemini.search_target_in_large_dataset;

import java.util.Arrays;

public class SearchInDataSet {
    // Method which give the ms of the linear search to search the element
    public long calculateLinearSearchTime(int[] arr, int target) {
        // Search the target element
        long nanoTimeBefore = System.nanoTime();
        for (int j : arr) {
            if (j == target) {
                break;
            }
        }
        return (System.nanoTime() - nanoTimeBefore);
    }

    // Method to calculate the ms time of binary Search
    public long calculateBinarySearchTime(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        Arrays.sort(arr);
        long nanoTimeBefore = System.nanoTime();
        while (left <= right) {
            // update the mid element
            mid = left + (right - left) / 2;
            // Check the element is equal to mid or not
            if (arr[mid] == target) break;
            else if (arr[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        return (System.nanoTime() - nanoTimeBefore);
    }

    // Method to display the time in both linear and binary search
    public void displayTime(int[] arr, int target) {
        double binarySearchTime = calculateBinarySearchTime(arr, target);
        double linearSearchTime = calculateLinearSearchTime(arr, target);
        System.out.println("Time taken in Binary Search is: " + binarySearchTime + "\nTime taken in Linear Search: " + linearSearchTime);
    }
}


