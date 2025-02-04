package challenge_problem.compare_file_reader_and_Input_stream;

import java.io.*;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;

public class Compare {
    public static void compare(String fileName){
        // Storing file path
        String filePath = "src/main/java/challenge_problem/compare_file_reader_and_Input_stream/" + fileName;

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            long count = 0;
            double timeFileReaderBefore = System.nanoTime();
            while((line = br.readLine()) != null){
                if (!line.equals(" ")) count++;
            }
            double timeFileReaderAfter = System.nanoTime();
            System.out.println("Total word in a file is: " + count + "\nTime taken by file reader is: " + (timeFileReaderAfter - timeFileReaderBefore) / 1e6 + " ms");
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
        // calculating the file input stream time
        try(FileInputStream fs = new FileInputStream(filePath)){
            InputStreamReader isr = new InputStreamReader(fs, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);
            String line;
            long count = 0;
            double timeInputStreamBefore = System.nanoTime();
            while((line = br.readLine()) != null){
                if (!line.equals(" ")) count++;
            }
            double timeInputStreamAfter = System.nanoTime();
            System.out.println("Total word in a file is: " + count + "\nTime taken by input stream reader is: " + (timeInputStreamAfter - timeInputStreamBefore) / 1e6 + " ms");
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
