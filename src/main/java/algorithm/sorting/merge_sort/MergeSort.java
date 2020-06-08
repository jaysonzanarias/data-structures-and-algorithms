package algorithm.sorting.merge_sort;

public class MergeSort {
    public int[] sort(int[] data) {
        mergeSort(data, 0, data.length - 1);
        return data;
    }

    public void mergeSort(int[] data, int start, int end) {
        if (start < end) {
            int middle = (int) Math.floor((start + end) / 2);
            mergeSort(data, start, middle);
            mergeSort(data, middle + 1, end);
            merge(data, start, middle, end);
        }
    }

    public void merge(int[] data, int start, int middle, int end) {
        int sizeOfLeft = middle - start + 1;
        int sizeOfRight = end - middle;
        int[] left = new int[sizeOfLeft];
        int[] right = new int[sizeOfRight];

         for (int i = 0; i < sizeOfLeft; i++) {
            left[i] = data[start + i];
        }

        for (int i = 0; i < sizeOfRight; i++) {
            right[i] = data[middle + 1 + i];
        }

        int i = 0, j = 0;
        for (int k = start; k <= end; k++) {
            if ((j >= sizeOfRight) || (i < sizeOfLeft && left[i] <= right[j])) {
                data[k] = left[i];
                i++;
            } else {
                data[k] = right[j];
                j++;
            }
        }
    }
}
