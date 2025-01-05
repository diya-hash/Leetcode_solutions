package SlidingWindow.easy;

import java.util.ArrayList;
import java.util.Arrays;

public class minPosSubarraySum {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(-3, 17));
        int l = 1;
        int r = 2;
        int min = Integer.MAX_VALUE;

        for (int i = l; i <= r; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum += nums.get(j);
            }
            if (sum > 0 && sum < min) {
                min = sum;
            }
            int left = 0;
            int right = i;
            while (right < nums.size()) {
                sum -= nums.get(left);
                sum += nums.get(right);
                if (sum > 0 && sum < min) {
                    min = sum;
                }
                left++;
                right++;
            }
        }
        if (min == Integer.MAX_VALUE) {
            min = -1;
        }
        System.out.println(min);

    }
}
