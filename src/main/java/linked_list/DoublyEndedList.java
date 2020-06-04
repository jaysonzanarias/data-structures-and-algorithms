package linked_list;

public class DoublyEndedList {
    private Node head;
    private Node tail;

    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (null == head) {
            head = newNode;
        }

        if (null != tail) {
            tail.setNextNode(newNode);
        }

        tail = newNode;
    }

    @Override
    public String toString() {
        String result = "{";
        Node current = head;

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
