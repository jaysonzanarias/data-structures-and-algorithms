package data_structure.linked_list;

public class LinkedList {
    private Node head;

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.setNextNode(head);
        head = newNode;
    }

    public int length() {
        int length = 0;
        Node current = head;

        while (null != current) {
            length++;
            current = current.getNextNode();
        }

        return length;
    }

    public void deleteFromHead() {
        head = head.getNextNode();
    }

    public Node find(int data) {
        Node current = head;

        while (null != current) {
            if (current.getData() == data) {
                return current;
            }
            current = current.getNextNode();
        }
        return null;
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
