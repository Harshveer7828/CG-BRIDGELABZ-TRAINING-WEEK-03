package InsertionSort;

import BubbleSort.BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Best time O(n) worst case O(n^2).
        // For small dataset
        Scanner input = new Scanner(System.in);
        // Get the total students
        System.out.println("Enter the total Employee :- ");
        int n = input.nextInt();
        int[] id = new int[n];
        System.out.print("Enter the Employee ID :- ");
        // Taking the user Input of student marks
        for (int i = 0; i < id.length; i++) {
            id[i] = input.nextInt();
        }

        // sort the array
        InsertionSort.insertionSort(id);
        System.out.print("Id's after sorting:- ");
        System.out.print(Arrays.toString(id));



    }
}
