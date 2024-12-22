package SlidingWindow.easy;

import java.util.Arrays;
import java.util.HashSet;

public class maxLengthSubstringWithTwoOccurs {
    public static void main(String[] args) {
        String s = "adaddccdb";
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        boolean isTrue = false;
        int[] occur = new int[26];
        int result = 0;
        int max = -10;
        int len = s.length();

        for (int i = 0; i < len; i++) {
            Arrays.fill(occur, 0);
            String str = "";
            result = 0;
            for (int j = i; j < len; j++) {
                set2.add(s.charAt(j));
                int n = (int) s.charAt(j) - 'a';
                occur[n]++;
                if (occur[n] > 2) {
                    break;
                }
                str += s.charAt(j);
                result++;

            }
            System.out.println(str + " result = " + result);
            if (result > max) {
                max = result;
                isTrue = set1.equals(set2);
            }

        }
        System.out.println(max + " " + isTrue);

    }
}
