package data_structure.heap;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class AscendingHeapTest {

    @Test
    void insert() {
        String expectedResult = "[2, 5, 21, 15, 10, 27, null, null, null, null]";

        AscendingHeap heap = new AscendingHeap(10);
        heap.insert(10);
        heap.insert(15);
        heap.insert(27);
        heap.insert(5);
        heap.insert(2);
        heap.insert(21);

        Assert.assertEquals(expectedResult, heap.toString());
    }
}