package BubbleSort;

public class BubbleSort {
    static void bubbleSort(double[] studentMark) {
        int n = studentMark.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n ; j++) {
                if (studentMark[i] > studentMark[j]){
                    double temp = studentMark[i];
                    studentMark[i] = studentMark[j];
                    studentMark[j] = temp;
                }
            }
        }
    }
}
