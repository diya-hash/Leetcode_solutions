package SlidingWindow.easy;

public class subsStringsOfSizeThreeWithDistinctChars {
    public static void main(String[] args) {
        String s = "aababcabc";
        int l = 0;
        int r = 2;
        int n = s.length();
        int count = 0;
        while (r < n) {
            if (s.charAt(r) != s.charAt(l) && s.charAt(l) != s.charAt(l + 1)
                    && s.charAt(l + 1) != s.charAt(r)) {
                count++;
            }
            l++;
            r++;
        }
        System.out.println(count);
    }
}