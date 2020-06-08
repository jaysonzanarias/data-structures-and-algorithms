package sorting.selection_sort;

public class SelectionSort {
    public int[] sort(int[] data) {
        for(int i=0; i<data.length - 1; i++) {
            int minIndex = i;
            for(int j=i+1; j<data.length; j++){
                if(data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = temp;
        }
        return data;
    }
}
