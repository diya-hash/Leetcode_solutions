package SlidingWindow.medium;

import java.util.HashMap;

public class maxNumVowelsinGivenLength {
    public static void main(String[] args) {
        String s = "weallloveyou";
        int k = 7;

        char[] ch = s.toCharArray();
        String vowel = "aeiou";
        char[] v = vowel.toCharArray();
        int l = 0;
        int r = k - 1;
        int n = s.length();
        int count = 0;
        int max = -1;
        while (r < n) {
            count = 0;
            System.out.println(s.substring(l, r + 1));
            for (int i = l; i <= r; i++) {
                if (ch[i] == v[0] || ch[i] == v[1] || ch[i] == v[2] || ch[i] == v[3] || ch[i] == v[4])
                    count++;
            }
            if (count > max)
                max = count;
            l++;
            r++;
        }
        System.out.println(max);
    }
}
