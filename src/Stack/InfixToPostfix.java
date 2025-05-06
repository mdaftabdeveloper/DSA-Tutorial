package Stack;

import java.util.Stack;

// write a program to convert expression infix to postfix
public class InfixToPostfix {
    // method to check the character is operator or not
    boolean isOperator(char c) {
        if (c == '+' || c == '-' || c == '/' || c == '*' || c == '^') {
            return true;
        }
        return false;
    }

    // method to check the character is operand or not
    boolean isOperand(char c) {
        if (c >= 'a' && c <= 'z' || c >= 0 && c <= 9 || c >= 'A' && c <= 'Z') {
            return true;
        }
        return false;
    }

    // method to get the precedence of the operator
    int getPrecedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;

            default:
                return -1;
        }
    }

    // method to convert infix to postfix expression
    String infixToPostfix(String infix) {
        StringBuilder postfixExpression = new StringBuilder();
        Stack<Character> st = new Stack<>();
        // char[] infixArray = infix.toCharArray();
        for (char c : infix.toCharArray()) {
            if (isOperand(c)) {
                postfixExpression.append(c);
            } else if (c == '(') {
                st.push(c);
            } else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    postfixExpression.append(st.pop());
                }
                st.pop();
            } else if (c == '{') {
                st.push(c);
            } else if (c == '}') {
                while (!st.isEmpty() && st.peek() != '{') {
                    postfixExpression.append(st.pop());
                }
                st.pop();
            } else if (c == '[') {
                st.push(c);
            } else if (c == ']') {
                while (!st.isEmpty() && st.peek() != '[') {
                    postfixExpression.append(st.pop());
                }
                st.pop();
            }

            else if (isOperator(c)) {
                while (!st.isEmpty() && getPrecedence(c) <= getPrecedence(st.peek())) {
                    postfixExpression.append(st.pop());
                }
                st.push(c);
            }
        }
        while (!st.isEmpty()) {
            postfixExpression.append(st.pop());
        }
        return postfixExpression.toString();
    }

    public static void main(String[] args) {
        InfixToPostfix itf = new InfixToPostfix();
        System.out.println(itf.infixToPostfix("(A+B)*[C*(D+E)+F]"));
    }
}
