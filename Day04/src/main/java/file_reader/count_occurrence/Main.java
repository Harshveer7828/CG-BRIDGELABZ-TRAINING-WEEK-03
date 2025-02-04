package file_reader.count_occurrence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // Get user data
            System.out.println("Enter the filename: ");
            String fileName = br.readLine();
            System.out.println("Enter the character: ");
            char word = br.readLine().charAt(0);
            // Handle the io exception
            System.out.println(CountOccurrence.count(fileName,word));
        }catch(IOException e){
            System.out.println("Error Occurred " + e.getMessage());
        }

    }
}
