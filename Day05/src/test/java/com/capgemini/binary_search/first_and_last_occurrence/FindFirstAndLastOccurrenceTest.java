package com.capgemini.binary_search.first_and_last_occurrence;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindFirstAndLastOccurrenceTest {
    // Test one
    @Test
    void findOccurrenceOne(){
        int[] result = FindFirstAndLastOccurrence.findFirstAndLastOccurrence(new int[] {1,2,2,2,3,4,5,6},2);
        assertEquals(Arrays.toString(new int[] {1,3}),Arrays.toString(result));
    }

    // Test second
    @Test
    void findOccurrenceSecond(){
        int[] result = FindFirstAndLastOccurrence.findFirstAndLastOccurrence(new int[] {2,2,2,2,2,2,2,2,2},2);
        assertEquals(Arrays.toString(new int[] {0,8}),Arrays.toString(result));
    }
}
