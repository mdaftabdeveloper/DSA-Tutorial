package Stack;

import java.util.Stack;

class PrintStack {
    public void show() {
        Stack st = new Stack();
        st.push(43);
        st.push(65);
        st.push(23);
        st.push(98);
        System.out.println("Using Object");
        System.out.println(st);
        System.out.println("From Starting");
        for (int i = 0; i < st.size(); i++) {
            System.out.print(st.get(i) + "\t");
        }
        System.out.println();
        System.out.println("From Ending");
        for (int i = st.size() - 1; i >= 0; i--) {
            System.out.print(st.get(i) + "\t");
        }
    }
}

public class MyStackPrint {
    public static void main(String[] args) {
        PrintStack ps = new PrintStack();
        ps.show();
    }
}
