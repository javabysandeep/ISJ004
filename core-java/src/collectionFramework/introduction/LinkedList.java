package collectionFramework.introduction;

public class LinkedList {
    Node head;
    int size = 0;

    void add(Object data) {
        if (head == null) {
            Node temp = new Node(data);
            head = temp;
            size++;
        } else {
            Node newNode = new Node(data);
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            size++;
        }

    }

    void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }
}
