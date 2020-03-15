package com.dojo.kata.datastructures;

import java.util.ArrayList;
import java.util.List;

public class Queue {

    private List<String> data;


    public Queue() {
        data = new ArrayList<>();
    }

    String peek() {
        if (data.size() > 0)
            return data.get(data.size() - 1);
        return null;
    }

    void add(String entry) {
        data.add(0, entry);
    }

    boolean isNotEmpty() {
        return data.size() > 0;
    }

    String remove() {
        String entry = null;
        int queueSize = data.size();
        if (queueSize > 0) {
            entry = data.get(queueSize - 1);
            data.remove(queueSize - 1);
        }
        return entry;
    }

    String print() {
        return data.toString();
    }

}
