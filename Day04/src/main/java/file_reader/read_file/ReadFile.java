package file_reader.read_file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    static String readFile(String filePath) {
        // Concatenate current path with the user file
        String myPath = "src/main/java/file_reader/read_file/" + filePath;

        // Try catch block if the exception occurred (File is not found in the directory);
        try {
            BufferedReader br = new BufferedReader(new FileReader(myPath));

            // Line contains the lines of the file
            String line;

            System.out.println(myPath);

            // Handle the IO Exception caused by buffer reader
            try {

                System.out.println("File content is: " + "\n--------------------------");
                // Printing the file content until it reaches to the null
                while ((line = br.readLine()) != null) {    // line = fileContent
                    System.out.println(line);             // Display file content
                }
                System.out.println("-----------------------------");
            } catch (IOException E) {
                System.out.println("Exception occurred IO Exception" + E.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Exception Occurred File not found" + e.getMessage());
        }


        return myPath;
    }
}
