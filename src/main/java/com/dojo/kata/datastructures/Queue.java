package com.dojo.kata.datastructures;

import java.util.ArrayList;
import java.util.List;

public class Queue {

    private List<String> data;


    public Queue() {
        data = new ArrayList<>();
    }

    String peek() {
        if (isNotEmpty())
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
        if (isNotEmpty()) {
            int index = data.size() - 1;
            entry = data.get(index);
            data.remove(index);
        }
        return entry;
    }

    String print() {
        return data.toString();
    }

}
