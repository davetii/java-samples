package software.daveturner.samples.algo.ds;

public class OneWayNode {
    int data;
    OneWayNode next;

    public OneWayNode(int data) {
        this.data = data;
        this.next = null;
    }

    public static boolean hasNode(OneWayNode n, OneWayNode target) {
        while(n != null) {
            if(n.data == target.data) { return true;}
            n = n.next;
        }
        return false;
    }

    public static OneWayNode last(OneWayNode n) {
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

    public static int size(OneWayNode n) {
        int size = 0;
        while(n != null) {
            n = n.next;
            size++;
        }
        return size;
    }

    public static OneWayNode insertBeforeNode(OneWayNode target, int data) {
        OneWayNode n = new OneWayNode(data);
        n.next = target;
        return n;
    }

    public static void insertAfter(OneWayNode target, int data) {
        OneWayNode n = new OneWayNode(data);
        target.next = n;
    }

    public static OneWayNode insertAtEnd(OneWayNode n, int data) {
        int size = size(n);
        int i=0;
        while(n != null) {
            i++;
            if(i == size) {
                n.next = new OneWayNode(data);
                break;
            }
            n = n.next;
        }
        return n;
    }

    public static int getIndexOf(OneWayNode n, int data) {
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

    public static OneWayNode remove(OneWayNode n, int indexToDelete) {
        if (indexToDelete == 0) {
            return n.next;
        }

        OneWayNode temp = n;
        OneWayNode start = null;
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

    @Override
    public String toString() {
        return "SimpleNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
