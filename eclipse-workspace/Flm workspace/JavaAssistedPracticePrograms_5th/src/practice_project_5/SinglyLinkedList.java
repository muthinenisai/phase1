package practice_project_5;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    Node head;

    // Method to delete the first occurrence of a key in the linked list
    void deleteNode(int key) {
        Node temp = head;
        Node prev = null;

        // If the key is at the head itself
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        // Search for the key to be deleted, keep track of the previous node
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If the key was not present in the linked list
        if (temp == null) {
            return;
        }

        // Unlink the node containing the key
        prev.next = temp.next;
    }

    // Method to print the linked list
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);

        System.out.println("Linked list before deletion:");
        list.printList();

        int key = 3;
        list.deleteNode(key);

        System.out.println("Linked list after deleting " + key + ":");
        list.printList();
    }
}
