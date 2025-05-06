package Stack;

import java.util.Stack;

public class ReverseString {
    private void reversedString(String str) {

        Stack<Character> st = new Stack<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            st.push(str.charAt(i));
        }
        System.out.print("Original String: " + str);
        System.out.println();
        System.out.print("Reversed String: ");
        for (char element : st) {
            System.out.print(element);
        }
    }

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        rs.reversedString("abcde");
    }
}
