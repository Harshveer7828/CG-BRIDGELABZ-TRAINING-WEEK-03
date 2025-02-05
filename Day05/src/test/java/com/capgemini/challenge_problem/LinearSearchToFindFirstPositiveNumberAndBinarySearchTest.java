package com.capgemini.challenge_problem;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinearSearchToFindFirstPositiveNumberAndBinarySearchTest {
    // Test one
    @Test
    void linearSearchTest(){
        assertEquals(2,LinearSearchToFindFirstPositiveNumberAndBinarySearch.searchFirstMissingPositive(new ArrayList<>(Arrays.asList(1,3,4,5,6))));
    }

    // Test second
    @Test
    void binaryTest(){
        assertEquals(2,LinearSearchToFindFirstPositiveNumberAndBinarySearch.binarySearch(new ArrayList<>(Arrays.asList(1,3,4,5,6)),4));
    }
}
