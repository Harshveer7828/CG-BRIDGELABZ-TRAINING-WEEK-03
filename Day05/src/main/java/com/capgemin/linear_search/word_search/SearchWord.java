package linear_search.word_search;

public class SearchWord {
    public static String search(String[] arr, String word){
        int n = arr.length;
        for (String str : arr) {
            if (str.contains(word)) return str;
        }
        return "Not Found";
    }
}
