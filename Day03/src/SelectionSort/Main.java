package SelectionSort;

import QuickSort.QuickSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Get the total Scores
        System.out.println("Enter the number total Scores :- ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Scores :- ");
        // Taking the user Input of student marks
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        // sort the array
        QuickSort.quickSort(arr,0,arr.length - 1);
        System.out.print("Scores after sorting:- ");
        System.out.print(Arrays.toString(arr));
    }
}
