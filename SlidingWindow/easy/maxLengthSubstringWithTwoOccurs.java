package SlidingWindow.easy;

import java.util.Arrays;

public class maxLengthSubstringWithTwoOccurs {
    public static void main(String[] args) {
        String s = "adaddccdb";

        int[] occur = new int[26];
        int result = 0;
        int max = -10;
        int len = s.length();

        for (int i = 0; i < len; i++) {
            Arrays.fill(occur, 0);
            result = 0;
            for (int j = i; j < len; j++) {
                int n = (int) s.charAt(j) - 'a';
                occur[n]++;
                if (occur[n] > 2) {
                    break;
                }
                result++;
            }
            System.out.println(" result = " + result);
            if (result > max) {
                max = result;
            }
        }
        System.out.println(max);

    }
}
