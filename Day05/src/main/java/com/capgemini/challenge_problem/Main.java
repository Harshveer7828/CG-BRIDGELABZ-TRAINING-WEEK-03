package com.capgemini.challenge_problem;

import com.capgemini.binary_search.find_rotated_point.FindPoint;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // Get the size of the array from the user
            System.out.println("Enter the length of the array: ");
            int n = Integer.parseInt(br.readLine());

            // Array  for storing the elements
            ArrayList<Integer> list = new ArrayList<>(n);
            System.out.println("Enter the array elements: ");
            try{
                for (int i = 0; i < n; i++) {
                    int num = Integer.parseInt(br.readLine().trim());
                    list.add(num);
                }

            }catch (NumberFormatException e){
                System.out.println("Number format exception occurred please enter the number one by one (Enter the number and press enter then repeat the process)\n" + e.getMessage());
            }
            // Invoke the method which return the index of smallest elements
            int missingNumber = LinearSearchToFindFirstPositiveNumberAndBinarySearch.searchFirstMissingPositive(list);
            // Display the index
            System.out.println(missingNumber + " is the missing number");

            System.out.println("Enter the target value: ");
            int target = Integer.parseInt(br.readLine().trim());
            // Invoke the binary search
            int[] arr = new int[n];
            Collections.sort(list);
            System.out.println(LinearSearchToFindFirstPositiveNumberAndBinarySearch.binarySearch(list,target) + " index target found");

        }catch (IOException e){
            System.out.println("Exception caught IO Exception " + e.getMessage());
        }


    }
}
