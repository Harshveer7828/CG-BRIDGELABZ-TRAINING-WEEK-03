package com.capgemini.binary_search.find_rotated_point;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FindPointTest {
    @Test
    void findPointTestOne(){
        assertEquals(2,FindPoint.findSmallestElementIndex(new int[] {4,5,1,2,3}));
    }
}

