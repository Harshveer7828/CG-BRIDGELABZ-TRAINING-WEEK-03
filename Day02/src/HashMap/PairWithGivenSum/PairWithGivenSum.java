package HashMap.PairWithGivenSum;

import java.util.HashMap;
import java.util.Map;

public class PairWithGivenSum {
    public static boolean hasPairWithSum(int[] arr, int target) {
        // HashMap to store numbers we have seen
        Map<Integer, Boolean> numMap = new HashMap<>();

        // Traverse the array
        for (int num : arr) {
            int complement = target - num;

            // Check if complement exists in the HashMap
            if (numMap.containsKey(complement)) {
                System.out.println("Pair found: (" + complement + ", " + num + ")");
                return true;
            }

            // Store the current number in the HashMap
            numMap.put(num, true);
        }

        System.out.println("No pair found.");
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 2, 4, 6};
        int target = 10;
        hasPairWithSum(arr, target);
    }
}
