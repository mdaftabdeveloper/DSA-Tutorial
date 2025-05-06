package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class AddElements {

    // method to add element of the queue
    static int elementSum(Queue<Integer> q) {
        int sum = 0;
        while (!q.isEmpty()) {
            sum = sum + q.remove();
        }
        return sum;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(34);
        queue.add(54);
        queue.add(65);
        System.out.println("Sum of elements : " + AddElements.elementSum(queue));
    }
}
