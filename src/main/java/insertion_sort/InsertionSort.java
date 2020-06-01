package insertion_sort;

public class InsertionSort {
    public int[] sort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            int j = i - 1;
            while(j >= 0 && numbers[j] > current) {
                numbers[j+1] = numbers[j];
                j -= 1;
            }
            numbers[j+1] = current;
        }
        return numbers;
    }
}
