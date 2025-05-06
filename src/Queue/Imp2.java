package Queue;

class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

class MyQueue {
    Node rear = null;
    Node front = null;

    // method to insert data
    void enQueue(String data) {
        Node newNode = new Node(data);
        if (rear == null && front == null) {
            front = newNode;
            rear = front;
        } else {
            front.next = newNode;
            front = newNode;
        }
    }

    // method to delete data
    void deQueue() {
        if (front == null && rear == null) {
            System.out.println("No stack exists..");
        } else {
            if (front == rear) {
                front = null;
                rear = null;
            } else {
                System.out.println("Deleted element: " + rear.data);
                rear = rear.next;
            }
        }
    }

    // method to display front element
    void peek() {
        if (rear == null && front == null) {
            System.out.println("No queue exists..");
        } else {
            System.out.println("Front element is: " + front.data);
        }
    }

    // method to display queue
    void displayQueue() {
        if (front == null && rear == null) {
            System.out.println("No queue exists..");
        } else {
            Node temp = rear;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
        }
    }
}

public class Imp2 {
    public static void main(String[] args) {
        MyQueue mq = new MyQueue();
        mq.enQueue("Aftab");
        mq.enQueue("Dadan");
        mq.enQueue("Mustakim");
        mq.enQueue("Ashraf");
        mq.enQueue("Shera");
        mq.peek();
        mq.displayQueue();
        mq.deQueue();
        mq.displayQueue();

    }
}
