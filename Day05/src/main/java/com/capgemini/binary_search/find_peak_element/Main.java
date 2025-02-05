package com.capgemini.binary_search.find_peak_element;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter the length of the array: ");
            int n = Integer.parseInt(br.readLine().trim());

            // Array which stores the elements
            int[] arr = new int[n];
            System.out.println("Enter the array elements ");
            try {
                for (int i = 0; i < n; i++) {
                    arr[i] = Integer.parseInt(br.readLine().trim());
                }
            }catch (NumberFormatException e){
                System.out.println("Number format exception occurred " + e.getMessage());
            }

            int index = FindPeak.peakIndex(arr);
            System.out.println("Peak find at index " + index + " and peak element is " + arr[index]);
        }catch (IOException e){
            System.out.println("IO exception occurred " + e.getMessage());
        }

    }
}
