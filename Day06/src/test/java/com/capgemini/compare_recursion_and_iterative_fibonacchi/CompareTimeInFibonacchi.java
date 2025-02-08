package com.capgemini.compare_recursion_and_iterative_fibonacchi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CompareTimeInFibonacchi {
    @Test
    void compareTest(){
        assertTrue(CalculateTimeAndDisplay.displayTimeResult(30));
    }
}
