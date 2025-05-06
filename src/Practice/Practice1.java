package Practice;

import java.util.Stack;

public class Practice1 {
    // method to check valid parenthesis
    static boolean validParenthesis(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                st.push(str.charAt(i));
            } else if (!st.isEmpty() && (st.peek() == '(' && str.charAt(i) == ')'
                    || st.peek() == '{' && str.charAt(i) == '}' || st.peek() == '[' && str.charAt(i) == ']')) {
                st.pop();
            } else {
                return false;
            }
        }

        if (st.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(Practice1.validParenthesis("}}"));
    }
}
