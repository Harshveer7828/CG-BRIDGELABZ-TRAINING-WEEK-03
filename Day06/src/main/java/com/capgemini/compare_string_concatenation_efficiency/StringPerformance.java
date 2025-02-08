package com.capgemini.compare_string_concatenation_efficiency;

public class StringPerformance {
    public static long calculateStringTime(int iteration){
        String a = "";
        long startTime = System.nanoTime();
        for (int i = 0; i < iteration; i++) {
            a += "a";
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
