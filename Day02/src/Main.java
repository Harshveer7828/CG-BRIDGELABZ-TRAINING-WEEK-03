import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> wordCount = new HashMap<>();
        String[] words = {"apple", "banana", "apple"};
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        System.out.println(wordCount);



    }
}
