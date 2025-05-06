package Practice;

import java.util.Stack;

public class ReverseString {

    // method to reverse the string
    void reverseString(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
        }
        String revString = "";
        while (!st.isEmpty()) {
            revString = revString + st.pop();
        }
        System.out.println("Reversed String: " + revString);
    }

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        rs.reverseString("Aftab");
    }
}
