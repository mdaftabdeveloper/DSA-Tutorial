package Stack;

class TwoStackUsingArrayImplementation {
    int[] ar = new int[10];
    int top1 = -1;
    int top2 = ar.length;

    // method to insert element in the first stack
    void push1(int no) {
        if (top2 == top1 + 1) {
            System.out.println("Stack2 is full..");
        } else {
            top1++;
            ar[top1] = no;
        }
    }

    // method to insert element in the second stack
    void push2(int no) {
        if (top2 == top1 + 1) {
            System.out.println("Stack2 is full..");
        } else {
            top2--;
            ar[top2] = no;
        }
    }

    // method to delete element from the first stack
    void pop1() {
        if (top1 == -1) {
            System.out.println("Stack 1 is empty..");
        } else {
            System.out.println("Deleted Item: " + ar[top1]);
            top1--;
        }
    }

    // method to delete element from the second stack
    void pop2() {
        if (top2 == ar.length) {
            System.out.println("Stack 2 is empty..");
        } else {
            System.out.println("Deleted Item: " + ar[top2]);
            top2++;
        }
    }

    // method to traverse the both stacks
    void traverse() {
        // traverse the first stack
        for (int i = 0; i < top1; i++) {
            System.out.print(ar[i] + "\t");
        }
        System.out.println();
        // traverse the second stack
        for (int i = ar.length - 1; i >= top2; i--) {
            System.out.print(ar[i] + "\t");
        }
    }
}

public class TwoStackUsingArray {
    public static void main(String[] args) {
        TwoStackUsingArrayImplementation tsqi = new TwoStackUsingArrayImplementation();
        tsqi.pop1();
        tsqi.pop2();
        tsqi.push1(12);
        tsqi.push1(78);
        tsqi.push1(56);
        tsqi.push1(67);

        tsqi.push2(123);
        tsqi.push2(567);
        tsqi.push2(234);
        tsqi.push2(456);

        tsqi.traverse();

    }
}
