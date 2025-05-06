package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueueUsingStack {
    // method to reverse a queue using stack
    private static Queue<Integer> reverseQueue(Queue<Integer> q) {
        if (q.isEmpty()) {
            System.out.println("Queue is empty..");
        } else {
            Stack<Integer> st = new Stack<>();
            while (!q.isEmpty()) {
                st.push(q.remove());
            }
            while (!st.isEmpty()) {
                q.offer(st.pop());
            }
        }
        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(56);
        queue.offer(12);
        queue.offer(76);
        queue.offer(87);
        queue.offer(32);
        System.out.println("Original queue: " + queue);
        System.out.print("Reversed queue: " + ReverseQueueUsingStack.reverseQueue(queue));
    }
}
