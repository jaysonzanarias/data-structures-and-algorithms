package data_structure.linked_list;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DoublyEndedListTest {
    DoublyEndedList list;

    @BeforeEach
    public void setup() {
        list = new DoublyEndedList();
        list.insertAtTail(5);
        list.insertAtTail(10);
        list.insertAtTail(2);
        list.insertAtTail(12);
        list.insertAtTail(19);
        list.insertAtTail(20);
    }

    @Test
    void insertAtTail() {
        String expectedResult = "{Data: 5, Data: 10, Data: 2, Data: 12, Data: 19, Data: 20}";
        Assert.assertEquals(expectedResult, list.toString());
    }
}