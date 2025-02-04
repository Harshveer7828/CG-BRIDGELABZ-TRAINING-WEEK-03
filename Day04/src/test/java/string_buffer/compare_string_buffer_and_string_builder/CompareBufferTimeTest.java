package string_buffer.compare_string_buffer_and_string_builder;

import string_buffer.compare_string_and_string_builder.Compare;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CompareBufferTimeTest {
    // Test one
    @Test
    void testStringBuilderIsFasterThanStringBuffer() {
        int iterations = 100000;

        // Get execution times
        double[] times = Compare.comparePerformance(iterations);
        double bufferTime = times[0];
        double builderTime = times[1];

        // Assertion: StringBuilder should be faster than StringBuffer
        assertTrue(builderTime < bufferTime, "StringBuilder should be faster than StringBuffer");
    }
}
