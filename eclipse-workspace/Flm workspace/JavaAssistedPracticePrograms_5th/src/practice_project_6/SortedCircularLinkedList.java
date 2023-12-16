package practice_project_6;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SortedCircularLinkedList {
    Node head;

    // Function to insert a new node into a sorted circular linked list
    void insert(int data) {
        Node newNode = new Node(data);
        Node current = head;

        // If the list is empty, make the new node as head and point to itself
        if (head == null) {
            newNode.next = newNode;
            head = newNode;
        } else if (current.data >= newNode.data) { // If the new data is smaller than the head
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
            head = newNode;
        } else {
            while (current.next != head && current.next.data < newNode.data) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // Function to print the circular linked list
    void display() {
        Node current = head;
        if (head != null) {
            do {
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != head);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SortedCircularLinkedList list = new SortedCircularLinkedList();
        list.insert(1);
        list.insert(3);
        list.insert(5);
        list.insert(7);
        
        System.out.println("Sorted Circular Linked List:");
        list.display();
    }
}
