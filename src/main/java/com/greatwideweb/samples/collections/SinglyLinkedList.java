package com.greatwideweb.samples.collections;

// singly Linked list is 1 direction .. it only knows about next cannot go backwards
public class SinglyLinkedList {
    private Node first;

    public boolean isEmpty() {
        return (first == null);
    }

    public void insert(Object o) {
        Node newNode = new Node();
        newNode.data = o;
        newNode.next = first;
        first = newNode;
    }

    public Node delete() {
        Node temp = first;
        first = first.next;
        return temp;
    }

    public void displayList() {
        System.out.println("first to last");
        Node current = first;
        while(current != null) {
            current.diplayNode();
            current = current.next;
        }
        System.out.println("end of display list");
    }


    public int size() {
        if(first == null) { return 0; }
        int size = 0;
        Node current = first;
        while(current != null) {
            current = current.next;
            size++;
        }
        return size;
    }
}
