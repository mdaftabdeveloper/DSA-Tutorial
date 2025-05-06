package Stack;

//Node top;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyStack {
    Node top = null;

    // method to insert element
    void push(int data) {
        Node newNode = new Node(data);
        // if stack is empty
        if (top == null) {
            top = newNode;
            top.next = null;
            return;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    // method to delete the element
    private void pop() {
        if (top == null) {
            System.out.println("Stack is empty..");
            return;
        } else {
            System.out.println("Deleted element: " + top.data);
            top = top.next;

        }
    }

    // method to show to top element
    private void peek() {
        if (top == null) {
            System.out.println("No stack exists..");
            return;
        } else {
            System.out.println("Top element: " + top.data);
        }
    }

    // method to print the stack
    private void printStack() {
        if (top == null) {
            System.out.println("Stack is empty..");
            return;
        }
        Node tempNode = top;
        while (tempNode != null) {
            System.out.println(tempNode.data);
            tempNode = tempNode.next;
        }
    }

    // methods to call private methods
    public void callPrintStack() {
        printStack();
    }

    public void callPeek() {
        peek();
    }

    public void callPop() {
        pop();
    }

}

public class Imp1 {
    public static void main(String[] args) {
        Node p = new Node(20);
        System.out.println(p);
        MyStack st = new MyStack();
        st.push(45);
        st.push(23);
        st.push(43);
        st.push(87);
        st.push(98);
        st.callPop();
        st.callPeek();
        st.callPrintStack();

    }
}
