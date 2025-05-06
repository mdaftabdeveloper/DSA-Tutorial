package Queue;

import java.util.LinkedList;
import java.util.Queue;

// write a program to find the greatest element in a queue
public class GratestElement {
    // method to find the greatest element in the queue
    static int findGreatest(Queue<Integer> q) {
        // checking the condition that queue is empty or not
        if (q.isEmpty()) {
            System.out.println("Queue is empty..");
            throw new IllegalArgumentException("Queue is empty..");
        }
        int greatest = q.peek();
        // for (int i = 0; i < q.size(); i++) {
        // if (greatest <= q.peek()) {
        // greatest = q.peek();
        // q.remove();
        // } else if (greatest >= q.peek()) {
        // q.remove();
        // }
        // }

        while (!q.isEmpty()) {
            int current = q.remove();
            if (greatest <= current) {
                greatest = current;
            }
        }
        return greatest;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(23);
        queue.add(54);
        queue.add(34);
        queue.add(65);
        queue.add(87);
        System.out.println(queue);
        System.out.println("Greatest element in the queue is : " + GratestElement.findGreatest(queue));
    }
}
