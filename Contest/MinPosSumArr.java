package Leetcode_solutions.Contest;

import java.util.ArrayList;
import java.util.Arrays;

public class MinPosSumArr {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(-12, 8));
        int l = 1;
        int r = 1;
        int sum = 0;
        int count = l;
        int min = -1;
        if (l > 1 && r > 1) {
            for (int i = 0; i < l; i++) {
                sum += nums.get(i);
            }
            if (sum > 0) {
                min = sum;
            }
            while (count != r + 1) {
                System.out.println("entered the while loop");
                for (int i = 1; i < nums.size() - count; i++) {
                    System.out.println("entered for loop");
                    sum -= nums.get(i - 1);
                    sum += nums.get(i + count);
                    if (sum > 0 && sum < min)
                        min = sum;
                    System.err.println(sum);
                }
                System.out.println(min);
                count++;
            }
        } else {
            for (int i = 0; i < nums.size(); i++) {
                sum = nums.get(i);
                System.out.println(sum);
                if (min < 0 || sum < min) {
                    min = sum;
                }
            }
        }
        System.out.println(min);
    }
}

// problem link:
// https://leetcode.com/contest/weekly-contest-425/problems/minimum-positive-sum-subarray/description/