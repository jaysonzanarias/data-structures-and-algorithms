package algorithm.sorting.counting_sort;

import java.util.Arrays;

public class CountingSort {
    public int[] sort(int[] data) {
        int[] temp = new int[11];

        for (int i = 0; i < data.length; i++) {
            temp[data[i]] = temp[data[i]] + 1;
        }

        System.out.println(Arrays.toString(temp));

        int curr = 0;

        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i]; j++) {
                data[curr] = i;
                curr++;
            }
        }

        return data;
    }
}
