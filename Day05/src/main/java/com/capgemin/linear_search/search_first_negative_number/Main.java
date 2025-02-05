package linear_search.search_first_negative_number;

import javax.print.attribute.standard.NumberOfDocuments;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        // Handle the exception by buffer reader
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the length of array :- ");
            // Handle the index out of bound exception
            try {
                int n = Integer.parseInt(br.readLine());
                int[] arr = new int[n];
                System.out.println("Enter the elements in the array: ");
                for (int i = 0; i < n; i++) {
                    arr[i] = Integer.parseInt(br.readLine());
                }

                // call the method to find the first negative element
                int index = SearchFirstNegative.searchFirstNegative(arr);
                System.out.println("First negative element is found on " + index);
            }catch (NumberFormatException e){
                System.out.println("Exception occurred NumberFormatException" + e.getMessage());
            }
        }catch (IOException e){
            System.out.println("Exception occurred " + e.getMessage());
        }
    }
}
