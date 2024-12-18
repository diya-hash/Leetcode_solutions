public class appendCharsToStringToMakeSubsequence {
    public static void main(String[] args) {
        String s = "a";
        String t = "acoaching";

        int left = 0;
        int right = 0;
        int n = s.length();
        int m = t.length();
        while (right < m) {
            if (s.charAt(left) == t.charAt(right)) {
                left++;
                right++;
                if (left == n) {
                    break;
                }
            } else {
                left++;
                if (left == n) {
                    break;
                }
            }
        }
        int count = m - right;
        System.out.println(count);
    }
}