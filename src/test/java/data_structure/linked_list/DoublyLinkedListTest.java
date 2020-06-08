package data_structure.linked_list;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DoublyLinkedListTest {

    @Test
    void insertAtHead() {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtHead(5);
        list.insertAtHead(10);
        list.insertAtHead(2);
        list.insertAtHead(12);
        list.insertAtHead(19);
        list.insertAtHead(20);

        String expectedResult = "{Data: 20, Data: 19, Data: 12, Data: 2, Data: 10, Data: 5}";
        Assert.assertEquals(expectedResult, list.toString());
    }
}