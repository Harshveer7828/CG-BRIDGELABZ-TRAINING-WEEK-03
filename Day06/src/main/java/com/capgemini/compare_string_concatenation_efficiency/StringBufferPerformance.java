package com.capgemini.compare_string_concatenation_efficiency;

public class StringBufferPerformance {
    public static long calculateBufferPerformance(int iterations) {
        StringBuffer sb = new StringBuffer();
        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            sb.append("a");
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
