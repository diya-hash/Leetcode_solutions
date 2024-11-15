package Leetcode_solutions.Blind75.Strings;

public class lengthOfLastWord {
    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        int count = 0;
        boolean flag = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
                flag = true;
                System.out.println(s.charAt(i));
            } else if (s.charAt(i) == ' ' && flag == true) {
                flag = false;
                break;
            }
        }
        System.out.println(count);
    }
}
// problem link: https://leetcode.com/problems/length-of-last-word/description/