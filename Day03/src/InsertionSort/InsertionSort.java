package InsertionSort;

public class InsertionSort {

    //Method to sort the insertion sort
    static void insertionSort(int[] id){
        int n = id.length;
        for (int i = 1; i < n; i++) {
            int key = id[i];
            int j = i - 1;
            while(j >= 0 && id[j] > key){
                id[j + 1] = id[j];
                j--;
            }
            id[j+1] = key;
        }
    }
}
