package Leetcode_solutions.Blind75.Strings;

import java.util.Stack;

public class validParentheses {

    public static void main(String[] args) {
        String s = "(){}}{";
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (!stack.isEmpty() && s.charAt(i) == ')' && stack.peek() == '(' ||
                    !stack.isEmpty() && s.charAt(i) == ']' && stack.peek() == '[' ||
                    !stack.isEmpty() && s.charAt(i) == '}' && stack.peek() == '{') {
                System.out.println(stack.pop());
            } else {
                stack.push(s.charAt(i));
            }
        }

        if (stack.isEmpty()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
// if (stack.peek() == s.charAt(i)) {
// System.out.println("exists: " + stack.pop());
// } else {
// stack.push(s.charAt(i));
// // }