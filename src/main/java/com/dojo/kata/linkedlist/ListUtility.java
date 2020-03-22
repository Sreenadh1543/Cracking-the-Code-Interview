package com.dojo.kata.linkedlist;

public class ListUtility {

    public static void main(String[] args) {

        LinkedList namesList = new LinkedList();

         /*   namesList.insertFirst("1");
            namesList.insertFirst("2");
            namesList.insertFirst("3");
            namesList.insertFirst("4");
            namesList.insertFirst("5");
            namesList.insertFirst("6");*/

        System.out.println(namesList.size());


        System.out.println("First value Or Head is " + namesList.getFirst());
        System.out.println("Last value  or Tail is " + namesList.getLast());
    }
}
