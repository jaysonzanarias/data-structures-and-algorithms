package algorithm.sorting.insertion_sort;

public class InsertionSort {
    public int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int current = data[i];
            int j = i - 1;
            while(j >= 0 && data[j] > current) {
                data[j+1] = data[j];
                j -= 1;
            }
            data[j+1] = current;
        }
        return data;
    }
}
