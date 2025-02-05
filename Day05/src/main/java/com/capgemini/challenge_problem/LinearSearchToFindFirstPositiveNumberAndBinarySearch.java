package com.capgemini.challenge_problem;

import java.util.ArrayList;

public class LinearSearchToFindFirstPositiveNumberAndBinarySearch {
    public static int searchFirstMissingPositive(ArrayList<Integer> list){
        int n = list.size();

        // Step 1: Create an array to mark presence of numbers
        boolean[] present = new boolean[n + 2];

        // Step 2: Mark all valid numbers in the boolean array
        for (int num : list) {
            if (num > 0 && num <= n + 1) {
                present[num] = true;
            }
        }

        // Step 3: Find the first missing positive number
        for (int i = 1; i <= n + 1; i++) {
            if (!present[i]) {
                return i;
            }
        }

        return -1;
    }
    public static int binarySearch(ArrayList<Integer> arr, int target) {
        System.out.println(arr);
        int left = 0, right = arr.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid) == target) {
                return mid; // Found target
            } else if (arr.get(mid) > target) {
                right = mid - 1; // Search in left half
            } else {
                left = mid + 1; // Search in right half
            }
        }
        return -1;
    }
}
