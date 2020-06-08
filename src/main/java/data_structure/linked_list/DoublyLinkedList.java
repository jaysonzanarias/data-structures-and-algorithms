package data_structure.linked_list;

public class DoublyLinkedList {
    private DoublyLinkedNode head;

    public void insertAtHead(int data) {
        DoublyLinkedNode newNode = new DoublyLinkedNode(data);
        newNode.setNextNode(head);
        if (null != head) {
            head.setPreviousNode(newNode);
        }
        head = newNode;
    }

    public int length() {
        if (null == head) {
            return 0;
        }

        int length = 0;
        DoublyLinkedNode current = head;

        while (current != null) {
            length++;
            current = current.getNextNode();
        }

        return length;
    }

    @Override
    public String toString() {
        String result = "{";
        DoublyLinkedNode current = head;

        if (null == current) {
            return "}";
        }

        while (true) {
            result += current.toString();
            current = current.getNextNode();

            if (null != current) {
                result += ", ";
            } else {
                break;
            }
        }

        result += "}";
        return result;
    }
}
