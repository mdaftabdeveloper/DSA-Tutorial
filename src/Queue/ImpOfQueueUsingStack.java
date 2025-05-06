package Queue;

import java.util.Stack;

class Implementation {
    Stack st1 = new Stack();
    Stack st2 = new Stack();

    public void enQueue(int no) {
        st1.push(no);
    }

    public void deQueue() {
        if (st2.isEmpty()) {
            if (st1.isEmpty()) {
                System.out.println("Queue is empty..");
            } else { // we are going to bring all the elements of stack 1 to stack 2
                while (!st1.isEmpty()) {
                    // st2.push(st1.pop());

                    int top = (int) st1.peek();
                    st2.push(top);
                    st1.pop();
                }
                st2.pop();
            }
        } else {
            st2.pop();
        }
    }

    public void traverse() {

        if (st1.isEmpty() && st2.isEmpty()) { // case 1 if both stacks are empty
            System.out.println("Queue is empty..");
        } else {
            // case 2
            if (st2.isEmpty()) {
                for (int i = 0; i < st1.size(); i++) {
                    System.out.print(st1.get(i) + "\t");
                }
            } else {
                for (int i = st2.size() - 1; i >= 0; i--) {
                    System.out.print(st2.get(i) + "\t");
                }
                for (int i = 0; i < st1.size(); i++) {
                    System.out.print(st1.get(i) + "\t");
                }
            }
        }
    }
}

public class ImpOfQueueUsingStack {
    public static void main(String[] args) {
        Implementation mq = new Implementation();
        mq.traverse();
        // mq.deQueue();
        mq.enQueue(45);
        mq.enQueue(21);
        mq.enQueue(76);
        mq.enQueue(98);
        mq.enQueue(19);
        mq.traverse();
        mq.deQueue();
        System.out.println();
        mq.traverse();
        System.out.println();
        mq.enQueue(65);
        mq.enQueue(89);
        mq.traverse();

    }

}
