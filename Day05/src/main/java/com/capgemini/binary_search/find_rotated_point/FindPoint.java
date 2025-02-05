package com.capgemini.binary_search.find_rotated_point;

public class FindPoint {

    // method to find the index of smallest element
    public static int findSmallestElementIndex(int[] arr) {
        // Variable which stores the pointer
        int left = 0, right = arr.length - 1, mid;

        // Loop until left pointer is less and equal to right
        while (left <= right) {
            // Update the middle element
            mid = (left + (right - left)) / 2;
            // left equal to right then the smallest element is in the left pointer
            if (left == right) return left;
            // If the middle element is greater than the right so the smallest elements is in the mid to right
            else if (arr[mid] > arr[right]) left = mid + 1;
            else if (arr[mid] < arr[left]) right = mid;
        }

        return -1;
    }

}
