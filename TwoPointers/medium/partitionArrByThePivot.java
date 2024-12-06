package medium;

import java.util.ArrayList;

public class partitionArrByThePivot {
    public static void main(String[] args) {
        int[] nums = { 9, 12, 5, 10, 14, 3, 10 };
        int pivot = 10;
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                arr.add(nums[i]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == pivot) {
                arr.add(nums[i]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > pivot) {
                arr.add(nums[i]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr.get(i);
            System.out.print(nums[i] + "\t");
        }
    }
}
