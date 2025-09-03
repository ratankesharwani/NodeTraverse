package org.example.traverse.linkedlist.circularDoublyLinkedList;

public class CircularDoublyLinkedList {
    static class Node {
        int data;
        Node next, prev;

        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;

    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
            return;
        }

        Node tail = head.prev;

        tail.next = newNode;
        newNode.prev = tail;
        newNode.next = head;
        head.prev = newNode;
    }

    // Delete by value
    public void delete(int data) {
        if (head == null) return;

        Node current = head;

        do {
            if (current.data == data) {
                if (current.next == current) {
                    head = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                    if (current == head)
                        head = current.next;
                }
                return;
            }
            current = current.next;
        } while (current != head);
    }

    // Display forward
    public void displayForward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        System.out.print("Forward: ");
        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }

    // Display backward
    public void displayBackward() {
        if (head == null) return;

        Node temp = head.prev;
        System.out.print("Backward: ");
        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        } while (temp != head.prev);
        System.out.println("(back to tail)");
    }

    // Main method
    public static void main(String[] args) {
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.displayForward();   // 10 <-> 20 <-> 30 <-> (back to head)
        list.displayBackward();  // 30 <-> 20 <-> 10 <-> (back to tail)

        list.delete(20);
        list.displayForward();   // 10 <-> 30 <-> (back to head)
    }
}
