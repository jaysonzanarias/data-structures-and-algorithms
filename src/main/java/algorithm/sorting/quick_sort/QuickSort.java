package algorithm.sorting.quick_sort;

public class QuickSort {
    public int[] sort(int[] data) {
        return quicksort(data, 0, data.length-1);
    }

    public int[] quicksort(int[] data, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(data, start, end);
            quicksort(data, start, pivotIndex-1);
            quicksort(data, pivotIndex+1, end);
        }
        return data;
    }

    private int partition(int[] data, int start, int end) {
        int pivot = data[end];
        int i = start;
        for (int j = start; j <= end - 1; j++) {
            if (data[j] < pivot) {
                int tmp = data[i];
                data[i] = data[j];
                data[j] = tmp;
                i++;
            }
        }
        data[end] = data[i];
        data[i] = pivot;
        return i;
    }
}
