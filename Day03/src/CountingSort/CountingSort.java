package CountingSort;

import QuickSort.QuickSort;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSort {
    public static void countingSort(int[] ages, int minAge, int maxAge) {
        int range = maxAge - minAge + 1;
        int[] count = new int[range];
        int[] output = new int[ages.length];

        //Count occurrences of each age
        for (int age : ages) {
            count[age - minAge]++;
        }

        //Calculate cumulative frequency
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        for (int i = ages.length - 1; i >= 0; i--) {
            output[count[ages[i] - minAge] - 1] = ages[i];
            count[ages[i] - minAge]--;
        }

        // Copy sorted elements back to the original array
        System.arraycopy(output, 0, ages, 0, ages.length);
    }

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

        // enter the min and max value
        System.out.println("Enter the min value:- ");
        int min = input.nextInt();
        System.out.println("Enter the max value:- " );
        int max = input.nextInt();
        // sort the array
        try{
            countingSort(arr, min, max);
            System.out.print("Scores after sorting:- ");
            System.out.print(Arrays.toString(arr));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error caught invalid input please check and re-enter");
        }
    }
}

