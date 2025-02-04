package challenge_problem.compare_String_builder_and_buffer;

public class compare {
    // Method to calculate the time taken by string builder and string buffer
    public static void compare(int iteration){
        String str = "hello";

        // String builder object
        StringBuilder sb = new StringBuilder();
        double timeByBuilderBefore = System.nanoTime();
        for (int i = 0; i < iteration; i++) {
            sb.append(str);
        }

        double timeByBuilderAfter = System.nanoTime();
        System.out.println("Time taken by string builder is: " + (timeByBuilderAfter - timeByBuilderBefore)/ 1e6 + " ms");
        // String buffer object
        StringBuffer sbuffer = new StringBuffer();
        double timeByBufferBefore = System.nanoTime();
        for (int i = 0; i < iteration; i++) {
            sbuffer.append(str);
        }

        double timeByBufferAfter = System.nanoTime();
        System.out.println("Time taken by string buffer is: " + (timeByBufferAfter - timeByBufferBefore) / 1e6 + " ms");
    }
}
