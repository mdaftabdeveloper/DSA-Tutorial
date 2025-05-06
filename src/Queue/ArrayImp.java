package Queue;

class MyQueue {
    int[] queue = new int[5];
    int front = -1;
    int rear = -1;

    // method to insert element in the queue
    public void enQueue(int num) {
        if (rear == queue.length - 1) {
            System.out.println("Queue is full..");
        } else {
            if (front == -1 && rear == -1) {
                front = 0;
                rear = 0;
            } else {
                rear++;
            }
            queue[rear] = num;
        }
    }

    // method to delete element from the queue
    public void deQueue() {
        if (front == -1 && rear == -1) {
            System.out.println("Queue is empty..");
            return;
        }
        System.out.println("Deleted Item: " + queue[front]);
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = front + 1;
        }
    }

    // method to traverse the queue
    public void traverse() {
        if (front == -1 && rear == -1) {
            System.out.println("Queue is empty..");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + "\t");
            }
        }
    }
}

public class ArrayImp {
    public static void main(String[] args) {
        MyQueue mq = new MyQueue();
        mq.enQueue(4);
        mq.enQueue(2);
        mq.enQueue(6);
        mq.enQueue(7);
        mq.enQueue(12);
        mq.traverse();
        System.out.println();
        mq.deQueue();
        mq.deQueue();
        mq.deQueue();
        mq.deQueue();
        mq.enQueue(56);
        mq.traverse();
        System.out.println(mq.front);
        System.out.println(mq.rear);
    }
}
