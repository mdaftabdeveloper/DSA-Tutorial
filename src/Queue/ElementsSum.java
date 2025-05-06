package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ElementsSum {
    // method to find the sum of elements of a queue
    int sumOfElements(Queue<Integer> q) {
        int sum = 0;

        while (!q.isEmpty()) {
            sum = sum + q.remove();
        }
        return sum;
    }

    public static void main(String[] args) {
        ElementsSum es = new ElementsSum();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(4);
        queue.add(6);
        queue.add(7);
        queue.add(3);
        int result = es.sumOfElements(queue);
        System.out.println("Sum of elements: " + result);

    }
}
