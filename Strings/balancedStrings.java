
//problem link: https://leetcode.com/problems/split-a-string-in-balanced-strings/description/
public class balancedStrings {
    public static void main(String[] args) {
        String s = "RLRRRLLRLL";
        int r = 0;
        int l = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R')
                r++;
            else if (s.charAt(i) == 'L')
                l++;

            if (r == l) {
                count++;
                r = 0;
                l = 0;
            }

        }
        System.out.println(count);
    }

}
