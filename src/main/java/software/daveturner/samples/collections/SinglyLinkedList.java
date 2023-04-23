package software.daveturner.samples.collections;

// singly Linked list is 1 direction .. it only knows about next cannot go backwards
public class SinglyLinkedList {
    private SinglyNode first;

    public boolean isEmpty() {
        return (first == null);
    }

    public void insert(Object o) {
        SinglyNode newNode = new SinglyNode();
        newNode.data = o;
        newNode.next = first;
        first = newNode;
    }

    public SinglyNode delete() {
        SinglyNode temp = first;
        first = first.next;
        return temp;
    }

    public void displayList() {
        System.out.println("first to last");
        SinglyNode current = first;
        while(current != null) {
            current.printData();
            current = current.next;
        }
        System.out.println("end of display list");
    }


    public int size() {
        if(first == null) { return 0; }
        int size = 0;
        SinglyNode current = first;
        while(current != null) {
            current = current.next;
            size++;
        }
        return size;
    }
}
