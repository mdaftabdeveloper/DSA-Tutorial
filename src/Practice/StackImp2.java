package Practice;

class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

public class StackImp2 {
    Node top = null;

    // method to insert element into the stack
    void push(String data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
            newNode.next = null;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    // method to delete the element of the stack
    String pop() {
        if (top == null) {
            System.out.println("Stack is empty..");
            return null;
        } else {
            String deletedItem = top.data;
            top = top.next;
            return deletedItem;
        }
    }

    // method to traverse the stack elements
    void displayStack() {
        Node tempNode = top;
        while (tempNode != null) {
            System.out.println(tempNode.data + "\t");
            tempNode = tempNode.next;
        }
    }

    public static void main(String[] args) {
        StackImp2 stkimp2 = new StackImp2();
        stkimp2.push("Aftab");
        stkimp2.push("Bittu");
        stkimp2.push("Dadan");
        stkimp2.push("Suhel");
        stkimp2.push("Naim");
        stkimp2.push("Mustakim");
        stkimp2.displayStack();
        stkimp2.pop();
        stkimp2.displayStack();

    }
}
