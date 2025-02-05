package com.capgemini.binary_search.find_rotated_point;

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
            int[] arr = new int[n];
            System.out.println("Enter the array elements: ");
            try{
                for (int i = 0; i < n; i++) {
                    arr[i] = Integer.parseInt(br.readLine());
                }

            }catch (NumberFormatException e){
                System.out.println("Number format exception occurred please enter the number one by one (Enter the number and press enter then repeat the process)\n" + e.getMessage());
            }
            // Invoke the method which return the index of smallest elements
            int smallestElementindex = FindPoint.findSmallestElementIndex(arr);
            // Display the index
            System.out.println(smallestElementindex + " is the smallest element index\n" + arr[smallestElementindex] + " is the smallest element");
        }catch (IOException e){
            System.out.println("Exception caught IO Exception " + e.getMessage());
        }

    }
}
