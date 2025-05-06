package Stack;

import java.util.Stack;

public class CountVowels {
    private int countVowels(String str) {
        int count = 0;
        String lowerString = str.toLowerCase();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < lowerString.length(); i++) {
            if (lowerString.charAt(i) == 'a' || lowerString.charAt(i) == 'e' || lowerString.charAt(i) == 'i'
                    || lowerString.charAt(i) == 'o' || lowerString.charAt(i) == 'u') {
                st.push(lowerString.charAt(i));
                count = count + 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountVowels cv = new CountVowels();
        String str = "Aftab";
        int vowelCount = cv.countVowels(str);
        System.out.println("Vowel Count = " + vowelCount);
    }
}
