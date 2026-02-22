package main;

import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");

        System.out.println("Queue: " + queue);

        System.out.println("En ust element: " + queue.peek());

        queue.poll();

        System.out.println("Silindikden sonra queue: " + queue);
    }
}