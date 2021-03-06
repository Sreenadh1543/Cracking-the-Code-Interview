package com.dojo.kata.datastructures;

public class QueueFromStack {


    public static void main(String[] args) {

        Stack firstStack = new Stack();

        firstStack.push("1");
        firstStack.push("2");
        firstStack.push("3");
        firstStack.push("4");


        Stack secondStack = new Stack();

        while (firstStack.isNotEmpty()) {
            secondStack.push(firstStack.pop());
        }

        while (secondStack.isNotEmpty()) {
            System.out.println(secondStack.pop());
        }


    }
}
