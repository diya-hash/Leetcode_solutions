//problem link: https://leetcode.com/problems/find-the-difference/description/
public class findTheDifference {
    public static void main(String[] args) {
        String s = "";
        String t = "y";
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < s.length(); i++) {
            sum1 += (int) (s.charAt(i));
            sum2 += (int) (t.charAt(i));
        }
        sum2 += (int) (t.charAt(t.length() - 1));
        char result = (char) (sum2 - sum1);
        System.out.println(result);
    }
}
