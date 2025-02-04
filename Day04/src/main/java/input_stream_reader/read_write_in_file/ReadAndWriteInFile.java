package input_stream_reader.read_write_in_file;

import java.io.*;

public class ReadAndWriteInFile {
    // Method to read the file
    public static void readFile(String fileName) {
        // Storing the file path
        String myPath = "src/main/java/input_stream_reader/read_write_in_file/" + fileName;
        try {
            BufferedReader br = new BufferedReader(new FileReader(myPath));
            String line;   // line contains each line in the file
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {  // Handle the io exception occurred by a buffer reader
            System.out.println("Exception occurred " + e.getMessage());
        }
    }

    // Method to write in the file or append in the file
    public static void writeFile(String fileName, String content) {
        String myPath = "src/main/java/input_stream_reader/read_write_in_file/" + fileName;

        // Handle fileWriter and creating object
        try (FileWriter fw = new FileWriter(myPath,true)) {
            fw.write(content + "\n");
        } catch (IOException e) { // Handling the exception occurred by FileWriter
            System.out.println("Exception occurred " + e.getMessage());
        }
    }
}
