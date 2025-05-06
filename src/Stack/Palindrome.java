package Stack;

import java.util.Stack;

// write a program to check a string is palindrome or not using stack
public class Palindrome {
    private boolean isPalindrome(String string) {
        String str = string.toLowerCase();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length() / 2 - 1; i++) {
            st.push(str.charAt(i));
        }
        for (int i = str.length() / 2 + 1; i < str.length(); i++) {
            if (str.charAt(i) == (char) st.peek()) {
                st.pop();
            }
        }
        if (st.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Palindrome pd = new Palindrome();
        boolean result = pd.isPalindrome("madam");
        System.out.println(result);
    }
}
