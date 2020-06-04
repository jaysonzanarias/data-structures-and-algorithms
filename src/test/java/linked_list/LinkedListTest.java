package linked_list;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LinkedListTest {
    LinkedList list;

    @BeforeEach
    public void setup() {
        list = new LinkedList();
        list.insertAtHead(5);
        list.insertAtHead(10);
        list.insertAtHead(2);
        list.insertAtHead(12);
        list.insertAtHead(19);
        list.insertAtHead(20);
    }

    @Test
    public void insertAtHead() {
        String expectedResult = "{Data: 20, Data: 19, Data: 12, Data: 2, Data: 10, Data: 5}";
        Assert.assertEquals(expectedResult, list.toString());
    }

    @Test
    public void length(){
        int expectedLength = 6;
        Assert.assertEquals(expectedLength, list.length());
    }

    @Test
    void deleteFromHead() {
        list.deleteFromHead();

        int expectedLength = 5;
        Assert.assertEquals(expectedLength, list.length());

        String expectedResult = "{Data: 19, Data: 12, Data: 2, Data: 10, Data: 5}";
        Assert.assertEquals(expectedResult, list.toString());
    }

    @Test
    void find() {
        String expectedResult = "Data: 12";
        Assert.assertEquals(expectedResult, list.find(12).toString());
        Assert.assertNull(list.find(121));
    }
}