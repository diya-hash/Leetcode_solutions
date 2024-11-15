
//problem link: https://leetcode.com/problems/two-sum/submissions/1448936680/
package Leetcode_solutions.Blind75.Array;

import java.util.*;

public class twoSum {
    public static void main(String[] args) {
        int[] nums = { 0, 4, 3, 0 };
        int target = 0;
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        // using O(n):
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = i;
                result[1] = map.get(target - nums[i]);
            }
            map.put(nums[i], i);
        }

        System.out.println(map);
        for (int i = 0; i < result.length; i++)
            System.out.println(result[i]);
    }
}