package BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Best Case O(n), Worst Case O(n^2).
        // For small dataset
        Scanner input = new Scanner(System.in);
        // Get the total students
        System.out.println("Enter the total student:- ");
        int n = input.nextInt();
        double[] studentMarks = new double[n];
        System.out.print("Enter the marks of the students :- ");
        // Taking the user Input of student marks
        for (int i = 0; i < studentMarks.length; i++) {
            studentMarks[i] = input.nextDouble();
        }

        // sort the array
        BubbleSort.bubbleSort(studentMarks);
        System.out.print("Students after sorting:- ");
        System.out.print(Arrays.toString(studentMarks));

        input.close();
    }
}
