package string_builder.reverse_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        // Make an buffer object to get the user input
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the String:- ");
            String userInput = br.readLine();

            // Invoke the method to reverse the string
            String reverseString = ReverseString.reverse(userInput);
            System.out.println(reverseString);
        }catch (IOException e){     // Handle the buffer reader io exeption
            System.out.println("Exception occurred " + e.getMessage());
        }
    }
}
