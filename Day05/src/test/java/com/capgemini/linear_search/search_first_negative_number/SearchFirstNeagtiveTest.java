package com.capgemini.linear_search.search_first_negative_number;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SearchFirstNeagtiveTest {

    // Test one
    @Test
    void searchFirstNegativeTestOne(){
        assertEquals(2,SearchFirstNegative.searchFirstNegative(new int[] {1, 2, -3, 4, 5}));
    }

    // Test second
    @Test
    void searchFirstNegativeTestSecond(){
        assertEquals(-1,SearchFirstNegative.searchFirstNegative(new int[] {1, 2, 0, 4, 5}));
    }
}
