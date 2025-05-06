package Practice;

public class StackImp1 {
    int top = -1;
    String[] stack = new String[5];

    // method to insert into stack
    void push(String data) {
        if (top >= stack.length - 1) {
            System.out.println("Stack is full..");
        } else {
            stack[++top] = data;
        }
    }

    // method to delete element
    String pop() {
        if (top == -1) {
            System.out.println("Stack is empty..");
            return null;
        } else {
            return stack[top--];
        }

    }

    // method to show the top element
    String peek() {
        if (top == -1) {
            System.out.println("Stack is empty..");
            return null;
        } else {
            return stack[top];
        }
    }

    // method to traverse stack
    void displayStack() {
        if (top == -1) {
            System.out.println("Stack is empty..");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + "\t");
            }
        }

    }

    public static void main(String[] args) {
        StackImp1 stkimp1 = new StackImp1();
        stkimp1.push("Aftab");
        stkimp1.push("Dadan");
        stkimp1.push("Sanjay Don");

        stkimp1.displayStack();
        System.out.println();
        System.out.println("Deleted Item: " + stkimp1.pop());
        System.out.println();
        stkimp1.displayStack();
    }
}
