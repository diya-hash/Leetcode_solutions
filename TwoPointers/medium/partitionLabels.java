package Leetcode_solutions.TwoPointers.medium;

import java.util.ArrayList;

public class partitionLabels {
    public static void main(String[] args) {
        String s = "caedbdedda";
        int[] lastIndx = new int[26];
        ArrayList<Integer> result = new ArrayList<>();
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int num = (int) s.charAt(i) - 'a';
            lastIndx[num] = i;
        }
        // for (int i = 0; i < 26; i++) {
        // System.out.println(i + "\t" + lastIndx[i]);
        // }
        for (int i = 0; i < s.length(); i++) {
            int num = (int) s.charAt(i) - 'a';
            if (lastIndx[num] > end) {
                end = lastIndx[num];
                System.out.println(end);
            }
            if (end == i) {
                result.add((end - start) + 1);
                System.out.println(result);
                start = end + 1;
                end = 0;
            }

        }
        // System.out.println(result);
    }
}
