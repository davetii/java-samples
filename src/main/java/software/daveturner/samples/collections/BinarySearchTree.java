package software.daveturner.samples.collections;

public class BinarySearchTree {

    private Node root;

    public void insert(int key, String value) {
        Node newNode = new Node(key, value);
        if(root == null) {
            root = newNode;
        } else {
            Node current  = root;
            Node parent;
            while(true) {
                parent = current;
                if(key < current.key) {
                    current = current.leftChild;
                    if(current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if(current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public boolean remove(int key) {
        Node currentNode = root;
        Node parentNode = root;
        boolean isLeftChild = false;

        while(currentNode.key != key) {
            parentNode = currentNode;
            if(key < currentNode.key) {
                isLeftChild = true;
                currentNode = currentNode.leftChild;
            } else {
                currentNode = currentNode.rightChild;
                isLeftChild = false;
            }

            if(currentNode == null) {
                return false;
            }
        }

        // found the node
        Node nodeToDelete = currentNode;

        // if node is a leaf
        if(nodeToDelete.leftChild == null && nodeToDelete.rightChild == null) {
            if(nodeToDelete == root) {
                root = null;
            } else if (isLeftChild) {
                parentNode.leftChild = null;
            } else {
                parentNode.rightChild = null;
            }
        } else if (nodeToDelete.rightChild == null) {
            if(nodeToDelete == root) {
                root = nodeToDelete.leftChild;
            } else if (isLeftChild) {
                parentNode.leftChild = nodeToDelete.leftChild;
            } else {
                parentNode.rightChild = nodeToDelete.leftChild;
            }
        } else if (nodeToDelete.leftChild == null) {
            if(nodeToDelete == root) {
                root = nodeToDelete.rightChild;
            } else if (isLeftChild) {
                parentNode.leftChild = nodeToDelete.rightChild;
            } else {
                parentNode.rightChild = nodeToDelete.rightChild;
            }
        } else {

            Node successor = findSuccesor(nodeToDelete);
            if(nodeToDelete == root) {
                root = successor;
            } else if (isLeftChild){
                parentNode.leftChild =  successor;
            } else {
                parentNode.rightChild =  successor;
            }

            successor.leftChild = nodeToDelete.leftChild;
        }


        return true;
    }

    private Node findSuccesor(Node nodeToDelete) {
        Node successorParent = nodeToDelete;
        Node successor = nodeToDelete;
        Node current = nodeToDelete.rightChild;
        while(current != null) {
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }
        if(successor != nodeToDelete.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = nodeToDelete.rightChild;
        }
        return successor;
    }

    public Node findMin() {
        Node current = root;
        Node last = null;

        while(current != null) {
            last = current;
            current = current.leftChild;
        }
        return last;
    }

    public Node findMax() {
        Node current = root;
        Node last = null;

        while(current != null) {
            last = current;
            current = current.rightChild;
        }
        return last;
    }


}
