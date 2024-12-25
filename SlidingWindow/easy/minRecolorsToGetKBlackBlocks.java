package SlidingWindow.easy;

import easy.twoSum;

public class minRecolorsToGetKBlackBlocks {
    public static void main(String[] args) {
        String blocks = "WWBBBWBBBBBWWBWWWB";
        int k = 16;
        int n = blocks.length();
        int min = 0;
        int left = 0;
        int right = left + k;

        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W')
                min++;
        }
        int localMin = min;
        while (right < n) {
            if (blocks.charAt(right) == 'W')
                localMin++;
            if (blocks.charAt(left) == 'W')
                localMin--;
            left++;
            right++;

            if (localMin < min)
                min = localMin;
        }
        System.out.println("answer = " + min);
    }
}
