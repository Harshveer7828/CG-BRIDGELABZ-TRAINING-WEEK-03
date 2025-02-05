package com.capgemini.binary_search.first_and_last_occurrence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Handle the buffer reader exception(io exception)
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // Get the length of the array
            System.out.println("Enter the length of the array: ");
            int n = Integer.parseInt(br.readLine().trim());

            int[] arr = new int[n];
            // Take the elements in the array and handle the NUMBER-FORMAT EXCEPTION
            int target = 0;
            try {
                for (int i = 0; i < n; i++) {
                    arr[i] = Integer.parseInt(br.readLine().trim());
                }
                // Get the target element
                System.out.println("Enter the target element: ");
                target = Integer.parseInt(br.readLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Try again! Enter the valid input numbers (Press the number and then enter for new number)" + e.getMessage());
            }

            // Invoke the method and store the result
            int[] result = new int[2];
            result = FindFirstAndLastOccurrence.findFirstAndLastOccurrence(arr, target);

            // Display the result
            System.out.println(result[0] != -1 ? "First occurrence found at " + result[0] + ", Last occurrence found at " + result[1] : "Target not found");


        }catch (IOException e){
            System.out.println("IO EXCEPTION OCCURRED " + e.getMessage());
        }
    }
}
