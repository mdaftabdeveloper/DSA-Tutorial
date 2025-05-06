package Stack;

import java.util.Stack;

public class StackQueue {
    Stack<String> st1 = new Stack<>();
    Stack<String> st2 = new Stack<>();

    // method to insert element in the queue
    private void enQueue(String data) {
        st1.push(data);
    }

    // method to delete element of the queue
    private void deQueue() {
        if (st1.isEmpty()) {
            System.out.println("Queue is empty..");
        } else {
            if (st2.isEmpty()) {
                while (!st1.empty()) {
                    st2.push(st1.pop());
                }
                st2.pop();
            } else {
                st2.pop();
            }
        }
    }

    private void displayQueue() {
        if (st1.isEmpty() && st2.isEmpty()) {
            System.out.println("Queue is empty..");
        } else if (!st1.isEmpty() && st2.isEmpty()) {
            for (int i = 0; i < st1.size(); i++) {
                System.out.print(st1.get(i) + "\t");
            }
        } else if (st1.isEmpty() && !st2.isEmpty()) {
            for (int i = st2.size() - 1; i >= 0; i--) {
                System.out.print(st2.get(i) + "\t");
            }
        } else if (!st1.isEmpty() && !st2.isEmpty()) {
            for (int i = st2.size() - 1; i >= 0; i--) {
                System.out.print(st2.get(i) + "\t");
            }
            for (int i = 0; i < st1.size(); i++) {
                System.out.print(st1.get(i) + "\t");
            }
        }
    }

    public static void main(String[] args) {
        StackQueue sq = new StackQueue();
        sq.enQueue("Aftab");
        sq.enQueue("Naffy");
        sq.enQueue("Suhel");
        sq.enQueue("Naddy");
        sq.enQueue("Mustakim");
        sq.enQueue("Dadan");
        sq.enQueue("Ashraf");
        sq.displayQueue();
        sq.deQueue();
        System.out.println();
        sq.displayQueue();
        sq.enQueue("Sanjay");
        sq.enQueue("Noushad Sir");
        sq.enQueue("Tathagat");
        System.out.println();
        sq.displayQueue();

    }
}
