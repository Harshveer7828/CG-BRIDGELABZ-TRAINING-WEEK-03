package com.capgemini.compare_recursion_and_iterative_fibonacchi;

public class ByIterativeApproach {
    // Method to calculate the time in iterative approach
    public static int fibonacciIterative(int n) {
        int a = 0;
        int b = 1;
        int sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}
