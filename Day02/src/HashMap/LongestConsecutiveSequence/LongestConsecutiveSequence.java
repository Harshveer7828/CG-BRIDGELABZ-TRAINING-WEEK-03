package HashMap.LongestConsecutiveSequence;


import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] arr) {
        if (arr.length == 0) return 0;

        // HashMap to store each number and mark if it's the start of a sequence
        Map<Integer, Boolean> numMap = new HashMap<>();

        // Add all numbers to the HashMap
        for (int num : arr) {
            numMap.put(num, true);
        }
        // Stores the longest sequence length
        int maxLength = 0;

        // Iterate through the array
        for (int num : arr) {
            // Check if the start of a sequence
            if (!numMap.containsKey(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                // Count consecutive numbers in the sequence
                while (numMap.containsKey(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                // Update the maximum sequence length
                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest Consecutive Sequence Length: " + longestConsecutive(arr));
    }
}

