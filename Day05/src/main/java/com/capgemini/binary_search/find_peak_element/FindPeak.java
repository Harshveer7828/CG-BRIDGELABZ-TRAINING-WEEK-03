package com.capgemini.binary_search.find_peak_element;

public class FindPeak {
    public static int peakIndex(int[] arr) {
        if (arr == null || arr.length == 0) return -1; // Handle empty array case
        if (arr.length == 1) return 0; // Single element is the peak

        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}
