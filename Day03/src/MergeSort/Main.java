package MergeSort;

import InsertionSort.InsertionSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Best case O(n Log n), Worst Case O(n Log n)
        // Space only in this O(n)
        // For small dataset
        Scanner input = new Scanner(System.in);
        // Get the total students
        System.out.println("Enter the number of books :- ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Book price :- ");
        // Taking the user Input of student marks
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        // sort the array
        MergeSort.mergeSort(arr);
        System.out.print("Prices after sorting:- ");
        System.out.print(Arrays.toString(arr));

    }
}
