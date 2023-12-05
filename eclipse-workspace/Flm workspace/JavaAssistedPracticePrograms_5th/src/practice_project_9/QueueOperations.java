package practice_project_9;
import java.util.LinkedList;
import java.util.Queue;

public class QueueOperations {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue elements into the queue
        queue.offer(5);
        queue.offer(10);
        queue.offer(15);

        // Display the elements in the queue
        System.out.println("Queue elements: " + queue);

        // Dequeue elements from the queue
        int removedElement = queue.poll();
        System.out.println("Removed element from the queue: " + removedElement);
        System.out.println("Updated queue elements after dequeue: " + queue);

        // Peek at the front element of the queue
        int frontElement = queue.peek();
        System.out.println("Front element of the queue: " + frontElement);
    }
}
