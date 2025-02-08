package com.capgemini.compare_string_concatenation_efficiency;

import java.util.concurrent.TimeUnit;

public class DisplayTime {
    static void displayTime(int iteration){
        long timeByString = StringPerformance.calculateStringTime(iteration);
        long timeByStringBuilder = StringBuilderPerformance.calculateBuilderTime(iteration);
        long timeByStringBuffer = StringBufferPerformance.calculateBufferPerformance(iteration);
        System.out.println("-----------------");
        System.out.println("String Builder:- " + TimeUnit.NANOSECONDS.toMillis(timeByStringBuilder));
        System.out.println("String Buffer:- " + TimeUnit.NANOSECONDS.toMillis(timeByStringBuffer));
        System.out.println("String:- " + TimeUnit.NANOSECONDS.toMillis(timeByString));
    }
}
