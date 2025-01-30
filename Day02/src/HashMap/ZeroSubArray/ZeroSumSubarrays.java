package HashMap.ZeroSubArray;

import java.util.*;

public class ZeroSumSubarrays {
    public static void findZeroSumSubarrays(int[] arr) {
        // HashMap to store sum and list of indices where it occurs
        Map<Integer, List<Integer>> sumMap = new HashMap<>();
        int sum = 0;
        ArrayList<int[]> result = new ArrayList<>();

        // Initialize map with sum 0 at index -1 (for subarrays starting from index 0)
        sumMap.put(0, new ArrayList<>(Arrays.asList(-1)));


        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // Update cumulative sum

            // If sum was seen before, it means we found zero-sum subarrays
            if (sumMap.containsKey(sum)) {
                for (int start : sumMap.get(sum)) {
                    result.add(new int[]{start + 1, i}); // Store (start, end) indices
                }
            }

            // Store the current sum's index in the HashMap
            sumMap.putIfAbsent(sum, new ArrayList<>());
            sumMap.get(sum).add(i);


        }
        for (int[] subarray : result) {
            System.out.println("Start Index: " + subarray[0] + ", End Index: " + subarray[1]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 1, 3, 3, 1, -4};
        findZeroSumSubarrays(arr);
    }
}
