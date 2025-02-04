package input_stream_reader.read_write_in_file;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // Get the file name and the content to add in the file
            System.out.println("Enter the file name: ");
            String fileName = br.readLine();
            System.out.println("Enter the content:- ");
            String content = "";        // Store the user content writing in the console
            while (!content.equals("exit")) {
                content = br.readLine();
                if (!content.equals("exit")){
                    // Invoke the method to write in the file
                    ReadAndWriteInFile.writeFile(fileName, content);
                }
            }

            // Invoke the method to display the file
            ReadAndWriteInFile.readFile(fileName);
        }catch (IOException e){
            System.out.println("Exception Occurred " + e.getMessage());
        }
    }
}
