package data_structure.heap;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class HeapTest {

    @Test
    void heapify() {
        String expectResult = "[1, 7, 12, 16, 21, 22, 28, 40, 44, 46, 66, 73, 90]";

        Heap heap = new Heap(10);
        heap.insert(10);
        heap.insert(15);
        heap.insert(27);
        heap.insert(5);
        heap.insert(2);
        heap.insert(21);

        // System.out.println(heap.deleteRoot());

        heap.heapSort();

        // System.out.println(heap);

        Heap result = Heap.heapify(new int[] { 73, 16, 40, 1, 46, 28, 12, 21, 22, 44, 66, 90, 7 });
        result.heapSort();

        // System.out.println(result);

        Assert.assertEquals(expectResult, result.toString());
    }
}