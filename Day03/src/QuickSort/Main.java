package QuickSort;

import MergeSort.MergeSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // worst case O(n^2) and average case is same as merge sort
        // Advantage no extra space is needed
        Scanner input = new Scanner(System.in);
        // Get the Product total
        System.out.println("Enter the number of Products :- ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Product price :- ");
        // Taking the user Input of student marks
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        // sort the array
        QuickSort.quickSort(arr,0,arr.length - 1);
        System.out.print("Prices after sorting:- ");
        System.out.print(Arrays.toString(arr));

    }
}
