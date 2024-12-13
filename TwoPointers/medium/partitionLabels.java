package Leetcode_solutions.TwoPointers.medium;

import java.util.ArrayList;

public class partitionLabels {
    public static void main(String[] args) {
        String s = "caedbdedda";
        char[] str = s.toCharArray();
        int[] lastIndx = new int[256];
        ArrayList<Integer> result = new ArrayList<>();
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            lastIndx[str[i]] = i;
        }
        for (int i = 0; i < s.length(); i++) {
            if (lastIndx[str[i]] > end) {
                end = lastIndx[str[i]];
            }
            if (end == i) {
                result.add((end - start) + 1);
                start = end + 1;
            }
        }
        System.out.println(result);
    }
}
