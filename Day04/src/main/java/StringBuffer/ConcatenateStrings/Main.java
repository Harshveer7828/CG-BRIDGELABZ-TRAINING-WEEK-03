package StringBuffer.ConcatenateStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        // Try catch block to handle the io exception from the buffer reader
        try {
            // Buffer reader to get the user input
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // Get the user array of String length
            System.out.print("Enter the String array length:- ");

            // parse the string into the integer
            int n = Integer.parseInt(br.readLine());

            String[] arr = new String[n];
            // Storing the user string value to the array
            System.out.println("Enter the values of array:- " + n);
            for (int i = 0; i < n; i++) {
                arr[i] = br.readLine();
            }

            // Invoke the concatenate method
            System.out.println(ConcatenateString.concatenate(arr));

        } catch (IOException e) {
            System.out.println("Exception caught " + e.getMessage());
        }
    }
}
