package com.dojo.kata.linkedlist;

class LinkedList {

    private Node head;


    void insertFirst(String data) {
        if (null == head)
            head = new Node(data);
        else
            head = new Node(data, head);
    }

    int size() {
        int size = 0;
        Node node = head;
        while (null != node) {
            ++size;
            node = node.getNext();
        }
        return size;
    }

    String getLast() {
        String data = null;
        Node node = head;
        while (null != node) {
            if (null == node.getNext())
                data = node.getData();
            node = node.getNext();

        }
        return data;
    }

    String getFirst() {
        return (null != head) ? head.getData() : null;
    }


}
