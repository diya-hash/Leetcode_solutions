public class appendCharsToStringToMakeSubsequence {
    public static void main(String[] args) {
        String s = "acoding";
        String t = "a";

        int left = 0;
        int right = 0;
        int count = 0;

        while (left < s.length() || right < t.length()) {
            if (s.charAt(left) == t.charAt(right)) {
                left++;
                right++;
                if (right == t.length()) {
                    break;
                } else if (left == s.length()) {
                    break;
                }
            } else if (s.charAt(left) != t.charAt(right)) {
                left++;
                if (left == s.length()) {
                    break;
                }
            }
        }

        if (right < t.length()) {
            s += t.substring(right, t.length());
            count += t.length() - right;
        }
        System.out.println(s + " " + count);
    }
}