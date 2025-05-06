package Practice;

import java.util.Stack;

public class StackSorting {
    /** method to sort the stack */
    void sort(Stack<Integer> st) {
        Stack<Integer> tempStack = new Stack<>();
        while (!st.isEmpty()) {
            int temp = st.pop();
            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                st.push(tempStack.pop());
            }
            tempStack.push(temp);
        }
        System.out.println("Sorted Stack : " + tempStack);
    }

    public static void main(String[] args) {
        StackSorting ss = new StackSorting();
        Stack<Integer> stack = new Stack<>();
        stack.push(54);
        stack.push(64);
        stack.push(22);
        stack.push(87);
        stack.push(58);
        stack.push(34);

        ss.sort(stack);
    }
}
