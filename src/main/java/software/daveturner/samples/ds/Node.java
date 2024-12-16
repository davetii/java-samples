package software.daveturner.samples.ds;

import java.util.ArrayList;

public class Node {
    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public static void loop(Node n) {
        System.out.println(n);
        if (n.next == null) { return; }
        loop(n.next);
    }

    public static ArrayList<Integer> toList(Node n) {
        if (n == null) { return null; }
        ArrayList<Integer> list = new ArrayList<>();
        while (n != null) {
            list.add(n.data);
            n= n.next;
        }
        return list;
    }

    public static int sumRecursive(Node n) {
        if (n == null) { return 0; }
        return n.data += sumRecursive(n.next);
    }

    public static int sum(Node n) {
       int sum= 0;
        while (n != null) {
            sum += n.data;
            n= n.next;
        }
        return sum;
    }

    public static boolean hasNode(Node n, Node target) {
        while(n != null) {
            if(n.data == target.data) { return true;}
            n = n.next;
        }
        return false;
    }

    public static Node last(Node n) {
        int size = size(n);
        int i = 0;
        while(n != null) {
            i++;
            if(i == size) {
                return n;
            }
            n = n.next;
        }
        return n;
    }

    public static int size(Node n) {
        int size = 0;
        while(n != null) {
            n = n.next;
            size++;
        }
        return size;
    }

    public static Node insertAtHead(Node target, int data) {
        Node n = new Node(data);
        n.next = target;
        return n;
    }

    public static Node insertAtIndex(Node head, int index, int data) {
        Node newNode = new Node(data);
        if(index ==0 ) {
            newNode.next = head;
            return newNode;
        }
        Node current = head;
        int i=0;
        while(current != null && i < (index -1)) {
            current = current.next;
            i++;
        }
        newNode.next = current.next;
        current.next = newNode;
        return head;
    }

    public static Node insertAtEnd(Node n, int data) {
        Node curr = n; Node prev= null;
        while(curr != null) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = new Node(data);
        return n;
    }

    public static int getIndexOf(Node n, int data) {
        int i=0;
        while(n != null) {
            if(n.data == data) {
                return i;
            }
            n = n.next;
            i++;
        }
        return -1;
    }

    public static Node remove(Node n, int indexToDelete) {
        if (indexToDelete == 0) {
            return n.next;
        }

        Node temp = n;
        Node start = null;
        for(int i =0; i < indexToDelete; i++) {
            start = temp;
            if (temp != null) {
                temp = temp.next;
            } else {
                break;
            }
        }

        if(temp != null) {
            start.next = temp.next;
        }
        return n;
    }


    public static Node reverse(Node n) {
        Node current = n;
        Node prev = null;
        Node next = null;
        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static Node zipLists(Node head1, Node head2) {
        Node tail = head1;
        Node c1 = head1.next;
        Node c2 = head2;
        int count  = 0;
        while(c1 != null && c2 != null) {
            if (count % 2 == 0) {
                tail.next = c2;
                c2 = c2.next;
            } else {
                tail.next = c1;
                c1 = c1.next;
            }
           tail = tail.next;
            count++;
        }

        if(c1 != null) {tail.next = c1;}
        if(c2 != null) {tail.next = c2;}
        return head1;
    }



    @Override
    public String toString() {
        return "{" + "data=" + data + ", next=" + next + "}";
    }
}
