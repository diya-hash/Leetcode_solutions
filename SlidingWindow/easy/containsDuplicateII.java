package SlidingWindow.easy;

import java.util.HashMap;

public class containsDuplicateII {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1, 2, 3 };
        int k = 2;
        boolean isDuplicate = false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                isDuplicate = true;
                break;
            }
            map.put(nums[i], i);
        }

        System.out.println(isDuplicate);
    }
}
