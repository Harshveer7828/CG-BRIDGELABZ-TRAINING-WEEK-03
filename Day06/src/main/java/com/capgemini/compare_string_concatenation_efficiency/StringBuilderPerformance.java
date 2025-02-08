package com.capgemini.compare_string_concatenation_efficiency;

public class StringBuilderPerformance {
    public static long calculateBuilderTime(int iterations) {
        StringBuilder sb = new StringBuilder();
        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            sb.append("a");
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
