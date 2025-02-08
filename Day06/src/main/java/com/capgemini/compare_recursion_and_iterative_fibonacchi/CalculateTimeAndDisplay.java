package com.capgemini.compare_recursion_and_iterative_fibonacchi;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class CalculateTimeAndDisplay {
    public static boolean displayTimeResult(int n){
        long startOfRecursion = System.nanoTime();
        int result1 = ByRecursion.fibonacciRecursive(n);
        long endOfRecursion = System.nanoTime();


        long startOfIterative = System.nanoTime();
        int result2 = ByIterativeApproach.fibonacciIterative(n);
        long endOfIterative = System.nanoTime();

        long timeByRecursion = endOfRecursion-startOfRecursion;
        long timeByIteration = endOfIterative-startOfIterative;

        System.out.println("Time taken by the recursive function: "+ (TimeUnit.NANOSECONDS.toMillis(timeByRecursion))+" ms");
        System.out.println("Time taken by the iterative function: "+ TimeUnit.NANOSECONDS.toMillis(endOfIterative-startOfIterative) +" ms");

        return timeByRecursion >= timeByIteration;
    }
}
