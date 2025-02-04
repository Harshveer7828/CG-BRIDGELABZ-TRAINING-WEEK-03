package string_builder.remove_duplicates_from_string;

import java.util.HashSet;

public class RemoveDuplicates {
    public static String deleteDuplicates(String userString) {
        // String builder with the initial capacity of 10
        StringBuilder sb = new StringBuilder(10);

        // Hash set of characters which collects the character
        HashSet<Character> set = new HashSet<>();
        for (char ch : userString.toCharArray()) {
            if (!set.contains(ch)){    // If the character is not in the set
                set.add(ch);
                sb.append(ch);
            }
        }

        userString = sb.toString();
        return userString;
    }
}
