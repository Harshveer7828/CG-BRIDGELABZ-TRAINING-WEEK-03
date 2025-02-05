package com.capgemini.binary_search.first_and_last_occurrence;

import java.util.ArrayList;
import java.util.Arrays;

public class FindFirstAndLastOccurrence {
    public static int[] findFirstAndLastOccurrence(int[] arr,int target){
        int[] ans = {-1,-1};
        int left = 0,right = arr.length - 1, mid = 0;
        // Loop until left is smaller than right or the elements is not found and found the first occurrence
        while(left <= right){
            mid = left + (right - left) / 2;
            // Checks if mid is equal to target or not
            if (arr[mid] == target){
                ans[0] = mid;   // Update the first occurrence and move the pointer left
                right = mid - 1;
            }
            else if(arr[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        left = 0;
        right = arr.length - 1;
        while(left <= right){
            mid = left + (right - left) / 2;
            // Checks if mid is equal to target or not
            if (arr[mid] == target){
                ans[1] = mid;   // Update the last occurrence and move the pointer right
                left = mid + 1;
            }
            else if(arr[mid] > target) right = mid - 1;
            else left = mid + 1;
        }



        return ans;
    }
}
