package com.capgemini.binary_search.search_in_2d_matrix;

public class SearchTargetValue {
    public static boolean searchIndex(int[][] arr, int target){
        int row = arr.length;
        int col = arr[0].length;
        int left = 0, right = row - 1;
        // Checks the first elements in the matrix array
        while(left <= right){
            int mid = left + (right - left) / 2;

            if (arr[mid][0] == target) return true;
            else if(arr[mid][0] > target) right = mid - 1;
            else left = mid + 1;
        }
        if (right < 0) return false;

        row = right;
        left = 0;
        right = col - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if (arr[row][mid] == target) return true;
            else if(arr[row][mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
}
