package com.dojo.kata.datastructures;

import java.util.LinkedList;
import java.util.List;

public class Stack {

    private List<String> data;

    public Stack() {
        data = new LinkedList<>();
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push("1");
        stack.push("2");
        stack.push("3");

        stack.peek();
        stack.pop();

        stack.peek();
        stack.pop();

        stack.peek();
        stack.pop();

        stack.peek();
        stack.pop();

    }

    protected void push(String record) {
        data.add(record);
    }

    protected String pop() {
        String record = null;
        if (isNotEmpty()) {
            int finalRecord = data.size() - 1;
            record = data.get(finalRecord);
            data.remove(finalRecord);
        }
        return record;
    }

    protected boolean isNotEmpty() {
        return !data.isEmpty();
    }

    protected String peek() {
        String record = null;
        if (isNotEmpty()) {
            int finalRecord = data.size() - 1;
            record = data.get(finalRecord);
        }
        return record;
    }
}
