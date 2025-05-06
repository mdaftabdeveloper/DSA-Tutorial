package Stack;

import java.util.Stack;

public class ValidParenthesis {

    // method to find symmetry of string of parenthesis using Stack class
    // time- O(n) space- O(n)
    private boolean isParenthesis(String str) {
        Stack<Character> st = new Stack<>();
        // traverse each character of string
        for (int i = 0; i < str.length(); i++) {
            // if the characters are opening parathesis then push it
            if (str.charAt(i) == '[' || str.charAt(i) == '{' || str.charAt(i) == '(') {
                st.push(str.charAt(i));
            } else { // if closing braces then compare with it top
                // if matches the incoming braces with top then pop the braces
                // this will empty the stack if the braces are balanced otherwise not
                if (!st.isEmpty() && ((st.peek() == '[') && (str.charAt(i) == ']')
                        || (st.peek() == '{') && (str.charAt(i) == '}')
                        || (st.peek() == '(') && (str.charAt(i) == ')'))) {
                    st.pop();
                } else {
                    // otherwise return false
                    return false;
                }
            }
        }
        // if stack is emtpy it will return true otherwise false
        return st.empty();
    }

    public static void main(String[] args) {
        ValidParenthesis vp = new ValidParenthesis();
        // vp.isParenthesis(null);
        String st = "}}";
        if (vp.isParenthesis(st)) {
            System.out.println("Valid Parethesis..");
        } else {
            System.out.println("Invalid Parenthesis..");
        }

        // int result = vp.isParenthesis("sfsadfsa", 0);
        // char x = st.charAt(0);
    }
}
