package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a queue using LinkedList
        Queue<Integer> queue = new LinkedList<>();

        // Add elements to the queue (enqueue)
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        System.out.println("Queue: " + queue);

        // Access the head of the queue
        System.out.println("Peek: " + queue.peek()); // Output: 10

        // Remove elements from the queue (dequeue)
        System.out.println("Dequeue: " + queue.poll()); // Removes 10
        System.out.println("Queue after dequeue: " + queue);

        // Check if queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());

        // Remove all elements from the queue
        while (!queue.isEmpty()) {
            System.out.println("Dequeue: " + queue.poll());
        }

        System.out.println("Queue after all dequeues: " + queue);
    }
}
