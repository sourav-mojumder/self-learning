package stack;

import java.util.Stack;

public class ValidParenthesis {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[')
                stack.push(c);
            else if (stack.size() > 0) {
                if (c == ')') {
                    if (stack.peek().equals(Character.valueOf('(')))
                        stack.pop();
                } else if (c == '}') {
                    if (stack.peek().equals(Character.valueOf('{')))
                        stack.pop();
                } else if (c == ']') {
                    if (stack.peek().equals(Character.valueOf('[')))
                        stack.pop();
                }
            }

        }
        return stack.size() == 0;
    }
}
