package com.greatwideweb.samples.collections;

public class Node {

    public final int key;
    public final String value;
    public Node leftChild, rightChild;

    public Node(int key, String value) {
        this.key = key;
        this.value = value;

    }
}
