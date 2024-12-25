package SlidingWindow.easy;

import easy.twoSum;

public class minRecolorsToGetKBlackBlocks {
    public static void main(String[] args) {
        String blocks = "WWBBBWBBBBBWWBWWWB";
        int k = 16;
        int n = blocks.length();
        int min = 10000000;
        int count = 0;
        int index = 0;
        if (n <= k) {
            for (int j = 0; j < n; j++) {
                if (blocks.charAt(j) == 'W') {
                    count++;
                }
            }
            min = count;
        } else {
            for (int i = 0; i <= n - k; i++) {
                count = 0;
                for (int j = i; j < i + k; j++) {
                    if (blocks.charAt(j) == 'W') {
                        count++;
                    }
                }
                System.out.println(count + " " + index);
                if (count < min) {
                    min = count;
                    index = i;
                }
            }
        }

        System.out.println("answer = " + min + " " + index);
    }
}
