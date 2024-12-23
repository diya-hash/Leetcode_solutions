package SlidingWindow.easy;

import java.util.HashSet;

public class longestNiceSubstring {
    public static void main(String[] args) {
        String s = "c";
        HashSet<Integer> upper = new HashSet<>();
        HashSet<Integer> lower = new HashSet<>();
        int n = s.length();
        int max = -10;
        String result = "";

        System.out.println(upper.equals(lower));
        for (int i = 0; i < n; i++) {
            String str = "";
            int count = 0;
            upper.clear();
            lower.clear();
            for (int j = i; j < n; j++) {
                if (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') {
                    int num = (int) s.charAt(j) - 'A';
                    upper.add(num);
                }

                else if (s.charAt(j) >= 'a' && s.charAt(j) <= 'z') {
                    int num = (int) s.charAt(j) - 'a';
                    lower.add(num);
                }
                str += s.charAt(j);
                count++;
                if (count > max && upper.equals(lower)) {
                    max = count;
                    result = str;

                }
            }

        }
        System.out.println(result + " " + max);

    }
}
