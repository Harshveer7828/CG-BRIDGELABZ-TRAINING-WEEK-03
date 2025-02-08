package com.capgemini.compare_recursion_and_iterative_fibonacchi;

public class ByRecursion {
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}
