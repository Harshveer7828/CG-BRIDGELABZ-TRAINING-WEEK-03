package HeapSort;
import QuickSort.QuickSort;

import java.util.Arrays;
import java.util.Scanner;

public class HeapSort {
    public static void heapSort(int[] salaries) {
        int n = salaries.length;

        // Build a Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        // Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Swap root (max element) with last element
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            heapify(salaries, i, 0);
        }
    }

    // Heapify function to maintain max heap property
    private static void heapify(int[] arr, int n, int i) {
        int largest = i; // Assume root (largest element)
        int left = 2 * i + 1; // Left child
        int right = 2 * i + 2; // Right child

        // Check if left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected subtree
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Get the total Student
        System.out.println("Enter the number employee:- ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the salary of employee :- ");
        // Taking the user Input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        // sort the array
        HeapSort.heapSort(arr);
        System.out.print("salary after sorting:- ");
        System.out.print(Arrays.toString(arr));
    }
}

