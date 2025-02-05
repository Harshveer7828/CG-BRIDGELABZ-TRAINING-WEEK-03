package com.capgemini.linear_search.word_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter the length of the array: ");
            // Get string array length
            int n = Integer.parseInt(br.readLine());
            // Array of string containing the sentences
            String[] arr = new String[n];
            System.out.println("Enter the values in the string array:");
            try {
                for (int i = 0; i < n; i++) {
                    arr[i] = br.readLine();
                }
                // Get the word to search
                System.out.println("Enter the word to search: ");
                String word = br.readLine();

                // Invoke the method which searches the word and display the sentence if found
                System.out.println(SearchWord.search(arr,word));
            }catch (NumberFormatException e){
                throw new RuntimeException(e.getMessage());
            }
        }catch (IOException e){
            System.out.println("IO Exception occurred " + e.getMessage());
        }
    }
}
