package StringBuffer.CompareStringBufferAndStringBuilder;

public class Compare {
    public static double[] comparePerformance(int iterations) {
        String str = "hello";

        // Measuring StringBuffer performance
        StringBuffer buffer = new StringBuffer();
        long startBufferTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            buffer.append(str);
        }
        long endBufferTime = System.nanoTime();
        double bufferTime = (endBufferTime - startBufferTime) / 1e6; // Convert to milliseconds

        // Measuring StringBuilder performance
        StringBuilder builder = new StringBuilder();
        long startBuilderTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            builder.append(str);
        }
        long endBuilderTime = System.nanoTime();
        double builderTime = (endBuilderTime - startBuilderTime) / 1e6; // Convert to milliseconds

        return new double[]{bufferTime, builderTime}; // Return times for testing
    }
}
