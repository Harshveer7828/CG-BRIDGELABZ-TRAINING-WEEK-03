package HashMap.TwoSum;

import java.util.HashMap;

public class TwoSum {

    // Method to find two indices such that their values add up to the target sum
    public static int[] twoSum(int[] nums, int target) {
        // HashMap to store the value and its corresponding index
        HashMap<Integer, Integer> map = new HashMap<>();

        // iterrate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Calculate the complement value

            // If the complement exists in the map, return the indices
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            // If the complement doesn't exist, store the current number with its index
            map.put(nums[i], i);
        }

        // Return an empty array if no solution is found
        return new int[]{};
    }

    // Main method to test the Two Sum solution
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15}; // Input array
        int target = 9; // Target sum

        int[] result = twoSum(nums, target);

        // Print the result
        if (result.length > 0) {
            System.out.println("Indices of the two numbers: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found.");
        }
    }
}

