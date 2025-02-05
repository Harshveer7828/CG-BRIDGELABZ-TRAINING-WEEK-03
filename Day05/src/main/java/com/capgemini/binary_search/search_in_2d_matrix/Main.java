package com.capgemini.binary_search.search_in_2d_matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // Get the size of the array from the user
            System.out.println("Enter the length of the array: ");
            int n = Integer.parseInt(br.readLine());

            // Array  for storing the elements
            int[][] arr = new int[n][n];
            System.out.println("Enter the array elements: ");
            try{
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        arr[i][j] = Integer.parseInt(br.readLine());
                    }
                }

            }catch (NumberFormatException e){
                System.out.println("Number format exception occurred please enter the number one by one (Enter the number and press enter then repeat the process)\n" + e.getMessage());
            }
            System.out.println("Enter the target value: ");
            int target = Integer.parseInt(br.readLine());

            // Display the index
            System.out.println(SearchTargetValue.searchIndex(arr,target));
        }catch (IOException e){
            System.out.println("Exception caught IO Exception " + e.getMessage());
        }
    }
}
