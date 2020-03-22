package com.dojo.kata.linkedlist;

class Node {

    private String data;
    private Node next;


    Node(String data) {
        this(data, null);
    }

    Node(String data, Node nextNode) {
        this.data = data;
        this.next = nextNode;
    }

    Node getNext() {
        return next;
    }

    String getData() {
        return data;
    }

}
