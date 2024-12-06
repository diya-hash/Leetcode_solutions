package easy;

public class reverseOnlyLetters {
    public static void main(String[] args) {
        String s = "7_28]";
        int l = 0;
        int r = s.length() - 1;
        char[] ch = s.toCharArray();
        boolean isFlag = false;
        while (l < r) {

            while (l < r && (ch[l] >= '!' && ch[l] <= '@')
                    || (ch[l] >= '[' && ch[l] <= '`')) {
                l++;
                if (l == s.length()) {
                    isFlag = true;
                    break;
                }

            }
            while (l < r && (ch[r] >= '!' && ch[r] <= '@')
                    || (ch[r] >= '[' && ch[r] <= '`')) {
                r--;
                if (r < 0) {
                    isFlag = true;
                    break;
                }
            }
            if (isFlag == true)
                break;
            char temp = ch[l];
            ch[l] = ch[r];
            ch[r] = temp;
            l++;
            r--;
        }
        s = String.valueOf(ch);
        System.out.println(s);
    }
}
// solution post:
// https://leetcode.com/problems/reverse-only-letters/solutions/6106789/java-solution-two-pointer-beats-100