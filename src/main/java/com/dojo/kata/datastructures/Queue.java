package com.dojo.kata.datastructures;

import java.util.ArrayList;
import java.util.List;

public class Queue {

    private List<String> data;


    public Queue() {
        data = new ArrayList<>();
    }

    public static void main(String[] args) {

        Queue queue = new Queue();

        queue.add("Sree");
        queue.add("uday");
        queue.add("vasa");
        queue.add("harsha");
        queue.add("sasi");

        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();

    }

    private void add(String entry) {
        data.add(0, entry);
        System.out.println("Queue after addition" + data.toString());
    }

    private void remove() {
        String entry = "Queue is already empty";
        int queueSize = data.size();
        if (queueSize > 0) {
            entry = data.get(queueSize - 1);
            data.remove(queueSize - 1);
        }
        System.out.println("Entry moved from queue is " + entry);
    }

}
