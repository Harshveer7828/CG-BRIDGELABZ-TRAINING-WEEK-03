package QuickSort;

public class QuickSort {
    // method to implement the quick sort
    static public void quickSort(int[] arr, int start, int end){
        if (start < end) {
            int pi = partition(arr, start, end);
            quickSort(arr, start, pi - 1);
            quickSort(arr, pi + 1, end);
        }
    }
    // Partition by comparing the pivot element to the other elements
    static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = pivot;
        arr[end] = arr[i];
        arr[i] = temp;

        return i;
    }
}
