package com.capgemini.binary_search.find_peak_element;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindPeakTest {
    // Test one
    @Test
    void findPeakOne(){
        assertEquals(2, FindPeak.peakIndex(new int[] {1,2,3,2,1}));
    }
}
