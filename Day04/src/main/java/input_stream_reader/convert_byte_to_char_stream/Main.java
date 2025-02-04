package input_stream_reader.convert_byte_to_char_stream;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Handle the IO Exception from buffer reader.
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the file name: ");
            // Get the filename from user
            String fileName = br.readLine();
            ConvertByteToCharStream.convert(fileName);
        }catch (IOException e){
            System.out.println("Error occurred " + e.getMessage());
        }
    }
}
