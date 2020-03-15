package com.dojo.kata.datastructures;

public class QueueWeaving {

    public static void main(String[] args) {
        Queue firstQueue = new Queue();

        firstQueue.add("1");
        firstQueue.add("2");

        Queue secondQueue = new Queue();

        secondQueue.add("Hi");
        secondQueue.add("There");

        weave(firstQueue, secondQueue);
    }

    private static void weave(Queue firstQueue, Queue secondQueue) {

        Queue weavedQueue = new Queue();

        while (firstQueue.isNotEmpty() || secondQueue.isNotEmpty()) {


            if (null != firstQueue.peek()) {

                weavedQueue.add(firstQueue.remove());
            }

            if (null != secondQueue.peek()) {

                weavedQueue.add(secondQueue.remove());

            }

        }


        System.out.println(weavedQueue.print());

    }
}
