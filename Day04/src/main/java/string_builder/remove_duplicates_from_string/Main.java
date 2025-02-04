package string_builder.remove_duplicates_from_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        // Try catch block to handle the io exception ny buffer reader
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // Get user String
            System.out.print("Enter the string :- ");
            String userInput = br.readLine();

            // Invoke the remover duplicate string method and display it
            System.out.println(RemoveDuplicates.deleteDuplicates(userInput));
        } catch (IOException e) {
            // Caught the exception
            System.out.println("Exception caught " + e.getMessage());
        }

    }
}
