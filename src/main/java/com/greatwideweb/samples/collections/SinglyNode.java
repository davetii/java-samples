package com.greatwideweb.samples.collections;

import java.util.Map;

public class SinglyNode {

    public Object data;
    public SinglyNode next;

    public void diplayNode() {
        if(data instanceof String) {
            System.out.println("data: " + data);
        } else if(data instanceof Integer) {
            System.out.println("data: " + data);
        } else if(data instanceof Boolean) {
            System.out.println("data: " + data);
        }else if(data instanceof Map) {
            System.out.println("data: " + data);
        }
    }
}
