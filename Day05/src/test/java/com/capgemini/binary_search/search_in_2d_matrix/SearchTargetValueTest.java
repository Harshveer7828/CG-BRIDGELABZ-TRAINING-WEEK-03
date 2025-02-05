package com.capgemini.binary_search.search_in_2d_matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchTargetValueTest {

    @Test
    void searchTargetValueOne(){
        assertEquals(true,SearchTargetValue.searchIndex(new int[][] {{1,2,3},{4,5,6},{7,8,9}},3));
    }
    @Test
    void searchTargetValueSecond(){
        assertEquals(false,SearchTargetValue.searchIndex(new int[][] {{1,2,3},{4,5,6},{7,8,9}},10));
    }
}
