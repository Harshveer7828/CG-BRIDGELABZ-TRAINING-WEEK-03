package linear_search.search_first_negative_number;

public class SearchFirstNegative {
    public static int searchFirstNegative(int[] arr){
        for(int i = 0;i < arr.length; i++){
            if (arr[i] < 0) return i;
        }
        return -1;
    }
}
