package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class PrimeFrequency {
    boolean findPrime(int n) {
        if (n <= 1) {
            return false;
        } else {
            for (int i = 2; i * i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    // method to find the occurance of prime numbers
    int findFrequency(Queue<Integer> q) {
        int frequency = 0;
        while (!q.isEmpty()) {
            if (findPrime(q.remove())) {
                frequency++;
            }
        }
        return frequency;
    }

    // method to find the sum of all prime numbers
    int primeSum(Queue<Integer> q) {
        int sum = 0;
        while (!q.isEmpty()) {
            if (findPrime(q.peek())) {
                sum = sum + q.remove();
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        PrimeFrequency pf = new PrimeFrequency();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(3);
        queue.add(3);
        queue.add(3);
        queue.add(3);
        queue.add(3);

        System.out.println(pf.findFrequency(queue));
        System.out.println(pf.primeSum(queue));

    }
}
