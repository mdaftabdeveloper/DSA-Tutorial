package Queue;

public class Imp1 {

    String[] queue = new String[10];
    int rear = -1, front = -1;

    // method to insert element
    void enQueue(String data) {
        if (rear == queue.length - 1) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1 && rear == -1) {
            front = 0;
            rear = 0;
        } else {
            rear++;
        }
        queue[rear] = data;
    }

    // method to delete element
    void deQueue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty..");
        } else {
            System.out.println("Deleted element: " + queue[front]);
            front++;
        }
    }

    // method to show top element
    void peek() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty..");
        } else {
            System.out.println("Front element: " + queue[front]);
        }
    }

    // method to display queue
    void displayQueue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty..");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " -> ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Imp1 queue = new Imp1();
        queue.enQueue("Aftab");
        queue.enQueue("Dadan");
        queue.enQueue("Mustakim");
        queue.deQueue();
        queue.peek();
        queue.displayQueue();
    }
}
