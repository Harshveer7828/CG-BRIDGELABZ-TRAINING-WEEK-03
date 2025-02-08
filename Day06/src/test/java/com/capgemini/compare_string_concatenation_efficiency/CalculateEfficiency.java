package com.capgemini.compare_string_concatenation_efficiency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculateEfficiency {
    // Test to check string builder time is less than buffer and string class
    @Test
    void compareTestOne(){
        long timeByString = StringPerformance.calculateStringTime(1000);
        long timeByStringBuilder = StringBuilderPerformance.calculateBuilderTime(1000);
        long timeByStringBuffer = StringBufferPerformance.calculateBufferPerformance(1000);

        assertTrue(timeByString >= timeByStringBuilder && timeByStringBuffer >= timeByStringBuilder);

    }
}
