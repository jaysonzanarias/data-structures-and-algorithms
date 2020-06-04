package sorting.bubble_sort;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class BubbleSortTest {
    int[] testNumbers = { 10, 2, 8, 6, 7, 3 };
    int[] expectedResult = {2, 3, 6, 7, 8, 10};

    @Test
    void sort() {
        int[] result = new BubbleSort().sort(testNumbers);
        Assert.assertArrayEquals(expectedResult, result);
    }
}