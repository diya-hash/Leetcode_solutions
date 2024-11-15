package Leetcode_solutions.Blind75.Strings;

import java.util.Stack;

public class validParentheses {

    public static void main(String[] args) {
        String s = "([])";
        Stack<Character> stack = new Stack<>();
        int sq = 0;
        int c = 0;
        int b = 0;

        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
            if (s.charAt(i) == '(') {
                b++;
                stack.push(s.charAt(i));

            } else if (s.charAt(i) == ')') {
                b--;
                stack.pop();

            }
            // } else if (s.charAt(i) == '[') {
            // sq++;
            // stack.push(s.charAt(i));
            // } else if (s.charAt(i) == '{') {
            // c++;
            // stack.push(s.charAt(i));
            // }

        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }
}
// int curls = 0;
// int bracks = 0;
// int squares = 0;
// boolean cflag = false;
// boolean sflag = false;
// boolean bflag = false;

// for (int i = 0; i < s.length(); i++) {
// if (s.charAt(i) == '{') {
// cflag = true;
// curls++;
// } else if (s.charAt(i) == '}') {
// curls--;
// if (curls == 0)
// cflag = false;
// } else if (s.charAt(i) == '[') {
// squares++;
// sflag = true;
// } else if (s.charAt(i) == ']') {
// squares--;
// if (squares == 0)
// sflag = false;
// } else if (s.charAt(i) == '(') {
// bracks++;
// bflag = true;
// } else if (s.charAt(i) == ')') {
// bracks--;
// if (bracks == 0)
// bflag = false;
// }

// }
// if (cflag == false && bflag == false && sflag == false) {
// System.out.println("Valid");
// } else {
// System.out.println("Invalid");
// }