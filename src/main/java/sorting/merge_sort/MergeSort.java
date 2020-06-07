package sorting.merge_sort;

public class MergeSort {
    public int[] sort(int[] numbers) {
        mergeSort(numbers, 0, numbers.length - 1);
        return numbers;
    }

    public void mergeSort(int[] numbers, int start, int end) {
        if (start < end) {
            int middle = (int) Math.floor((start + end) / 2);
            mergeSort(numbers, start, middle);
            mergeSort(numbers, middle + 1, end);
            merge(numbers, start, middle, end);
        }
    }

    public void merge(int[] numbers, int start, int middle, int end) {
        int sizeOfLeft = middle - start + 1;
        int sizeOfRight = end - middle;
        int[] left = new int[sizeOfLeft];
        int[] right = new int[sizeOfRight];

         for (int i = 0; i < sizeOfLeft; i++) {
            left[i] = numbers[start + i];
        }

        for (int i = 0; i < sizeOfRight; i++) {
            right[i] = numbers[middle + 1 + i];
        }

        int i = 0, j = 0;
        for (int k = start; k <= end; k++) {
            if ((j >= sizeOfRight) || (i < sizeOfLeft && left[i] <= right[j])) {
                numbers[k] = left[i];
                i++;
            } else {
                numbers[k] = right[j];
                j++;
            }
        }
    }
}
