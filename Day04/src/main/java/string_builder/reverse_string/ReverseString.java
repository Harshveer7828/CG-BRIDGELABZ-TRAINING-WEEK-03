package string_builder.reverse_string;

public class ReverseString {
    public static String reverse(String input){
        StringBuilder result = new StringBuilder(input);
        input  = result.reverse().toString();
        return input;
    }
}
